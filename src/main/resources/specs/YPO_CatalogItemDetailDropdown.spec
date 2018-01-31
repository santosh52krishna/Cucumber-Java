
@objects

    navHeader       xpath	    //div[@class='navbar-header top-head']
    YPOLOGO		    xpath      //img[@alt="YPO "]
    CartIcon        xpath      //div[@class='cartIicon']
    headerpanel     xpath      //div[@class='col-md-8 col-xs-12 col-md-offset-2 catalogBack headtop']
    Body 			xpath      //div[@class='col-md-8 col-xs-12 col-md-offset-2 btnsDiv paddiing-top']
     
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
		    
		headerpanel:
           width 620 to 630px  
   
        Body :
		   css font-family contains "FFTisaWebPro"
  
         