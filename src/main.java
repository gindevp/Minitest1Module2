public class main {
    public static void main(String[] args) {

        //Khởi tạo đối tượng pb có tham số với kiểu dữ liệu ProgramingBook
        ProgrammingBook pb1 = new ProgrammingBook(1, "book C++", 9.99, "Quyet", "java", "chua ro");
        ProgrammingBook pb2 = new ProgrammingBook(2, "book java", 9.99, "quyet79", "English", "Spring");
        ProgrammingBook pb3 = new ProgrammingBook(3, "book java", 9.99, "quyet79", "java", "Spring");
        ProgrammingBook pb4 = new ProgrammingBook(4, "book java", 9.99, "quyet79", "English", "Spring");
        ProgrammingBook pb5 = new ProgrammingBook(5, "book java", 9.99, "quyet79", "English", "Spring");

        //Khởi tạo đối tượng fb có tham số với kiểu dữ liệu FictionBook
        FictionBook fb1 = new FictionBook(6, "book java", 9.99, "quyet79", "vientuong1");
        FictionBook fb2 = new FictionBook(7, "book java", 9.99, "quyet79", "sach lap trinh");
        FictionBook fb3 = new FictionBook(8, "book java", 9.99, "quyet79", "sach lap trinh");
        FictionBook fb4 = new FictionBook(9, "book java", 9.99, "quyet79", "sach lap trinh");
        FictionBook fb5 = new FictionBook(10, "book java", 9.99, "quyet79", "sach lap trinh");

        //Truyền các đối tượng vào mảng có kiểu dữ liệu là class
        ProgrammingBook[] arrPb = new ProgrammingBook[]{pb1, pb2, pb3, pb4, pb5};
        FictionBook[] arrFb = new FictionBook[]{fb1, fb2, fb3, fb4, fb5};

        //Thực hiện và in ra giá trị
        System.out.println("Price 10:");
        System.out.println(Service.sumPrice(arrPb, arrFb));
        System.out.println("Count language is Java PB:");
        System.out.println(Service.countLanguage(arrPb, "java"));
        System.out.println("Count category is Vientuong1: ");
        System.out.println(Service.countCategory(arrFb, "vientuong1"));
        System.out.println("Count price <100:");
        System.out.println(Service.countPriceMin100(arrFb));
    }


}
