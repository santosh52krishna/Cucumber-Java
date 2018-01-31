package cucumber.examples.java.testNG.stepDefinitions;

import org.openqa.selenium.By;

public  class YPOObjects {
	//login page
	By username=By.id("username");
	By password=By.id("password");
	By login=By.id("Login");
	//welcomepage
	By welcomepageHeader=By.xpath("//h2[text()='Welcome to YPO']");
	By continuebtn1=By.xpath("//a[contains(text(),'Continue')]");	 
	//updateprofilepage
	By updatepageheader=By.xpath("//h1[text()='Update Profile Information']");
	By confirmbtn=By.id("saveConfirmProfileButtonId");
	By confirmbtnmobile=By.id("saveConfirmProfileButtonMobileId");
	//ChooseAnetwork
	By ChooseanetworkpageHeader=By.xpath("//h2[text()='Choose a Business Network']");
	By radiobtn=By.className("radioButtonDiv");
	By continuebtn=By.id("continueBTN");
	//Catalog
	By catalogpageHeader=By.xpath("//h2[text()='YPO Membership Catalog']");
	By cart=By.xpath("//span[@id='pageId:j_id5:j_id88:pagblockId:cartPanelId']/section/div/div/div/div/div/span/span");
	By addtocart=By.xpath("//input[@value='Add to cart']");
	By reviewbtn=By.xpath("//input[@value='Review Shopping Cart']");
	//catalogModal
	By catalogmodal=By.xpath("//div[@class='modal-header']");
	By remove=By.linkText("REMOVE");
	By selectitem=By.xpath("//span[@class='kgvenue name']");
	//catalogItemDetailed
	By itemdetailedpage=By.cssSelector("span.backTo");
	By member=By.cssSelector("div.familyMember > a");
	//catlogitemdetaileddropdown
	By dropdownpage=By.cssSelector("div.addFamily"); 
	By add=By.cssSelector("div.addFamily"); 
	//catalogitemdetaileddropdownaddnewmember
	By addnewmemberpage=By.cssSelector("span.backTo"); 
	By btn=By.xpath("//input[@value='Review Shopping Cart']");
	//shoppingcartpage
	By cartpage=By.xpath("//h2[text()='Shopping Cart']");
	By proceedbtn=By.xpath("//a[contains(text(),'Proceed to check out')]");
	//codeofconduct
	By codeofconductpage=By.xpath("//h2[text()='Code of Conduct']");
	By acceptterms=By.xpath("//label[@name='codeOfConduct']");
	By confirmbtn_CC=By.id("continueBTN"); 
	//checkoutSelectpaymentpage
	By selectpaymentpage=By.xpath("//h2[text()='Checkout']"); 
	By dropdown1=By.id("j_id0:j_id4:j_id15:paymentModeSelect"); 
	By revieworderbtn=By.id("ReviewOrderButton");
	//creditcardpage
	By creditcardpage=By.xpath("//h2[text()='Checkout']");
	By dropdown2=By.id("j_id0:j_id4:j_id15:paymentModeSelect"); 
	//checkwirepage
	By checkwirepage=By.xpath("//h2[text()='Checkout']");
	//checkouteditpage
    By checkoutpage=By.id("j_id0:j_id4:j_id15:CardHolderNameInputTextId"); 
	By billing=By.xpath("//div[@id='carddivId']/div[4]/div/span");
	By addaddress=By.linkText("Add an Address");
	//checkouteditaddressmodalpage
	By checkouteditpage=By.xpath("//h4[text()='Add an Address']");
	//revieworderpage
	By reviewpage=By.xpath("//h2[text()='Review Order']"); 
	By submitbtn=By.xpath("//button[@type='button']");
	//confirmationpage
	By confirmationpage=By.cssSelector("button.btn.btn-blue");
    //Recertificationpage
	By recertificationpage=By.xpath("//h2[text()='Recertification']");

//Renewal Pages
	


}

	