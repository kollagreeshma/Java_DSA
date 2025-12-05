public class Largeststring {
    public static void main(String[] args) {
        String str=" welcome to my java classroom";
        String [] words = str.split(" ");
        String largest = words[0];
        for(int i=1;i<words.length;i++){
            if(largest.length()<words[i].length()){
                largest = words[i];
            }
        }
        System.out.println(largest);

    }
    
}
