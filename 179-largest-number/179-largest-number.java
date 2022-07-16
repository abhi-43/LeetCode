class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        
        String num[] = new String[n];
        for(int i=0;i<n;i++){
            num[i]=nums[i]+""; 
        }
        Arrays.sort(num, (a, b) -> {
        String n1 = a+b;
        String n2 = b+a;
        
        return n1.compareTo(n2);
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