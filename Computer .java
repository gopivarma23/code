public class Computer {
    public static String os = "Window";
    public String ram;

    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.ram = "8GB";

        Computer computer2 = new Computer();
        computer2.ram = "16GB";

        System.out.println("OS: " + Computer.os);
        System.out.println("Computer 1 RAM: " + computer1.ram);
        System.out.println("Computer 2 RAM: " + computer2.ram);
    }
}