import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(1);
        HashMapCheck hashMapCheck = new HashMapCheck();
        HashMap<Integer, Integer> map = hashMapCheck.FrequencyCount(list);

        for(var key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

    }
}