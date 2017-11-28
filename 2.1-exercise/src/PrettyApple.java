import java.util.ArrayList;
import java.util.List;

/* Write a prettyPrintApple method that takes a List of Apples
and that can be parameterized with multiple ways to generate
a String output from an apple (a bit like multiple customized
toString methods). For example, you could tell your pretty-PrintApple
method to print only the weight of each apple. In addition, you
could tell your prettyPrintApple method to print each apple
individually and mention whether it’s heavy or light. The solution
is similar to the filtering examples we’ve explored so far. */

public class PrettyApple implements ApplePredicate{


    public static void prettyPrintApple(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> greenHeavyAppleList = new ArrayList<>();
        for (Apple apple : inventory) {
//            String output = ???.???(apple);
            if (applePredicate.greenApples(apple) && applePredicate.appleWeightAbove245(apple)) {
                greenHeavyAppleList.add(apple);

                String output = apple.getColor(apple);
                System.out.println("Apple of color: " + output + " apple weight: " + apple.getWeight(apple));
            }
        }
    }

    @Override
    public boolean greenApples(Apple apple) {
        return "green".equals(apple.getColor(apple));
    }

    @Override
    public boolean appleWeightAbove245(Apple apple) {
        return apple.getWeight(apple) < 245;
    }


    public class Apple {
        private String color;
        private int weight;

        public Apple(String color, int weight) {
            this.color = color;
            this.weight = weight;
        }

        public int getWeight(Apple apple) {
            return this.weight;
        }

        public String getColor(Apple apple) {
            return this.color;
        }

    }

}
