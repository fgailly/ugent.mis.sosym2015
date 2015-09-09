package ugent.mis.sysfish.sosym.demo;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.openrdf.model.URI;
import org.openrdf.model.impl.ValueFactoryImpl;
import org.openrdf.model.vocabulary.RDF;
import org.openrdf.query.QueryEvaluationException;
import org.openrdf.query.TupleQueryResult;
import org.openrdf.rio.RDFFormat;

import ugent.mis.sysfish.sosym.ontologysetup.StarDogOntology;

import com.complexible.common.iterations.Iteration;
import com.complexible.stardog.ContextSets;
import com.complexible.stardog.StardogException;
import com.complexible.stardog.api.Connection;
import com.complexible.stardog.api.Exporter;
import com.complexible.stardog.api.SelectQuery;
import com.complexible.stardog.api.reasoning.ReasoningConnection;
import com.complexible.stardog.icv.ConstraintViolation;
import com.complexible.stardog.icv.ICV;
import com.complexible.stardog.icv.api.ICVConnection;
import com.complexible.stardog.reasoning.api.ReasoningType;

public class Demo {

	public static void main(String[] args) {
		try {
			
			StarDogOntology sysFish = new StarDogOntology("http://bizagi.ugent.be:5820/","admin","liesbeth", "SoSyM2015");
			
			Connection aConn = sysFish.getConnection();
			ReasoningConnection aReasoningConn = sysFish.getReasoningConnection();
					
			
			//SelectQuery aQuery = aConn.select("select * where {?s ?p ?o}");
			SelectQuery aQuery = aConn.select("SELECT ?x WHERE {\n" +
					 "?x <"+ RDF.TYPE + "> ?type\n}"); //  <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?type\n" + "}");
			
			URI BUSINESSENTITY = ValueFactoryImpl.getInstance().createURI("http://www.mis.ugent.be/ontologies/REA-EMO#BusinessEntity");
			URI ECONOMICRESOURCE = ValueFactoryImpl.getInstance().createURI("http://www.mis.ugent.be/ontologies/REA-EMO#EconomicResource");
			URI STOCKFLOW = ValueFactoryImpl.getInstance().createURI("http://www.mis.ugent.be/ontologies/REA-EMO#economicEvent_stockflow");
			URI ECONOMICEVENT = ValueFactoryImpl.getInstance().createURI("http://www.mis.ugent.be/ontologies/REA-EMO#EconomicEvent");
			aQuery.parameter("type", BUSINESSENTITY);
			 
			// now we can run this query...but lets set a limit on it since otherwise that'd be the whole database
			aQuery.limit(20);
			 
			TupleQueryResult aResult = aQuery.execute();
			 
			System.out.println("The first 20 results...");
			 
			// and do something with the results
			while (aResult.hasNext()) {
				System.out.println(aResult.next());
				
			}
			
			// So let's print out how many of some different types there are...
			System.out.println("The default results...");
			printCounts(aConn);

			// Let's do the same thing with the reasoning connection
			// and print the same set of counts, but this time, with reasoning so we can see the difference
			System.out.println("\nResults with reasoning...");
			printCounts(aReasoningConn);
			
			// Let's define a constraint
			// we want to say that a product should be manufactured by a Manufacturer:
			//Constraint aConstraint = ConstraintFactory.constraint(subClassOf(ECONOMICRESOURCE, some(STOCKFLOW, ECONOMICEVENT)));

			// ok, we have a database, and a constraint, lets use ICV.  We'll start out by creating a validator from our connection
			ICVConnection aValidator = aConn.as(ICVConnection.class);
			
			

			// and adding the constraint, must do this in a transaction
			aValidator.begin();
			aValidator.addConstraints()
			.format(RDFFormat.RDFXML)
			.file(new File("ontologies/REA-EMO-CONSTRAINTS.owl"));
			aValidator.commit();

			// now we can check whether or not our data is valid
			// which it isnt, we're lacking the assertion that m1 is a Manufacturer...

			System.out.println("The data " + (aValidator.isValid(ContextSets.DEFAULT_ONLY) ? "is" : "is NOT") + " valid!");
			 
			// always close your result sets
			aResult.close();
			
			printValidity(aValidator);
			aValidator.clearConstraints();
			
			File sysfish = new File("ontologies/sysfish.owl");
			FileOutputStream is = new FileOutputStream(sysfish);
			
			Exporter exporter = aReasoningConn.export();
			exporter.format(RDFFormat.RDFXML);
			exporter.to(is);
			
			
			
			aConn.close();
			System.exit(0);
		} catch (StardogException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (QueryEvaluationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		//} catch (ServerException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void printValidity(final ICVConnection theValidator) throws StardogException {
		final boolean isValid = theValidator.isValid(ContextSets.DEFAULT_ONLY);
		System.out.println("The data " + (isValid ? "is" : "is NOT") + " valid!");
 
		if (!isValid) {
			Iteration<ConstraintViolation<org.openrdf.query.BindingSet>, StardogException> aViolationIter = theValidator.getViolationBindings(ContextSets.DEFAULT_ONLY);
 
			while (aViolationIter.hasNext()) {
				ConstraintViolation<org.openrdf.query.BindingSet> aViolation = aViolationIter.next();
 
				Iteration<org.openrdf.model.Resource, StardogException> aViolatingIndividuals = ICV.asIndividuals(aViolation.getViolations());
 
				System.out.println("Each of these individuals violated the constraint: " + aViolation.getConstraint());
 
				while (aViolatingIndividuals.hasNext()) {
					System.out.println(aViolatingIndividuals.next());
				}
 
				// ALWAYS close Iterations when you're done with them!
				aViolatingIndividuals.close();
			}
		}
		System.out.println();
	}
	
	private static void printCounts(final Connection theConn) throws StardogException, QueryEvaluationException {
		URI BUSINESSENTITY = ValueFactoryImpl.getInstance().createURI("http://www.mis.ugent.be/ontologies/REA-EMO#BusinessEntity");
		URI BUSINESSRELATIONSHIP = ValueFactoryImpl.getInstance().createURI("http://www.mis.ugent.be/ontologies/REA-EMO#businessRelationship_BusinessEntity");
		URI BUSINESSPROCESS = ValueFactoryImpl.getInstance().createURI("http://www.mis.ugent.be/ontologies/REA-EMO#BusinessProcess");
		
		URI ECONOMICRESOURCE = ValueFactoryImpl.getInstance().createURI("http://www.mis.ugent.be/ontologies/REA-EMO#EconomicResource");
		URI ECONOMICAGENT = ValueFactoryImpl.getInstance().createURI("http://www.mis.ugent.be/ontologies/REA-EMO#EconomicAgent");
		URI ECONOMICEVENT = ValueFactoryImpl.getInstance().createURI("http://www.mis.ugent.be/ontologies/REA-EMO#EconomicEvent");
		URI BUSINESSEVENT = ValueFactoryImpl.getInstance().createURI("http://www.mis.ugent.be/ontologies/REA-EMO#BusinessEvent");
		
		URI DUALITY = ValueFactoryImpl.getInstance().createURI("http://www.mis.ugent.be/ontologies/REA-EMO#duality_EconomicEvent");
		
		URI PROPERTY = ValueFactoryImpl.getInstance().createURI("http://www.w3.org/2002/07/owl#topObjectProperty");
		
		URI BMM_BUSINESSPROCESS = ValueFactoryImpl.getInstance().createURI("http://www.ugent.mis.be/ontologies/BMM#BusinessProcess");
		URI BMM_ASSET = ValueFactoryImpl.getInstance().createURI("http://www.ugent.mis.be/ontologies/BMM#Asset");
		URI BMM_ORGANISATIONUNIT = ValueFactoryImpl.getInstance().createURI("http://www.ugent.mis.be/ontologies/BMM#OrganisationUnit");
		URI BMM_BPMANAGESA = ValueFactoryImpl.getInstance().createURI("http://www.ugent.mis.be/ontologies/BMM#BusinessProcessManagesAsset");
		
		
		
		SelectQuery aQuery = theConn.select("SELECT ?x WHERE {\n" +
									 "?x <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?type\n" +
									 "}");
		
		SelectQuery aQueryB = theConn.select("SELECT ?x ?y WHERE {\n" +
				 "?x ?objectProperty ?y\n" +
				 "}");
		
		
		aQuery.parameter("type", BUSINESSENTITY);
		TupleQueryResult aResult = aQuery.execute();
		System.out.println("Number of Business Entities: " + count(aResult));
		
		aQueryB.parameter("objectProperty", BUSINESSRELATIONSHIP);
		TupleQueryResult aResult2 = aQueryB.execute();
		System.out.println("Number of Business Relationships: " + count(aResult2));
		
		aQuery.parameter("type", BUSINESSPROCESS);
		aResult = aQuery.execute();
		System.out.println("Number of Business Processes: " + count(aResult));
		
		aQuery.parameter("type", ECONOMICRESOURCE);
		aResult = aQuery.execute();
		System.out.println("Number of Economic Resources: " + count(aResult));

		aQuery.parameter("type", ECONOMICAGENT);
		aResult = aQuery.execute();
		System.out.println("Number of Economic Agents: " + count(aResult));

		aQuery.parameter("type", ECONOMICEVENT);
		aResult = aQuery.execute();
		System.out.println("Number of Economic Event: " + count(aResult));
		
		aQuery.parameter("type", BUSINESSEVENT);
		aResult = aQuery.execute();
		System.out.println("Number of Business Event: " + count(aResult));
		
		aQueryB.parameter("objectProperty", DUALITY);
		aResult2 = aQueryB.execute();
		System.out.println("Number of Duality Relationships: " + count(aResult2));
		
		aQueryB.parameter("objectProperty", PROPERTY);
		aResult2 = aQueryB.execute();
		System.out.println("Number of Relationships: " + count(aResult2));
		
		aQuery.parameter("type", BMM_BUSINESSPROCESS);
		aResult = aQuery.execute();
		System.out.println("Number of BMM Business Processes: " + count(aResult));
		
		aQuery.parameter("type", BMM_ASSET);
		aResult = aQuery.execute();
		System.out.println("Number of BMM Assets: " + count(aResult));
		
		aQuery.parameter("type", BMM_ORGANISATIONUNIT);
		aResult = aQuery.execute();
		System.out.println("Number of BMM Organisation Units: " + count(aResult));
		
		aQueryB.parameter("objectProperty", BMM_BPMANAGESA);
		TupleQueryResult aResult3 = aQueryB.execute();
		System.out.println("Number of Bp manages Assets Relationships: " + count(aResult3));
		
		
	}

	private static int count(final TupleQueryResult theResult) throws QueryEvaluationException {
		try {
			int count = 0;
			while (theResult.hasNext()) {
				count++;
				theResult.next();
			}

			return count;
		}
		finally {
			theResult.close();
		}
	}
}
