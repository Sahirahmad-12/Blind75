import java.util.*;

public class L399EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for(int i = 0; i<equations.size(); i++){
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            double value = values[i];
            graph.putIfAbsent(a, new HashMap<>());
            graph.putIfAbsent(b, new HashMap<>());

            graph.get(a).put(b, value);
            graph.get(b).put(a, 1.0/value);
        }
        double[] result = new double[queries.size()];
        for(int i = 0; i<queries.size(); i++){
            String start = queries.get(i).get(0);
            String end = queries.get(i).get(1);
            if(!graph.containsKey(start) || !graph.containsKey(end)){
                result[i] = -1.0;
            }else{
                Set<String> visited = new HashSet<>();
                result[i] = dfs(graph, start, end, visited);
            }
        }
        return result;
    }
    private double dfs(Map<String, Map<String, Double>> graph, String start, String end, Set<String> visited){
        if(start.equals(end)){
            return 1.0;
        }
        visited.add(start);
        for(Map.Entry<String, Double> entry : graph.get(start).entrySet()){
            String neighbour = entry.getKey();
            double weight = entry.getValue();
            if(!visited.contains(neighbour)){
                double result = dfs(graph, neighbour, end, visited);
                if(result != -1.0){
                    return weight*result;
                }
            }
        }
        return -1.0;
    }
    public static void main(String[] args) {
    }
}
