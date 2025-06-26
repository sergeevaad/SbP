package org.example;

public class Main {
    public static void main(String[] args){

        //Задание 1
        Phone phone1 = new Phone("89000000000","Sam",0.209);
        Phone phone2 = new Phone("89111111111","Sam");
        Phone phone3 = new Phone();

        phone1.recieveCall("Анастасия");
        System.out.println("Номер phone2: "+phone2.getNumber());
        Phone.sendMessage();
        System.out.println(phone1);

        System.out.println("\n\n");

        //Задание 2
        Circle circle1 = new Circle(5,"Красный");
        System.out.println(circle1);

        System.out.println("\n\n");

        //Задание 3
        Matrix matrix1 = new Matrix(3, 3);
        matrix1.setValue(0, 0, 1);
        matrix1.setValue(0, 1, 2);
        matrix1.setValue(0, 2, 3);
        matrix1.setValue(1, 0, 4);
        matrix1.setValue(1, 1, 5);
        matrix1.setValue(1, 2, 6);
        matrix1.setValue(2, 0, 7);
        matrix1.setValue(2, 1, 8);
        matrix1.setValue(2, 2, 9);

        System.out.println("Матрица 1");
        Matrix.print(matrix1);

        Matrix matrix2 = new Matrix(3, 2);
        matrix2.setValue(0, 0, 9);
        matrix2.setValue(0, 1, 8);
        //matrix2.setValue(0, 2, 7);
        matrix2.setValue(1, 0, 6);
        matrix2.setValue(1, 1, 5);
        //matrix2.setValue(1, 2, 4);
        matrix2.setValue(2, 0, 3);
        matrix2.setValue(2, 1, 2);
        //matrix2.setValue(2, 2, 1);

        System.out.println("\nМатрица 2");
        Matrix.print(matrix2);

        System.out.println("\nСумма матриц");
        Matrix.print(matrix1.sum(matrix2));

        System.out.println("\nУмножение на число");
        Matrix.print(matrix1.multNum(2));

        System.out.println("\nУмножение двух матриц");
        Matrix.print(matrix1.multMat(matrix2));

        System.out.println("\n\n");

        //Задание 4
        Author author1 = new Author("J.K.Rowling","F","jkrowling@gmail.com");
        Author author2 = new Author();

        author2.setName("Шилдт Герберт");
        author2.setGender("M");
        author2.setEmail("herbertschildt@gmail.com");

        System.out.println(author1.getName());
        System.out.println(author1.getGender());
        System.out.println(author1.getEmail());

        System.out.println(author2);

        System.out.println();

        Book book1 = new Book("Harry Potter and Philosopher's Stone",author1,1997);
        Book book2 = new Book();

        book2.setTitle("Java. Полное руководствоб, 12-е издание");
        book2.setAuthor(author2);
        book2.setYear(2022);


        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getYear());

        System.out.println(book2);

    }
}
