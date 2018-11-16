public class Main {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("ttttkn"));
        bookShelf.appendBook(new Book("kawakami"));
        bookShelf.appendBook(new Book("nishio"));
        bookShelf.appendBook(new Book("fdsadf"));
        bookShelf.appendBook(new Book("qwere"));
        bookShelf.appendBook(new Book("vxczcv"));
        bookShelf.appendBook(new Book(";lkj"));
        bookShelf.appendBook(new Book("@poiu"));

        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}

/*
iteratorを集合体(bookshelf)の外に置くことで集合体の要素を別のオブジェクトで実装しても
正しいiteratorを返せばiteratorを使用することができる(クラスの再利用)
 */