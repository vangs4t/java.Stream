package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class RetrieveirngOperationTest {
    @Test
    void testSkip(){
        List.of("Naufal", "Abdul", "Basth", "onah","ono","rizky").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Nauf", "Abdul", "Basth", "onah","ono","rizky").stream()
                .takeWhile(name -> name.length() <= 5)
                .forEach(s -> System.out.println(s));
    }

    @Test
    void testDropWhile() {
        List.of("Nauf", "Abdul", "Basth", "onah","ono","rizky").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }
    @Test
    void testEncrypt(){
        String halo = "Hello, my name is kanjut badag";
        System.out.println(Stream.of(halo.split(" "))
                .map(name -> name.split(""))
                .toArray().toString());
    }

    @Test
    void testSortedfunction() {
        List.of("Nauf", "Abdul", "Basth", "onah","ono","rizky").stream()
                .sorted()
                .forEach(name -> System.out.println(name));
    }

    @Test
    void testSortedFunctionUseComparator() {
        List.of("Nauf", "Abdul", "Basth", "onah","ono","rizky").stream()
                .sorted(Comparator.reverseOrder())
                .forEach(name -> System.out.println(name));
    }
}









