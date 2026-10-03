import java.util.*;
class WaterBill{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double w=sc.nextDouble();
        if(w<=500){
            System.out.println("Water Bill=100");
        }
        else {
            System.out.println("Water Bill=200");
        }
    }
}