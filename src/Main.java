import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args){
        File a = new File("/home/oem/IdeaProjects/3.2.1/src/a.txt");
        File b = new File("/home/oem/IdeaProjects/3.2.1/src/b.txt");
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(a));
            BufferedReader br2 = new BufferedReader(new FileReader(b));
            int count = 0;
            int c1 = br1.read();
            int c2 = br2.read();
            while ((char)c1 != '\n' && (char)c2 != '\n'){
                count++;
                if (c1 != c2){
                    System.out.println(count+": "+(char)c1+" "+(char)c2);
                }
                c1 = br1.read();
                c2 = br2.read();
            }
            if ((char)c1 == '\n'){
                while ((char)c2 != '\n'){
                    count++;
                    System.out.println(count+":   "+(char)c2);
                    c2 = br2.read();
                }
            }
            if ((char)c2 == '\n'){
                while ((char)c1 != '\n'){
                    count++;
                    System.out.println(count+": "+(char)c1);
                    c1 = br1.read();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
