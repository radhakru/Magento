package com.magneto.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={//"./features/Verifycompareproducts.feature",

				"./features/Verify_create_account_and_share_WISHLIST_to_other.feature"},
				//"./features/VerifyLoginUserPurchaseProduct.feature"},
				

				//"./features/VerifyAccountCreationAndShareWishlist.feature"},

		glue={"com/magento/StepDefination"},
		dryRun=false,
		monochrome=true
		
		
		)


public class Runner {

}
