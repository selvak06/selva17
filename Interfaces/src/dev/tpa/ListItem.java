package dev.tpa;

public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public abstract void next();
    public abstract void setNext();
    public abstract void previous();
    public abstract void setPrevious();
    public abstract void compareTo();

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
