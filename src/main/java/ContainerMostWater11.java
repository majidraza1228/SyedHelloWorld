public class ContainerMostWater11 {
    public static  int maxArea(int[] height) {

        int l=0; int r = height.length-1 ; int  maxArea=0;

        while ( l < r){

           // maxArea = Math.max(maxArea,Math.min(height[l], height[r]*(r-l)));
            maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]){
                l++;
            } else {
                r--;
            }
        }

        return maxArea;

    }


    public static void main(String[] main){

        int[] input = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(input));

    }
}
