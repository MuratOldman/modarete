package modarete;

public class removeDuplicate {

    public static String RemoveDup(String word){
        String RemoveDup="";
        for(int i=0;i<word.length();i++){
            if(!RemoveDup.contains(""+word.charAt(i))){
                RemoveDup+=""+word.charAt(i);
            }
        }
        System.out.println(RemoveDup);
        return RemoveDup;
    }

    public static String Unique(String word){
        String unique="";
        int count=0;
        for(int i=0;i<word.length();i++){
            count=0;
            for(int j=0;j<word.length();j++){
                if(word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                unique+=""+word.charAt(i);
            }
        }
        System.out.println(unique);

        return unique;

    }
 public static String OneTimeWord(String sentence){
        String[]arr=sentence.split(" ");
     String unique="";
     int count=0;
     for(int i=0;i<arr.length;i++){
         count=0;
         for(int j=0;j<arr.length;j++){
             if(arr[i].equalsIgnoreCase(arr[j])){
                 count++;
             }
         }
         if(count==1){
             unique+=" "+arr[i];
         }
     }
     System.out.println(unique.trim());

        return unique;

 }





    public static void main(String[] args) {
        RemoveDup("aaabbbbbbcccccccccccccccccd");
        Unique("aaaabccccccd");
        OneTimeWord("Ali ali veli deli gitti gelmedi Gitti  acaba");
    }

}
