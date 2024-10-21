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
     * Complete the 'makingAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static int makingAnagrams(String s1, String s2) {
    // Write your code here
    HashMap<Character,Integer> map1 = new HashMap<>();
    HashMap<Character,Integer> map2 = new HashMap<>();
    for(char c: s1.toCharArray()){
        map1.put(c,map1.getOrDefault(c,0)+1);
    }
    for(char c: s2.toCharArray()){
        map2.put(c,map2.getOrDefault(c,0)+1);
    }
    int count=0;
    for(char c : map2.keySet()){
        if(map1.containsKey(c)){
           count+=Math.abs(map1.get(c)-map2.get(c)); 
        }else{
            count+=map2.get(c);
        }
    }
    for(char c : map1.keySet()){
        if(!map2.containsKey(c)){
            count+=map1.get(c);
        }
    }return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        int result = Result.makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
