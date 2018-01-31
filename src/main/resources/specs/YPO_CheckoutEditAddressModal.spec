
@objects
    navHeader       		 xpath	      //div[@class='navbar-header top-head']
    YPOLOGO		  			 xpath     	  //img[@alt="YPO "]
    CartIcon     			 xpath     	  //div[@class='cartIicon']
    popupheader              xpath        //div[@class='modal-header']
    closeicon                xpath        //button[@type='button']
    cancelbutton             xpath        (//button[@type='button'])[2]
    saveaddressbutton        xpath        (//button[@type='button'])[3]
    main                     xpath        //div[@class='row'] 
    Body                     xpath        //div[@class='modal-body']    
   
    
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
		popupheader :
			width ~448px
			#centered  inside screen
			width 40 to 60 % of screen/width
			
		closeicon :
            width ~12px
        cancelbutton :
            width ~88px
            text is "Cancel"
            aligned horizontally all saveaddressbutton
        saveaddressbutton :
            width ~129px
            near cancelbutton ~16px right 
		    css font-family contains "Gentona-Book"
		    text is "Save Address"
		   
	    Body :
		    css font-family contains "FFTisaWebPro"
       
    
      
        
       
        
    
    