/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(Interval inv : intervals){
            if(!pq.isEmpty() && pq.peek() <= inv.start){
                pq.poll();
            }
            pq.add(inv.end);
           
        }
        return pq.size();

    }
}
