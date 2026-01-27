public class Product {

    private Long id;
    private String name;
    private Double price;

    public Product(Long id, String name, Double price){
        this.id = id;
        this.name = name;
        this.price = price;

    }
    public Long getId(){
        return id;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;

        }
        if (obj == null){
            return false;
        }

        if (getClass() !=obj.getClass()){
            return false;

        }
        Product other = (Product) obj;

        if (id == null){
            return false;
        }
        return id.equals(other.id);
    }
}
