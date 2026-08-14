package foundation;

public class Main1 {
        public static void main(String[] args){
            Oyun obj = new Oyun();

            int oyuncu1 = 0;

            int oyuncu2 = 0;

            while (true) {

                int zer1 = obj.zerAt();

                System.out.println("Oyuncu 1 zer atdi: " + zer1);

                oyuncu1 = obj.xalTopla(oyuncu1, zer1);

                System.out.println("Oyuncu 1 xal: " + oyuncu1);

                if (oyuncu1 == 30) {

                    System.out.println("Oyuncu 1 qazandi!");

                    break;

                }

                System.out.println();

                int zer2 = obj.zerAt();

                System.out.println("Oyuncu 2 zer atdi: " + zer2);

                oyuncu2 = obj.xalTopla(oyuncu2, zer2);

                System.out.println("Oyuncu 2 xal: " + oyuncu2);

                if (oyuncu2 == 30) {

                    System.out.println("Oyuncu 2 qazandi!");

                    break;

                }
                System.out.println();
            }
        }

}
