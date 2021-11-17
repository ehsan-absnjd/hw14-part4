package StringArray;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringArray {
    public static void main(String[] args) {
        String[] strings = {"ali" , "hamed", "mohsen" ,"asd"};

        showCounts(strings);
        showGroups(strings);

    }
    public static void showGroups(String[] strings){
        System.out.println(Arrays.stream(strings)
                .collect(Collectors.groupingBy(String::length)));
    }
    public static void showCounts(String[] strings) {
        System.out.println(Arrays.stream(strings)
                .collect(Collectors.groupingBy(String::length , Collectors.counting())));
    }

}
