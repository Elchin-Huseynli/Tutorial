package integerList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,2,3,9,5,7,6,1,10);


        int minValue = numbers.stream()                 // en kicik deyer
                .reduce(numbers.size(),Integer::min);


        int maxValue = numbers.stream()                 // en boyuk deyer
                .reduce(0,Integer::max);


        int sumValue = numbers.stream()                  // deyerlerin cemi
                        .reduce(0,Integer::sum);


        List<Integer> powList = numbers.stream()           // deyerlerin kvadirati
                        .map(num -> num*num)
                        .collect(Collectors.toList());

        List<Integer> factList = numbers.stream()          // deyerlerin faktoriali
                        .map(num -> IntStream.rangeClosed(1, num).reduce(1,(x, y) -> x*y))
                        .collect(Collectors.toList());

        


        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);
        System.out.println("Sum value: " + sumValue);
        System.out.println("Power list: " + powList);
        System.out.println("Factorial list: " + factList);

    }
}