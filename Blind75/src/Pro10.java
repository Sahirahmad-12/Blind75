// 1071:: Greatest Common Divisor of Strings

public class Pro10 {
    public String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdlength = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdlength);
    }

    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
    public static void main(String[] args) {
    }
}
