public class StringProgram {
    static int countVowels(String s){
        int count =0;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(c =='a'|| c =='e'||  c =='i'|| c =='o'|| c =='u'|| c =='A'||
                c =='E'|| c =='I'|| c =='O'|| c =='U'){
                count++;
            }

        }
        return count;
    }
     static String removeSpecialCharFromString(String s){
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        return str;
     }
    static String removeWhiteSpaceFromString (String str){
        String trimStr = str.trim(); // Returns a string whose value is this string, with any leading and
                                    // trailing whitespace removed.
       // System.out.println(trimStr);
        String plainStr = str.replaceAll("\\s", "");
        return plainStr;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("No. of Vowels in String: " +countVowels(s));
        String str = "@#jkdsh!$dff%^dsad";
        System.out.println("Remove special characters from String: " +removeSpecialCharFromString(str));
        String str1 ="   ssd  fgjkfdl  dfkj fgfd  ";
        System.out.println("Remove white space from String: " +removeWhiteSpaceFromString(str1));
    }
}
