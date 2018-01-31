
@objects
	Title              xpath     //h2[@class='title']
	Body               xpath     //div[@class='panel thePanel']
	RegionDropdown     xpath     //select[@id='j_id0:j_id5:j_id16:pageBlockId:regionInputTextId']
	ChapterDropdown    xpath     //select[@id='j_id0:j_id5:j_id16:pageBlockId:chapterInputTextId']
    Backbutton         xpath     //input[@class='btn btn-gray']
    Continuebtn        xpath     //button[@id='ContinueId']
    Buttonpannel       xpath     //div[@class='btm-btns whiteBox']
  
       
= Content =
	@on desktop
		Title:
        	text is "YPO Gold Transition Option" 
        Body :
		    css font-family contains "FFTisaWebPro"
		RegionDropdown:
			width 710 to 715px
			height 45 to 50px
		ChapterDropdown:
			width 710 to 715px
			height 45 to 50px      
        Backbutton:
            width ~ 77px
      		aligned horizontally all continuebtn
            text is "Back"
            css font-family contains "Gentona-Book"
        
        Continuebtn:
            width 100 to 105px
            aligned horizontally all Backbutton
            text is "Continue"
            css font-family contains "Gentona-Book"
		Buttonpannel:
		    width ~778px
		    height ~75px
		
	 
	 
	@on mobile
		
		Title:
        	text is "YPO Gold Transition Option" 
        Body :
		    css font-family contains "FFTisaWebPro"
		RegionDropdown:
			width 250 to 270px
			height ~45px
		ChapterDropdown:
			width 255 to 270px
			height ~45px      
        Backbutton:
            width ~ 77px
      		aligned horizontally all continuebtn
            text is "Back"
            css font-family contains "Gentona-Book"
        
        Continuebtn:
            width ~ 102px
            aligned horizontally all Backbutton
            text is "Continue"
            css font-family contains "Gentona-Book"
		Buttonpannel:
		    width 360 to 375px
		    height ~75px
		
        
		    

         	    
 		
 
	