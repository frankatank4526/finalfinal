package blurb;

import interfaces.BlurbInterface;

public class alienLanguage implements BlurbInterface
{

	@Override
	public String generateBlurb()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBlurb(String blurb)
	{
		// TODO Auto-generated method stub
		
		if(isWhoozit(blurb, 0) == -1){
			return false;
		}
		else{
			int startPoint = isWhoozit(blurb, 0);
		}
		return false;
	}
	
	private int isWhoozit(String bleh, int i){
		
		int siez = bleh.length();
	  if(bleh.charAt(i) == 'x' && bleh.charAt(i+1) != 'y'){
		//  return 1;
	//	 System.out.println("dab");
		return i;  
	  }
	  else if(bleh.charAt(i) == 'y' && bleh.charAt(i+1) != 'y'){
			//  return 1;
		//	 System.out.println("dab")
		  if(i == siez){
			  return siez;
		  }
			return i;  
		  }
	  else if(bleh.charAt(0) == 'y' && bleh.charAt(i) == 'y'){
		  i++;
		  if(i == siez){
			  return siez;
		  }
		  isWhoozit(bleh, i);
		 
	  }
	  else if(bleh.charAt(0) == 'x' && bleh.charAt(i) == 'y'){
		  i++;
		  if(i == siez){
			  return siez;
		  }
		  isWhoozit(bleh, i);
	  }
	  System.out.println("fail");
	  return -1;
	
	}
	private int isWhatzit(String bluh, int j){
		
	}
	
}
