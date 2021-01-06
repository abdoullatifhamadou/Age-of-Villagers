public Coffee getCoffee(CoffeeType type, Customization cust) {
  switch(type) {
    case ESPRESSO:
        Espresso obj = new Espresso();
        obj.setMilk(cust.getMilk());
        obj.setSugar(Math.min(DEFAULT_SUGAR, cust.getSugar()));
        obj.setCoffee(Math.min(DEFAULT_COFFEE, cust.getCoffee()));
        return obj;
        .
        .
        .
        .
        
    case COKE:
      Coke obj = new Coke();
      obj.setCoke(DEFAULT_COKE, cust.getCoke());
      obj.setSoda(DEFAULT_SODA, cust.getSoda());
      return obj;
    default:
      throw new SomeException("Coffee type not supported");
  }
