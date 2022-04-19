public class task3 {
    public static void main(String[] args) {

        int a [] ;
        a = new int[1];

        for (int i = 0; i <= 1 ; ){

            a[i] = (int)(Math.random()*101);
            System.out.println("Число: " + a[i]);

            int length = (int) (Math.log10(a[i]) + 1);
            System.out.println("Довжина числа: "+ length);

            break;
        }
    }
}
