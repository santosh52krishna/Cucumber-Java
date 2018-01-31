package cucumber.examples.java.testNG.stepDefinitions;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.galenframework.api.Galen;
import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.model.LayoutReport;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.examples.java.testNG.DriverManager;


public class StepDefinitions {
	

    static Logger log = Logger.getLogger(StepDefinitions.class);
    WebDriver driver = DriverManager.getDriver();
    WebElement webElement;
    YPOObjects obj=new YPOObjects();
   
    

  //welcome Page        
    @Given("^I launch YPO Website$")
    public void i_launch_YPO_Website() throws Throwable { 

    driver.navigate().to("https://bwrenew-ypoportal.cs60.force.com/members/login");
    }

    @And("^I login using Valid Credentials$")
    public void i_login_using_Valid_Credentials() throws Throwable{ 	
    	driver.findElement(obj.username).sendKeys("theprospect@qentelli.com");  	
    	driver.findElement(obj.password).sendKeys("Salesforce@123");
    	driver.findElement(obj.login).click();
    }


    @When("^the welcome page is displayed$")
    public void the_welcome_page_is_displayed() throws Throwable {
        driver.findElement(obj.welcomepageHeader).isDisplayed();
    
             
    }

    @Then("^Welcome Page Content Layout is tested$")
    public void welcome_Page_Content_Layout_is_tested() throws Throwable {
    	galenTest(driver,"specs/YPO_WelcomePage.spec");
     
   
    }
//Update profile page
    
@Then("^I click on Continue Button$")
public void i_click_on_Continue_Button() throws Throwable {
	driver.findElement(obj.continuebtn1).click();	

}
@When("^Update Profile Page is Displayed$")
public void update_Profile_Page_is_Displayed() throws Throwable {
  //driver.findElement(obj.updatepageheader).isDisplayed();	

	
}

@Then("^Update Profile Page Content Layout is tested$")
public void update_Profile_Page_Content_Layout_is_tested() throws Throwable {
	galenTest(driver,"specs/YPO_Updateprofile.spec");
	
	
}
		
//choose a network page

@Then("^I click on Save&Confirm Button$")
public void i_click_on_Save_Confirm_Button() throws Throwable {
if (driver.findElement(obj.confirmbtn).isDisplayed()) {
	driver.findElement(obj.confirmbtn).click();
} else {
	driver.findElement(obj.confirmbtnmobile).click();
}

//
//
driver.navigate().to("https://bwrenew-ypoportal.cs60.force.com/members/recertification_screen");
}

@When("^the ChooseaNetwork Page is displayed$")
public void the_ChooseaNetwork_Page_is_displayed() throws Throwable {
  //driver.findElement(obj.ChooseanetworkpageHeader).isDisplayed();	  

	
}

@Then("^the ChooseaNetwork Page content Layout is tested$")
public void the_ChooseaNetwork_Page_content_Layout_is_tested() throws Throwable {
	galenTest(driver,"specs/YPO_ChooseaNetwork.spec");
	
	
}

//catalog page

@Then("^I click on continue to catalog button$")
public void i_click_on_continue_to_catalog_button() throws Throwable {
driver.findElement(obj.radiobtn).click();
driver.findElement(obj.continuebtn).click();

	
}

@When("^the Catalog page is displayed$")
public void the_Catalog_page_is_displayed() throws Throwable {
	
	driver.findElement(obj.catalogpageHeader).isDisplayed();

}
@Then("^I click on Continue to catalog button$")
public void i_click_on_Continue_to_catalog_button() throws Throwable {
	driver.findElement(obj.radiobtn).click();
	driver.findElement(obj.continuebtn).click();
		
}
@Then("^Catalog Page content Layout is tested$")
public void Catalog_Page_content_Layout_is_tested() throws Throwable{
	galenTest(driver,"specs/YPO_Catalog.spec");	
}
@And ("^I add Items to the cart$")
public void I_add_Items_to_the_cart() throws Throwable
{
((JavascriptExecutor) driver).executeScript("scroll(0,250);");
driver.findElement(obj.addtocart).click();
Thread.sleep(30);

try {
	((JavascriptExecutor) driver)
	.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	if (driver.findElement(By.xpath("//button[@class='confirm']")).isDisplayed()) 
	{	
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		
	}
} catch (NoSuchElementException e) {

	System.out.println("Item added successfully");
}

}


//catalog modal page

@Then("^I click on CartIcon$")
public void i_click_on_CartIcon() throws Throwable {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(obj.cart).click();
}


@When("^the CatalogModal page is displayed$")
public void the_CatalogModal_page_is_displayed() throws Throwable{
driver.findElement(obj.catalogmodal).isDisplayed();

}
@Then ("^CatalogModal Page Content Layout is tested$")
public void CatalogModal_Page_Content_Layout_is_tested() throws Throwable{
	galenTest(driver,"specs/YPO_CatalogModal.spec");
	
	}

//catalog modal delete page

@Then("^I click on Remove button$")
public void i_click_on_Remove_button() throws Throwable {
driver.findElement(obj.remove).click();
}

@When("^the CatalogDeleteItem page is displayed$")
public void the_CatalogDeleteItem_page_is_displayed() throws Throwable {
driver.findElement(obj.catalogmodal).isDisplayed();

}

@Then("^CatalogDeleteItem page content Layout is tested$")
public void catalogdeleteitem_page_content_Layout_is_tested() throws Throwable {
	
	galenTest(driver,"specs/YPO_CatalogDeleteItem.spec");
   
}

//Catalog Item detailed page

@Then("^I click on a Item$")
public void i_click_on_a_Benifit() throws Throwable {
driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
driver.findElement(obj.selectitem).click();

}
@When("^the CatalogItemDetailed Page is displayed$")
public void the_CatalogItemDetailed_Page_is_displayed() throws Throwable {
driver.findElement(obj.itemdetailedpage).isDisplayed(); 


}

@Then("^CatalogItemDetailed Page Content Layout is tested$")
public void catalogitemdetailed_Page_Content_Layout_is_tested() throws Throwable {
	galenTest(driver,"specs/YPO_CatalogItemDetailed.spec");
	   
}
//catalog Item detailed dropdown page

@Then("^I click on Family member$")
public void i_click_on_Family_member() throws Throwable {
 driver.findElement(obj.member).click();
    
}


@When("^the CatalogItemDetailedDropdown page is displayed$")
public void theCatalogItemDetailedDropdownpageisdisplayed() throws Throwable{
driver.findElement(obj.dropdownpage).isDisplayed();

}

@Then("^CatalogItemDetailedDropdown Page Content Layout is tested$")
public void catalogitemdetaileddropdown_Page_Content_Layout_is_tested() throws Throwable {
	galenTest(driver,"specs/YPO_CatalogItemDetailDropdown.spec");
	
}
//catalog item detailed add new member page

@Then("^I click on Add a family member$")
public void I_click_on_Add_a_familymember() throws Throwable{
driver.findElement(obj.add).click();

}
@When("^the CatalogItemDetailAddNewMember page is displayed$") 
public void theCatalogItemDetailAddNewMember_page_is_displayed() throws Throwable{
	driver.findElement(obj.addnewmemberpage).isDisplayed();


}
@Then("^CatalogItemDetailAddNewMember Page content Layout is tested$")
public void CatalogItemDetailAddNewMember_Page_content_Layout_is_tested() throws Throwable{
	galenTest(driver,"specs/YPO_CatalogItemDetailAddNewMember.spec");
	
}
//shoppingcart page

@Then("^I click on ReviewShoppingCart button$")
public void i_click_on_ReviewShoppingCart_button() throws Throwable {

WebElement myele=(new WebDriverWait(driver, 60))
		 .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='Review Shopping Cart']")));
Thread.sleep(300);
driver.findElement(obj.reviewbtn).click();
}

