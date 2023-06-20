public class Animal extends Human{
    public  int eat;
    public Animal(String name , int year, int eat){
    super(name , year );
        this.eat = eat ;
        }public void sleep(){
        System.out.println("ngủ 5 tiếng");
    }
}
