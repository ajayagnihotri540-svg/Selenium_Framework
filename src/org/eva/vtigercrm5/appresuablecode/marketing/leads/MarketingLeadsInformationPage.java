package org.eva.vtigercrm5.appresuablecode.marketing.leads;

import com.eva.vtiger.pages.common.CommonReusableCodes;
import com.eva.vtiger.utils.WebUtil;
import com.eva.vtigercrm5.objectrepository_orlayer.MarketingLeadsInformationPageOr;

public class MarketingLeadsInformationPage extends MarketingLeadsInformationPageOr  {
private WebUtil wt;
	public MarketingLeadsInformationPage(WebUtil wu) {
		super(wu);
		this.wt=wu;
	}
	public String innerTextsearchForLeadNumber() {
		String leadNumberText=wt.myInnerText(getLeadNumber());
		String[] arrStr=leadNumberText.split("LEA");
		String leadNum=arrStr[1].trim();
		deleteButton();
		CommonReusableCodes cc=new CommonReusableCodes(wt);
		cc.searchForElement(leadNum, "lead_no");
		String leadResult=wt.myInnerText(getLeadStatus());
		return leadResult;
	}
	public void deleteButton() {
		wt.mouseClick(getDeleteBT());
		wt.popUpAccept();
	}
	public String firstName() {
		String actName=wt.myInnerText(getFirstName());
		return actName;
	}

}
