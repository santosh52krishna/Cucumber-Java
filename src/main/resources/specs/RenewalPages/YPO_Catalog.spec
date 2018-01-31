
@objects

    navHeader          xpath	 //div[@class='navbar-header top-head']
    YPOLOGO		  	   xpath     //img[@alt="YPO "]
    CartIcon     	   xpath     //div[@class='cartIicon']
	networkpannel      xpath     //div[@class='panel']
    addbutton          xpath     //input[@value='Add to cart']
    backbutton         xpath     //input[@value='Back']
    reviewcartbutton   xpath     //input[@value='Review Shopping Cart']
    buttonpannel       xpath     //div[@class='whiteBox btm-btns btm-btns']
    Body	 		   xpath     //div[@class='col-md-10 col-md-offset-1 col-lg-8 col-lg-offset-2']


       
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
		networkpannel:
			width  750 to 780px
			width 60 to 80 % of screen/width
           
		   

        addbutton:
            width ~ 115px
            text is "Add to cart"
            
        backbutton:
            width ~ 77px
            aligned horizontally all reviewcartbutton
            text is "Back"
     
        reviewcartbutton:
        	width 178 to 184px
        	near backbutton ~13px right 
			css font-family contains "Gentona-Book"
			text is "Review Shopping Cart"	 
			
		buttonpannel:
		    width 750 to 780px
			width 70 to 80 % of screen/width
		
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
        networkpannel:
            width 330 to 350px
         

        addbutton:
            width ~ 115px
            text is "Add to cart"
        backbutton:
            width ~ 77px
            text is "Back"
            #aligned horizontally all reviewcartbutton
            
        reviewcartbutton:
        	width ~ 180px
        	text is "Review Shopping Cart"	    
 		