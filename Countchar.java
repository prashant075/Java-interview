import java.util.Set;
import java.util.HashMap;

class Countchar{
  static void countchar(String str){
    HashMap<Character, Integer> countnoofchar =new HashMap<Character, Integer>();
    char [] noofchar = str.toCharArray();
    for(char ch: noofchar){
      if(countnoofchar.containsKey(ch)){
        countnoofchar.put(ch, countnoofchar.get(ch)+1);
      }else{
        countnoofchar.put(ch,1);
      }
    }
    Set<Character> charset = countnoofchar.keySet();
    for(Character chr: charset){
      if(countnoofchar.get(chr)>1){
        System.out.println(chr+" Come in the string "+countnoofchar.get(chr));
      }
    }
  }
  public static void main(String [] args){
    countchar("PrashantGupta");
    countchar("alkagupta");
  }
}
