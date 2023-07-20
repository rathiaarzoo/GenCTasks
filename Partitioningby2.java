//This example partitions the input strings into a map of strings values based on whether the first character is upper case or lower case. The downstream Collector converts the values list into the count (size of the list)

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PartitioningBy2 {
    public static void main (String[] args) {
        Stream<String> s = Stream.of("Ace", "heart", "Club", "diamond");
        Map<Boolean, Long> m = s.collect(Collectors.partitioningBy(
                            x -> Character.isUpperCase(x.charAt(0)),
                            Collectors.counting()));
        System.out.println(m);
    }
}
