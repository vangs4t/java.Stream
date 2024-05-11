package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {
    /**
     * Pada method testStreamOperation kita sedang mengganti data value dari string menjadi integer
     */
    @Test
    void testStreamOperation(){
        List<String> arr = List.of("123", "456", "789");
        Stream<String> stream = arr.stream();
        stream.forEach(s -> System.out.println(Integer.parseInt(s)));
    }

    /**
     * Membuat testPipeline
     */
    @Test
    void testStreamPipelineOk(){
        List<String> pipa = List.of("Naufal", "Abdul", "Basth");
        pipa.stream()
                .map(replace -> replace.replaceAll("[Aa]", "i"))
                .map(String::toUpperCase)
                .map(mister -> "Mr " + mister)
                .forEach(System.out::println);
    }
    @Test
    void testFilteringOpertation(){
        List.of("Naufal", "Abdul", "Basth", "onah","ono","rizky").stream().filter(with -> with.length() <= 4).forEach(System.out::println);
    }
    @Test
    void testFlatMapOpertations(){
        List.of("Naufal", "Abdul", "Basth", "onah","ono","rizky").stream()
                .flatMap(mapper -> Stream.of(mapper.length(), mapper.toLowerCase()))
                .flatMap(s -> Stream.of(s,s,s,s))
                .distinct()
                .forEach(System.out::println);
    }
}
