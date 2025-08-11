import java.util.*;
class Occur{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int delete = sc.nextInt();
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i).equals(delete)){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}