@When("^the ShoppingCart page is displayed$")
public void the_ShoppingCart_page_is_displayed() throws Throwable {
	driver.findElement(obj.cartpage).isDisplayed();

}

@Then("^ShoppingCart Page Content Layout is tested$")
public void shoppingcart_Page_Content_Layout_is_tested() throws Throwable { 
	galenTest(driver,"specs/YPO_ShoppingCart.spec");
   	
}
//code of conduct page
@Then("^I click on Proceed to checkout button$")
public void i_click_on_Proceed_to_checkout_button() throws Throwable {
driver.findElement(obj.proceedbtn).click();
	
}
       
@When("^the CodeOfConduct Page is displayed$")
public void the_CodeOfConduct_Page_is_displayed() throws Throwable {
	driver.findElement(obj.codeofconductpage).isDisplayed();

	  
}

@Then("^CodeOfConduct Page content Layout is tested$")
public void codeofconduct_Page_content_Layout_is_tested() throws Throwable {
	galenTest(driver,"specs/YPO_CodeOfConduct.spec");

}

//CheckOutSelectPayment page
@Then("^I click on save&confirm button$")
public void i_click_on_save_confirm_button() throws Throwable {
  driver.findElement(obj.acceptterms).click();
  driver.findElement(obj.confirmbtn_CC).click();	  
}

