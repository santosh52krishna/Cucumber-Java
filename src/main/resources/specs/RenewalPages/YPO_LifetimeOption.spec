@objects

    navHeader        xpath	    //div[@class='navbar-header top-head']
    YPOLOGO		     xpath     //img[@alt="YPO "]
    CartIcon         xpath     //div[@class='cartIicon']
    Title    	 	 xpath    	//h1[@class='title']
	Body1     	 	 xpath    	//ul
	Body2     	 	 xpath    	//div[@class='memberServices']
    RenewButton   	 xpath    	//input[@class='btn btn-blue']
    BackButton     	 xpath    	//input[@class='btn btn-gray']
    Buttonpannel  	 xpath    	//div[@class='btm-btns whiteBox']
     
= Content =
	@on desktop
		navHeader:
        	height	53px
        YPOLOGO:
	        width ~ 50px
	        inside screen 25 to 45px left
		CartIcon:
		    width ~ 35px
		    right-of YPOLOGO ~850px
        Title:
        	text starts "Lifetime Option"
        Body1:
           css font-family contains "FFTisaWebPro"
        Body2:
		   css font-family contains "FFTisaWebPro"
		   
	    RenewButton:
           width 149 to 154px
           css font-family contains "Gentona-Book"
           text is "Renew As Annual"
        
        BackButton:
        
           width ~77px
           css font-family contains "Gentona-Book"
           text is "Back"
		
		Buttonpannel:
		   height ~74px
		   width  ~778px
		   width 60 to 80 % of screen/width
		   
	@on mobile
		navHeader:
        	height	53px
        YPOLOGO:
	        width ~ 50px
	        inside screen 0 to 10px left
		CartIcon:
		    width ~ 35px
		    right-of YPOLOGO 250 to 280px
        Title:
        	text starts "Lifetime Option"
        Body1:
           css font-family contains "FFTisaWebPro"
        Body2:
		   css font-family contains "FFTisaWebPro"
		   
	    RenewButton:
           width 149 to 154px
           css font-family contains "Gentona-Book"
           text is "Renew As Annual"
        
        BackButton:
           width ~77px
           css font-family contains "Gentona-Book"
           text is "Back"
		
		Buttonpannel:
		   height ~74px
		   width  360 to 370px
		
        
	      