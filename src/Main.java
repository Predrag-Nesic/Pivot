public class Main {
    public static void main(String[] args) {
        int[] niz = {15, 22, 7, 13, 11, 10, 72, 25, 33, 1, 8};
        Razvrstavanje r = new Razvrstavanje(niz);
        r.razvrstaj(niz, 0, niz.length - 1);

        System.out.println(r.quickSelect(niz, 3, 0, niz.length - 1));
    }
}
