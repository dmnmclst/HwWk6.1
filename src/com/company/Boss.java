package com.company;

public class Boss extends GameEntity{
   private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "Здоровье босса: "+getHealth()+";" +
                "\nАтака Босса: "+getDamage()+"; " +
                "\nТип оружие босса: "+weapon.getTypeOfWeapon()+";" +
                "\nНазвание оружие босса: "+weapon.getNameOfWeapon()+".";
    }
}
