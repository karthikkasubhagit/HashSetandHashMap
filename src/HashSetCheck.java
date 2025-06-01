import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetCheck {
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> FindCommon(HashSet<Integer> a, HashSet<Integer> b) {
        if(a.size() <= b.size())
        {
            for(Integer i : a)
            {
                if(b.contains(i))
                {
                    result.add(i);
                }
            }
        }
        else
        {
            for(Integer i : b)
            {
                if(a.contains(i))
                {
                    result.add(i);
                }
            }
        }

        return result;
    }
}
