package org.eva.vtigercrm5.appresuablecode.marketing.leads;

import com.eva.vtiger.utils.WebUtil;
import com.eva.vtigercrm5.objectrepository_orlayer.MarketingLaedsNewCreateLeadOr;

public class MarketingLaedsNewCreateLead extends MarketingLaedsNewCreateLeadOr{
	private WebUtil wt;
	public MarketingLaedsNewCreateLead(WebUtil wu) {
		super(wu);
		this.wt=wu;
	}

	public String newCreatMarketingLeads() {
		String expLeadsName=wt.getRandomName(9);
		//WebUtil wt = new WebUtil();
		wt.selectByValueAttribute(getSirNameTB(), "Mr.");
		wt.sendKeys(getSirNameTB(),expLeadsName);
		wt.sendKeys(getSirNameTB(),"EVA");
		wt.sendKeys(getSirNameTB(),"8081157129");
		wt.sendKeys(getCompanyTB(),"Daphnish services pvt.ltd");
		wt.sendKeys(getEmailNameTB(),""+expLeadsName+"eva.sigma2023@gmail.com");
		wt.sendKeys(getLaneTB(),"pashchim sharira");
		wt.sendKeys(getCountryTB(),"india");
		wt.sendKeys(getCityTB(),"kaushambi");
		wt.sendKeys(getStateTB(),"utter pradesh");
		wt.sendKeys(getDescriptionTB(),"Do work hard until you do");
		return expLeadsName;
	}


}
