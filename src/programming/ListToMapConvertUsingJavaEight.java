package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapConvertUsingJavaEight {
    public static void main(String[] args) {
        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1,"www.google.com",90000));
        list.add(new Hosting(6,"www.ksi.com",95000));
        list.add(new Hosting(2,"www.gmail.com",75000));
        list.add(new Hosting(4,"www.twitter.com",87000));
        list.add(new Hosting(5,"www.youtube.com",120000));
        list.add(new Hosting(3,"www.facebook.com",85000));

        // key = id, value - name
        Map<Integer, String> mapRes1= list.stream().collect(Collectors.toMap(Hosting::getId,Hosting::getName));
        System.out.println("Result 1 : " + mapRes1);

        // key = name, value - websites
        Map<String, Long> mapRes2=list.stream().collect(Collectors.toMap(Hosting::getName,Hosting::getWebsites));
        System.out.println("Result 2 : " + mapRes2);

        // Same with result1, just different syntax
        // key = id, value = name
        Map<Integer, String> mapRes3=list.stream().collect(Collectors.toMap(x->x.getId(),x->x.getName()));
        System.out.println("Result 3 : "+mapRes3);

    }

}
