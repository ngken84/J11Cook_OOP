/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbookchpt2_oop.optionals;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *
 * @author ngke
 */
public class OptionalsExamples {

    public OptionalsExamples() {
        
        System.out.println("\n == OPTIONAL EXAMPLES == ");
        
    }
    
   
    
    
    public void runExample01() {
        
        System.out.println("\nEXAMPLE 01 - Using optionals");
        Optional<Integer> prize1 = Optional.empty();
        System.out.println("Prize 1 initialized as empty");
        System.out.println("Prize 1 present " + prize1.isPresent());
        System.out.println(prize1);
        
        Optional<Integer> prize2 = Optional.of(10000);
        System.out.println("Prize 2 initialized as 10000");
        System.out.println("Prize 2 present " + prize2.isPresent());
        System.out.println("Prize 2 value " + prize2.get());
        System.out.println(prize2);
        
        Optional<Integer> prize3 = Optional.ofNullable(null);
        System.out.println("Prize 3 initialized as null");
        System.out.println("Prize 3 present " + prize3.isPresent());
        System.out.println(prize3);
        
        System.out.println("Comparing Prizes: ");
        System.out.println("Prize 1 & Prize 2 " + prize1.equals(prize2));
        System.out.println("Prize 1 & Prize 3 " + prize1.equals(prize3));
        
        int prize = prize1.orElseGet(() -> 0);
        prize = prize1.orElse(20);
        System.out.println(prize);
        
        prize1.ifPresent(new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {
                System.out.println("CONSUME PRIZE1");
            }
        });
        
        prize2.ifPresent((Integer t) -> {
            System.out.println("CONSUME PRIZE2 " + t);
        });
        
        List<Optional<Integer>> myList = new LinkedList<>();
        myList.add(Optional.of(1000));
        myList.add(Optional.empty());
        myList.add(Optional.of(2000));
        myList.add(Optional.ofNullable(null));
        myList.add(Optional.of(3000));
        
        useFilter(myList);
        useMap(myList);
    }
    
    void useFilter(List<Optional<Integer>> list) {
        list.stream().filter(opt -> opt.isPresent()).forEach(opt -> System.out.println("THIS VALUE WAS NOT NULL " + opt));
    }
    
    void useMap(List<Optional<Integer>> list) {
        list.stream().map(opt -> opt.orElse(200)).forEach((Integer t) -> {
            System.out.println("PROCESSING " + t);
        });
    }
    
    
}
