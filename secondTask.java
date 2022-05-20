package myTask;

import java.util.Scanner;

class Stringmethods{
	String string;
	int strlength ;
	int index;
	char[] strArray ; 
	Stringmethods(String string){
		this.string=string;
		this.strArray=string.toCharArray();
		int strArray_length =strArray.length;
		this.strlength=strArray_length;
	}
	public char charAt(int index) {
			if(index<strlength)
				return strArray[index];
			return '\0';
		}	
  public int codePointAt(int index) {
	  
		if(index<strlength) {
		int asciivalue=strArray[index];
		return asciivalue;
		}
		return '\0';
     }
  
public int codePointBefore(int index) {
	if(index<strlength) {
		int asciivalue=strArray[index-1];
		return asciivalue;
		}
		return '\0';
     }
public int codePointCount(int startindex,int endindex) {
	  

    int count=0;
           if(endindex>strArray.length) {
		    return '\0';
	      }
    		for(int i=startindex;i<endindex;i++) {
    			count++;
    		 }
    		return count;
 }
  
  public String concat(String concat_string) {
	  return string+concat_string;
  }
  public boolean contains( String otherstr) {
	
	    if(otherstr==null) {
	        return false;
	    }
	    char otherstr_Array[]=otherstr.toCharArray();
	    int counter=0;


	    for(int i=0;i<this.strlength;i++) {

	        if(strArray[i]==otherstr_Array[counter]) {
	            counter++;
	          
	        } 
	        else if(strArray[i]!=otherstr_Array[counter]&&counter>0) {
	        counter=0;
	        i--;
	          
	        } 
	        if(counter==otherstr_Array.length) {
	            return true;}
	       
	    }
	    return false;

	}
  
