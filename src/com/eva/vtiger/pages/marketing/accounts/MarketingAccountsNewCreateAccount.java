package com.eva.vtiger.pages.marketing.accounts;

import com.eva.vtiger.utils.WebUtil;
import com.eva.vtigercrm5.objectrepository_orlayer.MarketingAccountsNewCreateAccountOr;

import lombok.Getter;

public class MarketingAccountsNewCreateAccount extends MarketingAccountsNewCreateAccountOr {

	
	private WebUtil wt;
	public MarketingAccountsNewCreateAccount(WebUtil wu) {
		super(wu);
		this.wt=wu;
	}

	public String fillUpBasicInformation() {
		String ranName=wt.getRandomName(10);
		wt.sendKeys(getAccountNameTB(),ranName);
		wt.sendKeys(getWebsiteTB(), ""+ranName+".er@gmail.com");
		wt.sendKeys(getPhoneTB(), "8947863734");
		wt.sendKeys(getTickerSymbolTB(),"plus");
		wt.sendKeys(getFaxNameTB(),"A fax called telecopying");
		wt.sendKeys(getPhonenumberTB(),""+ranName+".evs@gmail.com");
		wt.sendKeys(getBillCityTB(),"kaushambi");
		wt.sendKeys(getBillStateTB() ,"utter pradesh");
		wt.sendKeys(getBillCodeTB() ,"68536");
		wt.sendKeys(getBillCountryTB(),"india");
		wt.click(getCopyBillingAddressRB());
		wt.sendKeys(getDescriptionTB(),"Do work hard until you do");
		return ranName;
	}
	
	public void fillUpMoreInformation(String chooseIndustryValueAttribute) {
		wt.sendKeys(getOtherphoneTB(),"9876573434");
		wt.sendKeys(getEmployeesTB(),"5345");
		wt.sendKeys(getOtherEmailTB(),"8947863734");
		wt.sendKeys(getOwnershipTB(),"72.27%");
		wt.selectByValueAttribute(getIndustryTB(),chooseIndustryValueAttribute );
	}
	
}
