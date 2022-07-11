public class main {
    public static void main(String[] args) {
        ProgrammingBook pb1 = new ProgrammingBook(1, "book C++", 99.9, "Quyet", "java", "chua ro");
        ProgrammingBook pb2 = new ProgrammingBook(2, "book java", 9.99, "quyet79", "English", "Spring");
        ProgrammingBook pb3 = new ProgrammingBook(3, "book java", 9.99, "quyet79", "java", "Spring");
        ProgrammingBook pb4 = new ProgrammingBook(4, "book java", 9.99, "quyet79", "English", "Spring");
        ProgrammingBook pb5 = new ProgrammingBook(5, "book java", 9.99, "quyet79", "English", "Spring");

        FictionBook fb1 = new FictionBook(6, "book java", 9.99, "quyet79", "vientuong1");
        FictionBook fb2 = new FictionBook(7, "book java", 9.99, "quyet79", "sach lap trinh");
        FictionBook fb3 = new FictionBook(8, "book java", 9.99, "quyet79", "sach lap trinh");
        FictionBook fb4 = new FictionBook(9, "book java", 9.99, "quyet79", "sach lap trinh");
        FictionBook fb5 = new FictionBook(10, "book java", 9.99, "quyet79", "sach lap trinh");

        double[] arr = new double[]{pb1.price, pb2.price, pb3.price, pb4.price, pb5.price, fb1.price, fb2.price, fb3.price, fb4.price, fb5.price};
        ProgrammingBook[] arrPb = new ProgrammingBook[]{pb1, pb2, pb3, pb4, pb5};
        FictionBook[] arrFb= new FictionBook[]{fb1,fb2,fb3,fb4,fb5};
        System.out.println("Price 10:");
        System.out.println(sumPrice(arr));
        System.out.println("Count language is Java PB:");
        System.out.println(countLanguage(arrPb,"java"));
        System.out.println("Count category is Vientuong1: ");
        System.out.println(countCategory(arrFb,"vientuong1"));
        System.out.println("Count price <100:");
        System.out.println(countPriceMin100(arrFb));
    }

    private static double sumPrice(double array[]) {
        double sum = 0;
        for (double x : array
        ) {
            sum += x;
        }
        return sum;
    }

    private static int countLanguage(ProgrammingBook[] pb, String language) {
        int count=0;
        for (ProgrammingBook x: pb
             ) {
            if(language.equals(x.getLanguage())){
                count++;
            }
        }
        return count;
    }
    private static int countCategory(FictionBook[] fb, String category ){
        int count=0;
        for (FictionBook x: fb
             ) {
            if(category.equals(x.getCategory())){
                count++;
            }


        }
        return count;

    }
    private static  int countPriceMin100(FictionBook[] fb){
        int count=0;
        for (FictionBook x: fb
             ) {
            if(x.price<100){
                count++;
            }
        }
        return count;
    }
}
