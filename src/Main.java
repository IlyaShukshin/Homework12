public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Альбер", "Камю");
        Book book1 = new Book("Падение", 1960, author1);

        Author author2 = new Author("Фёдор", "Достоевский");
        Book book2 = new Book("Преступление и наказание", 1866, author2);

        book1.setPublicationYear(1956);
        System.out.println("Книга: " + book1.getName());
        System.out.println("Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("Год публикации: " + book1.getPublicationYear());
        System.out.println("Хэш код автора: " + author2.hashCode());
        System.out.println();
        System.out.println("Книга: " + book2.getName());
        System.out.println("Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
        System.out.println("Год публикации: " + book2.getPublicationYear());
        System.out.println("Хэш код автора: " + author1.hashCode());
        System.out.println();
        if (author1.equals(author2)) {
            System.out.println("Автор один");
        } else {
            System.out.println("Авторы разные");
        }
    }
}