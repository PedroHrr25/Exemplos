import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        String[] arr = {"banco", "chickem", "avocado"};

        List<String> list = Arrays.asList(arr);

        for (String s : list) {
            System.out.println(s + " ");
        }

        System.out.println("----------------------------------------------------------------------------------------------");

        int[] arr2 = new int[5];

        Arrays.fill(arr2, 100);

        for (int c : arr2) {
            System.out.println(c);
        }
        System.out.println("----------------------------------------------------------------------------------------------");

        int[] arr3 = new int[5];
        int[] arr4 = Arrays.copyOf(arr3, arr3.length);

        arr3[2] = 47;

        for (int i : arr3) {
            System.out.println(i);
        }
        System.out.println("----------------------------------------------------------------------------------------------");
        for (int i : arr4) {
            System.out.println(i);
        }
        System.out.println("----------------------------------------------------------------------------------------------");

        String[] arr5 = {"banco", "chickem", "avocado"};
        System.out.println(arr.equals(arr5));

        //compara a quantidade de termos .... = 0, primeiro termo maior -1, segundo termo maior +1
        int c = Arrays.compare(arr, arr5);
        System.out.println(c);

        System.out.println("----------------------------------------------------------------------------------------------");



    System.out.println("----------------------------------------------------------------------------------------------");

int[] arr6 = {7, 3 , 4 , 5 , 10};

Arrays.sort(arr6) ;

        for (int y : arr6) {
            System.out.println(y);

        }

int p = Arrays.binarySearch(arr6, 4);
System.out.println(p);


// string nao substitui, tem que criar uma nova variavel para contemplar
String nome = "Mario";
        nome.replace('o', 'a');
        System.out.println(nome);


        // string builder

        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Marrocos");
        String texto = builder.toString();
        System.out.println(texto);
    }




}
