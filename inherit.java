public class inherit {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
    }
}
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
    int fins;
    void swin(){
        System.out.println("swins");
    }
}
