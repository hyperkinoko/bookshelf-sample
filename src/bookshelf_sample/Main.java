package bookshelf_sample;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("Java基礎", "キノコ", 1000));
        list.add(new Book("Java応用", "キノコ", 1200));

        // 本棚の中身を出力
        System.out.println("==========================");
        for(int i = 0; i < list.size(); i++) {
            System.out.println("● " + list.get(i));
        }
        System.out.println("==========================");
    }
}