package date1229;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class 스트림공부 {
    public static void main(String[] args) {
        String[] arr = new String[] {"a","b","c"};
        Stream<String> stream = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr,1,3);

        System.out.println(streamOfArrayPart);

        List<String> list = Arrays.asList("a","v","c","d");
        Stream<String> listStream = list.stream();

        listStream.limit(6);

        Stream<String> makeStream = Stream.<String>builder().add("jaejun").add("dongdong").add("harry").build();

        Stream<String> generatedStream = Stream.generate(() -> "jun").limit(5);

        Stream<Integer> iteratedStream = Stream.iterate(30, n -> n+2).limit(5);

    }
}
