public class ManagerApp {

    public static void main(String[] args) {
        var manager = new Manager("eko");
        manager.sayHello("budi");

        var vp = new VicePresident("joko");
        vp.sayHello("budi");
    }
}