
@objects
    navHeader     			  xpath	    //div[@class='navbar-header top-head']
    YPOLOGO		  			  xpath     //img[@alt="YPO "]
    CartIcon     			  xpath     //div[@class='cartIicon']
    save&returntocart         xpath     //input[@value='Save and Return to Cart']
    revieworder               xpath     //input[@value='Review Order']
    buttonpannel              xpath     //div[@class='btm-btns btm-btns whiteBox']
    main                      xpath     //div[@class='row']
    Body                      xpath     //div[@class='col-md-10 col-md-offset-1 col-lg-8 col-lg-offset-2']
    
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
		    
		save&returntocart :
            width ~192px
            aligned horizontally all revieworder
            text is "Save and Return to Cart"
            css font-family contains "Gentona-Book"
        revieworder  :
            width ~128px
            near save&returntocart ~13px right 
			css font-family contains "Gentona-Book"
			text is "Review Order"
			
		buttonpannel :
		    width 750 to 780px
            width 60 to 80 % of screen/width
            inside main ~10px bottom
          
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
        save&returntocart :
            width ~192px
            aligned horizontally all revieworder
            text is "Save and Return to Cart"
        revieworder  :
            width ~128px
            text is "Review Order"
		buttonpannel :
		    width 358 to 375px
        
          
             
          
         
         
          
       
          
           