//hackerrank problem :- 
//Mars Exploration
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
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
    // Write your code here
        int count = 0;
      //here we are checking the sequence of "SOS" through out the string and increasing the count if the sequence breaks
    for(int i =0;i<s.length()-2;i=i+3){ //we are going form index 0 to last index -2 and increasing i by 3 every seq
        String st = s.substring(i,i+3);
       if(st.charAt(0)!= 'S') count++;
        if(st.charAt(1)!= 'O') count++;
        if(st.charAt(2)!= 'S') count++;
        
    }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
