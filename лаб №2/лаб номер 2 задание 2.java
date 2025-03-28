public  class Main {
    public static String rename(String str) {
        var i = str.toLowerCase();
        char ch = i.charAt(0);
        char ch2 = Character.toUpperCase(ch);
        var u = i.substring(1);
        return ch2 + u;
    }

    public static void main(String[] y) {
        String str = "аННа";
        var q = rename(str);
        System.out.println(q);
    }
}