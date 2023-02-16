package MiniBookStore;

public class Product {
    //1-a;tum urunlerin ortak ozellik ve metodlari

    private  int id;
    private  String name;
    private  String price;
    private int stok;

    public Product(int id, String name, String price, int stok) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getStok() {
        return stok;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
