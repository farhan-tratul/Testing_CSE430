package chole_na;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;

public class Teat_Tester {
    
	
	teat_T obj = new teat_T();
	StringManipulatorClass2 Srr=new StringManipulatorClass2();
	StringManipulatorClass3 Sr=new StringManipulatorClass3();
	 
	
	
	
	//class 1
    @Test
    public void testCalculateStringLength() {
    	
        
        assertEquals(5, obj.calculateStringLength("Hello"));
        assertEquals(0, obj.calculateStringLength(""));
        assertEquals(11, obj.calculateStringLength("Hello World"));
    }
  

    @Test
    public void testReverseString() {
        
        assertEquals("olleH", obj.reverseString("Hello"));
        assertEquals("", obj.reverseString(""));
        assertEquals("dlroW olleH", obj.reverseString("Hello World"));
    }

    @Test
    public void testToLowerCase() {
         
        assertEquals("hello", obj.toLowerCase("Hello"));
        assertEquals("", obj.toLowerCase(""));
        assertEquals("hello world", obj.toLowerCase("Hello World"));
    }

    @Test
    public void testCountOccurrences() {
    	
        assertEquals(2, obj.countOccurrences("Hello", 'l'));
        assertEquals(0, obj.countOccurrences("", 'a'));
        assertEquals(2, obj.countOccurrences("Hello World", 'o'));
    }
    
    
    //class 2
    
    @Test
    public void testCapital() {
    	
        assertEquals("Hello", Srr.capitalizeWords("HEllo"));
        assertEquals("", Srr.capitalizeWords(""));
        assertEquals("Hello World", Srr.capitalizeWords("hello world"));
    }
    
    @Test
    public void testremovenonal() {
    	
        assertEquals("Hello", Srr.removeNonAlphabetic(",Hello"));
        assertEquals("Hellowe", Srr.removeNonAlphabetic(",Hello #we"));
        
        
    }
    @Test
    public void testsubString() {
    	
    	 assertEquals(true, Srr.containsSubstring("Hello you", "you"));
         assertEquals(true, Srr.containsSubstring("", ""));
    }
    @Test
    public void testMergeString() {
    	
    	 assertEquals("Helloyou", Srr.MergeStrings("Hello", "you"));
    	 assertEquals("  ", Srr.MergeStrings(" ", " "));
    }
    @Test
    public void testReverseword() {
        
        assertEquals("be we Hello", Srr.reverseWords("Hello we be"));
         
    }
//class 3
    
    @Test
    public void testPalidrome() {
    	
   	 assertEquals(true, Sr.isPalindrome("Level"));
   	  
   }
    @Test
    public void testremoveunspace() {
    	
   	 assertEquals("Levelyou", Sr.removeExtraSpaces("Level you"));
   	  
   }
    
}
