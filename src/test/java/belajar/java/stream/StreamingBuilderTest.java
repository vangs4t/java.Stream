package belajar.java.stream;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class StreamingBuilderTest {
    @Test
    void testStreamingBuilder(){
        Stream.Builder<String> data = Stream.builder();
        data.accept("Kanjut");
        data.add("Naufal").add("Abdul");
        Stream<String> result = data.build();
        result.forEach(System.out::println);
    }
}
