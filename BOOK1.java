import java.io.*;

public class BOOK1 {
    public static void main(String args[]) throws IOException,ClassNotFoundException {
        Book book=new Book(010313, "blackpink", "RanLuYao", 66);
        ObjectOutputStream oos=new ObjectOutputStream(
                new FileOutputStream("D:/book.dat"));
        oos.writeObject(book);
        oos.close();
        book=null;
        ObjectInputStream ois=new ObjectInputStream(
                new FileInputStream("D:/book.dat"));
        book=(Book)ois.readObject();
        ois.close();
        System.out.println("ID is:"+book.id);
        System.out.println("name is:"+book.name);
        System.out.println("author is:"+book.author);
        System.out.println("price is:"+book.price);
    }
}
