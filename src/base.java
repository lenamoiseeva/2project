import java.util.Random;
/**
 * @author Lena Moiseeva
 * the program finds max negative and min positive elements in the array
 *
 */
public class base {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) - 10;
            System.out.println(+i + " element of the array = " + array[i]);
        }
        // поиск максимльного отрицательного числа
        int n = 0;
        int min = 0;
        int max = -10;
        for (int nl = 0; nl < array.length; nl++) {
            if (array[nl] < min && array[nl] > max) {
                max = array[nl];
                n = nl;
            }
        }
        System.out.println("The max negative element = " + max);

        // поиск минимального положительного числа
        int p = 0;
        int min1 = 0;
        int max1 = 10;
        for (int pl = 0; pl < array.length; pl++) {
            if (array[pl] > min1 && array[pl] < max1) {
                max1 = array[pl];
                p = pl;
            }
        }
        System.out.println("The min positive element = " + max1);

        array[n]= max1;
        array[p]= max;
        System.out.println(+n + " element of the array " +array[n]);
        System.out.println(+p + " element of the array " +array[p]);

    }
}
