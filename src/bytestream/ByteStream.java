package bytestream;
import java.io.*;
public class ByteStream {

public static void main(String[] args) {
       byte[]Data=new byte[10]; 
       int panjang=0;
       System.out.println("masukan data :");
       try {
       panjang=System.in.read(Data);
           System.out.println("yang anda ketik :");
           System.out.write(Data);
           System.out.println("panjang krakter :"+panjang);
       }
       catch (IOException e){
           System.out.println("terjadi exception");
       }
    }
    
}
