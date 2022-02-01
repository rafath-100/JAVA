package Assignment11;

import java.io.*;
import java.util.HashMap;

class FileReadWrite{
    HashMap<Character, Integer> map=new HashMap<Character, Integer>();
    public void read() throws IOException {
        FileReader fr=new FileReader("/home/rafatam/Desktop/message");
        int i;
        while ((i= fr.read())!=-1){
            if(!Character.isWhitespace((char) i)){
                if(map.containsKey((char)i)){
                    map.put((char)i,map.get((char)i)+1);
                }
                else{
                    map.put((char)i,1);
                }
            }
        }
    }
    public void write() throws IOException {
        File f=new File("/home/rafatam/Desktop/writeMessage");
        FileWriter fw=new FileWriter(f);
        fw.write(map.toString());
        fw.close();
    }
}

public class MainClass {
    public static void main(String[] args) throws IOException {
        FileReadWrite obj=new FileReadWrite();
        obj.read();
        obj.write();
        System.out.println("check your file -_-");
    }
}