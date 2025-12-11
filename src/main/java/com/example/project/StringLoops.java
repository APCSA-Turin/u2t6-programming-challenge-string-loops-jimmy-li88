package com.example.project;

public class StringLoops {

   public StringLoops() { }

   //WARM UP 
    // using a for loop remove all 'a' characters from input string
   public String removeA(String str) {
        for (int i = 0; i < str.length(); i++){
            if (str.substring(i,i+1).equalsIgnoreCase("a")){
                str = str.replace("a","");
            }
        }
       return str;
   }


   // WARM UP
   // using a while loop remove all 'a' characters from input string
   public String removeA2(String str) {
       while (str.contains("a") || str.contains("A")) {
           str = str.replace("a", "").replace("A", "");
       }
       return str;
   }
   


   //WARM UP 
   //Reverse a string by counting down from the end to the start
   public String reverseString(String str) {
         String reversed = "";
         for (int i = str.length() - 1; i >= 0; i--) {
              reversed += str.charAt(i);
         }
         return reversed;
   }


   //WARM UP
   //Reverse a string by counting up from the start to the end
   public String reverseString2(String str) {
       
       String reversed = "";
         int index = str.length() - 1;
         while (index >= 0) {
             reversed += str.charAt(index);
             index--;
         }
        
         return reversed;
   }


   // using a for loop
   public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
        for (int i = 0; i < origStr.length(); i++){
            if (origStr.substring(i,i+1).equals(searchChar)){
                origStr =  origStr.replace(searchChar,replaceChar);
            }
        }
        return origStr;
        
   }


   // using a while loop
   public String replaceCharacterV2(String searchChar, String origStr, String replaceChar) {
       
       while (origStr.contains(searchChar)){
              origStr = origStr.replace(searchChar, replaceChar);

       }
         return origStr;
   }

   public int countString(String searchString, String origString) {
    int count = 0;
        for (int i =0; i < origString.length() - searchString.length() + 1; i++) {
            if (origString.substring(i, i + searchString.length()).equals(searchString)) {
                count ++;
            }
        }

       return count;
   }

   public String removeString(String searchString, String origString) {
         while (origString.contains(searchString)){
              origString = origString.replace(searchString, "");
         }
       return origString;
   }


   public void commaSeparated(int fromNum, int toNum) { //the tests will compare your printed output (not a returned string)
    StringBuilder output = new StringBuilder();
    if (fromNum <= toNum) {
        for (int i = fromNum; i <= toNum; i++) {
            output.append(i);
            if (i < toNum) {
                output.append(", ");
            }
        }
    } else {
        for (int i = fromNum; i >= toNum; i--) {
            output.append(i);
            if (i > toNum) {
                output.append(", ");
            }
            
        }
       
   }
    System.out.println(output.toString());
   }


   public boolean isPalindrome(String myString) {
       myString = myString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       String reversed = "";
       for (int i = myString.length() - 1; i >= 0; i--) {
           reversed += myString.charAt(i);
       }
       return reversed.equals(myString);
   }


   public void multiPrint(String toPrint, int num) { //the tests will compare your printed output (not a returned string)
       StringBuilder output = new StringBuilder();
       output.append("[");
       for (int i = 0; i < num; i++) {
           output.append(toPrint);
           if (i < num - 1) {
               output.append(" ");
           }
       }
       output.append("]");
       System.out.println(output.toString());
   }
}
