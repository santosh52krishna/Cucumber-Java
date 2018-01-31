@objects
	
	linktoDocheader   				 xpath     //form[@id='j_id0:j_id4:j_id20']/section/div[5]/div/div
	CertificationOptionsDropdown     xpath     //select[@id='linkdocInputTextId']
	LinktoDocField                   xpath     //input[@id='linkdocurlInputTextId']
	linktoDocFooter					 xpath	   //form[@id='j_id0:j_id4:j_id20']/section/div[5]/div/div[4]
	Savelinktop						 xpath	   //button[@id='linkdocumentationUpSaveId']
	Savelinkbottom          		 xpath	   //button[@id='linkdocumentationDownSaveId']
	buttonpannel       				 xpath     //div[@class='btm-btns whiteBox pageBtns']
	Body							 xpath 	   //div[@class='col-md-10 col-md-offset-1 col-lg-8 col-lg-offset-2']
	PannelHeader       				 xpath 	   //h5
	DropdownPannel	   				 xpath 	   //div[@class='selectDrop input-select']
	Backbutton				         xpath     //a[@class='btn btn-gray']
	Continuebutton					 xpath 	   //button[@class='btn btn-blue']


= Content =
    @on desktop
		linktoDocheader:
			width ~778px
			height ~52px 
		PannelHeader:
			width ~778px
			height ~37px
		linktoDocFooter:
			width ~778px
			height ~52px
		LinktoDocField:
			width 690 to 710px
			height ~52px	
		Savelinktop:
			width ~56px
			height ~22px 
		Savelinkbottom:
			width ~56px
			height ~22px
		CertificationOptionsDropdown:
			width ~693px
			aligned vertically all LinktoDocField
		buttonpannel:
			width ~778px
			height ~74px
		DropdownPannel:
			width ~778px
			height 80 to 86px
			aligned vertically all PannelHeader
		Backbutton:
			width ~77px
			height ~33px
			aligned horizontally all Continuebutton
		Continuebutton:
			width ~104px
			height ~33px	

		Body:
			css font-family contains "FFTisaWebPro"
   
	@on mobile
		linktoDocheader:
			width 330 to 345px
			height ~42px 
		PannelHeader:
			width 330 to 345px
			height ~37px
		linktoDocFooter:
			width 330 to 345px
			height ~52px
		LinktoDocField:
			width 280 to 295px
			height ~64px	
		Savelinktop:
			width ~56px
			height ~22px 
		Savelinkbottom:
			width ~56px
			height ~22px
		CertificationOptionsDropdown:
			width 290 to 305px
			aligned vertically all LinktoDocField
		buttonpannel:
			width 360 to 375px
			height ~74px
		DropdownPannel:
			width 330 to 345px
			height 80 to 86px
			aligned vertically all PannelHeader
		Backbutton:
			width ~77px
			height ~33px
			aligned horizontally all Continuebutton
		Continuebutton:
			width ~104px
			height ~33px	
		Body:
			css font-family contains "FFTisaWebPro"