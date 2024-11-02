import java.util.*;

public class Subsequence_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number for position " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Old array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = Recursion(0, temp, arr);

        System.out.println("\nSubsequences:");
        System.out.println("[");
        for (List<Integer> list : ans) {
            System.out.print("  [");
            for (Integer item : list) {
                System.out.print(item + " ");
            }
            System.out.println("]");
        }
        System.out.println("]");
    }

    public static List<List<Integer>> Recursion(int ind, List<Integer> temp, int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();

        if (ind >= arr.length) {
            ans.add(new ArrayList<>(temp));
            return ans;
        }

        // Include the current element
        temp.add(arr[ind]);
        ans.addAll(Recursion(ind + 1, temp, arr));

        // Exclude the current element
        temp.remove(temp.size() - 1);
        ans.addAll(Recursion(ind + 1, temp, arr));

        return ans;
    }
}
