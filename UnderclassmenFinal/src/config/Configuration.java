package config;

import blurb.alienLanguage;
import interfaces.BlurbInterface;
import interfaces.CapitalGainsInterface;

/**
 * This class acts as a configuration file which tells the testing framework
 * which implementation you want us to use when we grade your assignment.
 * 
 * @author jddevaug
 * 
 */
public class Configuration {
	
	/**
	 * Returns a new instance of the {@link BlurbInterface} that you want to be
	 * graded.
	 */
	public static BlurbInterface getBlurbInterface(){
		return new alienLanguage();
	}
	
	/**
	 * Returns a new instance of the {@link CapitalGainsInterface} that you want to be
	 * graded.
	 */
	public static CapitalGainsInterface getCapitalGainsInterface(){
		return null;
	}
	
	//TODO: Add interface for DropoutStack

}
