public class main {
    public static void main(String[] args) {

        //Khởi tạo đối tượng pb có tham số với kiểu dữ liệu ProgramingBook
        Book pb1 = new ProgrammingBook(1, "book C++", 9.99, "Quyet", "java", "chua ro");
        Book pb2 = new ProgrammingBook(2, "book java", 9.99, "quyet79", "English", "Spring");
        Book pb3 = new ProgrammingBook(3, "book java", 9.99, "quyet79", "java", "Spring");
        Book pb4 = new ProgrammingBook(4, "book java", 9.99, "quyet79", "English", "Spring");
        Book pb5 = new ProgrammingBook(5, "book java", 9.99, "quyet79", "English", "Spring");

        //Khởi tạo đối tượng fb có tham số với kiểu dữ liệu FictionBook
        Book fb1 = new FictionBook(6, "book java", 9.99, "quyet79", "vientuong1");
        Book fb2 = new FictionBook(7, "book java", 9.99, "quyet79", "sach lap trinh");
        Book fb3 = new FictionBook(8, "book java", 9.99, "quyet79", "sach lap trinh");
        Book fb4 = new FictionBook(9, "book java", 9.99, "quyet79", "sach lap trinh");
        Book fb5 = new FictionBook(10, "book java", 9.99, "quyet79", "sach lap trinh");

        //Truyền các đối tượng vào mảng có kiểu dữ liệu là class
        Book[] arr = new Book[]{pb1, pb2, pb3, pb4, pb5,fb1, fb2, fb3, fb4, fb5};


        //Thực hiện và in ra giá trị
        System.out.println("Price 10:");
        System.out.println(Service.sumPrice(arr));
        System.out.println("Count language is Java PB:");
        System.out.println(Service.countLanguage(arr, "java"));
        System.out.println("Count category is Vientuong1: ");
        System.out.println(Service.countCategory(arr, "vientuong1"));
        System.out.println("Count price <100:");
        System.out.println(Service.countPriceMin100(arr));
    }


}
