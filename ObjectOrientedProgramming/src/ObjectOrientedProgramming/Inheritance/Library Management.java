package ObjectOrientedProgramming.Inheritance;

/*
 * This class represents a Book
 * with basic book-related details.
 */
class Book {

    // Title of the book
    String title;

    // Year of publication
    int publicationYear;

    // Constructor to initialize book details
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

/*
 * This class represents an Author
 * and extends the Book class.
 */
class Author extends Book {

    // Name of the author
    String name;

    // Short biography of the author
    String bio;

    // Constructor to initialize author and book details
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Method to display complete book and author information
    void displayInfo() {
        System.out.println(
                title + " " +
                publicationYear + " " +
                name + " " +
                bio
        );
    }
}
