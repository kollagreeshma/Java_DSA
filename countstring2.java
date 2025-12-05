public class countstring2 {
     public static void main(String[] args) {
        String a = "Rishitha is a very good  girl";
        int count = 0;
        String result="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=' '){
                count++;
                result = result +a.charAt(i);
            }
        }
        System.out.println("number of spaces:"+count);
        System.out.println(result);
    }
}

