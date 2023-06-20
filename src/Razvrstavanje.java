import java.util.ArrayList;
import java.util.Arrays;

public class Razvrstavanje {
    int[] niz;

    public Razvrstavanje(int[] niz) {
        this.niz = niz;
    }

    private void zameni(int[] niz, int i, int j) {
        int temp = niz[i];
        niz[i] =  niz[j];
        niz[j] = temp;
    }

    public int razvrstaj(int[] niz, int levi, int desni) {
        int pivot = levi++;
        while(levi <= desni) {
            System.out.println(Arrays.toString(niz));
            while(levi <= desni && niz[levi] >= niz[pivot]) {
                levi++;
            }
            while(levi <= desni && niz[desni] < niz[pivot]) {
                desni--;
            }
            if(levi > desni) {
                break;
            }
            zameni(niz, levi, desni);
        }
        zameni(niz, pivot, desni);
        System.out.println(Arrays.toString(niz));
        return desni;
    }

    public int quickSelect(int[] niz, int k, int levi, int desni) {
        int poz = razvrstaj(niz, levi, desni);
        if(poz == k - 1) {
            return niz[poz];
        } else if(poz < k - 1) {
            return quickSelect(niz, k, poz + 1, desni);
        } else {
            return quickSelect(niz, k, levi, poz - 1);
        }
    }
}
