public class Countstring {
    public static void main(String[] args) {
        String a = "Rishitha is a very good  girl";
        int count = 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("number of words:"+count);

    }
}
