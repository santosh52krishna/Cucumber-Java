
@objects
   
    navHeader     xpath	    //div[@class='navbar-header top-head']
    YPOLOGO		  xpath     //img[@alt="YPO "]
    CartIcon      xpath     //div[@class='cartIicon']
    ImagePic	xpath    //img[@id='j_id0:j_id2:j_id13:theImage']
    Continue    xpath    //a[contains(text(),'Continue')]
    Body        xpath    //section[@class='welcomesection']
    Welcome     xpath    //h2[@class='title']



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
        Welcome:
        	text starts "Welcome" 
    		text ends "YPO"
        ImagePic:
           inside screen ~143px top
           width ~125px
           height ~156px
        Continue:
           width 114 to 119px
           css font-family contains "Gentona-Book"
           text is "Continue"
		Body :
		   css font-family contains "FFTisaWebPro"
	      
         
	@on mobile,
		 ImagePic:
            width ~125px
            height ~156px
         Continue:
            width ~116px
            text is "Continue"
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
	        inside screen 0 to 10px left
		CartIcon:
		    width ~ 35px
		    right-of YPOLOGO 250 to 280px
		ImagePic:
           inside screen ~143px top
           width ~125px
           height ~156px
        Continue:
           width ~114px
           css font-family contains "Gentona-Book"
           text is "Continue"		
    	   #centered horizontally inside content 1px
    	   #inside login-box ~ 40px top, ~ 20px left
    	 