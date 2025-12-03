package com.week7;

public class circle {
    static void main() {
       //printCircle(5);
     //  printCooking();
      // printCircletimed(7);
       printCookingtimer();
    }
    public static void printCookingtimer() {
        String[][] letters = {
                // C
                {" ****", "*    ", "*    ", "*    ", " ****"},
                // O
                {" *** ", "*   *", "*   *", "*   *", " *** "},
                // O
                {" *** ", "*   *", "*   *", "*   *", " *** "},
                // K
                {"*   *", "*  * ", "**   ", "*  * ", "*   *"},
                // I
                {"*****", "  *  ", "  *  ", "  *  ", "*****"},
                // N
                {"*   *", "**  *", "* * *", "*  **", "*   *"},
                // G
                {" ****", "*    ", "*  **", "*   *", " ****"}
        };

        for (int row = 0; row < 5; row++) {
            for (int letter = 0; letter < 7; letter++) {
                System.out.print(letters[letter][row] + "  ");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println();
        }
    }
    public static void printCircletimed(int radius) {
        for (int y = 0; y <= radius * 2; y++) {
            for (int x = 0; x <= radius * 2; x++) {
                double distance = Math.sqrt(Math.pow(x - radius, 2) + Math.pow((y - radius) * 2, 2));
                if (distance > radius - 1.0 && distance < radius + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println();
        }
    }
    public static void printCircle(int radius) {
        for (int y = 0; y <= radius * 2; y++) {
            for (int x = 0; x <= radius * 2; x++) {
                double distance = Math.sqrt(Math.pow(x - radius, 2) + Math.pow((y - radius) * 2, 2));
                if (distance > radius - 1.0 && distance < radius + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void printCooking() {
        String[][] letters = {
                // C
                {" ****", "*    ", "*    ", "*    ", " ****"},
                // O
                {" *** ", "*   *", "*   *", "*   *", " *** "},
                // O
                {" *** ", "*   *", "*   *", "*   *", " *** "},
                // K
                {"*   *", "*  * ", "**   ", "*  * ", "*   *"},
                // I
                {"*****", "  *  ", "  *  ", "  *  ", "*****"},
                // N
                {"*   *", "**  *", "* * *", "*  **", "*   *"},
                // G
                {" ****", "*    ", "*  **", "*   *", " ****"}
        };

        for (int row = 0; row < 5; row++) {
            for (int letter = 0; letter < 7; letter++) {
                System.out.print(letters[letter][row] + "  ");
            }
            System.out.println();
        }
    }
}
