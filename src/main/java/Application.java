import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Application{

    public void waitForInput(String tag) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");
            PrintStream out = new PrintStream("log.txt");
            int num = 0;
            while (true) {
                String input = scanner.nextLine();
                num += 1;
                System.out.println(num + " <" + tag + ">"+ input + "</" + tag + ">");
                num += 1;
                out.println(num + " <" + tag + ">" + input + "</" + tag + ">");
            }
        } catch (IllegalStateException | NoSuchElementException | FileNotFoundException e) {
        }
    }
}