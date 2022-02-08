class StringReverse {
    public static void main (String[] args) {
       
        String string= "Hello world", reverse="";
        char character;
       
      System.out.println("Original word: "+string);
    
       
      for (int i=string.length()-1;i>=0; i--)
      {
        character= string.charAt(i); //extracts each character
     // System.out.println(character);
	  reverse+=character; //adds each character in front of the existing string
      
	  }
      System.out.println("Reversed word: "+ reverse);
    }
}
 