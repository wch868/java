import java.util.HashMap;
import java.util.Map;

/**
 * Created by chunhai.wang on 2015/12/10.
 */
public class Test2 {

    public static void main(String[] args) {
        Map<Object,Integer> map = new HashMap<Object, Integer>(10);
        map.put(new People(),1);
        map.put(new People(),1);
        map.put(new People(),1);

        System.out.println(map.size());
    }
}
