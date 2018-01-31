
@objects
     
    navHeader    		xpath	   //div[@class='navbar-header top-head']
    YPOLOGO				xpath      //img[@alt="YPO "]
    CartIcon      		xpath      //div[@class='cartIicon']
    popup               xpath      //div[@class='modal-header']
    closebutton         xpath      //button[@type='button']
    main                xpath      //div[@class='row']
     

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
       popup :
        width ~598px
        width 55 to 60 % of screen/width
        inside main ~185px left , ~76px top 
       closebutton :
         height ~30px
       
    
