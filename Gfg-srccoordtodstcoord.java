class Gfg{
    public static int gcd(int i,int j){
        if(i==j){
            return i;
        }
        if(i>j){
            return gcd(i-j,j);
        }
        return gcd(i,j-i);
    }
    public static boolean check(int x,int y,int a,int b){
        x=Math.abs(x);
        y=Math.abs(y);
        a=Math.abs(a);
        b=Math.abs(b);
        return (gcd(x,y)==gcd(a,b));
    }
    public static void main(String[] args){
        int x=35,y=15;
        int a=20,b=25;
        System.out.println(check(x,y,a,b));
    }
}