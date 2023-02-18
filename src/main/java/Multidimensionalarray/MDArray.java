package Multidimensionalarray;

public class MDArray {
    public static void main(String[] args) {
        int[][] nums = new int[3][4];
        for(int[] m:nums)
        {
            for(int n:m)
            {
                System.out.print(n + "\t");
            }
            System.out.println();
        }

        for(int[] o:nums)
        {
            for (int p:o)
            {
                p = (int) (Math.random()*100);
                System.out.print(p + "\t");
            }
            System.out.println();
        }
    }
}
