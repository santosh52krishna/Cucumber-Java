@objects
	
	PrintDocheader   				 xpath     //div[@class='hidebg-blue']
	CertificationOptionsDropdown     xpath     //select[@id='uploaddocInputTextId']
	PrintDocFooter					 xpath	   //div[@class='hidebg-blue white']
	Savelinktop						 xpath	   //button[@id='uploadDocumeationDownSaveId']
	Savelinkbottom          		 xpath	   //button[@id='uploadDocumeationUpSaveId']
	buttonpannel       				 xpath     //div[@class='btm-btns whiteBox pageBtns']
	Body							 xpath 	   //div[@class='col-md-10 col-md-offset-1 col-lg-8 col-lg-offset-2']
	PannelHeader       				 xpath 	  //h5
	DropdownPannel	   				 xpath 	  //div[@class='selectDrop input-select']
	Backbutton						 xpath    //a[@class='btn btn-gray']
	Continuebutton					 xpath 	  //button[@class='btn btn-blue']

= Content =
    @on desktop
		PannelHeader:
			width ~778px
			height ~37px
		DropdownPannel:
			width 778px
			height 80 to 86px
			aligned vertically all PannelHeader		 
		buttonpannel:     				 
			width ~778px
			height ~73px	
		Body :
			css font-family contains "FFTisaWebPro"
		Backbutton:
			width 25px
			height 10px
			aligned horizontally all Continuebutton
		Continuebutton:
			width 25px
			height 10px
		
    
    @on mobile
		PannelHeader:
			width 330 to 345px
			height ~37px
		DropdownPannel:
			width 330 to 345px
			height 80 to 86px
			aligned vertically all PannelHeader		 
		buttonpannel:     				 
			width 360 to 375px
			height ~73px	
		Body :
			css font-family contains "FFTisaWebPro"
		Backbutton:
			width ~77px
			height ~33px
			aligned horizontally all Continuebutton
		Continuebutton:
			width ~104px
			height ~33px
		