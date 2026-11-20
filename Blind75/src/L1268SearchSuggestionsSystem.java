import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L1268SearchSuggestionsSystem {
    class Node{
        Node[] children = new Node[26];
        List<String> suggestions = new ArrayList<>();
    }
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Node root = new Node();
        Arrays.sort(products);
        for(String product : products){
            Node curr = root;
            for(char ch : product.toCharArray()){
                int index = ch - 'a';
                if(curr.children[index] == null){
                    curr.children[index] = new Node();
                }
                curr = curr.children[index];
                if(curr.suggestions.size() < 3){
                    curr.suggestions.add(product);
                }
            }
        }
        List<List<String>> result = new ArrayList<>();
        Node curr = root;
        for(char ch : searchWord.toCharArray()){
            int index = ch - 'a';
            if(curr != null){
                curr = curr.children[index];
            }
            if(curr == null){
                result.add(new ArrayList<>());
            }else{
                result.add(new ArrayList<>(curr.suggestions));
            }
        }
        return result;
    }
    public static void main(String[] args) {
    }
}