@When("^the CheckoutSelectPayment Page is displayed$")
public void the_CheckoutSelectPayment_Page_is_displayed() throws Throwable {
 driver.findElement(obj.selectpaymentpage).isDisplayed();

	
}

@Then("^CheckoutSelectPayment Page content Layout is tested$")
public void checkoutselectpayment_Page_content_Layout_is_tested() throws Throwable {
   
	galenTest(driver,"specs/YPO_CheckoutSelectPayment.spec");
	   
}

//CheckoutCreditCard Page

@Then("^I select Credit Card$")
public void i_select_Credit_Card() throws Throwable {
	driver.findElement(By.cssSelector("a.payNow")).click();
       
}

@When("^the CheckoutCreditCard Page is displayed$")
public void the_CheckoutCreditCard_Page_is_displayed() throws Throwable {
	driver.findElement(obj.creditcardpage).isDisplayed();
    
}

	

@Then("^CheckoutCreditCard Page Content layout is tested$")
public void checkoutcreditcard_Page_Content_layout_is_tested() throws Throwable {

	galenTest(driver,"specs/YPO_CheckoutCreditCard.spec");
	   
}

//Checkout  Check Wire

@Then("^I select Check/wire$")
public void i_select_Check_wire() throws Throwable {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	((JavascriptExecutor) driver)
    .executeScript("window.scrollTo(0, document.body.scrollHeight)");

	 driver.findElement(By.xpath("//a[@class='payNow']")).click();
	   WebElement clist;
		clist=driver.findElement(By.id("j_id0:j_id4:j_id15:paymentModeSelect"));
		Select clist1=new Select(clist);
		clist1.selectByVisibleText("Check/Wire");
		
   
}

@When("^the CheckoutCheckWire Page is displayed$")
public void the_CheckoutCheckWire_Page_is_displayed() throws Throwable {
	driver.findElement(obj.checkwirepage).isDisplayed();
	 
    
}

@Then("^CheckoutCheckWire Page Content layout is tested$")
public void checkoutcheckwire_Page_Content_layout_is_tested() throws Throwable {
   
	galenTest(driver,"specs/YPO_CheckoutCheckWire.spec");
	
 
}

//Checkout  Edit Address Modal

@When("^the credit card page is displayed$")
public void the_credit_card_page_is_displayed() throws Throwable {
	driver.findElement(obj.checkoutpage).isDisplayed();
    
    
}

@Then("^I click on Billing Address$")
public void i_click_on_Billing_Address() throws Throwable {
	driver.findElement(obj.billing).click();
     
}

@Then("^I click on Add an Address$")
public void i_click_on_Add_an_Address() throws Throwable {
	driver.findElement(obj.addaddress).click();
	
    
}

@When("^the CheckoutEditAddressModal Page is displayed$")
public void the_CheckoutEditAddressModal_Page_is_displayed() throws Throwable {
	driver.findElement(obj.checkouteditpage).isDisplayed();


}

