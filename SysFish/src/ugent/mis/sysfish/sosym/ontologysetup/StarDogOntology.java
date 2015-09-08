package ugent.mis.sysfish.sosym.ontologysetup;

import java.io.File;

import org.openrdf.rio.RDFFormat;

import com.complexible.stardog.StardogException;
import com.complexible.stardog.api.Connection;
import com.complexible.stardog.api.ConnectionConfiguration;
import com.complexible.stardog.api.IO;
import com.complexible.stardog.api.Remover;
import com.complexible.stardog.api.reasoning.ReasoningConnection;
import com.complexible.stardog.reasoning.api.ReasoningType;

public class StarDogOntology {
	
	private String server;
	private String login;
	private String password;
	
	private Connection conn;
	private ReasoningConnection reasoningConn;
	private String databasename;
	
	public StarDogOntology(String server, String login, String password, String databaseName){
		this.server = server;
		this.login = login;
		this.password = password;
		this.databasename = databaseName;
		
		try {
			conn = ConnectionConfiguration
					.to(databasename)		    // the name of the db to connect 
					.server(server)
					.credentials(login, password)// credentials to use while connecting
					.connect();
			
			reasoningConn = ConnectionConfiguration
					.to(databasename)
					.credentials(login, password)
					.server(server)
					.reasoning(ReasoningType.SL)
					.connect()
					.as(ReasoningConnection.class);
			
		} catch (StardogException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void closeConnection(){
		try {
			conn.close();
			reasoningConn.close();
		} catch (StardogException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadOntology(String ontologyfile){
		
		try {
			conn.begin();
			IO aAdder = conn.add().io().format(RDFFormat.RDFXML);
			aAdder.file(new File("ontologies/" + ontologyfile));
			
			conn.commit();
		
		
		} catch (StardogException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void cleanStardogDB(){
		try {
			conn.begin();
			Remover aRemover = conn.remove();
			aRemover.all();
			
			conn.commit();

		} catch (StardogException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Connection getConnection() {
		return conn;
	}
	
	public ReasoningConnection getReasoningConnection() {
		return reasoningConn;
	}

}
