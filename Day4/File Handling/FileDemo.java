import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FileDemo{
    public static void main(String[] args) throws IOException {
        File f =new File("new.txt");
        FileReader reader=new FileReader(f);

        int i;
        String s="";
        //reads character by character
        while ((i=reader.read())!=-1) {
            s=s+(char)i+"";
        }
        
        //String s contains all the data
        
        String[]ar= (s.split("\n"));  
        
        for(i=1;i<=ar.length;i++){
            System.out.println(i+" "+ar[i-1]);
        }
        
        
    }
}