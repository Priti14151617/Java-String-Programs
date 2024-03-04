public class ReverseString {
    public static void main(String[] args) {

        // 4 Ways to reverse a string

        //1. Using toCharArray() method
        String str = "hello";
        char[] chArr = str.toCharArray();
        System.out.println("\n1. Using cahrAt() method");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(chArr[i]);
        }
        System.out.println("\n2. Using charAt() method");

        // 2. Using charAt() method
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        // 3. Using StringBuffer class reverse method

        System.out.println("\n3. Using StringBuffer class reverse method");
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        // 4. Using StringBuilder class reverse method
        System.out.println("\n4. Using StringBuilder class reverse method");
        StringBuilder sb1 = new StringBuilder(str);
        System.out.println(sb1.reverse());


    }
}