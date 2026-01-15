// Defining the interface
interface Motor {
    int capacity = 5;

    void run();
    void consume();
}


class WashingMachine implements Motor {

    public void run() {
        System.out.println("Motor is running");
    }

    public void consume() {
        System.out.println("Motor is consuming power");
    }

    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();


        System.out.println("Capacity of the motor is " + capacity);
    }
}

