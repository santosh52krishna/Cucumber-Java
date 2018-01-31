
@objects

  navHeader    	 			 xpath	     //div[@class='navbar-header top-head']
  YPOLOGO					 xpath       //img[@alt="YPO "]
  CartIcon     				 xpath       //div[@class='cartIicon']
  invoicebutton              xpath       //button[@class='btn btn-blue']
  image                      xpath       //img[@id='j_id0:j_id2:theImage']
  congratsblock              xpath       //section[@class='congratsBlock']
  Body						 xpath 		 //section[@class='congratsBlock']
  
  
  
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
		invoicebutton :
           width ~123px
           css font-family contains "Gentona-Book"
           text is "Print Invoice"
		 
        image :
           height 129px
           width  150px
        congratsblock:
           width 88 to 95 % of screen/width
           
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
		invoicebutton :
           width ~123px
           text is "Print Invoice"
        image :
           height ~129px
           width ~150px