import java.util.*;
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<AbstractMap.SimpleEntry<Integer, Integer>> queue = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            queue.offer(new AbstractMap.SimpleEntry(tickets[i], i));
        }
        int count = 0;
        while (!queue.isEmpty()) {
            AbstractMap.SimpleEntry<Integer, Integer> curr = queue.poll();
            int temp = curr.getKey();
            int index = curr.getValue();
            temp--;
            count++;
            if (index == k && temp == 0) {
                break;
            }
            if (temp > 0) {
                queue.offer(new AbstractMap.SimpleEntry<>(temp, index));
            }
        }
        return count;
    }
}