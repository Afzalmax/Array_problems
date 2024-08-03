class Stringbin{
    public static String getChecker(String s){
        StringBuilder sb =new StringBuilder(s);
        boolean changed;
        do{
            changed=false;
            for(int i=0;i<sb.length()-1;i++){
                if(sb.charAt(i)=='1' && sb.charAt(i+1)=='0'){
                    sb.deleteCharAt(i);
                    changed=true;
                    break;
                }
            }
        }while(changed);
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.println(getChecker("101"));
    }
}