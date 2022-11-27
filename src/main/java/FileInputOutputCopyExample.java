import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputCopyExample {
    public static void main(String[] args)throws IOException {

        char chars[] = {'Q', 'W', 'E','R','T','Y'};
        FileOutputStream out = null;
        FileInputStream in = null;
        FileOutputStream out1 = null;

        try{
            out = new FileOutputStream("test.txt");
            for (char c: chars) {
                out.write(c);
            }
            in = new FileInputStream("test.txt");
            out1 = new FileOutputStream("copy.txt");


            int num = 0;
            while ((num = in.read()) != -1){
                out1.write(num);
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (out != null) out.close();
            if (in != null) in.close();
            if (out1 != null) out1.close();
        }

    }
}
