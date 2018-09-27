package ArraysAndStrings;

public class StringHasUniqueCharacters {

  public boolean isUniqueCharacters(String string){

    if(string.length() > 128){
      return false;
    }

    boolean[] characterSet= new boolean[128];//assumes the string is ascii
    for(int i=0;i<string.length();i++){
      int asciiValue=string.charAt(i);
      if(characterSet[asciiValue]){//if at the ascii value of the character array already has a true the code will return false
        return false;
      }
      characterSet[asciiValue]=true;
    }

    return true;

  }

}
