package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.jar.JarEntry;

public class Main {

    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.setTypeOfWeapon("Стрелковое");
        weapon.setNameOfWeapon("Лук ");

        Boss boss = new Boss();
        boss.setHealth(2000);
        boss.setDamage(50);

        boss.setWeapon(weapon);

        Skeleton firstSkeleton = new Skeleton();
        firstSkeleton.setQuantityOfRows(67);
        firstSkeleton.setWeapon(weapon);
        firstSkeleton.setDamage(45);
        firstSkeleton.setHealth(27);

        Skeleton secondSkeleton = new Skeleton();
        secondSkeleton.setQuantityOfRows(67);
        secondSkeleton.setWeapon(weapon);
        secondSkeleton.setDamage(45);
        secondSkeleton.setHealth(27);

        System.out.println("Boss Info");
        System.out.println(boss.printInfo());
        System.out.println();

        System.out.println("First Skeleton Info");
        System.out.println(firstSkeleton.printInfo());
        System.out.println();

        System.out.println("Second Skeleton Info");
        System.out.println(secondSkeleton.printInfo());
        System.out.println();



    }
}
