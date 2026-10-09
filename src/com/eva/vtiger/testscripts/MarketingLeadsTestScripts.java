package com.eva.vtiger.testscripts;

import org.eva.vtigercrm5.appresuablecode.marketing.leads.MarketingLaedsNewCreateLead;
import org.eva.vtigercrm5.appresuablecode.marketing.leads.MarketingLeadsInformationPage;
import org.eva.vtigercrm5.appresuablecode.marketing.leads.MarketingLeadsLandingPage;

import com.eva.vtiger.pages.common.CommonReusableCodes;
import com.eva.vtiger.utils.WebUtil;

public class MarketingLeadsTestScripts {
	private WebUtil wt;
	public void verifyVT007SearchLeads() {
		wt.printMessage("====  verifyVT008SearchLeads starts from here====");
		wt.launchBrowser();
		wt.goToHitUrl("http://localhost:8888");
		CommonReusableCodes cc= new CommonReusableCodes(wt);
		cc.login();
		cc.goToMarketingLeadsLink();
		cc.creatNewPluseButton();
		MarketingLaedsNewCreateLead creatLead=new MarketingLaedsNewCreateLead(wt);
		String expFirstName =creatLead.newCreatMarketingLeads();
		cc.saveButton();
		cc.goToMarketingLeadsLink();
		MarketingLeadsLandingPage malp=new MarketingLeadsLandingPage(wt);
		String searchedName=malp.innerTextOfSearchedElement(expFirstName, "firstname");
		if (searchedName.contains(expFirstName)) {
			wt.printMessage("passed! your data "+searchedName+" is matched that you are searching");
		} else {
			wt.printMessage("failed! your data "+searchedName+" is not  matched that you are searching");
		}
		cc.logOut();
		wt.myQuit();
		wt.printMessage("====  verifyVT008SearchLeads starts from here====");
	}

	public void verifyVT008CreateLeads() {
		wt.printMessage("====  verifyVT009CreateLeads ends from here====");
		wt.launchBrowser();
		wt.goToHitUrl("http://localhost:8888");
		CommonReusableCodes cc= new CommonReusableCodes(wt);
		cc.login();
		cc.goToMarketingLeadsLink();
		cc.creatNewPluseButton();
		MarketingLaedsNewCreateLead creatLead=new MarketingLaedsNewCreateLead(wt);
		String expFirstName =creatLead.newCreatMarketingLeads();
		cc.saveButton();
		cc.goToMarketingLeadsLink();
		MarketingLeadsLandingPage mlLandingPage=new MarketingLeadsLandingPage(wt);
		String searchData=mlLandingPage.innerTextOfSearchedElement(expFirstName, "firstname");
		if (searchData.contains(expFirstName)) {
			wt.printMessage("your search data "+searchData+" is matched that you are searching");
			wt.printMessage("Passed !, "+searchData+" name is created successfully");
		} else {
			wt.printMessage("your search data data "+searchData+" is not  matched that you are searching");
			wt.printMessage("Failed !, "+searchData+" name is not created successfully");
		}
		cc.logOut();
		wt.myQuit();
		wt.printMessage("====  verifyVT009CreateLeads ends from here====");
	}

	public void verifyVT009DeleteLead() {
		wt.printMessage("====  verifyVT0010DeleteLead starts from here====");
		wt.launchBrowser();
		wt.goToHitUrl("http://localhost:8888");
		CommonReusableCodes cc= new CommonReusableCodes(wt);
		cc.login();
		cc.goToMarketingLeadsLink();
		cc.creatNewPluseButton();
		MarketingLaedsNewCreateLead creatLead=new MarketingLaedsNewCreateLead(wt);
		creatLead.newCreatMarketingLeads();
		cc.saveButton();
		wt.myThread(3000);
		MarketingLeadsInformationPage mlInfoPage=new MarketingLeadsInformationPage(wt);
		String leadResult=mlInfoPage.innerTextsearchForLeadNumber();
		String expResult="No Lead Found !";
		if (expResult.equalsIgnoreCase(leadResult)) {
			System.out.println("Passed!,your created lead has been deleted successfully");
		} else {
			System.out.println("failed!,your created lead hasn't been deleted successfully");

		}
		cc.logOut();
		wt.myQuit();
		wt.printMessage("====  verifyVT0010DeleteLead ends from here====");
	}

	public void verifyVT010LeadsTableLinks() {
		wt.printMessage("===== verifyVT011LeadsTableLinks starts from here ======");
		wt.launchBrowser();
		wt.goToHitUrl("http://localhost:8888");
		CommonReusableCodes cc= new CommonReusableCodes(wt);
		cc.login();
		cc.goToMarketingLeadsLink();
		cc.creatNewPluseButton();
		MarketingLaedsNewCreateLead creatLead=new MarketingLaedsNewCreateLead(wt);
		String expLeadsName=creatLead.newCreatMarketingLeads();
		cc.saveButton();
		wt.myThread(3000);
		cc.goToMarketingLeadsLink();
		MarketingLeadsLandingPage mlLandingPage=new MarketingLeadsLandingPage(wt);
		String firstNameBeforeClickText=mlLandingPage.innerTextOfSearchedElement(expLeadsName, "firstname");
		MarketingLeadsInformationPage mlip=new MarketingLeadsInformationPage(wt);
		String firstNameAfterClickText=mlip.firstName();

		if (firstNameBeforeClickText.equalsIgnoreCase(firstNameAfterClickText)) {
			wt.printMessage("Passed !,first name is same After clicking the first name link in marketing leads");
		} else {
			wt.printMessage("Passed !,first name is not same After clicking the first name link in marketing leads");
		}
		cc.logOut();
		wt.myQuit();
		wt.printMessage("====  verifyVT011LeadsTableLinks ends from here====");

	}
}
