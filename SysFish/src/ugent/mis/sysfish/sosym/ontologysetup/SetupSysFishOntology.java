package ugent.mis.sysfish.sosym.ontologysetup;

public class SetupSysFishOntology {
	public static void main(String[] args) {
		StarDogOntology sosym = new StarDogOntology("http://jools.ugent.be:5820/","admin","liesbeth", "SoSyM2015");
		
		sosym.cleanStardogDB();
		
		sosym.loadOntology("REA-EMO.owl");
		sosym.loadOntology("BMM.owl");
		sosym.loadOntology("SysFishBMM.owl");
		sosym.loadOntology("BMM_REA-EMO.owl");
		sosym.loadOntology("SyFishEntities.owl");
		sosym.loadOntology("SysfishCollaborationDiagram.owl");
		sosym.loadOntology("FishCleaningAR.owl");
		sosym.loadOntology("TruckAcquisitionAR.owl");
		sosym.loadOntology("FinancingAR.owl");
		sosym.loadOntology("FishPurchaseAR.owl");
		sosym.loadOntology("FishSellingAR.owl");
		sosym.loadOntology("PayrollAR.owl");
		sosym.loadOntology("FishPurchaseBP.owl");
		
		sosym.closeConnection();
		
		System.out.println("Finish");
	
	}

}
