
package com.eva.vtiger.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import com.eva.vtiger.pages.common.CommonReusableCodes;
import com.eva.vtiger.pages.inventry.invoice.InventoryInvoiceNewCreateInvoice;
import com.eva.vtiger.utils.WebUtil;

public class InventryInvoiceTestScripts {
	
	public void verifyVT006AccountAndContactAddOnInvoiceForm() {
		WebUtil wt=new WebUtil();
		//WebUtil wt1=new WebUtil();
	     	
		wt.printMessage("====  verifyVT0012AccountAndContactAddOnInvoiceForm starts from here====");
		wt.launchBrowser();
		//wt1.launchBrowser();
		wt.goToHitUrl("http://localhost:8888");
		
		CommonReusableCodes cc=new CommonReusableCodes(wt);
		cc.login();
		cc.goToInventoryInvoiceLink();
		cc.creatNewPluseButton();
		InventoryInvoiceNewCreateInvoice creatInvoice= new InventoryInvoiceNewCreateInvoice(wt);
		creatInvoice.fillUpInvoiceInformation("Test Account Name And Contact Name Addition");
		wt.printMessage("====  verifyVT0012AccountAndContactAddOnInvoiceForm ends from here====");

	}
   ///  cadric beust 
	
	    /////   TestNG  JUnit
	
	
	   ////  Cucumber   -   BDD 
	
	
	
	
	
	
	
}
