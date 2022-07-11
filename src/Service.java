public class Service {
    public static double sumPrice(Book[] arr) {
        double sum = 0;
        for (Book x : arr
        ) {
            sum += x.getPrice();
        }
        return sum;
    }

    public static int countLanguage(Book[] arr, String language) {
        int count = 0;
        for (Book x : arr
        ) {
            if (x instanceof ProgrammingBook) {
                ProgrammingBook y = (ProgrammingBook) x;
                if (language.equals(y.getLanguage())) {
                    count++;
                }

            }
        }return count;
    }
    public static int countCategory(Book[] arr, String category) {
        int count = 0;
        for (Book x : arr
        ) {
            if(x instanceof FictionBook){
                FictionBook y= (FictionBook) x;
                if (category.equals(y.getCategory())) {
                    count++;
                }
            }



        }
        return count;

    }

    public static int countPriceMin100(Book[] arr) {
        int count = 0;
        for (Book x : arr
        ) {
            if(x instanceof FictionBook){
                FictionBook y=(FictionBook) x;
                if (y.getPrice() < 100) {
                    count++;
                }
            }

        }
        return count;
    }
}
