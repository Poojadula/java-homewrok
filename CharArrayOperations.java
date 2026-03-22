public class CharArrayOperations {

    //  Function 1: Returns character at given index (Uppercase if index == 0)
    public static char getCharacterValue(char[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
        if (index == 0) {
            return Character.toUpperCase(arr[index]); // First index → Uppercase
        }
        return arr[index];
    }

    //  Function 2: Joins two character arrays into one
    public static char[] join(char[] a, char[] b) {
        char[] result = new char[a.length + b.length]; // New array with combined length

        // Copy first array
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        // Copy second array after first
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }

        return result;
    }

    //  Print char array 
    public static void printArray(char[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(",");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {

        
        // getCharacterValue()
        

        char[] arr1 = {'j', 'a', 'v', 'a'};
        char[] arr2 = {'l', 'a', 'p', 't', 'o', 'p'};

        System.out.println(" etCharacterValue()");

        // Sample Input 1
        System.out.print("Input: ");
        printArray(arr1);
        System.out.println("Index value: 2");
        System.out.println("Output: " + getCharacterValue(arr1, 2)); // v

        System.out.println();

        // Sample Input 2
        System.out.print("Input: ");
        printArray(arr2);
        System.out.println("Index value: 0");
        System.out.println("Output: " + getCharacterValue(arr2, 0)); // L (Uppercase)

        System.out.println();

        
        //  Test join()
        

        System.out.println("=== join() ===");

        // Sample Input 1
        char[] java  = {'j', 'a', 'v', 'a'};
        char[] prog  = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
        char[] joined1 = join(java, prog);
        System.out.print("Input 1: ");  printArray(java);
        System.out.print("Input 2: ");  printArray(prog);
        System.out.print("Output : ");  printArray(joined1);

        System.out.println();

        // Sample Input 2
        char[] board  = {'b', 'o', 'a', 'r', 'd'};
        char[] marker = {'m', 'a', 'r', 'k', 'e', 'r'};
        char[] joined2 = join(board, marker);
        System.out.print("Input 1: ");  printArray(board);
        System.out.print("Input 2: ");  printArray(marker);
        System.out.print("Output : ");  printArray(joined2);
	}   }