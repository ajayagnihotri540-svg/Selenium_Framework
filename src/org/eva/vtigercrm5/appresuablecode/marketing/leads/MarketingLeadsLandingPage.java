package org.eva.vtigercrm5.appresuablecode.marketing.leads;

import com.eva.vtiger.pages.common.CommonReusableCodes;
import com.eva.vtiger.utils.WebUtil;
import com.eva.vtigercrm5.objectrepository_orlayer.MarketingLeadsLandingPageOr;

public class MarketingLeadsLandingPage extends MarketingLeadsLandingPageOr {
	private WebUtil wt;
	public MarketingLeadsLandingPage(WebUtil wu) {
		super(wu);
		this.wt=wu;
	}

	public String innerTextOfSearchedElement(String searchName,String SearchTypeAttributValue) {
		CommonReusableCodes cc=new CommonReusableCodes(wt);
		cc.searchForElement(searchName,SearchTypeAttributValue );
		String actAccountName=wt.myInnerText(getAccountNameTB());
		wt.click(getFirstName());
		return actAccountName;
	}
}
