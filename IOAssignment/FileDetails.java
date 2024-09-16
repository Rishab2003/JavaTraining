import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class FileDetails {
    public static void main(String[] args) throws Exception {
        
        
        Scanner scan = new Scanner(System.in);
        String fileName=scan.next();
        File file=new File(fileName);
        System.out.println(fileName);
        if(file.exists()){
            System.out.println("File found");
        }
        if(file.canRead()){
            System.out.println("File is Readable");
        }
        else{
            throw new Exception("File not readable");
        }

        if(file.canWrite()){
            System.out.println("File is writable");
        }
        else{
            throw new Exception("File isnt Writable");
        }
        
        String s=file.getName();
        
        String str[]=s.split("/.");
        System.out.println(str[0]);

        FileInputStream filestream=new FileInputStream(fileName);

        byte b[]=filestream.readAllBytes();
        System.out.println(b.length+"bytes is the size");

        
    }
}
