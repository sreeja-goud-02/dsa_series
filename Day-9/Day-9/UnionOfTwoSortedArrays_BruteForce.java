import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        TreeSet<Integer> set = new TreeSet<>();

        // Add first array
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        // Add second array
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }

        // Convert TreeSet to ArrayList
        ArrayList<Integer> ans = new ArrayList<>();

        for (int value : set) {
            ans.add(value);
        }

        return ans;
    }
}
