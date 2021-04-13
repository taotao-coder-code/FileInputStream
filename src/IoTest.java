import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoTest {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("/Users/taotao/Desktop/io liu de .txt");
            byte[] bytes = new byte[4];
int readData = 0;
while((readData = fis.read(bytes))!=-1){
    System.out.println(new String(bytes,0,readData));

}
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
