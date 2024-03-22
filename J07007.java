import java.util.*;
import java.io.*;

class WordSet {
    TreeSet<String> set;

    public WordSet(String file) throws FileNotFoundException {
        set = new TreeSet<>();
        Scanner sc = new Scanner(new File(file));
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        String s = "";
        for(String i : set){
             s += i + "\n"; 
        }
        return s;
    }

    
    
}

public class J07007 {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("D:/java.txt");
        System.out.println(ws);
    }
}
