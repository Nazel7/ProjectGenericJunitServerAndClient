package junit.test.algorithm;

public class Utilities {
    public static void main(String[] args) {
        Utilities utilities = new Utilities();
     String str = utilities.removePairs("ABBCCAABDEEF");
        System.out.println(str);
        char[] chars= {'h','e','l', 'l', 'o'};
        System.out.println(utilities.returnNthValue(chars, 2));
    }
    public char[] returnNthValue(char[] sourceArray, int n) {
        if (sourceArray == null || sourceArray.length < n) {
            return sourceArray;
        }
        
        int resultLength = sourceArray.length / n;
        char[] charLength = new char[resultLength];
        int index = 0;
        for (int i = n-1; i < (sourceArray.length); i+=n) {

            charLength[index++] = sourceArray[i];
        }

        return charLength;
    }

    public String removePairs(String source) {

        if (source.length() < 2) {
            return source;
        }
        StringBuilder sb = new StringBuilder();
        char[] charResult = source.toCharArray();
        sb.append(charResult[0]);
        for ( int i = 1; i < charResult.length; i++) {
//            if (!sb.toString().contains(String.valueOf(charResult[i]))){
////                sb.append(charResult[i]);
////            }

            if (charResult[i] != charResult[i-1]) {
                sb.append(charResult[i]);
            }
        }
        return sb.toString();
    }

    public int coverter(int a, int b){
        return (a/b) + (a * 30)- 2;
    }

  public String nullIfOddLenght(String source){
        if(source.length() % 2 == 0){
            return source;
        }
        return null;
  }
}
