import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class SomeClass {
    public static void main(String[] args) { 
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings.length > 2 ? strings[2] : "";
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("sdafgdsaf");
        } catch (RuntimeException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (StackOverflowError error) {
            System.out.println(error);
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("я жив!");
    }


    public static void test () throws IOException { 
        try {
            File file = new File("1");
            System.out.println(file.createNewFile() ? "File created" : "File already exists");
            FileReader reader = new FileReader(file);
            reader.read();
        } catch (IOException e) {
            throw new IOException(e);
        } finally {
            test();
        }
    }
}