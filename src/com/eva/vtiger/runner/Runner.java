package com.eva.vtiger.runner;

import com.eva.vtiger.testscripts.InventryInvoiceTestScripts;
import com.eva.vtiger.testscripts.MarketingAccountTestScripts;
import com.eva.vtiger.testscripts.MarketingLeadsTestScripts;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
  
//		________________ Marketing's Accounts ______________________
		
//		MarketingAccountTestScripts mas=new MarketingAccountTestScripts();
//		mas.verifyVT001CreateAccount();
//		mas.verifyVT002DeleteAccount();
//		mas.verifyVT003SearchAccount();
//		mas.verifyVT004DuplicateAccount();
//		mas.verifyVT005AccountEditable();
		
//		________________ Inventory's Invoice ______________________

		InventryInvoiceTestScripts iits=new InventryInvoiceTestScripts();
		iits.verifyVT006AccountAndContactAddOnInvoiceForm();
		
//		________________ Marketing's Leads ______________________

//		MARKETINGLEADSTESTSCRIPTS MLTS= NEW MARKETINGLEADSTESTSCRIPTS();
//		MLTS.VERIFYVT007SEARCHLEADS();
//		MLTS.VERIFYVT008CREATELEADS();
//		MLTS.VERIFYVT009DELETELEAD();
//		MLTS.VERIFYVT010LEADSTABLELINKS();
	}


}





