public class DataType {
  public static void main (String[] args) {
    // Number
    // Declaration
    int num;// int is a way to declare a variable
    // from now on, you can only put integer to variable number. 
    // Assignment
    num = 3; // from right to left, when there is one equal sign only --> Action: assignment
    System.out.println("3");
    System.out.println(3);
    System.out.println(num); // printing the variable inside the variable "num"

    // Text
    String str = "hello   ";
    System.out.println(str);

    // String str2 = 1; // error
    // int num2 = "hello";
    // each variable type is only allowed to assign the same data type

    // Re-assignment 
    num = 10;
    // floating point 
    // int num3 = 1.1; // error, int can only store Integer
    double f = 1.03;
    double f2 = 1; // OK, will explain later (?)

    // byte, short, long
    byte num3 = 10;
    System.out.println(num3);

    byte b = 127;
    //byte b2 = 128; error, out of range
    byte b3 = -128;
    //byte b4 =-129; error, out of range

    // short 
    short s = 23;
    short s2 = -60;

    // long
    long l = 400;
    long l2 = 1000;
    long l3 = 30L; //***norm -> L, but not l
    System.out.println(l2);

    //floating point -> double / float
    float f3 = 1.0000000003f;
    double d4 = 23.9;

    // char, should be assigned by single quote ''
    char gender = 'M';
    char s10 = ' ';
    // char empty = ' '; // error

    // boolean
    boolean isMale = true;
    boolean isSalaryGreaterThan1000 = true;
    boolean isValid = false;

    // initialization, means 1st time of assignment
    int a10 = 0; //default = 0;
    a10 = 100;
    System.out.println(a10);

    // String + operation
    String str1 = "something";
    String str2 = "something2"
    String result = str1 + str2;
    System.out.println(result); //something somthing2

    String result2 = "something" + "something2";
    System.out.println(result2); //something something2

    System.out.println(result + " " + result2); //something something2

    String str3 = "abc" + 13; // default behaviour: convert 13 to String
    //abc13
    String str4 = 'abc' + 'A'; // 'A' -> String "A", abcA
    String str5 = "abcd" + true;
    System.out.println(str5); //abcdtrue

   // String str6 = 13 + 13 ; //error, type not match
    String str7 = "" + 13 + 13; // 13 -> String "13", result: 1313

    //
    int a = 1 + 3; //4
    int b10 = 1 - 3; //-2
    int c10 = 2 - 80; //-78
    int i = 2 * 101; // 202
    int p = 10 / 3; //3
    int o = 10 % 3; //1
    System.out.println(o); //1

  }
}
