package Recursion;


public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n , "S" , "H" , "D");
        }

    private static void towerOfHanoi(int n, String src, String hlpr, String dest) {
        if(n==1){
            System.out.println(" move disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, hlpr);
        System.out.println(" move disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, hlpr, src, dest);    
    }
    
}
