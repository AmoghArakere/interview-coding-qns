/*You are on a hiking trail represented by an Array A of length N. where the trial initially ascends and then descends forming a single peek. Your task is to find and return an integer value representing the elevation of the summit.
Input Specification :
Input1: An integer Array A.
Input2 : An integer value N denoting the size of A.
Output :
Return an integer value representing the elevation of the summit.*/

public class Main {
    public static void main(String[] args) {
        List<Integer> v = Arrays.asList(5, 4, 3, 2, 1);
        int peakElement = peekelement(v.size(), v);
        System.out.println("Peak Element: " + peakElement);
    }

    public static int peekelement(int n, List<Integer> v) {
        if (n == 0) return 0;
        if (n == 1) return v.get(0);

        if (v.get(0) > v.get(1)) {  // descending array
            return v.get(0);
        }

        if (v.get(n - 1) > v.get(n - 2)) {  // ascending array
            return v.get(n - 1);
        }

        for (int i = 1; i < n - 1; i++) {
            if (v.get(i) > v.get(i - 1) && v.get(i) > v.get(i + 1)) {
                return v.get(i);
            }
        }

        return -1;
    }
}