  public boolean  contentEquals(String otherstr) {
	char[] otherstr_Array=otherstr.toCharArray();
      for (int i = 0; i < this.string.length(); i++){
   
             if (this.strArray[i] != otherstr_Array[i]) {
            	  return false;
             }
          
      }
 
       return true;
  }
  
public int compareTo(String otherstr) {
	
	char[] otherstr_Array=otherstr.toCharArray();	
	int otherstr_length=otherstr_Array.length;
	
		for(int i=0;i<this.strlength;i++) {
		
			 if(this.strArray[i] != otherstr_Array[i]){
				 int asciivalue_str=this.strArray[i];
				 int asciivalue_otherstr=otherstr_Array[i];
				 return asciivalue_str-asciivalue_otherstr;
			 }
			 if(this.strlength!=otherstr_length) {
				 return this.strlength-otherstr_length;
			 }
		}
		return 0;
	
	
	
}
public int compareToIgnoreCase(String otherstr) {
	
	char[] otherstr_Array=otherstr.toCharArray();	
	int otherstr_length=otherstr_Array.length;
	
		for(int i=0;i<this.strlength;i++) {
			int asciivalue_otherstr=otherstr_Array[i];
			int char_value=this.strArray[i];
			  if(char_value>=65&&char_value<=90) {
		    	  char_value=char_value+32;
		    	 
		      } if((char)char_value==asciivalue_otherstr)
		      {
		    	  continue;
		      }			 
			 if((char)char_value!=asciivalue_otherstr){
			
				 return (char)char_value-asciivalue_otherstr;
			 }
			 if(this.strlength!=otherstr_length) {
				 return this.strlength-otherstr_length;
			 }
			 

		}
		return 0;
}

public String toString() { //stringArray to string
	   String covert_string="";	   
	  for(int i=0;i<this.strlength;i++) 
	  {
		  covert_string+=this.strArray[i]; 
	  }
	return covert_string;
	 }


public String toUpperCase() {
	String upper_string="";
	for(int i=0;i<this.strlength;i++) {
		int char_value=this.strArray[i];
	      if(char_value>=97&&char_value<=122) {
	    	  char_value=char_value-32;
	    	  upper_string+=(char)char_value;
	    	 
	      } else {
	    	  upper_string+=strArray[i];
	      }
	}
	return upper_string;
}
public String toLowerCase() {
	String lower_string="";
	for(int i=0;i<this.strlength;i++) {
		int char_value=this.strArray[i];
	      if(char_value>=65&&char_value<=90) {
	    	  char_value=char_value+32;
	    	  lower_string+=(char)char_value;
	    	 
	      } else {
	    	  lower_string+=strArray[i];
	      }
	}
	return lower_string;
}
public boolean  equals(String otherstr) {
	char[] otherstr_Array=otherstr.toCharArray();
	int otherstr_length=otherstr_Array.length;
     for (int i = 0; i < this.string.length(); i++){
            if (this.strArray[i] != otherstr_Array[i]) {
           	  return false;
            }
         if(this.strlength!=otherstr_length) {
        	 return false;
         }
     }

      return true;
 }

public boolean equalsIgnoreCase(String otherstr){
	
	char[] otherstr_Array=otherstr.toCharArray();	
	int otherstr_length=otherstr_Array.length;
	
		for(int i=0;i<this.strlength;i++) {
		 int asciivalue_otherstr=otherstr_Array[i];
			int char_value=this.strArray[i];
			  if(char_value>=65&&char_value<=90) {
		    	  char_value=char_value+32;
		    	 
		      } if((char)char_value==asciivalue_otherstr)
		      {
		    	  continue;
		      }			 
			 if((char)char_value!=asciivalue_otherstr){
			
				 return false;
			 }
			
		}
		return true;
}

public boolean isEmpty() {
	if(this.strlength==0) {
		return true;
	}
	return false;
}

public String replace(char oldChar,char newChar) {
	String replacedString="";
	  for (int i = 0; i < this.string.length(); i++){
	      if (this.strArray[i] == oldChar) {
	    	  replacedString+=newChar;
	      }
	      replacedString+=strArray[i]; 
	}
	return replacedString;
}

public int indexOf(char character) {
	  for (int i = 0; i < this.string.length(); i++){
	      if (this.strArray[i] == character) {
	   	  return i;
	      }
	}
	  
	return '\0';


	}



public boolean startsWith(String otherstr) {
	char[] otherstr_Array=otherstr.toCharArray();
	int otherstr_length=otherstr_Array.length;
	 if(strlength<otherstr_length) {
		return false;
	 }
      for(int i=0;i<otherstr_length;i++) {
    	  
    	  if(this.strArray[i]==otherstr_Array[i]){
  			continue;}
		if(this.strArray[i]!=otherstr_Array[i]){
			return false;}
	
	   }
    	 
	return true;
	
}
public boolean endsWith(String otherstr) {
	char[] otherstr_Array=otherstr.toCharArray();
	int otherstr_length=otherstr_Array.length;
	int count=otherstr_length-1;
	if(strlength<otherstr_length) {
		return false;
	}
	for(int i=strlength-1;i>otherstr_length&&count>=0;i--) {
	    	  
	    	if(this.strArray[i]==otherstr_Array[count]){
	    		System.out.println(count);
	    		count--;
	  			continue;
	    	}
			if(this.strArray[i]!=otherstr_Array[count]){
				System.out.println(count+""+this.strArray[i]);
				return false;}
//			if(count==otherstr_Array.length) {
//	            return true;}
		   
	}
	return true;
}
public String valueOf(int value) { //int to string
	   String covert_string="";	   
	  for(int i=0;i<value;i++) 
	  {
		  covert_string+=value; 
	  }
	return covert_string;
	 }
public String valueOf(float value) { //float to string
	   String covert_string="";	   
	  for(int i=0;i<value;i++) 
	  {
		  covert_string+=value; 
	  }
	return covert_string;
	 }









}
  
  

public class secondTask {
public static void main(String[] args) {
	
	System.out.println("Enter the String : ");
	Scanner scanner=new Scanner(System.in);
	String str=scanner.nextLine();	
	Stringmethods obj=new Stringmethods(str);
//	System.out.println( obj.charAt(2));
//	System.out.println(obj.codePointAt(6));
//	System.out.println(obj.codePointBefore(3));
//	System.out.println(obj.codePointCount(1, 5));
//	System.out.println(obj.concat("Krishnakavi"));
//	System.out.println(obj.contains("str"));
//	System.out.println(obj.contentEquals("sivaranjakavi"));
//	System.out.println(obj.compareTo("sivaranjakavi"));
//	System.out.println(obj.compareToIgnoreCase("sivaranja?12"));
//	System.out.println(obj.toUpperCase());
//	System.out.println(obj.toLowerCase());
//	System.out.println(obj.equals("sivaranja"));
//	System.out.println(obj.equalsIgnoreCase("abc1_2!353"));
//	System.out.println(obj.isEmpty());
//	System.out.println(obj.startsWith("sivaranja"));
	System.out.println(obj.endsWith("ranja"));
//	System.out.println(obj.indexOf('s'));
	
	
	 
 
	
}
}

