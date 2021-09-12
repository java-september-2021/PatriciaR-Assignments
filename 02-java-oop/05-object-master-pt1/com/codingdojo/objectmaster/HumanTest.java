package com.codingdojo.objectmaster;

public class HumanTest {
    public static void main(String[] args) {
        Human tricia = new Human();
        Human brian = new Human();
        Wizard billy = new Wizard();
        Ninja deb = new Ninja();
        Samurai cody = new Samurai();
        Samurai lit = new Samurai();
        System.out.println(tricia.getHealth());
        System.out.println(brian.getHealth());
        tricia.attack(brian);
        System.out.println(brian.getHealth());
        billy.fireBall(brian);
        System.out.println(brian.getHealth());
        deb.steal(brian);
        System.out.println(brian.getHealth());
        System.out.println(deb.getHealth());
        deb.runAway();
        System.out.println(deb.getHealth());
        System.out.println(Samurai.count());
        cody.deathBlow(tricia);
        System.out.println(tricia.getHealth());
        lit.meditate();
        System.out.println(lit.getHealth());
    }
}
