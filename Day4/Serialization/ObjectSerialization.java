package Serialization;

import java.io.Serializable;
import java.util.Date;

public class ObjectSerialization implements Serializable{
    
    public void writeObject(){
        Date date=new Date();
    }

    public static void main(String[] args) {
        ObjectSerialization obj=new ObjectSerialization();
        obj.writeObject();
      
    }
    

}
