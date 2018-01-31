
@objects
    navHeader     xpath	    //div[@class='navbar-header top-head']
    YPOLOGO		  xpath     //img[@alt="YPO "]
    CartIcon      xpath     //div[@class='cartIicon']
   
    



= Content =
	@on desktop,
		navHeader:
        	height	53px
        YPOLOGO:
	        width ~ 50px
	        inside screen 25 to 45px left
		CartIcon:
		    width ~ 35px
		    right-of YPOLOGO 840 to 850px
		    
	@on mobile,
		navHeader:
        	height	53px
        YPOLOGO:
	        width ~ 50px
	        inside screen 0 to 10px left
		CartIcon:
		    width ~ 35px
		    right-of YPOLOGO 250 to 280px
		 	  
	@on iPad
		navHeader:
        	height	53px
        YPOLOGO:
	        width ~ 50px
	        inside screen 30 to 45px left
		CartIcon:
		    width ~ 35px
		    right-of YPOLOGO ~850px
		    
	  
