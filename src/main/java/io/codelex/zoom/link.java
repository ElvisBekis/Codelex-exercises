package io.codelex.zoom;

public class link {

    private String value;

    private link nextLink;

    public link(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public link getNextLink() {
        return nextLink;
    }

    public void setNextLink(link nextLink) {
        this.nextLink = nextLink;
    }


}
