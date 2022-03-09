package io.codelex.classesandobjects.practice.exercises;

public class Ex_7_Dog {

    String name;
    String sex;
    Ex_7_Dog father;
    Ex_7_Dog mother;

    @Override
    public String toString() {
        return "name = " + name + " " +
                ", sex = " + sex + " ";
    }

    public Ex_7_Dog(String name, String sex, Ex_7_Dog father, Ex_7_Dog mother) {
        this.name = name;
        this.sex = sex;
        assignParents(father, mother);
    }


    public void assignParents(Ex_7_Dog father,Ex_7_Dog mother) {
        this.father = father;
        this.mother = mother;
    }

    public boolean hasSameMother(Ex_7_Dog otherDog) {
       return mother == otherDog.mother;
    }


    public Ex_7_Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String fathersName() {
        if (father != null) {
            return father.name;
        } else {
            return "Unknown";
        }
    }

}
