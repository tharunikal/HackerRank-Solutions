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
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
    // Write your code here
    HashMap<Character,Integer> map = new HashMap<>();
    for(char c : s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
    }
    //now we create a frequency map
    HashMap <Integer,Integer> freqMap= new HashMap<>();
    for(int i : map.values()){
        freqMap.put(i,freqMap.getOrDefault(i,0)+1);
    }
    if (freqMap.size()==1){
        return "YES";
    }
    if(freqMap.size()>2){
        return "NO";
    }
    //now we exactly have two frequencies 
    //storing  the  key's in a list
    ArrayList<Integer> list = new ArrayList<>();
    for(int i :freqMap.keySet()){
        list.add(i);
    }
    Collections.sort(list);
    int freq1= list.get(0);//smaller 
    int freq2= list.get(1);//larger
    if((freqMap.get(freq1)==1 && freq1-1==0)||(freqMap.get(freq2)==1 && freq2-1==freq1)){
        return "YES";
    }
    return "NO";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
