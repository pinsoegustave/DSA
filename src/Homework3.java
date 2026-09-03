public class Homework3 {

    public static void main(String[] args) {
        String s2 = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(s2.substring(22));
        System.out.println(s2.substring(2, 4));
        System.out.println(s2.substring(21));
        System.out.println(s2.substring(21, 23));
        System.out.println(s2.substring(s2.indexOf('v')));
        System.out.println(s2.substring(22, s2.length()));
        System.out.println(s2.substring(s2.indexOf('c'), s2.indexOf('h')));
        System.out.println(s2.substring(s2.indexOf("uv")));
        System.out.println(s2.substring(s2.indexOf(s2.charAt(20))));
        System.out.println(s2.substring(s2.length() - 6));
        //        String s1 = "Java, Java, Java";
//
//        System.out.println(s1.length());
//        System.out.println(s1.indexOf("v"));
//        System.out.println(s1.lastIndexOf("v"));
//        System.out.println(s1.indexOf("va"));
//        System.out.println(s1.lastIndexOf("va"));
//        System.out.println(s1.indexOf("va", 5));
//        System.out.println(s1.lastIndexOf("v", 5));
//        System.out.println(s1.indexOf("va", s1.length() - 10));
//        System.out.println(s1.lastIndexOf("va", s1.length() - 4));
//        System.out.println(s1.indexOf("v", s1.indexOf("va")));
    }
}
