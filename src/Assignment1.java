import java.io.File;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        File directory = new File("/home/sanjB");
        while(true) {
            System.out.println("Enter a regular expression");
            String pat = sc.nextLine();
            getFiles(pat,directory);
        }


    }

    public static void getFiles( String pat , File directory) {
        if(directory.isDirectory()){
            File files[]=directory.listFiles();
            for(File f:files){
                if(f.isDirectory()){
                    getFiles(pat,f);
                }
                else {
                    if (f.getName().matches(pat)){
                        System.out.println("path is " + f.getAbsolutePath());
                    }
                }
            }
        }
    }
}
