
@objects

    navHeader  		   xpath	   //div[@class='navbar-header top-head']
    YPOLOGO		 	   xpath     //img[@alt="YPO "]
    CartIcon    	   xpath     //div[@class='cartIicon']
    backbutton         xpath    //button[@type='button']
    backbtnmobile      xpath    //button[@type='button']
    continuebutton     xpath    (//button[@type='button'])[2]
    continebtnmobie    xpath    //button[@id='continueBTN']
    networkpanel       xpath    //div[@class='panel']
    radiobutton        xpath    //div[@class='radioButtonDiv'] 
    buttonpannel       xpath    //div[@class='btns-div btm-btns whiteBox']
    main               xpath    //div[@class='row'] 
    Body               xpath    //div[@class='col-md-10 col-md-offset-1 col-lg-8 col-lg-offset-2']
   

= Content =
	@on desktop
		navHeader:
        	height	53px
        YPOLOGO:
	        width ~ 50px
	        inside screen 25 to 45px left
		CartIcon:
		    width ~ 35px
		    right-of YPOLOGO 840 to 850px
		continuebutton :
			height ~33px
			near backbutton ~13px right 
			css font-family contains "Gentona-Book"
			text is "Continue to Catalog"
			
        backbutton :
            height ~33px
            aligned horizontally all continuebutton 
            text is "Back"
        networkpanel :
            width 720 to 780 px
            width 75 to 95 % of screen/width
            inside main ~262 px top  
        radiobutton:
            height 15px
            
        buttonpannel :
            width 720 to 780 px
            width 75 to 95 % of screen/width
            
        Body :
		    css font-family contains "FFTisaWebPro"
            
       
       
            
           
           
	@on mobile
		navHeader:
        	height	53px
        YPOLOGO:
	        width ~ 50px
	        inside screen 0 to 10px left
		CartIcon:
		    width ~ 35px
		    right-of YPOLOGO 250 to 280px
		continebtnmobie :
            height ~33px
            text is "Continue to Catalog"
        backbtnmobile :
            height ~33px
            aligned horizontally all continuebutton
            text is "Back"
        networkpanel :
            width 330 to 350 px
        radiobutton:
            height 15px
       
           
           
            
                 
           