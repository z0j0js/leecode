package sise;

public class test {
    public static void main(String[] args) {
//        Integer a = new Integer(3);
//        Integer b = 3; // 将3自动装箱成Integer类型
//        int c = 3;
//        System.out.println(a == b); // false 两个引用没有引用同一对象
//        System.out.println(a==c); //truea自动拆箱成int类型再和c比较
//        System.out.println(b==c); //true

//        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
//        System.out.println(f1 == f2); //true
//        System.out.println(f3 == f4); //false,简单的说，如果整型字面量的值在-128 到 127 之间，那么不会 new 新的 Integer 对象，而是直接引用常量池中的 Integer 对象，

        String s1 = new StringBuilder("go") .append("od").toString();
        System.out.println(s1.intern() == s1);
        String s2 = new StringBuilder("ja") .append("va").toString();
        System.out.println(s2.intern() == s2);

    }

}
