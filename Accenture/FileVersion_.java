/*
You are given a string array S that contains the names of some files along with their versions. Your task is to find and return an integer value representing the latest version out of all the files that are correctly named in the array. A file is considered correct if it follows the format of the file named as "File_X* (where X represents the file version number). Retur -1 if there are no correct files in the array.
Note:
• A file is incorrect if the name of the file does not match the format.
• If there is no file in the files array then also return - 1.
> Sample Input
4
file_20
File_1s12
File_29
File_we3
> Your Output
29
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int solve(ArrayList<String> files) {
        int maxVersion = -1;
        
        for (String file : files) {
            if (file.startsWith("File_")) {
                String versionPart = file.substring(5);
                // Check if versionPart is not empty and consists only of digits
                if (versionPart.length() > 0) {
                    boolean isNumber = true;
                    for (char c : versionPart.toCharArray()) {
                        if (!Character.isDigit(c)) {
                            isNumber = false;
                            break;
                        }
                    }
                    if (isNumber) {
                        int version = Integer.parseInt(versionPart);
                        maxVersion = Math.max(maxVersion, version);
                    }
                }
            }
        }
        return maxVersion;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<String> files = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            files.add(scanner.nextLine());
        }

        System.out.println(solve(files));
    }
}
