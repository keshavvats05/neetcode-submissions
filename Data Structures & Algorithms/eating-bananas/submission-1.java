class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Arrays.stream(piles).max().getAsInt();
        int res = r;
        while (l <= r){
            int mid = (l+r) / 2;
            int totalHrs = 0;
            for (int i = 0; i < piles.length; i++){
                totalHrs += Math.ceil((double)piles[i]/mid);
            }
            if (h >= totalHrs){
                res = mid ;
                r = mid - 1;
            }
            else if (h <= totalHrs){
                l = mid + 1;
            }
        }
        return res;
    }
}
