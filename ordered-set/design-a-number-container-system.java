import java.util.*;

class NumberContainers {
    private Map<Integer, PriorityQueue<Integer>> res;
    private Map<Integer, Integer> index_val;
    private Map<Integer, Set<Integer>> index_sets;

    public NumberContainers() {
        res = new HashMap<>();
        index_val = new HashMap<>();
        index_sets = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if (index_val.containsKey(index)) {
            int prevNum = index_val.get(index);
            if (prevNum == number) return; // No change needed
            
            // Efficient removal using HashSet
            index_sets.get(prevNum).remove(index);
            if (index_sets.get(prevNum).isEmpty()) {
                res.remove(prevNum); // Cleanup if empty
                index_sets.remove(prevNum);
            }
        }

        // Add index to new number
        res.computeIfAbsent(number, k -> new PriorityQueue<>()).offer(index);
        index_sets.computeIfAbsent(number, k -> new HashSet<>()).add(index);
        index_val.put(index, number);
    }
    
    public int find(int number) {
        if (!res.containsKey(number)) return -1;

        PriorityQueue<Integer> pq = res.get(number);
        while (!pq.isEmpty() && !index_sets.get(number).contains(pq.peek())) {
            pq.poll(); // Remove outdated entries
        }
        return pq.isEmpty() ? -1 : pq.peek();
    }
}
