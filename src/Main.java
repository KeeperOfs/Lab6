import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main {


    public static void main(String[] args) {
        List <Integer> list = new ArrayList <Integer>();
        for (int i = 0; i<100; i++) list.add(i%100);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list );
        System.out.println(list);

    }
}

