import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();

        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);

        B.add(1);
        B.add(2);
        B.add(3);

        HashSetCheck h = new HashSetCheck();
        List<Integer> C = new ArrayList<>();
        C = h.FindCommon(A, B);

        for(Integer i :  C)
        {
            System.out.println(i);
        }

    }
}