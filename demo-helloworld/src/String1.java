public class String1 {
  public static void main(String[] args) {
    String str = "Why so serious lolll";
    str = str + "?";
    System.out.println(str); // Result: Why so serious lolll?

    //Method
    // length()
    int i = str.length(); //length(), tool to return the length of str
    System.out.println("i=" + i); // convert i to String "24 -> "i=24"

    System.out.println("hello".length()); // 5  ** placing one method into another

    //eqauls()
    String str1 = "abc";
    String str2 = "abcd";
    boolean areTheyEqual = str1.equals(str2); // false
    boolean areTheyEqual2 = str1.equals(str3); // true
    boolean b4 = str2.equals(str1 + "d"); //false
    System.out.println(b4); //true

    //chatAt(2), find the char at index of the string
    String str4 = "helloworld"; 
    // index 0 of str4 -> 'h'
    // index 4 of str4 -> 'o'
    System.out.println(str4.charAt(2)); //result: l
    System.out.println(str4.charAt(20));




  }
}






