//soru3

public class pyramid {

    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i < 6; i++) {//Döngümüzün ne kadar döneceğini belirtir.
            for (j = i; j < 6; j++) {//sol tarafındaki boşluğu belirtir.
                System.out.print(" ");//Boşluk belirtir.
            }
            for (k = 1; k <= i; k++) {//Yıldız sembolümüzün yazılmasını sağlar.
                System.out.print("*");//Sembol bir üst satırdaki kurala göre dönecek ve çıktı verecek.
                System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.
            }
            System.out.println(" ");//Döngü sonu satır atlar.
        }
    }

}

