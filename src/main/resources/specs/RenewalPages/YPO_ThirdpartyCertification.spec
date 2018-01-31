@objects
	
	navHeader    	    xpath		//div[@class='navbar-header top-head']
    YPOLOGO		 		xpath		//img[@alt="YPO "]
    CartIcon        	xpath		//div[@class='cartIicon']
    backbutton          xpath		//a[@class='btn btn-gray']
    continuebtn         xpath		//button[@class='btn btn-blue']
    buttonpannel        xpath		//div[@class='btm-btns whiteBox pageBtns']
    Body                xpath		//div[@class='col-md-10 col-md-offset-1 col-lg-8 col-lg-offset-2']
    Title               xpath		//h2[@class='title']
    PannelHeader        xpath 	  	//h5
	DropdownPannel	    xpath 	  	//div[@class='selectDrop input-select']   
= Content =
    @on desktop
       	
		YPOLOGO:
	        width ~ 50px
	        inside screen 25 to 45px left
		CartIcon:
		    width ~ 35px
		    right-of YPOLOGO 840 to 850px
		Title:
        	text starts "Third" 
    		text ends "Certification"
    	DropdownPannel:
    		width ~778px
    		height ~86px
    		aligned vertically all PannelHeader
		PannelHeader:
			width ~778px
    		height ~37px
        backbutton:
            width ~ 77px
      		aligned horizontally all continuebtn
            text is "Back"
            css font-family contains "Gentona-Book"
        
        continuebtn:
            width ~ 104px
            aligned horizontally all backbutton
            text is "Continue"
            css font-family contains "Gentona-Book"
		buttonpannel:
		    width 750 to 780px
			width 60 to 80 % of screen/width

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
        backbutton:
            width ~ 77px
      		aligned horizontally all continuebtn
            text is "Back"
            
        
        continuebtn:
            width ~ 104px
            aligned horizontally all backbutton
            text is "Continue"
           
		buttonpannel:
		    width 360 to 380px
		
        Body :
		    css font-family contains "FFTisaWebPro"
         	    
 		
 
	