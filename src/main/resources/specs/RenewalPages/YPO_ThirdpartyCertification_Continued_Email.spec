@objects
	Emailheader        xpath     //div[@class='hidebg-blue']
	NameField          xpath     //input[@id='thridPartyFullname']
	CompanyField       xpath     //input[@id='thridPartyCompnayName']
	PhoneNoField       xpath     //input[@id='thridPartyPhoneNumber']
	EmailField         xpath     //input[@id='thridPartyEmail']
	EmailFooter		   xpath	 //div[@class='hidebg-blue white']
	Savelinktop		   xpath	 //button[@id='emailCrtiteriaUpSaveId']
	Savelinkbottom	   xpath	 //button[@id='emailCrtiteriaDownSaveId']
	buttonpannel       xpath     //div[@class='btm-btns whiteBox pageBtns']
	Body			   xpath 	 //div[@class='col-md-10 col-md-offset-1 col-lg-8 col-lg-offset-2']
	PannelHeader       xpath 	 //h5
	DropdownPannel	   xpath 	 //div[@class='selectDrop input-select']
	Backbutton		   xpath     //a[@class='btn btn-gray']
    Continuebutton	   xpath 	 //button[@class='btn btn-blue']


= Content =
    @on desktop
    	DropdownPannel:
    		width ~778px
    		height 80 to 86px
    		aligned vertically all PannelHeader
		
		PannelHeader:
    		width ~778px
    		height ~37px

		Emailheader:
        	width ~778px
        	height ~52px
        	aligned vertically all DropdownPannel
        	aligned vertically all DropdownPannel
        NameField:
        	aligned vertically all EmailField
        	width ~693px
        CompanyField:
        	width ~693px
        	aligned vertically all EmailField
        PhoneNoField:
        	width ~693px
        	aligned vertically all EmailField
        EmailField:
        	width ~693px
        	aligned vertically all NameField
        EmailFooter:
        	width ~778px
        	height ~44px
        Savelinktop:
        	width ~56px
        	height ~22px
        	aligned vertically all Savelinkbottom
        	
        Savelinkbottom:
        	width ~56px
        	height ~22px
        	
        buttonpannel:
        	width ~778px
        	height ~74px
		Backbutton:
			width ~104px
			height ~34px
			aligned horizontally all Continuebutton
		Continuebutton:
			width 25px
			height 10px
        Body :
		    css font-family contains "FFTisaWebPro"
           
	@on mobile
    	DropdownPannel:
    		width 330 to 345px
    		height ~82px
    		aligned vertically all PannelHeader
		
		PannelHeader:
    		width 330 to 345px
    		height ~37px
    	DropdownPannel:
    		width 330 to 345px
    		height ~81px
    		aligned vertically all PannelHeader
    	PannelHeader:
			width 330 to 345px
            height ~37px
    		
		Emailheader:
        	width 330 to 345px
        	height ~51px
        	aligned vertically all DropdownPannel
        	aligned vertically all DropdownPannel
        NameField:
        	aligned vertically all EmailField
        	width 245 to 260px
        CompanyField:
        	width 245 to 260px
        	aligned vertically all EmailField
        PhoneNoField:
        	width 245 to 260px
        	aligned vertically all EmailField
        EmailField:
        	width 245 to 260px
        	aligned vertically all NameField
        EmailFooter:
        	width 330 to 345px
        	height ~42px
        Savelinktop:
        	width ~56px
        	height ~22px
        	aligned vertically all Savelinkbottom
        	
        Savelinkbottom:
        	width ~56px
        	height ~22px
        	
        buttonpannel:
        	width 360 to 375px
        	height ~74px
		Backbutton:
			width ~77px
			height ~33px
			aligned horizontally all Continuebutton
		Continuebutton:
			width ~104px
			height ~33px	
        Body :
		    css font-family contains "FFTisaWebPro"
       	
       