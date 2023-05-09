package template.List;

import java.util.AbstractList;

public class MyStringList extends AbstractList<String> {
    private String[] myList;

    public MyStringList(String[] myList) {
        this.myList = myList;
    }

    public String get(int index) {
        return myList[index];
    }

    public int size() {
        return myList.length;
    }

    public String set(int index, String element) {
        String oldString = myList[index];
        myList[index] = element;
        return oldString;
    }

}
