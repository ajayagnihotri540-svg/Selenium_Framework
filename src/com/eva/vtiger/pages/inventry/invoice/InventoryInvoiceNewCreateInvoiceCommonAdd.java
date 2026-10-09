package com.eva.vtiger.pages.inventry.invoice;

import org.openqa.selenium.support.PageFactory;

import com.eva.vtiger.utils.WebUtil;
import com.eva.vtigercrm5.objectrepository_orlayer.InventoryInvoiceNewCreateInvoiceCommonAddOr;

public class InventoryInvoiceNewCreateInvoiceCommonAdd extends InventoryInvoiceNewCreateInvoiceCommonAddOr{

	WebUtil webUtilObj;
	public InventoryInvoiceNewCreateInvoiceCommonAdd(WebUtil webUtilObj) {
		super(webUtilObj);
		this.webUtilObj=webUtilObj;
	}
	
	
	
	public String searchForElement(String expSearchName,String searchTypeAttributeValue) {
		webUtilObj.sendKeys(getExpSearchNameTB(),expSearchName);
		webUtilObj.selectByValueAttribute(getSearchTypeAttributeValueTB(), searchTypeAttributeValue);
		webUtilObj.click(getSearchBT());
		return expSearchName;
	}	
	public void addElementName(String expSearchName,String valueAttribute) {
		webUtilObj.switchToWindowByTitle("");
		webUtilObj.windowMaximize();
//		InventoryInvoiceNewCreateInvoiceCommonAdd commonAdd=PageFactory.initElements(webUtilObj.getDriver(),InventoryInvoiceNewCreateInvoiceCommonAdd.class);
		searchForElement(expSearchName,valueAttribute);
		webUtilObj.myThread(2000);
		webUtilObj.click(getSearchNameValueClick());
		webUtilObj.myThread(2000);
		webUtilObj.popUpAccept();
		webUtilObj.switchToWindowByTitle(getWindowTitle());
		webUtilObj.myThread(2000);

	}
}
