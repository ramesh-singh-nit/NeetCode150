import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length){
            return nums;
        }

        Map<Integer, Integer> count= new HashMap<>();
        for(int i : nums){
            count.put(i, count.getOrDefault(i, 0)+1);
        }

        Queue<Integer> topFrequentElements= new PriorityQueue<>(
                (a,b) -> count.get(a)-count.get(b)
        );

        for(int i: count.keySet()){
            topFrequentElements.add(i);
            if(topFrequentElements.size()> k){
                topFrequentElements.poll();
            }

        }
        int[] topElements= new int[k];
        for(int i= 0; i< k; i++){
            topElements[i]= topFrequentElements.poll();
        }
        return topElements;
    }
}
