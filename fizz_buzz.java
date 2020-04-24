package modarete;

public class fizz_buzz {

    public static String fizzbuzz(int i){
        String result="";
        if(i%15==0){
            return "fizzbuzz";
        }
        else if(i%5==0){
            return "buzz";
        }
        else if(i%3==0){
            return "fizz";
        }
        return result;
    }

    public static void main(String[] args) {
        String c=fizzbuzz(15);
        System.out.println(c);
    }



}
