
@objects
    
    navHeader       xpath	  //div[@class='navbar-header top-head']
    YPOLOGO		    xpath     //img[@alt="YPO "]
    CartIcon        xpath     //div[@class='cartIicon'] 
    headerpanel     xpath     //div[@class='col-md-8 col-xs-12 col-md-offset-2 catalogBack headtop']
	Body 			xpath     //div[@class='col-md-8 col-xs-12 col-md-offset-2 btnsDiv paddiing-top']
    cancelbutton    xpath     //button[@class='btn btn-gray is-disabled']
    addtocartbutton xpath     //button[@class='btn btn-blue']
 
    
   
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
         headerpanel :
           width 620 to 630px
           width 60 to 80 % of screen/width
       
         cancelbutton :
           width ~88px
           aligned horizontally all addtocartbutton
           text is "Cancel"
         addtocartbutton : 
           width ~117px
           near cancelbutton ~14px right 
		   css font-family contains "Gentona-Book"
		   text is "Add to Cart"
		 Body :
		   css font-family contains "FFTisaWebPro"
        