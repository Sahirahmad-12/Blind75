import java.util.LinkedList;
import java.util.Queue;

public class L1926NearestExitfromEntranceinMaze {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;

        Queue<int[]> q = new LinkedList<>();

        int sr = entrance[0];
        int sc = entrance[1];

        q.offer(new int[]{sr, sc, 0});

        // Mark entrance as visited
        maze[sr][sc] = '+';

        int[][] directions = {
                {-1, 0}, // Up
                {1, 0},  // Down
                {0, -1}, // Left
                {0, 1}   // Right
        };

        while (!q.isEmpty()) {
            int[] curr = q.poll();

            int row = curr[0];
            int col = curr[1];
            int steps = curr[2];

            for (int[] dir : directions) {
                int nr = row + dir[0];
                int nc = col + dir[1];

                // Check boundaries and walls
                if (nr < 0 || nr >= m || nc < 0 || nc >= n ||
                        maze[nr][nc] == '+') {
                    continue;
                }

                // If current cell is a border, it is the nearest exit
                if (nr == 0 || nr == m - 1 ||
                        nc == 0 || nc == n - 1) {
                    return steps + 1;
                }

                // Mark visited
                maze[nr][nc] = '+';

                q.offer(new int[]{nr, nc, steps + 1});
            }
        }

        return -1;
    }
    public static void main(String[] args) {
    }
}
