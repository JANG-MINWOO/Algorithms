import java.util.Map;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int height = park.length;
        int width = park[0].length();
        int x = 0; 
        int y = 0;
        
        for(int i = 0; i<height; i++) {
            for(int j = 0; j<width; j++) {
                if(park[i].charAt(j)=='S'){
                    x = i;
                    y = j;
                    break;
                }  
            }
        }
        
        Map<String, int[]> direction = Map.of(
            "N", new int[]{-1,0},
            "S", new int[]{1,0},
            "E", new int[]{0,1},
            "W", new int[]{0,-1}
        );
        
        for(String route : routes) {
            String[] parts = route.split(" ");
            String dir = parts[0];
            int distance = Integer.parseInt(parts[1]);
            int nowX=x;
            int nowY=y;
            boolean valid = true;
            
            for(int d = 0; d < distance ; d++) {
                nowX += direction.get(dir)[0];
                nowY += direction.get(dir)[1];
                
                if( nowX < 0||
                    nowX >= height ||
                    nowY < 0 ||
                    nowY >=width ||
                    park[nowX].charAt(nowY)=='X') 
                {
                    valid = false;
                    break;
                }
            }
            if(valid) {
                x = nowX;
                y = nowY;
            }
        }
        return new int[]{x,y};
    }
}