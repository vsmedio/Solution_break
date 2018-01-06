// Izmantojam break lai izietu no cikla
public class Solution {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 4) {
                break; // завершить цикл, если i = 4
            }
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен.");
    }
}
