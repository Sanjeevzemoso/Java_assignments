
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner infile;


        try {
            infile = new Scanner(new File("/home/sanjB/IdeaProjects/Java_assignments/src/txt1"));
            Map<Character,Integer> myMap = new HashMap<Character, Integer>();
            PrintWriter pw = new PrintWriter("/home/sanjB/IdeaProjects/Java_assignments/src/txt2");
            String input;

            while(infile.hasNext()) {
                input = infile.next();
                char[] myChar = input.toCharArray();
                for( char x : myChar){
                    Integer count = myMap.get(x);
                    if( count == null ) {
                        count = 0;
                    }

                    myMap.put(x,count+1);


                }

                for(Map.Entry<Character,Integer> me : myMap.entrySet()) {
                    pw.println(me.getKey()+" "+me.getValue());
                }

                pw.close();

            }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
