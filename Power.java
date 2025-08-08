import java.util.*;
class Power{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean isPower=true;
        
        if(isPower){
            System.out.print(x+"is a power of"+y);
        }
        else{
            System.out.print(x+"is not a power of"+y);
        }
        
    }
    public static boolean isPower(int x, int y){
        if(y==1){
            return true;
        }
        else if(x==1){
            return y==1;
        }
        while(y%x==0){
            y=y/x;
        }
        return y==1;
        
    }
   }
   
   
   
   
   
   
   
   
   
