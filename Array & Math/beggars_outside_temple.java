public class Solution {
    public int[] solve(int A, int[][] B) {
        int z[]=new int[A];
        int i,j,k;
        for(i=0;i<A;i++)
        {z[i]=0;}
        //System.out.println(B[0][0]);
        for(i=0;i<B.length;i++)
        {   k=B[i][2];
            for(j=B[i][0]-1;j<=B[i][1]-1;j++)
            {
                z[j]=z[j]+k; //System.out.println("here"+z[i]+""+j);
            }
        }
     
        return z;
    }
}
