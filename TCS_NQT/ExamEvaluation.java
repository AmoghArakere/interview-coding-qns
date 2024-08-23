/* 
John is mathematics teacher in one of the classes of Dale's school. The class has N students. Today is their yearly exam. And John is very strict on the answers. As per John, no one is allowed to cheat. He will find it out from the final marks of two adjacent students.
The marks of N students are mentioned in M[ ], with index 1 to N. All of the students are seated one behind the other based on their roll numbers, which is from 1 to N.
If any two adjacent (one behind the other) students have same marks, then it will be considered as cheating, and the latter student will be removed from the merit list. The student sitting behind is considered as cheater.
At the next level is the process of re-evaluation, which is performed by another department. The re-evaluation can impact marks of K students. The re-evaluation will update their marks and then again, the 3 final merit list will be declared.
The re-evaluation will be in the format of X Y. Here 'X' is the index of the student whose marks needs to be changed from the original value to Y. Each re-evaluation is independent, and the merit list is updated after each re-evaluation.
After each re-evaluation the merit list is updated, where the cheater is filtered out if there is any. Your task is to find the maximum number of students that were part of the merit list after each re-evaluation. Only the final merit list is visible to all students.

Input :
5 2
1 1 2 5 2
1 3
4 2
Output :
Number of Students part of merit list are: 5
Number of Students part of merit list are: 3
Final state of the array: 3 1 2 
*/

import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < k; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            // Update the value at index x - 1
            arr[x - 1] = y;
            int ans = 1;
            
            // Count unique values in the array
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] != arr[j - 1]) {
                    ans += 1;
                }
            }
            
            System.out.println("Number of Students part of merit list are: " + ans);
        }
        
        // Remove duplicates and keep only the first occurrence
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            uniqueElements.add(arr[i]);
        }
        
        // Print the final state of the array
        System.out.print("Final state of the array: ");
        for (int value : uniqueElements) {
            System.out.print(value + " ");
        }
    }
}