@Then("^CheckoutEditAddressModal Page content layout is tested$")
public void checkouteditaddressmodal_Page_content_layout_is_tested() throws Throwable {
	galenTest(driver,"specs/YPO_CheckoutEditAddressModal.spec");
   
}

//Review order
@Then("^I click on Review Order$")
public void i_click_on_Review_Order() throws Throwable {
	driver.findElement(obj.revieworderbtn).click();
	
}

@When("^the ReviewOrder page is displayed$")
public void the_ReviewOrder_page_is_displayed() throws Throwable {
	WebElement myDynamicElement = (new WebDriverWait(driver, 40))
			  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='cartIicon']")));	
	driver.findElement(obj.reviewpage).isDisplayed();
     
}

@Then("^ReviewOrder Page content layout is tested$")
public void revieworder_Page_content_layout_is_tested() throws Throwable {
	galenTest(driver,"specs/YPO_ReviewOrder.spec");
  	    
}

//Confirmation Page

@Then("^I click on Submit Order$")
public void i_click_on_Submit_Order() throws Throwable {
	((JavascriptExecutor) driver)
	.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	driver.findElement(By.xpath("//label[@name='CodeofConductCheckName']")).click();
	driver.findElement(obj.submitbtn).click();
	
}

@When("^the Confirmation page is displayed$")
public void the_Confirmation_page_is_displayed() throws Throwable {
	WebElement myDynamicElement = (new WebDriverWait(driver, 40))
			  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='cartIicon']")));
	
	driver.findElement(obj.confirmationpage).isDisplayed();

	
}
   

@Then("^Confirmation Page Content layout is tested$")
public void confirmation_Page_Content_layout_is_tested() throws Throwable {
 
  	galenTest(driver,"specs/YPO_confirmation.spec");

}


//Renewal PAges---
//--------------------------------------------------------------
//welcomepage_Renewal

@Then("^RenewalWelcome Page content layout is tested$")
public void renewalwelcome_Page_content_layout_is_tested() throws Throwable {
	galenTest(driver,"specs/RenewalPages/YPO_RenewalWelcomePage.spec");
   
}



//Recertification Page

@Given("^I login using Valid Credentials of a Renewal user$")
public void i_login_using_Valid_Credentials_of_a_Renewal_user() throws Throwable {
	driver.findElement(obj.username).sendKeys("rupel111@h12.com");  	
	driver.findElement(obj.password).sendKeys("Qentelli@123");
	driver.findElement(obj.login).click();
	
	
}
@When("^the Renewal user welcome page is displayed$")
public void the_Renewal_user_welcome_page_is_displayed() throws Throwable {

	//driver.findElement(By.xpath("//div[@class='thankYouDiv']")).isDisplayed();
   
}

@Then("^I click on Continue Button in Renewal Welcome page$")
public void i_click_on_Continue_Button_in_Renewal_Welcome_page() throws Throwable {
	driver.findElement(By.linkText("START HERE")).click();
 
}

@When("^the Recertification page is Displayed$")
public void the_Recertification_page_is_Displayed() throws Throwable {
	
	driver.findElement(By.xpath("//h2[@class='title']")).isDisplayed();
	

}
                                                                          
@Then("^Recertification Page Content Layout is tested$")
public void recertification_Page_Content_Layout_is_tested() throws Throwable {
	WebElement myDynamicElement = (new WebDriverWait(driver, 40))
			  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='cartIicon']")));
	galenTest(driver,"specs/RenewalPages/YPO_Recertification.spec");
}

@Then("^I click on Continue Button in Recertification Page$")
public void i_click_on_Continue_Button_in_Recertification_Page() throws Throwable {
   //driver.findElement(By.xpath("//input[@id='submitButtonId']")).click();
   //
   //
   driver.navigate().to("https://bwrenew-ypoportal.cs60.force.com/members/thirdpartycertification_screens_ypo");
}

