public class Book {
    String title;
    String author;
    double price;
    double discount;
    public Book (){
        this.title ="Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    public Book (String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails(){
        System.out.println("title: "+title);
        System.out.println("author: "+author);
        System.out.println(discount+"% discount is added. New price: "+price);
    }
    public void updatePrice(double newPrice){
        price = newPrice;
        if (price < 0){
            price *= -1;
        }
    }
    public void applyDiscount(double discountPrice){
        if (discountPrice <= 0.00 || discountPrice >= 100.00){
            System.out.println("Discount percentage is invalid!!!");
        }else{
            discount = discountPrice;
            price -= (price * (discountPrice/100));
            updatePrice(price);
        }
    }
}
