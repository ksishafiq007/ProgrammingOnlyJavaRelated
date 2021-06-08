package programming;

import java.util.*;
//import java.util.stream.Collectors;

public class TestSortCollectExample {
    public static void main(String[] args) {
      /*  List<HostingModelClass> list = new ArrayList<>();
        list.add(new HostingModelClass(1,"www.google.com",90000));
        list.add(new HostingModelClass(2,"www.gmail.com",75000));
        list.add(new HostingModelClass(3,"www.facebook.com",85000));
        list.add(new HostingModelClass(4,"www.twitter.com",87000));
        list.add(new HostingModelClass(5,"www.youtube.com",120000));
        list.add(new HostingModelClass(6,"www.ksi.com",95000));
        list.add(new HostingModelClass(7,"www.gmail.com",97000));

       Map<String,Long> resultForSort= list.stream()
               .sorted(Comparator.comparingLong(HostingModelClass::getWebsites).reversed())    //sorting
               .collect(Collectors.toMap(
                       HostingModelClass::getName,HostingModelClass::getWebsites,              //mapping with key and value
               (oldValue,newValue)->newValue,                                                  //if duplicated found then fixed needed value
               LinkedHashMap::new                                                              // return with what we need
       ));

        System.out.println(" Result check   "+resultForSort);
    }*/
    }
}