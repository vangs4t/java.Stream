package belajar.java.stream;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Streaming {
    @Test
    void simpleStream() {
//        Stream<String> stream = Stream.empty();

        Stream<String> oneData = Stream.of("Jhon");

//        String kanjut = null;

//        Stream<String> nullables = Stream.ofNullable(kanjut);

//        assertNull(nullables);

        assertEquals(1, oneData.toList().size());

    }
    @Test
    void arraysStream(){
        Stream<String> arrays = Stream.of("Naufal", "Abdul", "Basth");
        List<String> expected = List.of("Niufil", "ibdul", "Bisth");
        List<String> result = new ArrayList<>();
        arrays.forEach(s -> {
            String mod = s.replaceAll("[Aa]", "i");
            result.add(mod);
        });
        assertEquals(expected, result);
    }
    @Test
    void collectionStreams(){
        Collection<String> cool = List.of("Niufil", "ibdul", "Bisth");
        Stream<String> hold = cool.stream();
        hold.forEach(System.out::println);
    }
    @Test
    void infiniteStreaming(){
        Stream<String> infito = Stream.generate(() -> "Kanjut");
        infito.forEach(System.out::println);
    }
}















