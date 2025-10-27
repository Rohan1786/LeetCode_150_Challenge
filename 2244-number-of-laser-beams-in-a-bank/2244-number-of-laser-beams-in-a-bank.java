import java.util.*;

class Solution {
    int n, m;
    int count = 0;

    public int countArrow(int[][] res, int i, int prevDevices) {
        if (i >= n) return count;

        
        int currDevices = 0;
        for (int j = 0; j < m; j++) {
            if (res[i][j] == 1) currDevices++;
        }
 
        if (currDevices > 0 && prevDevices > 0) {
            count += currDevices * prevDevices;
        } 
        return countArrow(res, i + 1, currDevices > 0 ? currDevices : prevDevices);
    }

    public int numberOfBeams(String[] bank) {
        List<List<Integer>> system = new ArrayList<>();

        for (String name : bank) {
            List<Integer> temp = new ArrayList<>();
            for (char ch : name.toCharArray()) {
                temp.add(ch - '0');
            }
            system.add(temp);
        }

        int[][] matrix = new int[system.size()][system.get(0).size()];
        for (int i = 0; i < system.size(); i++) {
            for (int j = 0; j < system.get(i).size(); j++) {
                matrix[i][j] = system.get(i).get(j);
            }
        }

        n = matrix.length;
        m = matrix[0].length;
        return countArrow(matrix, 0, 0);
    }
}