//Thirdparty certification
//--------------------------------------------
@When("^the ThirdpartyCertification page is Displayed$")
public void the_ThirdpartyCertification_page_is_Displayed() throws Throwable {
	driver.findElement(By.xpath("//h2[@class='title']")).isDisplayed();
	
  
}

@Then("^ThirdpartyCertification Page Content Layout is tested$")
public void thirdpartycertification_Page_Content_Layout_is_tested() throws Throwable {
	WebElement myDynamicElement = (new WebDriverWait(driver, 40))
			  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='YPO ']")));
	galenTest(driver,"specs/RenewalPages/YPO_ThirdpartyCertification.spec");


   
}


//Third party Certification Email Page

	@Then("^I select Email Criteria To a Verifier$")
	public void i_select_Email_Criteria_To_a_Verifier() throws Throwable {
		WebElement dropdown=driver.findElement(By.id("j_id0:j_id4:j_id20:EnterpriseTypeInputTextId"));
		Select clist=new Select(dropdown);
		clist.selectByIndex(1);
	    
	}
	@Then("^I click on Pencil Icon in Email Criteria Page$")
	public void i_click_on_Pencil_Icon_in_Email_Criteria_Page() throws Throwable {
		((JavascriptExecutor) driver)
		.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.xpath("//div[@id='emailCriteriaDiv']/h5/span")).click();
	}
	
	@When("^ThirdpartyCertification Continued_Emial Page is displayed$")
	public void thirdpartycertification_Continued_Emial_Page_is_displayed() throws Throwable {
		driver.findElement(By.id("EnterpriseTypeInputTextId")).isDisplayed();
		
	
	}

	@Then("^ThirdpartyCertification Continued_Emial Page Content Layout is tested$")
	public void thirdpartycertification_Continued_Emial_Page_Content_Layout_is_tested() throws Throwable {
		galenTest(driver,"specs/RenewalPages/YPO_ThirdpartyCertification_Continued_Email.spec");

	}
//link to doc page
	@Then("^I select Link to Documentation$")
	public void i_select_Link_to_Documentation() throws Throwable {
		WebElement dropdown=driver.findElement(By.id("j_id0:j_id4:j_id20:EnterpriseTypeInputTextId"));
		Select clist=new Select(dropdown);
		clist.selectByIndex(2); 
		Thread.sleep(45);
	}
	
	@Then("^I click on Pencil Icon in LinkToDocumentation Page$")
	public void i_click_on_Pencil_Icon_in_LinkToDocumentation_Page() throws Throwable {
		((JavascriptExecutor) driver)
		.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.xpath("//div[@id='linkToDocumenDiv']/h5/span")).click();
	}
	@When("^ThirdpartyCertification LinkToDocumentation Page is displayed$")
	public void thirdpartycertification_LinkToDocumentation_Page_is_displayed() throws Throwable {
		driver.findElement(By.id("linkdocInputTextId")).isDisplayed();
	}

	@Then("^ThirdpartyCertification LinkToDocumentation Page Content Layout is tested$")
	public void thirdpartycertification_LinkToDocumentation_Page_Content_Layout_is_tested() throws Throwable {
		galenTest(driver,"specs/RenewalPages/YPO_ThirdpartyCertification_Continued_LinktoDoc.spec");
	}

//third Party certification continued upload doc
	@Then("^I select Upload Documents$")
	public void i_select_Upload_Documents() throws Throwable {
		WebElement dropdown=driver.findElement(By.id("j_id0:j_id4:j_id20:EnterpriseTypeInputTextId"));
		Select clist=new Select(dropdown);
		clist.selectByIndex(3);   
	    
	}
	@Then("^I click on Pencil Icon in Upload documents Page$")
	public void i_click_on_Pencil_Icon_in_Upload_documents_Page() throws Throwable {
		((JavascriptExecutor) driver)
		.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.xpath("//div[@id='uploadDocumentDiv']/h5/span")).click();
	}
	@When("^ThirdpartyCertification Upload documents Page is displayed$")
	public void thirdpartycertification_Upload_documents_Page_is_displayed() throws Throwable {
		driver.findElement(By.id("uploaddocInputTextId")).isDisplayed();
	   
	}

	@Then("^ThirdpartyCertification Upload documents Page Content Layout is tested$")
	public void thirdpartycertification_Upload_documets_Page_Content_Layout_is_tested() throws Throwable {
		galenTest(driver,"specs/RenewalPages/YPO_ThirdPartyCertification_Continued_UploadDoc.spec");
	}

