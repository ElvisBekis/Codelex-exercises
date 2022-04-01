package io.codelex.classesandobjects.practice.exercises;

public class Ex7Dog {

    String name;
    Sex sex;
    Ex7Dog father;
    Ex7Dog mother;

    @Override
    public String toString() {
        return "name = " + name + " " +
                ", sex = " + sex + " ";
    }

    public Ex7Dog(String name, Sex sex, Ex7Dog father, Ex7Dog mother) {
        this.name = name;
        this.sex = sex;
        assignParents(father, mother);
    }


    public void assignParents(Ex7Dog father, Ex7Dog mother) {
        this.father = father;
        this.mother = mother;
    }

    public boolean hasSameMother(Ex7Dog otherDog) {
        if (mother == null) {
            return false;
        }
        return mother == otherDog.mother;
    }


    public Ex7Dog(String name, Sex sex) {
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
