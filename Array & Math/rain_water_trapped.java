public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int i,max=0,pos=-1,l=A.length;
        for(i=0;i<l;i++)
        {
            if(max<A[i]){max=A[i];pos=i;}
        }
        int sum=0;
        int c=0;
        int a[]=new int[l];
            int b[]=new int[l];
        int ma=0,mi=100000;
      
        for(i=1;i<pos;i++)
        {   ma=Math.max(ma,A[i-1]);
            c=Math.min(ma,max);
            if(c>A[i]){
            sum=sum+Math.min(ma,max)-A[i];
            //System.out.println(sum);
        }}
        ma=0;
        for(i=l-2;i>pos;i--)
        {   ma=Math.max(ma,A[i+1]);  
            c=Math.min(ma,max);
        if(c>A[i]){
            sum=sum+Math.min(ma,max)-A[i];
            //System.out.println(sum);
        }}
       // System.out.println(sum);
        return sum;
    }
}
