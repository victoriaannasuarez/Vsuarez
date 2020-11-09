package in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Gen {
    public static void main(String[] args) {
        String [] arr = new String[]{"Vic", "Max"};

        List<String> names = new ArrayList<>(Arrays.asList(new String[]{"Vic", "Max"}));

        Iterator <String> ir = names.iterator();

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        while (ir.hasNext()){
//            System.out.println(names);
            System.out.println(ir.next());
//            ir.remove();
//            System.out.println(names);
        }
    }
}
