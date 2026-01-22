interface Greeting {
    void sayHello();
}

class GreetingDemo {
    public static void main(String[] args) {

        // Anonymous inner class implementing Greeting
        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Hello! Welcome to Java Programming.");
            }
        };

        g.sayHello();
    }
}
