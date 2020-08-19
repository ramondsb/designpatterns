interface IStrategy {
    String action();
}

class StrategyContainer {
    private IStrategy strategy;

    public StrategyContainer(IStrategy strategy) {
        this.strategy = strategy;
    }

    void doAction() {
        System.out.println(this.strategy.action());
    }

    void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}

class StrategyA implements IStrategy {
  public String action() {
      return "Executing some action in A style";
  }
}

class StrategyB implements IStrategy {
  public String action() {
      return "Executing some action in B style";
  }
}

class StrategyExample {
    public static void main(String[] args) {
        StrategyA strategyA = new StrategyA();
        StrategyContainer container = new  StrategyContainer(strategyA);
        container.doAction();

        // Change strategy at runtime
        StrategyB strategyB = new StrategyB();
        container.setStrategy(strategyB);
        container.doAction();
    }
}