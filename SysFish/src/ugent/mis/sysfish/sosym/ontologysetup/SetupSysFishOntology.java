package ugent.mis.sysfish.sosym.ontologysetup;

public class SetupSysFishOntology {
	public static void main(String[] args) {
		StarDogOntology sysFish = new StarDogOntology("http://bizagi.ugent.be:5820/","admin","liesbeth1812", "SYSFISH");
		
		sysFish.cleanStardogDB();
		
		sysFish.loadOntology("REA-EMO.owl");
		sysFish.loadOntology("BMM.owl");
		sysFish.loadOntology("SysFishBMM.owl");
		sysFish.loadOntology("BMM_REA-EMO.owl");
		sysFish.loadOntology("SyFishEntities.owl");
		sysFish.loadOntology("SysfishCollaborationDiagram.owl");
		sysFish.loadOntology("FishCleaningAR.owl");
		sysFish.loadOntology("TruckAcquisitionAR.owl");
		sysFish.loadOntology("FinancingAR.owl");
		sysFish.loadOntology("FishPurchaseAR.owl");
		sysFish.loadOntology("FishSellingAR.owl");
		sysFish.loadOntology("PayrollAR.owl");
		sysFish.loadOntology("FishPurchaseBP.owl");
		
		sysFish.closeConnection();
		
		System.out.println("Finish");
	
	}

}
