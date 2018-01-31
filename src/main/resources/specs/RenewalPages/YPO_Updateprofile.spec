
@objects
    
    navHeader     xpath	    //div[@class='navbar-header top-head']
    YPOLOGO		  xpath     //img[@alt="YPO "]
    CartIcon      xpath     //div[@class='cartIicon']
    savebutton         xpath     //button[@id='saveConfirmProfileButtonId']
    savebtnmobile      xpath     //a[contains(text(),'Save & Confirm')]    
    backbutton         xpath     //a[@class='btn btn-gray']
    backbtnmobile      xpath     (//a[contains(text(),'Back')])[5]
    subheaderpanel     xpath     //div[@class='panel']
    main               xpath     //div[@class='row']
    Body               xpath     //div[@class='col-md-10 col-md-offset-1 col-lg-8 col-lg-offset-2']
 

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
        savebutton :
            height ~34px
            width ~258px
            near backbutton ~13px right 
            css font-family contains "Gentona-Book"
            text is "Save & Confirm Profile Information"

        subheaderpanel:
           width ~776px
           width 74 to 84 % of screen/width
           inside main ~123 px top  

        backbutton  :
           width ~77px
           height ~34px
           aligned horizontally all savebutton
           text is "Back"
           css font-family contains "Gentona-Book"
           
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
         savebtnmobile :
            height ~34px
            text is "Save & Confirm"         
         subheaderpanel:
           width 330 to 350 px
         backbtnmobile :
           aligned horizontally all savebtnmobile
           text is "Back"
    	
  