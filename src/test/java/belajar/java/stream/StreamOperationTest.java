package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {
    @Test
    void testStreamOperation(){
        List<String> arr = List.of("123", "456", "789");
        Stream<String> stream = arr.stream();
        stream.forEach(s -> System.out.println(Integer.parseInt(s)));
    }
}
