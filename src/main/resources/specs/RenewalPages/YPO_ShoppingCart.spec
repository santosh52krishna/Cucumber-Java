
@objects

	navHeader    		 xpath	    //div[@class='navbar-header top-head']
    YPOLOGO		 		 xpath      //img[@alt="YPO "]
    CartIcon      		 xpath      //div[@class='cartIicon']
    returnbutton         xpath      //a[contains(text(),'Return to Catalog')]
    proceedbutton        xpath      //a[contains(text(),'Proceed to check out')]

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
		returnbutton:
			width ~154px
            text is "Return to Catalog"
        
        proceedbutton:
        	width ~175px
        	text is "Proceed to check out"
        	aligned horizontally all returnbutton
       	 	near returnbutton ~13px right 
	    	css font-family contains "Gentona-Book"
	     
	    
           
	@on mobile
		
		navHeader:
        	height	53px
        YPOLOGO:
	        width ~ 50px
	        inside screen 0 to 10px left
		CartIcon:
		    width ~ 35px
		    right-of YPOLOGO 250 to 280px
		returnbutton:
			width ~154px
            text is "Return to Catalog"		
		 	  
        proceedbutton:
        	width ~175px
         	aligned horizontally all returnbutton
         	text is "Proceed to check out"
        
          
         