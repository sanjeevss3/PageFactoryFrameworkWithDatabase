package com.hybridFramework.productDetailsPage;

import org.apache.log4j.Logger;

import com.hybridFramework.helper.Logger.LoggerHelper;
import com.hybridFramework.testBase.Config;
import com.hybridFramework.testBase.TestBase;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class VerifyInformationLinkText extends TestBase{
	private final Logger log = LoggerHelper.getLogger(VerifyInformationLinkText.class);
	
	public void testVerifyInformationLinkText(){
		log.info(VerifyInformationLinkText.class.getName()+" started");	
		
		Config config = new Config(OR);
		driver.get(config.getWebsite());
	}
}
