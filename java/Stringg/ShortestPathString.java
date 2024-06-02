package Stringg;


//Given a route containing 4 direction (E,W,N,S), 
//find the shortest path to reach the destination
//E = East W =West N= North S=South

public class ShortestPathString {
    public static float getshortestPath(String path){
        int x=0 ,y=0;
        for(int i=0;i<path.length();i++){
            char dir =path.charAt(i);
            //north
            if(dir == 'N'){
                y++;
            }
            //south
            else if(dir == 'S'){
                y--;
            }
            //west
            else if(dir == 'W'){
                x--;
            }
            //east
            else{
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String direction="WNEENESENNN";
        System.out.println(getshortestPath(direction));
    }
}
