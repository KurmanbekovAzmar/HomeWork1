public class Employee {
    String name;
    int age;
    int price;
    int expirience;

    public void getAge() {
        System.out.println(name+" : ");
        if (age < 18) {
            System.out.println("Нельзя работать ");
        }else{
            System.out.println("Можно работать");
        }
    }

    public void getPrice() {
        System.out.println(name+" : ");
        System.out.println(price + "*" + 3 + "+" + (price * 3));
    }

    public void getExpireance() {
        if(expirience>5){
            System.out.println(name);
        }
    }public void employes(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Price : "+price);
        System.out.println("Expireance : "+expirience);
    }
}
