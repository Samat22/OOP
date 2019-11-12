package com.company;

public class Main {

    public static void main(String[] args) {
        Hero s = new Hero(150, 30, 25);
        System.out.println(s.heroHealths + " " + s.heroAttacks + " " + s.heroAttackTypes);
        Boss boss = new Boss(40, 100, 50);
        System.out.println(boss.getAttack() + " " + boss.getHealth() + " " + boss.getDefenceType());
        boss.BossM(70);
        System.out.println(boss.getAttack() + " " + boss.getHealth() + " " + boss.getDefenceType());

        
    }

    

    // write your code here
}

