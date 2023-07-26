import java.util.*;
import java.io.*;

public class elf_counter {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/mthich/projects/advent_of_code/2022/DayOne/demo.txt");
        Scanner s = new Scanner(file);
        int oldCount = 0;

        while (s.hasNextInt()) {
           oldCount += s.nextInt();
           System.out.println(oldCount);
        }
        s.close();
    }
}
