package com.company;

public class Heroes extends GameEntity{
    private String  ability;

    public Heroes(String ability) {
        this.ability = ability;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
}
