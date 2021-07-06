public class Strings {
    public static void main(String[] args) {
        String x = "Loucas Penico";
        boolean isequal = x.equalsIgnoreCase("LoUcas Penico");
        System.out.println(isequal);

        int res = x.length();
        System.out.println(res);

        char charat = x.charAt(0);
        System.out.println(charat);

        int indexof = x.indexOf("L");
        System.out.println(indexof);

        String replaced = x.replace("o", "X");
        System.out.println(replaced);
    }
}
