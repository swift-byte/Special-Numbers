import java.util.*;
class Special{
    int n;
    void accept(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to find if its Special or not");
        n = s.nextInt();
    }
    int factorial(int m){
        int fact = 1;
        for(int i=1;i<=m;i++){
            fact = fact*i;
        }
        return fact;
    }
    boolean isSpecial(){
        int c = 0;
        int nm = n;
        while(n>0){
            int f = n%10;
            int x = factorial(f);
            c = c+x;
            n = n/10;
        }
        if(c==nm){
            return true;
        }
        else{
            return false;
        }
    }
    void display(){
        boolean z = isSpecial();
        if(z==true){
            System.out.println("It's a special number");
        }
        else{
            System.out.println("It's not a special number");
        }
    }
    void main(){
        accept();
        display();
    }
}