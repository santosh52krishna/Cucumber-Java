
@objects
  YPOLOGO		  	  	  xpath       //img[@alt="YPO "]
  navHeader    			  xpath	     //div[@class='navbar-header top-head']
  CartIcon      		  xpath      //div[@class='cartIicon']
  backbutton              xpath      //button[@type='button']
  save&confirmbutton      xpath      //button[@id='continueBTN']
  buttonpannel            xpath      //div[@class='btm-btns whiteBox']
  acceptpannel            xpath      //div[@class='terms']
  Body                    xpath      //div[@class='cntBlock']
  
     

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
         backbutton :
             width ~77px
             text is "Back"
         save&confirmbutton:
             width ~154px
             text is "Save and Confirm"
         buttonpannel:
             width ~778px
             height ~74px
         acceptpannel:
             near buttonpannel 15px top   
             
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
         backbutton :
             width ~77px
             text is "Back"
         save&confirmbutton:
             width ~154px
             text is "Save and Confirm"
         buttonpannel:
             width ~360 to 375px
             height ~74px
         acceptpannel:
             near buttonpannel 0 to 5px top
          
           
          
          
          
          
          