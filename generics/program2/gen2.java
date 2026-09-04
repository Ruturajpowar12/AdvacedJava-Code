package generics.program2;

class mobile< T ,U>{
    T brand;
    U price;

    mobile(T brand , U price){
        this.brand = brand;
        this.price = price;
    }

    U getPrice(){
        return price;
    }

    T getBrand(){
        return brand;
    }
}

public class gen2 {

    public static void main(String[] args) {
        
        mobile<String ,Integer> mb = new mobile<>("ViVo", 18000);
        System.out.println("Mobile brand is "+mb.getBrand());
        System.out.println("Mobile price is "+mb.getPrice());
    }
}
