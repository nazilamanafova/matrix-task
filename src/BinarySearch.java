public class BinarySearch {
    static void main() {
        int[] array = {10, 20, 30, 40, 50, 60, 70};

        int axtarilan = 50;

        int sol = 0;
        int sag = array.length - 1;

        int index = -1;

        while(sol <= sag){
           int orta = (sag + sol) / 2;

           if (array[orta] == axtarilan){
               index = orta;
               break;
           }

           if (array[orta] < axtarilan){
               sol = orta + 1;
           }else {
               sag = orta - 1;
           }

        }
        if (index == -1){
            System.out.println(" Eded Tapilmadi");
        } else {
            System.out.println("Eded tapildi: " + array[index]);
            System.out.println("Index: " + index);
        }


    }
}
