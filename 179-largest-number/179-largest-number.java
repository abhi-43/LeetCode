class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        
        String num[] = new String[n];
        for(int i=0;i<n;i++){
            num[i]=nums[i]+""; 
        }
        Arrays.sort(num, (a, b) -> {
        long n1 = Long.parseLong(a+b);
        long n2 = Long.parseLong(b+a);
        
        if(n1>n2)
          return 1;
        else if(n1<n2)
          return -1;
        else
          return 0;
      });
      
      String ans="";
      for(int i=n-1;i>=0;i--){
        ans+=num[i];
      }
      if(ans.charAt(0)=='0')
          return "0";
        
      return ans;
    }
}