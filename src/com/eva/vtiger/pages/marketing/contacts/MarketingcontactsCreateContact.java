package com.eva.vtiger.pages.marketing.contacts;

import com.eva.vtiger.utils.WebUtil;

import com.eva.vtigercrm5.objectrepository_orlayer.MarketingcontactsCreateContactOr;

public class MarketingcontactsCreateContact extends MarketingcontactsCreateContactOr{
	
	private WebUtil wt;

	public MarketingcontactsCreateContact(WebUtil wu) {
		super(wu);
		this.wt=wu;
	}

	public String newCreateMarketingContacts(String expContactsName) {
		WebUtil wt = new WebUtil();
		wt.selectByValueAttribute(getSirNameTB(), "Mr.");	
		wt.sendKeys(getFirstNameTB(),expContactsName);
		wt.sendKeys(getLastNameTB(),"EVA");
		wt.sendKeys(getPhoneTB(),"8764564654");
		wt.sendKeys(getEmailNameTB(),""+expContactsName+".tester@qa.com");
		wt.myThread(3000);
		wt.sendKeys(getMailingStreetTB(),"Sant Ravidash nagar near khamharia village");
		wt.sendKeys(getMaillingPoBoxTB(),"bhadohi");
		wt.sendKeys(getMaillingCityTB(),"varanashi");
		wt.sendKeys(getMailingStateTB(),"utter pradesh");
		wt.sendKeys(getMaillingCountryTB(),"india");
		wt.click(getCopyMailingAddressRB());
		wt.sendKeys(getDescriptionTB(),"“Set your goals high, and don't stop till you get there.”");
		return expContactsName;
	}
}
