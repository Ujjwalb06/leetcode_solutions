class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> list = new ArrayList<>();

        int start1 = newInterval[0];
        int end1 = newInterval[1];

        int i = 0;

        // Phase 1: Add all intervals before newInterval
        while (i < intervals.length && intervals[i][1] < start1) {
            list.add(intervals[i]);
            i++;
        }

        // Phase 2: Merge overlapping intervals
        while (i < intervals.length && intervals[i][0] <= end1) {

            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            start1 = Math.min(start1, start2);
            end1 = Math.max(end1, end2);

            i++;
        }

        // Add the merged interval
        list.add(new int[]{start1, end1});

        // Phase 3: Add remaining intervals
        while (i < intervals.length) {
            list.add(intervals[i]);
            i++;
        }

        return list.toArray(new int[list.size()][]);
    }
}