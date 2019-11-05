package com.company.adapter;


import com.company.adapter.adapter.DuckAdapter;
import com.company.adapter.adapter.TurkeyAdapter;
import com.company.adapter.bird.Duck;
import com.company.adapter.bird.Turkey;
import com.company.adapter.implementationsBirds.MallardDuck;
import com.company.adapter.implementationsBirds.WildTurkey;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck adapterTurkey = new TurkeyAdapter(turkey);
        Turkey adapterDuck = new DuckAdapter(duck);

        System.out.println("The Turkey says. . .");
        turkey.gobble();
        turkey.fly();

        System.out.println("The Duck says");
        duck.fly();
        duck.quack();

        System.out.println("The Turkey Adapter says");

        adapterTurkey.quack();
        adapterTurkey.fly();

        System.out.println("The Duck Adapter says");

        adapterDuck.fly();
        adapterDuck.gobble();
    }
}
