package com.company;

public abstract class Food implements Consumable {

    String name = null;
    public Food(String name) {
        this.name = name;
    }
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false;//является ли arg0 экземпляром класса фуд или его потомков
        if (name==null || ((Food)arg0).name==null) return false;// проверка равенства внутреннего поля name(ссылка) константе null
        return name.equals(((Food)arg0).name);// проверка равенства нейм у обоих объектов
    }
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
