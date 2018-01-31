
@objects
     
    closeicon           xpath    //button[@type='button']
    nobutton            xpath    //a[contains(text(),'No')]
    yesbutton           xpath    //a[contains(text(),'Yes')]

= Content =
	@on desktop
         closeicon :
            height ~30px
         nobutton :
            width ~58px
            text is "No"	
         yesbutton :
            width ~60px
            aligned horizontally all nobutton
            near nobutton ~13px right 
			css font-family contains "Gentona-Book"
			text is "Yes"
		
            
            