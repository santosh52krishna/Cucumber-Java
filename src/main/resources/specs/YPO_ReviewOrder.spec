
@objects

    returntocart      		xpath       //input[@value='Return to Cart']
    submitorder       		xpath       //button[@type='button'] 
    cartpannel        		xpath       //div[@class='shoppingCartBlock']
    main              		xpath       //div[@class='row']
    Body              		xpath       //div[@class='container']    
    YPOLOGO		  	  		xpath       //img[@alt="YPO "]
    CartIcon      	 		xpath       //div[@class='cartIicon']
    ContactdetailsPannel 	xpath       //div[@class='whiteBox']
    navHeader    		    xpath	    //div[@class='navbar-header top-head']
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
        returntocart :
           width ~134px 
           text is "Return to Cart"          
        submitorder :
           width ~128px
           text is "Submit Order"
           aligned horizontally all returntocart
           near returntocart ~13px right 
		   css font-family contains "Gentona-Book"
        cartpannel :
           width 640 to 650px  
           aligned horizontally top ContactdetailsPannel
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
		    right-of YPOLOGO 240 to 260px
        returntocart :
           width ~133px 
           text is "Return to Cart"          
        submitorder :
           width ~130px
		   text is "Submit Order"   
        cartpannel :
           width 330 to 345px  
           
           
         
           
           
           
           