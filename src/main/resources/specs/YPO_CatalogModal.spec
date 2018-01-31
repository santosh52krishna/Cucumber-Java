
@objects
     
    navHeader    		xpath	   //div[@class='navbar-header top-head']
    YPOLOGO				xpath      //img[@alt="YPO "]
    CartIcon      		xpath      //div[@class='cartIicon']
    popup               xpath      //div[@class='modal-header']
    closebutton         xpath      //button[@type='button']
    main                xpath      //div[@class='row']
     

= Content =
	@on desktop
       popup :
        width ~598px
        width 55 to 60 % of screen/width
        inside main ~185px left , ~76px top 
       closebutton :
         height ~30px
       
    
