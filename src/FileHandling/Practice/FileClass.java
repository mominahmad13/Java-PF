package FileHandling.Practice;
import java.util.Scanner;
import java.io.File;
// File Class used to obtain information of file
public class FileClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file or directory name: ");
        String path = input.nextLine();
        analyzePath(path);
    }

    // display info about file
    private static void analyzePath(String path) {

        File name = new File(path);

        if (name.exists()) // gives true if file directory or file represented by object exists
        {
            // display file information
            System.out.printf("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s", name.getName(), "exists", (name.isFile() ? "is a File " : " is not a File")
                    , (name.isDirectory() ? "is Directory" : "is not a Directory"), (name.isAbsolute() ? "is Absolute path" : "is not a Absolute path")
                    ,"LastModified: " , name.lastModified(), "Length: ", name.length(), "Path: ", name.getPath()
                    , "AbsolutePath: ", name.getAbsolutePath(), "Parent:", name.getParent()
            ); // name.length give size of file in Bytes // .getParent return parent directory


            if (name.isDirectory()) {
                String[] Directory = name.list();// .list method return array containing names of files or directory
                System.out.println("\n \n Directory contents: ");
                for (String directoryName : Directory) {
                    System.out.println(directoryName);
                }
            } else {
                System.out.printf("%s %s", path, "doesnotexist");
            }
        }
    }
}
