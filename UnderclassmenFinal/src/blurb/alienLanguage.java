package blurb;

import interfaces.BlurbInterface;

public class alienLanguage implements BlurbInterface
{

	@Override
	public String generateBlurb()
	{
		return null;
	}
	@Override
	  public boolean isBlurb(String blurb) {
	    // TODO Auto-generated method stub
	    int n = 0;
	    if(blurb.substring(n,n+1).equals("x")){
	      return isBlurb(blurb, n, blurb.substring(n,n+1));
	    } else {
	      return false;
	    }
	  }
	  
	  private boolean isBlurb(String s, int n, String previous){
	    if(n == s.length()-1){
	      if(previous.equals("x") || previous.equals("y")){
	        return true;
	      }
	      return false;
	    }
	    
	    if(previous.equals("x")){
	      n++;
	      if(s.substring(n, n+1).equals("y") || s.substring(n, n+1).equals("q")){
	        return isBlurb(s, n, s.substring(n, n+1));
	      } else {
	        return false;
	      }
	    } else if(previous.equals("y")){
	      n++;
	      String temp = s.substring(n,n+1);
	      if(temp.equals("y")){
	        return isBlurb(s, n, temp);
	      }
	      else if (temp.equals("q")){
	        return isBlurb(s, n, temp);
	      }
	      else {
	        return false;
	      }
	    }
	    else if(previous.equals("q")){
	      n++;
	      String temp = s.substring(n,n+1);
	      if(temp.equals("z")){
	        return isBlurb(s, n, temp);
	      } 
	      else if(temp.equals("d")){
	        return isBlurb(s, n, temp);
	      } 
	      else {
	        return false;
	      }
	    } 
	    else if(previous.equals("z") || previous.equals("d")){
	      n++;
	      String temp = s.substring(n,n+1);
	      if(temp.equals("x")){
	        return isBlurb(s, n, temp);
	      } 
	      else {
	        return false;
	      }
	    }
	    return true;
	  }
//	@Override
//	public boolean isBlurb(String blurb)
//	{
//		// TODO Auto-generated method stub
//		
//		if(isWhoozit(blurb, 0) == -1){
//		
//			return false;
//		}
//		else{
//			int startPoint = isWhoozit(blurb, 0);
//			System.out.println(blurb.length());
//			System.out.println(startPoint);
//			System.out.println(isWhatzit(blurb.substring(startPoint +1, blurb.length()), 0));
//			if(isWhatzit(blurb.substring(startPoint + 1, blurb.length()), 0) == -1){
//		//	System.out.println(isWhatzit(blurb.substring(startPoint, blurb.length()), 0));
//				return false;
//				
//			}
////			else if(isWhoozit(blurb, startPoint + 3) == -1){
////				return false;
////			}
//			else {
//				return true;
//			}
//		}
//		//return false;
//	}
//	
//private int isWhoozit(String bleh, int i){
//		//System.out.println(bleh.charAt(0));
//		int siez = bleh.length();
//	  if(bleh.charAt(i) == 'x' && bleh.charAt(i+1) != 'y'){
//		//  return 1;
//	//	 System.out.println("dab");
//		return i;  
//	  }
//	  else if(bleh.charAt(i) == 'y' && bleh.charAt(i+1) != 'y'){
//			//  return 1;
//		//	 System.out.println("dab")
//		  if(i == siez){
//			  return siez;
//		  }
//			return i;  
//		  }
//	  else if(bleh.charAt(0) == 'y' && bleh.charAt(i) == 'y'){
//		  i++;
//		  if(i == siez){
//			  return siez;
//		  }
//		  isWhoozit(bleh, i);
//		 
//	  }
//	  else if(bleh.charAt(0) == 'x' && bleh.charAt(i) == 'y'){
//		  i++;
//		  if(i == siez){
//			  return siez;
//		  }
//		  isWhoozit(bleh, i);
//	  }
//	  System.out.println("fail");
//	  return -1;
//	
//	}
//	private int isWhatzit(String bluh, int j){
//		if(bluh.charAt(0) == 'q' && bluh.charAt(1) == 'z' || bluh.charAt(0) == 'q' && bluh.charAt(1) == 'd'){
//			//  return 1;
//		//	 System.out.println("dab");
//			return 0;  
//		  }
//		else{
//			return -1;
//		}
//	}
	
	
}
