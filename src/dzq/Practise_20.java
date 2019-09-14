package dzq;


/**
 * 1-n中1的个数
 */
public class Practise_20 {

    public static void main(String[] args) {


        int count = count(2);

        System.out.println(count);

    }

    private static int count(int n) {

        if (n <= 0) {
            return 0;
        }
        int count = 0;

//        for (int m = 1; m <= n; m *= 10) {
//            count +=  n / (m*10) + n % (m*10) / m == 0 ? 0 : (n % (m*10) / m == 1 ? n % (m*10) % m+1 : m);
//        }

        for (int m = 1; m <= n; m *= 10) {
            count += (n / m + 8) / (10 * m) + (n / m % 10 == 1 ? n % m + 1 : 0);
        }

//        while (flag) {
//            int count_10 = n / count10(i);
//            int yushu = n % count10(i);
//            if (count_10 == 0) {
//                flag = false;
//            }
//            int part1 = n / count10(i);
//            int part2 = yushu / count10(i -1) == 0 ?0 : (yushu / count10(i -1) == 1 ? yushu % count10(i -1)+1 : count10(i-1));
//            count = count + part1 + part2;
//            i++;
//        }

        return count;
    }

    private static int count10(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            count = count * 10;
        }
        return count;
    }


}
