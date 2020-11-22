import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ARRAY {

    public static void main(String[] args) throws IOException {

        BufferedReader reder = new BufferedReader(new InputStreamReader(System.in));
        String value = reder.readLine();
        String[] split = value.split("\\s+");
        List<Integer> numbers = new ArrayList<>();



        for
        (String num : split) {
            numbers.add(Integer.parseInt(num));
        }
        System.out.println("[REFERENCE]\n _________________________________\n[-TOP VALUE: number of array cells]\n[-CENTER VALUE: number and index..]" +
                "\n[-BOTTOM VALUE: array cell ID.....]" +
                "\n ---------------------------------\n[This is your array!]  -  " + numbers + "\n");
        Map<Integer, Integer> HM = new HashMap<>();

        for
        (int i = 0; i < numbers.size(); i++){
            int number = numbers.get(i);
            if (HM.containsKey(number)) {
                HM.put(number, HM.get(number) + 1);

            } else HM.put(number, 1);
        }
        for
        (Map.Entry entry : HM.entrySet())    {
            int a = (Integer) entry.getKey();
            if ((Integer) entry.getValue() > 1);
            System.out.println( numbers.spliterator().getExactSizeIfKnown());
            System.out.println("sum of\narray cells:" +  "\n---\nСomplete  |  numbers: " + a + "\nResult\n___\narray\ncells ID:");

            for
            (int i = 0; i < numbers.size(); i++) {
                if (a == numbers.get(i));
                System.out.println(" " + i);
            }
            System.out.println();
        }
    }
}