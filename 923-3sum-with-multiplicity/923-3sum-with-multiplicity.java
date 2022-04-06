class Solution {
    private int m = 1000000007; 
    public int threeSumMulti(int[] arr, int target) 
    {
        int len = arr.length;
        long ans = 0; 
        for(int i = 0; i < len; i++)
        {
            Map<Integer, Integer> map = new HashMap<>();
            for(int j = i+1; j < len; j++) 
            {
                if(map.containsKey(target-arr[i]-arr[j]))
                {
                    ans = ans%m;
                    ans = (ans + map.get(target-arr[i]-arr[j]))%m; 
                }
                map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
            }
        }
        return (int)(ans%m);
    }
}