//Print doc page
	
	@Then("^I select Print documentation$")
	public void i_select_Print_documentation() throws Throwable {
		WebElement dropdown=driver.findElement(By.id("j_id0:j_id4:j_id20:EnterpriseTypeInputTextId"));
		Select clist=new Select(dropdown);
		clist.selectByIndex(4); 
	}

	@When("^ThirdpartyCertification Print Documentation  Page is displayed$")
	public void thirdpartycertification_Print_Documentation_Page_is_displayed() throws Throwable {
		//code for displayed
	}

	@Then("^ThirdpartyCertification Print Documentation  Page Content Layout is tested$")
	public void thirdpartycertification_Print_Documentation_Page_Content_Layout_is_tested() throws Throwable {
		galenTest(driver,"specs/RenewalPages/YPO_ThirdPartyCertification_Continued_PrintDoc.spec");
	}

//Grace page
@When("^we go to Grace page$")
public void we_go_to_Grace_page() throws Throwable {
	driver.navigate().to("https://bwrenew-ypoportal.cs60.force.com/members/grace_ypo");
	
}

@Then("^Grace Page Content Layout is tested$")
public void grace_Page_Content_Layout_is_tested() throws Throwable {
	WebElement myDynamicElement = (new WebDriverWait(driver, 40))
			  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='saveContinueId']")));

	galenTest(driver,"specs/RenewalPages/YPO_Grace.spec");
}

//Lifetime Option page
@When("^we go to LifetimeOption Page$")
public void we_go_to_LifetimeOption_Page() throws Throwable {
	driver.navigate().to("https://bwrenew-ypoportal.cs60.force.com/members/LifetimeOption_ypo");
	driver.findElement(obj.username).sendKeys("theprospect@qentelli.com");  	
	driver.findElement(obj.password).sendKeys("Salesforce@123");
	driver.findElement(obj.login).click();
}

@Then("^LifetimeOption Page Content Layout is tested$")
public void lifetimeoption_Page_Content_Layout_is_tested() throws Throwable {
	WebElement myDynamicElement = (new WebDriverWait(driver, 40))
			  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='cartIicon']")));
	galenTest(driver,"specs/RenewalPages/YPO_LifetimeOption.spec");
}

//Member does not meet page
@When("^we go to YPO_ThirdPartyCertification_MemberDoesNotMeet Page$")
public void we_go_to_YPO_ThirdPartyCertification_MemberDoesNotMeet_Page() throws Throwable {
	driver.navigate().to("https://bwrenew-ypoportal.cs60.force.com/members/MemberDoesNotMeet_ypo");
	driver.findElement(obj.username).sendKeys("theprospect@qentelli.com");  	
	driver.findElement(obj.password).sendKeys("Salesforce@123");
	driver.findElement(obj.login).click();
	

}

@Then("^YPO_ThirdPartyCertification_MemberDoesNotMeet Page Content Layout is tested$")
public void ypo_thirdpartycertification_memberdoesnotmeet_Page_Content_Layout_is_tested() throws Throwable {
	galenTest(driver,"specs/RenewalPages/YPO_ThirdPartyCertification_MemberDoesNotMeet.spec");

}

//Gold TransitionOption Page

@When("^we go to GoldTransitionOption Page$")
public void we_go_to_GoldTransitionOption_Page() throws Throwable {
	driver.navigate().to("https://bwrenew-ypoportal.cs60.force.com/members/Gold_Transition_Option_YPO");
	
	
    
}

