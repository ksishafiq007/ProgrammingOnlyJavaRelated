package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateKeyChecklistToMap {

    public static void main(String[] args) {
        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1,"www.google.com",90000));
        list.add(new Hosting(2,"www.gmail.com",75000));
        list.add(new Hosting(3,"www.facebook.com",85000));
        list.add(new Hosting(4,"www.twitter.com",87000));
        list.add(new Hosting(5,"www.youtube.com",120000));
        list.add(new Hosting(6,"www.ksi.com",95000));

        list.add(new Hosting(7,"www.gmail.com",97000));

        // key = name, value - websites , but the key 'www.ksi.com' is duplicated!?
        Map<String,Long> result1=list.stream().collect(Collectors.toMap(Hosting::getName,
                Hosting::getWebsites,(oldValue,newValue)->newValue));
        System.out.println(" Result "+result1);

    }
}
