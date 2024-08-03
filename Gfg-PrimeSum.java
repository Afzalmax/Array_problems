import java.util.*;
public class PrimeSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        if((a%2)==1){
            System.out.println("odd");
        }
        else{
            boolean[] isPrime =new boolean[a+1];
            Arrays.fill(isPrime,true);
            isPrime[0]=isPrime[1]=false;
            for(int i=2;i*i<=a;i++){
                if(isPrime[i]){
                    for(int j=i*i;j<=a;j+=i){
                        isPrime[j]=false;
                    }
                }
            }
            for(int i=2;i<=a/2;i++){
                if(isPrime[i]&&isPrime[a-i]){
                    System.out.println(i+" "+(a-i));
                    
                    return;
                }
            }
        }
    }
}