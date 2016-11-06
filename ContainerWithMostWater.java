PS:
  Given n non-negative integers a1, a2, a3, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn 
  such that the two end points of line are at (i,0), (i, ai). Find two lines, along with x-axis forms a container, such that container contains the most water.

Thought
  sweep from end to middle
  
  public int maxArea(int[] height) {
         int maxA = 0;
        int l = 0, h = height.length-1;
        
        while(l < h){
            maxA = Math.max(maxA,(h-l)*Math.min(height[l],height[h]));
            if(height[l] < height[h])
              l++;
            else
              h--;
        }
        
        return maxA;
    }
