public class L1456MaximumNumberofVowelsinaSubstringofGivenLength {
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxVowels = 0;
        for(int i = 0; i<k; i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }
        maxVowels = count;

        for(int i = k; i<s.length(); i++){
            char left = s.charAt(i-k);
            if(isVowel(left)){
                count--;
            }
            char right = s.charAt(i);
            if(isVowel(right)){
                count++;
            }
            maxVowels = Math.max(maxVowels, count);
        }
        return maxVowels;
    }
    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' ||  ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static void main(String[] args) {
    }
}

