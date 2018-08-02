class ReplaceSpace{
  public static void main(String [] args){
    String str = "My Java Is Bold";
    String rev = str.replaceAll(" ","");
    System.out.println(rev);

    char[] strarray = str.toCharArray();
    StringBuffer sb = new StringBuffer();
    for(int i=0; i < strarray.length;i++ ){
      if((strarray[i] != ' ') && (strarray[i] != '\t')){
          sb.append(strarray[i]);
      }
    }
    System.out.println(sb);
  }
}
