public class RansomNote{
static void checkMagazine(String[] magazine, String[] note) {
        //m number of words in the magazine  <=30,000
        // n number of words in the ransom note <=30,000
        boolean flag = false;
        for(int i = 0; i<note.length; i++){
            String noteWord = note[i];
            flag = false;
            for(int j=0; j<magazine.length; j++){
                if(magazine[j].equals(noteWord)){
                    magazine[Xj] = "";
                    flag = true;
                    break;
                }
 
            }
            if(flag==false){
            break;
            }
        }
      if(flag){
      System.out.print("yes");}
      else{
      System.out.print("no");
      }
    }
public static void main(String[] args){
String[] magazine = {"two", "times", "three", "is", "not", "four"};
String[] note = {"two", "times", "two", "is", "four"} ;
checkMagazine(magazine, note);
}
}
// 
// 
// two times three is not four
// two times two is four