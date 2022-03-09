package io.codelex.zoom;

public class chain {

    private link firstLink;

    public chain(link firstLink) {
        this.firstLink = firstLink;
    }

    public link getFirstLink() {
        return firstLink;
    }

    public void addLink(link newLink) {

    }

    public void printOut() {
        link currentLink = firstLink;
        System.out.println(firstLink.getValue());
        while (currentLink.getNextLink() != null) {
            System.out.println(currentLink.getNextLink().getValue());
            currentLink = currentLink.getNextLink();
        }

    }
}
