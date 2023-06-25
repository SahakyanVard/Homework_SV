import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class StreamBig {

    static int bigF(int x) {
        for (int i = 0; i < 1000000; i++) {
            x = (x ^ 7 % 88) / 101;
        }
        return x;
    }

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            integerList.add(random.nextInt());
        }
//        System.out.println();
// .parallelStream()
        long timeStart = System.currentTimeMillis();
        Optional<Integer> reduce = integerList.parallelStream().map(x -> bigF(x)).reduce(Integer::max);
        long timeEnd = System.currentTimeMillis();
        System.out.println((timeEnd - timeStart) / 1000.0);

    }
}
