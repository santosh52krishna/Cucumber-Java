
@objects

	navHeader    			 xpath	     //div[@class='navbar-header top-head']
    YPOLOGO		 			 xpath      //img[@alt="YPO "]
    CartIcon      			 xpath      //div[@class='cartIicon']
	Body              		 xpath      //div[@class='col-md-10 col-md-offset-1 col-lg-8 col-lg-offset-2']
	CorporationTypeDropdown	 xpath		//select[@class='input-field']
	PresidentTypeDropdown    xpath	    //select[@id='j_id0:j_id5:j_id16:PresidentTypeisYPOMembInputTextId']
	BusinessScopeDropdown	 xpath 		//select[@id='j_id0:j_id5:j_id16:BusinessScopeisYPOMembInputTextId']
	DollarVolumeField		 xpath		//input[@id='j_id0:j_id5:j_id16:AnnualRevisYPOMembInputTextId']
    Backbutton        		 xpath     //input[@class='btn btn-gray']
    Submitbtn          	     xpath     //input[@class='btn btn-blue']

= Content =
	@on desktop
		
        navHeader:
        	height	53px
        YPOLOGO:
	        width 50px
	        inside screen 25 to 45px left
		CartIcon:
		    width 35px
		    right-of YPOLOGO 840 to 850px 
		Body:
			 css font-family contains "FFTisaWebPro"
		
		CorporationTypeDropdown:
			width ~300px
			height 50 to 56px
			aligned vertically all PresidentTypeDropdown
		
		PresidentTypeDropdown:
			width ~300px
			height 51 to 56px
			aligned vertically all CorporationTypeDropdown
		
		
		BusinessScopeDropdown:
			width ~300px
			height 50 to 56px
			aligned vertically all PresidentTypeDropdown
		
		DollarVolumeField:
			width ~300px
			height 57 to 61px
			aligned vertically all PresidentTypeDropdown
		
		Backbutton:
			width ~77px
            aligned horizontally all Submitbtn
            text is "Back"
		Submitbtn:
			width ~91px
            aligned horizontally all Submitbtn
            text is "Submit"
	
	@on mobile
		
        navHeader:
        	height	53px
        YPOLOGO:
	        width 50px
	        inside screen ~7px left
		CartIcon:
		    width 35px
		    right-of YPOLOGO 253 to 268px
		Body:
			 css font-family contains "FFTisaWebPro"
		
		CorporationTypeDropdown:
			width ~300px
			height ~51px
			aligned vertically all PresidentTypeDropdown
		
		PresidentTypeDropdown:
			width ~300px
			height ~51px
			aligned vertically all CorporationTypeDropdown
		
		
		BusinessScopeDropdown:
			width ~300px
			height ~51px
			aligned vertically all PresidentTypeDropdown
		
		DollarVolumeField:
			width ~300px
			height 57 to 61px
			aligned vertically all PresidentTypeDropdown
		
		Backbutton:
			width ~77px
            aligned horizontally all Submitbtn
            text is "Back"
		Submitbtn:
			width ~91px
            aligned horizontally all Submitbtn
            text is "Submit"