import java.io.Serializable;

class Book implements Serializable {
    int id;
    String name;
    String author;
    float price;
    public Book(int id,String name,String author,float price) {
        this.id=id;
        this.name=name;
        this.author=author;
        this.price=price;
    }
}
