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


        int number = 130;                                          // sade ededler
        List<Integer> simpleNumbers = IntStream.range(1,number)
                        .filter(num -> num%2!=0)
                        .filter(num -> IntStream.range(2, (int) Math.sqrt(num))
                                .filter(n -> n%2!=0)
                                .noneMatch(n -> num%n==0))
                        .boxed()
                        .collect(Collectors.toList());



        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);
        System.out.println("Sum value: " + sumValue);
        System.out.println("Power list: " + powList);
        System.out.println("Factorial list: " + factList);
        System.out.println("Simple numbers list: " + simpleNumbers);

    }
}