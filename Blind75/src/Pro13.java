public class Pro13 {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;
        int i = 0;

        while(i<n){
            char current = chars[i];
            int count = 0;

            while(i<n && chars[i] == current){
                i++;
                count++;
            }
            chars[write] = current;
            write++;

            if(count > 1){
                String num = String.valueOf(count);

                for(int j = 0; j<num.length(); j++){
                    chars[write] = num.charAt(j);
                    write++;
                }
            }
        }
        return write;
    }
    public static void main(String[] args) {
    }
}
