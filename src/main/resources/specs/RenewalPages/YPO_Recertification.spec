@objects
	navHeader     					xpath	    //div[@class='navbar-header top-head']
    YPOLOGO		 					xpath       //img[@alt="YPO "]
    CartIcon     				    xpath       //div[@class='cartIicon']
	header		      				xpath  		//h2[@class='title']
	pencilicon         				xpath   	//span[@class='glyphicon glyphicon-pencil']
	Qualifyingcompanypannel 		xpath  		//div[@class='panel mainMem']
	MainMembershipCriteriaPannel 	xpath       //div[@id='ContactDetailDivPanelId']
    backbutton         				xpath       //input[@value='Back']
    Continuebutton     				xpath       //input[@id='submitButtonId']
    buttonpannel       				xpath       //div[@class='btm-btns btm-btns whiteBox']
    Body               				xpath       //div[@class='col-md-10 col-md-offset-1 col-lg-8 col-lg-offset-2']
       
= Content =
    @on desktop
		header:
			text is "Recertification"	  
	    pencilicon:
        	height ~18px
        	width ~24px
                
        Qualifyingcompanypannel:
        	height ~47px
        	width ~778px
        	aligned vertically all MainMembershipCriteriaPannel
        	aligned vertically all MainMembershipCriteriaPannel
        
        	
		MainMembershipCriteriaPannel:
			height ~47px
			width ~778px

        backbutton:
            width ~ 77px
            aligned horizontally all Continuebutton
            text is "Back"
            css font-family contains "Gentona-Book"
        
        Continuebutton:
            width ~ 102px
            aligned horizontally all backbutton
            text is "Continue"
            css font-family contains "Gentona-Book"
		buttonpannel:
		    width 750 to 780px
			width 60 to 80 % of screen/width

        Body :
		    css font-family contains "FFTisaWebPro"
 
    @on mobile
    	header:
			text is "Recertification"	  
	    pencilicon:
        	height ~18px
        	width ~24px
        
        Qualifyingcompanypannel:
        	height ~57px
        	width ~345px
        	aligned vertically all MainMembershipCriteriaPannel
        	aligned vertically all MainMembershipCriteriaPannel
        
        	
		MainMembershipCriteriaPannel:
			height ~57px
			width 345px


			
        backbutton:
            width ~375px
            aligned horizontally all Continuebutton
            text is "Back"
            css font-family contains "Gentona-Book"
        
        Continuebutton:
            width ~ 102px
            aligned horizontally all backbutton
            text is "Continue"
            css font-family contains "Gentona-Book"
		buttonpannel:
		    width ~375px
			

        Body :
		    css font-family contains "FFTisaWebPro"
		 