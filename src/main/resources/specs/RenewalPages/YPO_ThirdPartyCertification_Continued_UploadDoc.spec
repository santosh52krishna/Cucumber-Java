@objects
	
	UploadDocheader   				 xpath     //form[@id='j_id0:j_id4:j_id20']/section/div[9]/div/div
	CertificationOptionsDropdown     xpath     //select[@id='uploaddocInputTextId']
	DocumentTypeDropdown             xpath     //select[@id='j_id0:j_id4:j_id20:uploaddoctypeInputTextId']
	UploadDocFooter					 xpath	   //form[@id='j_id0:j_id4:j_id20']/section/div[9]/div/div[4]
	Savelinktop						 xpath	   //button[@id='uploadDocumeationDownSaveId']
	Savelinkbottom          		 xpath	   //button[@id='uploadDocumeationUpSaveId']
	browseFileSection				 xpath	   //div[@class='browseFile']
	buttonpannel       				 xpath     //div[@class='btm-btns whiteBox pageBtns']
	Body							 xpath 	   //div[@class='col-md-10 col-md-offset-1 col-lg-8 col-lg-offset-2']
	PannelHeader       				 xpath 	   //h5
	DropdownPannel	   				 xpath 	   //div[@class='selectDrop input-select']
	Backbutton		  				 xpath     //a[@class='btn btn-gray']
    Continuebutton	  				 xpath 	   //button[@class='btn btn-blue']
	
= Content =
    @on desktop
		PannelHeader:
			width 778px
			height 37px
		DropdownPannel:
			width 778px
			height 80 to 86px
			aligned vertically all PannelHeader
		UploadDocheader:   	
			width ~778px
			height ~52px	
		CertificationOptionsDropdown:  
			width ~693px
			height 50 to 56px		
				  	
		DocumentTypeDropdown:  
			width ~693px
			height 50 to 56px	           
		UploadDocFooter:
			width ~778px
			height ~52px						 
		Savelinktop:
			width 50 to 56px
			height ~22px							 
		Savelinkbottom: 
			width ~55px
			height ~22px	         		 
		browseFileSection:		
			width ~693px
			height ~103px					 
		buttonpannel:  
			width ~778px
			height ~74px	
		Backbutton:
			width ~77px
			height ~33px
			aligned horizontally all Continuebutton
		Continuebutton:
			width ~104px
			height ~33px	    				 
		Body:	
			css font-family contains "FFTisaWebPro"   
    
    @on mobile
		PannelHeader:
			width 330 to 345px
			height ~37px
		DropdownPannel:
			width 330 to 345px
			height ~80px
			aligned vertically all PannelHeader
		UploadDocheader:   	
			width 330 to 345px
			height ~51px	
		CertificationOptionsDropdown:  
			width 290 to 305px
			height ~50px		
				  	
		DocumentTypeDropdown:  
			width 290 to 305px
			height ~51px	           
		UploadDocFooter:
			width 330 to 345px
			height ~51px						 
		Savelinktop:
			width ~54px
			height ~22px							 
		Savelinkbottom: 
			width ~54px
			height ~22px	         		 
		browseFileSection:		
			width 290 to 305px
			height ~129px					 
		buttonpannel:  
			width 360 to 375px
			height ~73px
		Backbutton:
			width ~77px
			height ~33px
			aligned horizontally all Continuebutton
		Continuebutton:
			width ~104px
			height ~33px		    				 
		Body:	
			css font-family contains "FFTisaWebPro"   


