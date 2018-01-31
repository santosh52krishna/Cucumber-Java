@objects
    navHeader    	   xpath	 //div[@class='navbar-header top-head']
    YPOLOGO		  	   xpath     //img[@alt="YPO "]
    CartIcon     	   xpath     //div[@class='cartIicon']
	Title              xpath     //h2[@class='title']
	Body               xpath     //div[@class='panel']
    Backbutton         xpath     //input[@class='btn btn-gray']
    Savebtn            xpath     //button[@id='saveContinueId']
    Commentbox         xpath     //textarea[@class='expanding']
    Buttonpannel       xpath     //div[@class='btm-btns whiteBox']
  
       
= Content =
    @on desktop
		navHeader:
        	height	53px
        YPOLOGO:
	        width ~ 50px
	        inside screen 25 to 45px left
		CartIcon:
		    width ~ 35px
		    right-of YPOLOGO ~850px
		Title:
        	text is "Request Grace"
     	
        Buttonpannel:
			width  750 to 780px
            height ~75px
            width 60 to 80 % of screen/width
       
        Backbutton:
            width ~ 77px
      		aligned horizontally all continuebtn
            text is "Back"
            css font-family contains "Gentona-Book"
        
        Savebtn :
            width ~ 148px
            aligned horizontally all Backbutton
            text is "Save & Continue"
            css font-family contains "Gentona-Book"

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
		Title:
        	text starts "GRACE" 
     	
        Backbutton:
            width ~ 77px
      		aligned horizontally all continuebtn
            text is "Back"
            css font-family contains "Gentona-Book"
        
        Savebtn :
            width 144 to 150 px
            aligned horizontally all Backbutton
            text is "Save & Continue"
            css font-family contains "Gentona-Book"
		
		Buttonpannel:
		    width 360 to 375px
			height ~75px

        Body :
		    css font-family contains "FFTisaWebPro"
		    

         	    
 		
 
	