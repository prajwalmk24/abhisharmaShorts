package testKnowledge;

import java.util.ArrayList;
import java.util.List;

class X {
    public void show() {
        System.out.println("class");
    }
}

interface Y {
    default void show() {
        System.out.println("interface");
    }
}

class CodeLyf extends X implements Y {
    public static void main(String[] args) {
        CodeLyf c = new CodeLyf();
        c.show();


        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.remove("B");
        list.remove(1);

        System.out.println(list);

        String s1 = "100";
        Integer i = 100;
        String s2 = i.toString();
        System.out.println(s1 == s2);
    }
}
