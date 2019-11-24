//Implement an algorithm to determine if a string has all unique characters

class Main {

  public static boolean isUnique(String word){
    int[] tab = new int[500];
    for(int i = 0; i < word.length(); ++i){
      ++tab[word.charAt(i)];
    }
    for(int i = 0; i < n; ++i){
      if(tab[i]> 1){return false;}
    }
    return true;
  }

  public static boolean isUnique2(String word){
    for(int i = 0; i < word.length(); ++i){
      for(int j = i + 1; j < word.length(); ++j){
        if(word.charAt(i) == word.charAt(j)){return false;}
      }
    }
    return true;
  }


  public static void main(String[] args) {

  }
}
