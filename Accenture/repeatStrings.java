/*You are Given an Integer N and String S. Your Task Is to find and return new string which consist of the original string repeated N times.
Input1: An integer value N.
Input2 : A string value S.
Outout :
New String repeating N times*/
  
public class Main {
    public static void main(String[] args) {
        System.out.println(repeatString("abc", 3));
    }
    
    public static String repeatString(String str, int n) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            ans.append(str);
        }
        return ans.toString();
    }
}
