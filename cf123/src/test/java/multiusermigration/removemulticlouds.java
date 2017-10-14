package multiusermigration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageobject.muserMigration;
import pageobject.removeclouds;
import resources.baseclass;

public class removemulticlouds extends baseclass {

	private static Logger log =LogManager.getLogger(baseclass.class.getName());	//logs
	static removeclouds r;
	
//remove	
@Test
public   void removemultclouds()
{
	
	r.Clouds().click();
	r.DeletmultiCloud1().click();
	log.warn("cloud1 is removed");
	r.DeletmultiCloud2().click();


}

}
