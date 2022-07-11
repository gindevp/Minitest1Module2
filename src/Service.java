public class Service {
    public static double sumPrice(ProgrammingBook[] pb, FictionBook[] fb) {
        double sum = 0;
        for (ProgrammingBook x : pb
        ) {
            sum += x.price;
        }
        for (FictionBook x : fb
        ) {
            sum += x.price;
        }
        return sum;
    }

    public static int countLanguage(ProgrammingBook[] pb, String language) {
        int count = 0;
        for (ProgrammingBook x : pb
        ) {
            if (language.equals(x.getLanguage())) {
                count++;
            }
        }
        return count;
    }
public static int countCategory(FictionBook[] fb, String category) {
        int count = 0;
        for (FictionBook x : fb
        ) {
            if (category.equals(x.getCategory())) {
                count++;
            }


        }
        return count;

    }

    public static int countPriceMin100(FictionBook[] fb) {
        int count = 0;
        for (FictionBook x : fb
        ) {
            if (x.price < 100) {
                count++;
            }
        }
        return count;
    }
}
