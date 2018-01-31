
@objects
   
	YPOLOGO	    		xpath		 //img[@alt='YPO ']
	Photo		    	xpath		 //img[@src='/members/resource/1490697132000/WelcomeNewDesignYPO/images/Pic1.JPG']
	PhotoMobile 		xpath		 //img[@class='Pic1']
	NavHeader			xpath		 //div[@class='navbar-header top-head']
	StartButton			xpath	     //div[@id='j_id0:j_id2:j_id12:pb1']/div/section/div/div/a
	sb2					xpath		 //a[contains(@href, '/members/UpdateProfileInfo_YPO?id=0033C000003yCP8QAM')]
	section1			xpath		 //div[@style='background-image:url('/members/resource/1490697132000/WelcomeNewDesignYPO/images/SplashBannerWeb.JPG');color:#FFF;                     background-size:cover;width:100%;height:325px;']
	UpdateProfileBlock	xpath		 //span[@class='step1 hidden-xs  visible-sm visible-md visible-lg']
	CertificationBlock	xpath		 //span[@class='step2']
	DuesBlock			xpath		 //span[@class='step3']
	UpdateProfileIcon	xpath 		 //img[@src='/members/resource/1490697132000/WelcomeNewDesignYPO/images/CertificationIcon.JPG']
	CertificationIcon	xpath		 //img[@src='/members/resource/1490697132000/WelcomeNewDesignYPO/images/CertificationIcon.JPG']
	DuesIcon			xpath		 //img[@src='/members/resource/1490697132000/WelcomeNewDesignYPO/images/MemberDuesIcon.JPG']
	PrintFormPannel		xpath 		 //*[@id='j_id0:j_id2:j_id12:pb1']/div[1]/section/div[3]/div[3]/div[3]
	pan2				xpath 		 //div[@class='print']
	stepsblock	 		xpath		 //div[@class='steps']
	stepsText	 		xpath		 //div[@class='threeStepsToRenewal']
	NeedAssistText		xpath		 //div[@class='needAsorAns']
	PhoneIcon	 		xpath 		 //*[@id='j_id0:j_id2:j_id12:pb1']/div[1]/section/div[3]/div[3]/div[6]/ul/img[1]
	MailIcon	 		xpath		 //*[@id='j_id0:j_id2:j_id12:pb1']/div[1]/section/div[3]/div[3]/div[6]/ul/img[2]
	Body				xpath		 //section[@class='welcomesec']


= Content =
	@on desktop
	
		NavHeader:
        	height	53px

        YPOLOGO:
	        width ~ 50px
	        height 50px
	        inside screen 0 to 5px left

    	UpdateProfileBlock:
    		height	~242px
    		width 174 to 180px
    		aligned horizontally top CertificationBlock 
    		
    	UpdateProfileIcon:
    		height	~66px
    		width ~85px
    		aligned horizontally all CertificationIcon
    		
    	CertificationBlock:
    		height 262 to 270px
    		width 174 to 180px
    		aligned horizontally top DuesBlock
    	
    	CertificationIcon:
    		height	~66px
    		width ~85px
    		aligned horizontally bottom DuesIcon
    			
    	DuesBlock:
    		height 242 to 248px
    		width 174 to 179px
    		aligned horizontally top UpdateProfileBlock
    		
    	DuesIcon:
    		height	~76px
    		width ~85px
    		aligned horizontally bottom UpdateProfileIcon
    	stepsblock:
    		height	437px
    		width 622 to 632px
    		
    	stepsText:
    		text is "3 Easy Steps to Complete Your Renewal"
    	
        Photo:
           inside screen ~25px left
           
           width 200px
           height 230px
        PhoneIcon:
    		height 34px
    		width 30px
    		aligned vertically all MailIcon
    		
    	MailIcon:
    		height 29px
    		width 30px
    		
  
		Body :
		   css font-family contains "FFTisaWebPro"
		 
	@on mobile
	
		NavHeader:
        	height	53px

        YPOLOGO:
	        width ~ 50px
	        height 50px
	        inside screen 5 to 10px left
 		
    	UpdateProfileIcon:
    		height	~66px
    		width ~85px
    		aligned horizontally all CertificationIcon
    		
    	CertificationBlock:
    		height ~243px
    		width 390 to 405px
    	
    	
    	CertificationIcon:
    		height	~66px
    		width ~85px
    		
    	DuesBlock:
    		height ~224px
    		width 390 to 405px
    		
    	DuesIcon:
    		height	~76px
    		width ~85px
    		
    	stepsblock:
    		height	~695px
    		width 390 to 405px
    		
    	stepsText:
    		text is "3 Easy Steps to Complete Your Renewal"
    	
  
        PhoneIcon:
    		height 34px
    		width 30px
    		aligned vertically all MailIcon
    		
    	MailIcon:
    		height 29px
    		width 30px
    		
  
		Body :
		   css font-family contains "FFTisaWebPro"
	      
         
	 