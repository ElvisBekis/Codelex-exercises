package io.codelex.zoom;

public class main {

    public static void main(String[] args) {

        link l1  = new link("John");
        link l2  = new link("Lisa");
        link l3  = new link("Peter");
        link l4  = new link("Arthur");
        link l5  = new link("Edgar");
        link l6  = new link("Olga");
        link l7  = new link("Elliot");


        l1.setNextLink(l2);
        l2.setNextLink(l3);
        l3.setNextLink(l1);

        chain chain = new chain(l1);
        chain.addLink(l2);
        chain.addLink(l3);
        chain.addLink(l4);
        chain.addLink(l5);
        chain.addLink(l6);
        chain.addLink(l7);


        chain.printOut();



    }
}
