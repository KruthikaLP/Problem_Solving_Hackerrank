import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
    // Write your code here
   
   Stack<Character> st = new Stack<>();
   char c[] = s.toCharArray();
   for(int i=0;i<c.length;i++ ){
        if(st.isEmpty()){
            st.push(s.charAt(i));
        }
        else{
            if(s.charAt(i)==st.peek()){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
   }
        StringBuilder sb = new StringBuilder();
        for( Character ch : st){
            sb.append(ch);
        }
        return sb.length()==0?"Empty String":sb.toString();
   
   

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
