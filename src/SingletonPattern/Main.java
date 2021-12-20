package SingletonPattern;

public class Main {

    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //Government government = new Government();

        //Get the only object available
        Government government = Government.elections();

        //show the message
        government.showMessage();
    }
}
