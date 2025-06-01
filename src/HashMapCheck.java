import java.util.HashMap;
import java.util.List;

public class HashMapCheck {

    public HashMap<Integer,Integer> FrequencyCount(List<Integer> list){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(Integer i : list){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }

        return map;
    }
}
