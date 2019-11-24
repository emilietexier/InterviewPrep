//Given two strings, write a method to determine if one is a permutation of the other

class Main {

public static boolean isPermut(String word1, String word2){
  int[] tab1 = new int[128];
  int[] tab2 = new int[128];
  if(word1.length() != word2.length()){return false;}
  for(int i = 0; i < word1.length(); ++i){
    ++tab1[word1.charAt(i)];
    ++tab2[word2.charAt(i)];
  }
  for(int i = 0; i < 128; ++i){
    if(tab1[i] != tab2[i]){return false;}
  }
  return true;
}

  public static void main(String[] args) {
  }
}
