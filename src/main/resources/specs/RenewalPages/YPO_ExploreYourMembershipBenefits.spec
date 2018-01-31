
@objects
    navHeader  		   xpath	  //div[@class='navbar-header top-head']
    YPOLOGO		 	   xpath     //img[@alt="YPO "]
    CartIcon   		   xpath     //div[@class='cartIicon']
	Title              xpath     //h2[@class='title']
	Body               xpath     //div[@class='container']
	Image1             xpath     //div[@class='fullImg']
	Image2             xpath	 //div[@class='halfImg']
	topPannel          xpath	 //div[@class='panel congratsPanel']
	InvoiceButton      xpath	 //a[@class=' btn btn-blue']


  
       
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
        	text is "Explore Your Membership Benefits" 
        Body :
		    css font-family contains "FFTisaWebPro"
		Image1 :
			width ~778px
			height ~280px
			aligned vertically all Image2
		Image2 :
			width ~778px
			height ~280px
			near Image1 ~15px bottom 
		topPannel:
			width ~940px
			height ~56px
		InvoiceButton:
			width ~102px
			height ~34px
			css font-family contains "Gentona-book"

		
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
        	text is "Explore Your Membership Benefits" 
        Body :
		    css font-family contains "FFTisaWebPro"
		Image1 :
			width 330 to 345px
			height ~280px
		Image2 :
			width 330 to 345px
			height ~280px
			near Image1 ~5px bottom
		topPannel:
			width 330 to 345px
			height ~131px
		InvoiceButton:
			width ~101px
			height ~33px
			css font-family contains "Gentona-book"

			
			
			
			