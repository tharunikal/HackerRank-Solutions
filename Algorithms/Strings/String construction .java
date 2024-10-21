HackerRank Home
|
Prepare
Certify
Compete
Apply
Search


1
|
Switch to..

PrepareAlgorithmsStringsString Construction
String Construction
1114 more points to get your next star!
Rank: 154700|Points: 1086/2200
Problem Solving
Problem
Submissions
Leaderboard
Discussions
Editorial
You made this submission 3 minutes ago.
Score:25.00Status:Accepted
People who solved String Construction attempted this next:

Sherlock and the Valid String
Remove some characters from the string such that the new string's characters have the same frequency.
Submitted Code
Language: Java 15
Open in editor
1
import java.io.*;
2
import java.math.*;
3
import java.security.*;
4
import java.text.*;
5
import java.util.*;
6
import java.util.concurrent.*;
7
import java.util.function.*;
8
import java.util.regex.*;
9
import java.util.stream.*;
10
import static java.util.stream.Collectors.joining;
11
import static java.util.stream.Collectors.toList;
12
​
13
class Result {
14
​
15
    /*
16
     * Complete the 'stringConstruction' function below.
17
     *
18
     * The function is expected to return an INTEGER.
19
     * The function accepts STRING s as parameter.
20
     */
21
​
22
    public static int stringConstruction(String s) {
23
    // Write your code here
24
    HashSet<Character> set = new HashSet<>();
25
    for(char ch:s.toCharArray()){
26
        set.add(ch);
27
    }
28
    return set.size();
29
​
30
    }
31
​
32
}
33
​
34
public class Solution {
35
    public static void main(String[] args) throws IOException {
36
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
37
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
38
​
39
        int q = Integer.parseInt(bufferedReader.readLine().trim());
40
​
41
        IntStream.range(0, q).forEach(qItr -> {
42
            try {
43
                String s = bufferedReader.readLine();
44
​
45
                int result = Result.stringConstruction(s);
46
​
47
                bufferedWriter.write(String.valueOf(result));
48
                bufferedWriter.newLine();
49
            } catch (IOException ex) {
50
                throw new RuntimeException(ex);
51
            }
52
        });
53
​
54
        bufferedReader.close();
55
        bufferedWriter.close();
56
    }
57
}
58
​

