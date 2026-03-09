package dev.tpa;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    public ListItem  next(){
        return value;
    }
    public ListItem setNext(ListItem list){
        return this.leftLink = list.leftLink;
    }

    public ListItem previous(){
        return value;
    }

    public ListItem setPrevious(ListItem list){
        return this.rightLink= list.rightLink;
    }

    public  int compareTo(ListItem list){
        return 0;
    }

}
