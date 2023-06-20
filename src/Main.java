public class Main {
    public static void main(String[] args) {
        int[] niz = {13, 19, 9, 5, 12, 8, 7, 14, 21, 2, 6, 11};
        Razvrstavanje r = new Razvrstavanje(niz);
        r.razvrstaj(niz, 0, niz.length - 1);

        System.out.println(r.quickSelect(niz, 3, 0, niz.length - 1));
    }
}