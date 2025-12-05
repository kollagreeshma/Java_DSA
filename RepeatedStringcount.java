public class Repeatedstringcount{
    public static void main(String args[]){
        String s="programming";
        boolean[] seen=new boolean[s.length()];
        for(int i=0;i < s.length();i++){
            if(!seen[i]){
                int count = 0;
                for(int j=1;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j)){
                        seen[j] = true;
                        count++;
                    }
                }
                System.err.println(s.charAt(i)+" = "+count);
            }
        }
    }
}