@objects
	Heading          xpath      //div[@class='heading']
	Body    	 	 xpath    	//div[@class='memberServices']
	RequestGracebtn  xpath      //a[contains(text(),'Grace')]
	I'mInterestedbtn xpath      //a[contains(text(),'Interested')]
    ExitButton   	 xpath    	//button[@class='btn btn-gray']
    BackButton     	 xpath    	//a[@class='btn btn-gray']
    Buttonpannel  	 xpath    	//div[@class='btm-btns whiteBox']
    PannelHeader     xpath 	    //h5
	DropdownPannel   xpath 	    //div[@class='selectDrop input-select']

= Content =
	@on desktop
		 Heading:
        	text starts "We" 
    		
	   	
	   	 #PannelHeader:
			
       
         Body:
           css font-family contains "FFTisaWebPro"   
	     RequestGracebtn:
           width 130 to 135px
           css font-family contains "Gentona-book"
           text is "Request Grace"
           aligned vertically all I'mInterestedbtn
        
         I'mInterestedbtn:
           width ~130px
           css font-family contains "Gentona-book"
           text is "I'm Interested"
         ExitButton:
		   width 70 to 75px
           css font-family contains "Gentona-Book"
           text is "Exit"
   		   aligned horizontally  all BackButton
		 BackButton:
		   width 75 to 80px
           css font-family contains "Gentona-Book"
           text is "Back"
		 Buttonpannel:
			height ~74px
		    width  ~778px
		    width 60 to 80 % of screen/width
     	 #DropdownPannel:
    		#width ~55px
    		#height ~22px
    		#aligned vertically all PannelHeader
     	
	

	@on mobile
     
        Body:
           css font-family contains "FFTisaWebPro"   
	    RequestGracebtn:
           width 130 to 135px
           css font-family contains "Gentona-book"
           text is "Request Grace"
        
        I'mInterestedbtn:
           width ~130px
           css font-family contains "Gentona-book"
           text is "I'm Interested"
        ExitButton:
		   width 70 to 75px
           css font-family contains "Gentona-Book"
           text is "Exit"

		BackButton:
		    width ~78px
            css font-family contains "Gentona-Book"
            text is "Back"
     	
        
	      