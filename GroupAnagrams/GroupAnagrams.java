import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap= new HashMap<>();
        int [] arr = new int[26];

        for(String str: strs){
            Arrays.fill(arr, 0);
            for(char c: str.toCharArray()){
                arr[c -'a']++;
            }
            StringBuilder anagramBuilder = new StringBuilder();
            for(int i: arr){
                anagramBuilder.append("#");
                anagramBuilder.append(i);
            }
            String anagramString= anagramBuilder.toString();

            if(!anagramMap.containsKey(anagramString)){
                List<String> anagramList= new ArrayList<>();
                anagramList.add(str);
                anagramMap.put(anagramString, anagramList);
            }else{
                anagramMap.get(anagramString).add(str);
            }
        }

        return new ArrayList<>(anagramMap.values());
    }
}
