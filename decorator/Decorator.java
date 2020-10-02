class Client {
    public void makeRequest() {
        System.out.println("Doing request");
    }
}

class Decorator extends Client {
    private Client client = null;

    public Decorator(Client client) {
        this.client = client;
    }

    // Fowarding all methods
    public void makeRequest() {
        this.client.makeRequest();
    }
}

class DecoratorA extends Decorator {
    public DecoratorA(Client client) {
        super(client);
        this.operationA();
    }

    public void operationA() {
        System.out.println("Operation A");
    }
}

class DecoratorB extends Decorator {
    public DecoratorB(Client client) {
        super(client);
        this.operationB();
    }

    public void operationB() {
        System.out.println("Operation B");
    }
}

class DecoratorApp {
    public static void main(String[] args)  {
        Client decoratedClient = new DecoratorA(new DecoratorB(new Client()));

        decoratedClient.makeRequest();
    }
}