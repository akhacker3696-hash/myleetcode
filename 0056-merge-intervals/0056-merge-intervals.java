class Solution {
    public int[][] merge(int[][] intervals) {

        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        list.add(intervals[0]);
        int idx=0;
        int i=1;


        while(i<intervals.length)
        {
            if(list.get(idx)[1] >= intervals[i][0])
            {
                list.set(idx,new int[] {list.get(idx)[0],Math.max(list.get(idx)[1],intervals[i][1])});
                i++;

            }
            else
            {
                list.add(intervals[i]);
                i++;
                idx++;
            }
        }

        int[][] res = new int[list.size()][2];
        for(int x=0;x<list.size();x++)
        {
            res[x][0]=list.get(x)[0];
            res[x][1]=list.get(x)[1];
        }
        return res;
    }
}