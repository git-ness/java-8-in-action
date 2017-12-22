package lambdasinaction.lambda;

import lambdasinaction.appd.Lambda;
import lambdasinaction.chap3.Lambdas;
import lambdasinaction.chap3.Lambdas.*;

import java.util.Comparator;

public class LambdaFun {
// To try: https://javabrains.io/courses/java_lambdabasics/lessons/Lambda-Exercise/
    public static void main(String[] args) {

        // Must return an object with a Functional Interface 
        Runnable o = () -> System.out.println("Trixy");

        // Can use type inference or be explicit and provide the object type in the parameter.
        Comparator<Lambdas.Apple> c = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
        Comparator<Lambdas.Apple> c2 = (a1, a2) -> a1.getWeight().compareTo(a2.getWeight());
    }
}

