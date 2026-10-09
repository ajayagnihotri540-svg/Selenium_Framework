package com.eva.vtiger.pages.marketing.accounts;
/* packege com.eva.vtiger.appreusablecode.marketing.accounts ka name change kar ke ab
 * ham es peckege ka name com.eva.vtiger.pages.marketing.accounts rakhate hai
 * kyoki ye page wise packege or (classes) hai   */

import org.openqa.selenium.support.PageFactory;

import com.eva.vtiger.pages.common.CommonReusableCodes;
import com.eva.vtiger.utils.WebUtil;
import com.eva.vtigercrm5.objectrepository_orlayer.MarketingAccountLandingPageOr;

public class MarketingAccountLandingPage extends MarketingAccountLandingPageOr{
	private WebUtil wt;
	public MarketingAccountLandingPage(WebUtil wu){
	super(wu);	
	this.wt=wu;
	}
	public String innerTextOfSearchedElement(String searchName,String SearchTypeAttributValue) {
		CommonReusableCodes cc=PageFactory.initElements(wt.getDriver(), CommonReusableCodes.class);
		cc.searchForElement(searchName,SearchTypeAttributValue );
		wt.myThread(4000);
		String actAccountName=wt.myInnerText(getAccountNameTB());
		return actAccountName;
	}
	public String clickOfSearchedElement(String searchName,String SearchTypeAttributValue) {
		CommonReusableCodes cc=PageFactory.initElements(wt.getDriver(), CommonReusableCodes.class);
		cc.searchForElement(searchName,SearchTypeAttributValue );
		wt.click(getAccountNameTB());
		String actAccountName=wt.myInnerText(getAccountNameTB());
		return actAccountName;

	}

	public void deleteAndSearchAccountStatus(String searchName,String SearchTypeAttributValue) {
		wt.click(getAccountDelete());
		wt.popUpAccept();
		CommonReusableCodes cc=PageFactory.initElements(wt.getDriver(), CommonReusableCodes.class);
		cc.searchForElement(searchName,SearchTypeAttributValue );
		String expResult="No Account Found !";
		String actResult=wt.myInnerText(getSearchResult());
		if(expResult.equalsIgnoreCase(actResult)) {
			System.out.println("Passed!,your created lead has been deleted successfully");
		}else {
			System.out.println("failed!,your created lead hasn't been deleted successfully");
		}
	}
	public void DuplicateAndEditStatus() {
		String emailBeforeDuplicate=wt.myInnerText(getEmailTb());
		wt.click(getDuplicateBT());
		wt.myClear(getAcName1());
		String accountName=wt.getRandomName(10);
		wt.sendKeys(getAcName1(),accountName);
		CommonReusableCodes cc=PageFactory.initElements(wt.getDriver(), CommonReusableCodes.class);
		cc.saveButton();
		String emailAfterDuplicate=wt.myInnerText(getEmailTb());
		if (emailBeforeDuplicate.equalsIgnoreCase(emailAfterDuplicate)) {
			wt.printMessage("Passed !,the privious data "+emailBeforeDuplicate+" and current data "+emailAfterDuplicate+" is matched successfully");
		} else {
			wt.printMessage("Failed !,the privious data "+emailBeforeDuplicate+" and current data "+emailAfterDuplicate+" is matched successfully");
		}
	}

	public String editAccountInformation() {
		wt.click(getEditBT());
		wt.myClear(getAcName1());
		String acNameAfrterEdit=wt.getRandomName(10);
		wt.sendKeys(getAcName1(),acNameAfrterEdit);
		CommonReusableCodes cc=PageFactory.initElements(wt.getDriver(), CommonReusableCodes.class);
		cc.saveButton();
		String acNameAfterEdit=wt.myInnerText(getAcName2());
		return acNameAfterEdit;
	}
}
