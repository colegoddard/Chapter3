
/**
 * Write a description of class MultiplicationTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiplicationTable
{
    public static void main (String[] args) {
        int x = 1;
        int y = 1;
        
        for (int i = x; i <= 12; i++) {
            for (int j = y; j <= 12; j++) {
                if ((i * j) > 99) {
                    System.out.print("|" + (i * j));
                }
                if ((i * j) < 100 && (i * j) > 9) {
                    System.out.print("| " + (i * j));
                }
                if ((i * j) < 10) {
                    System.out.print("|  " + (i * j));
                }
            }
            System.out.println();
        }
    }
}
