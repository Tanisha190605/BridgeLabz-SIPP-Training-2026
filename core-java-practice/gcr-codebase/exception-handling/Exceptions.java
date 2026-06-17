// TRY AND CATCH BLOCK

/*public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
        System.out.println("Rest of the code executes...");
    }
} */


// IO Exception
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;
// public class IOExceptionExample {
//     public static void main(String[] args) {
//         try {
//             BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
//             String line;
//             while ((line = reader.readLine()) != null) {
//                 System.out.println(line);
//             }
//             reader.close();
//         } catch (IOException e) {
//             System.out.println("An IOException occurred: " + e.getMessage());
//         }
//     }
// }


// Class Not Found Exception
// public class ClassNotFoundExceptionExample {
//     public static void main(String[] args) {
//         try {
//             Class.forName("com.mysql.jdbc.Driver");
//             System.out.println("Driver found!");
//         } catch (ClassNotFoundException e) {
//             System.out.println("Class not found: " + e.getMessage());
//         }
//     }
// }



//Arithmetic Exception

// public class ArithmeticExceptionExample {
//     public static void main(String[] args) {
//         try {
//             int result = 10 / 0; // This will throw ArithmeticException
//         } catch (ArithmeticException e) {
//             System.out.println("ArithmeticException caught: " + e.getMessage());
//         }
//     }
// }


// Null Pointer Exception
// public class NullPointerExceptionExample {
//     public static void main(String[] args) {
//         try {
//             String str = null;
//             System.out.println(str.length()); // This will throw NullPointerException
//         } catch (NullPointerException e) {
//             System.out.println("NullPointerException caught: " + e.getMessage());
//         }
//     }
// }


//Array Index Out Of Bounds Exception
// public class ArrayIndexOutOfBoundsExceptionExample {
//     public static void main(String[] args) {
//         try {
//             int[] arr = {1, 2, 3};
//             System.out.println(arr[3]); // This will throw ArrayIndexOutOfBoundsException
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
//         }
//     }
// }


//Illegal Argument Exception
// public class IllegalArgumentExceptionExample {
//     public static void main(String[] args) {
//         try {
//             printAge(-5); // This will throw IllegalArgumentException
//         } catch (IllegalArgumentException e) {
//         System.out.println("IllegalArgumentException caught: " + e.getMessage());
//         }
//     }
//     public static void printAge(int age) {
//         if (age < 0) {
//             throw new IllegalArgumentException("Age cannot be negative");
//         }
//         System.out.println("Age: " + age);
//     }
// }

//Illegal State Exception
// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;
// public class IllegalStateExceptionExample {
//     public static void main(String[] args) {
//         List<String> list = new ArrayList<>();
//         list.add("A");
//         list.add("B");
//         list.add("C");
//         Iterator<String> iterator = list.iterator();
//         while (iterator.hasNext()) {
//             String value = iterator.next();
//             if (value.equals("B")) {
//                 iterator.remove();
//             }
//         }
//         try {
//             iterator.remove(); // This will throw IllegalStateException
//         } catch (IllegalStateException e) {
//             System.out.println("IllegalStateException caught: " + e.getMessage());
//         }
//     }
// }

//Number Format Exception
// public class NumberFormatExceptionExample {
//     public static void main(String[] args) {
//         try {
//             int number = Integer.parseInt("XYZ"); // This will throw NumberFormatException
//         } catch (NumberFormatException e) {
//             System.out.println("NumberFormatException caught: " + e.getMessage());
//         }
//     }
// }

//Class Cast Exception
// public class ClassCastExceptionExample {
//     public static void main(String[] args) {
//         try {
//             Object obj = new Integer(100);
//             String str = (String) obj; // This will throw ClassCastException
//         } catch (ClassCastException e) {
//             System.out.println("ClassCastException caught: " + e.getMessage());
//         }
//     }
// }

// Finally Block 
// public class FinallyExample {
//     public static void main(String[] args) {
//         try {
//             int data = 50 / 0; // This will throw ArithmeticException
//         } catch (ArithmeticException e) {
//             System.out.println("ArithmeticException caught: " + e.getMessage());
//         } finally {
//             System.out.println("Finally block executed.");
//         }
//     }
// }

//Multiple Catch Blocks
// public class MultipleCatchBlockExample {
//     public static void main(String[] args) {
//         try {
//             int[] numbers = {1, 2, 3};
//             int result = numbers[1] / 0; // This will throw ArithmeticException
//             System.out.println(numbers[3]); // This will throw ArrayIndexOutOfBoundsException
//             String text = null;
//             System.out.println(text.length()); // This will throw NullPointerException
//         } catch (ArithmeticException e) {
//             System.out.println("ArithmeticException caught: " + e.getMessage());
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
//         } catch (NullPointerException e) {
//             System.out.println("NullPointerException caught: " + e.getMessage());
//         } catch (Exception e) {
//             System.out.println("General Exception caught: " + e.getMessage());
//         }        
//         System.out.println("Rest of the code executes...");
//     }
// }


//Nested Try-Catch Blocks
// public class NestedTryExample {
//     public static void main(String[] args) {
//         try {
//             // Outer try block
//             int[] numbers = {1, 2, 3};
            
//             try {
//                 // Inner try block 1
//                 int result = numbers[1] / 0; // This will throw ArithmeticException
//             } catch (ArithmeticException e) {
//                 System.out.println("ArithmeticException caught in inner try block 1: " + e.getMessage());
//             }
//                try {
//                 // Inner try block 2
//                 System.out.println(numbers[3]); // This will throw ArrayIndexOutOfBoundsException
//             } catch (ArrayIndexOutOfBoundsException e) {
//                 System.out.println("ArrayIndexOutOfBoundsException caught in inner try block 2: " + e.getMessage());
//             }

//             String text = null;
//             System.out.println(text.length()); // This will throw NullPointerException
            
//         } catch (NullPointerException e) {
//             System.out.println("NullPointerException caught in outer try block: " + e.getMessage());
//         } catch (Exception e) {
//             System.out.println("General Exception caught in outer try block: " + e.getMessage());
//         }
//         System.out.println("Rest of the code executes...");
//     }
// }














