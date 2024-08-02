class GFG {
    static int MOD = 1000000007;
    int pow(int x,int y,int p){
        int res=1;
        x=x%p;
        while(y>0){
            if(y%2==1){
                return (1*x*res)%p;
            }
            y=y>1;
            return (x*x)%p;
        }
        return res;
    }
    static int countEvenWays(int n) {
        return power(2, n / 2 - 1, MOD);
    }
}