@Then("^GoldTransitionOption Page Content Layout is tested$")
public void goldtransitionoption_Page_Content_Layout_is_tested() throws Throwable {
	galenTest(driver,"specs/RenewalPages/YPO_GoldTransitionOption.spec");
    
}

//Explore Your Membership Benefits Page

@When("^we go to ExploreYourMembershipBenefits Page$")
public void we_go_to_ExploreYourMembershipBenefits_Page() throws Throwable {
driver.navigate().to("https://bwrenew-ypoportal.cs60.force.com/members/splash_ypo");

}

@Then("^ExploreYourMembershipBenefits Page Content Layout is tested$")
public void exploreyourmembershipbenefits_Page_Content_Layout_is_tested() throws Throwable {
	WebElement myDynamicElement = (new WebDriverWait(driver, 40))
			  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='cartIicon']")));;
	galenTest(driver,"specs/RenewalPages/YPO_ExploreYourMembershipBenefits.spec");
	
}
//CompanyInformationYPOGold page
@When("^we go to CompanyInformationYPOGold page$")
public void we_go_to_CompanyInformationYPOGold_page() throws Throwable {
	driver.navigate().to("https://bwrenew-ypoportal.cs60.force.com/members/recertification_ypo");
	driver.findElement(obj.username).sendKeys("theprospect@qentelli.com");  	
	driver.findElement(obj.password).sendKeys("Salesforce@123");
	driver.findElement(obj.login).click();
}

@Then("^CompanyInformationYPOGold Page Content Layout is tested$")
public void companyinformationypogold_Page_Content_Layout_is_tested() throws Throwable {
	WebElement myDynamicElement = (new WebDriverWait(driver, 40))
			  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='cartIicon']")));
	galenTest(driver,"specs/RenewalPages/CompanyInformationYPOGold.spec");
}

public LayoutReport galenTest(WebDriver driver, String specPath) throws IOException{
	String DeviceType="mobile";
	Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
	String deviceDetails=getCapabilities(cap);
	String browserName = deviceDetails.split("_")[1];
	System.out.println(browserName);
    String os = deviceDetails.split("_")[0];
    System.out.println(os);
    String v = cap.getVersion().toString();
    if((os.toLowerCase().equalsIgnoreCase("windows"))||(browserName.toLowerCase().contains("safari")&&os.equalsIgnoreCase("mac"))||(browserName.toLowerCase().contains("iPad")&&os.toLowerCase().equalsIgnoreCase("mac"))){
    	DeviceType="desktop";
    }
    if(os.toLowerCase().contains("ipad")){
    	DeviceType="desktop";
    }
  
	LayoutReport layoutReport = Galen.checkLayout(driver, specPath,Arrays.asList(""+DeviceType+""), null, null, null);
	GalenTestInfo test = GalenTestInfo.fromString(browserName+"_"+os+"_"+BaseStepDefs.s.getName());
	//GalenTestInfo test = GalenTestInfo.fromString(TestngXMLGenerator2.browserName+"_"+TestngXMLGenerator2.OS+"_"+BaseStepDefs.s.getName());
	//	browserName,OS
	test.getReport().layout(layoutReport, BaseStepDefs.s.getName());
	BaseStepDefs.tests.add(test);
	String TestResult="LayOut Satisfied",abc="LayOut Satisfied";
	if(test.isFailed()){
		TestResult="LayOut Not Satisfied";
	}
	Assert.assertEquals(TestResult,abc );
	return layoutReport;
}

public String getCapabilities(Capabilities cap ){
	
	System.out.println("************Started To print Browser Capabilities For the Current Instance***************");
	String deviceName ;
	try {
		deviceName = cap.getCapability("device").toString();
	    System.out.println("deviceName : "+ deviceName);
	}
	catch(NullPointerException ex){
		deviceName=cap.getCapability("platform").toString();
		System.out.println("platform : "+deviceName);
	}
	String browserName = cap.getBrowserName().toLowerCase();
	System.out.println("browserName : "+browserName);

	System.out.println("************Ending To print Browser Capabilities***************");
	return deviceName+"_"+browserName;
}


}






