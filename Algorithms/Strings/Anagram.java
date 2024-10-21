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
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
    // Write your code here
    if(s.length() % 2 == 0){
        int mid = (s.length() /2 );
        String left = s.substring(0,mid);
        String right = s.substring(mid);
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char c : left.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c : right.toCharArray()){
            if(map1.containsKey(c) && map1.get(c) > 0){
                map1.put(c,map1.get(c)-1);
            }
        }
        int count=0;
        for(int i : map1.values()){
            count+=i;
        }return count;
    }
    return -1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.anagram(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
