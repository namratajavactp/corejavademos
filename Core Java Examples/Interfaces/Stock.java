class Stock implements Printable {
 private String tickerSymbol = new String("XYZ");
 private int shares = 100;
 private int currentPrice = 4000; // in pennies
 public void printAll() {
  System.out.println(tickerSymbol + " " + shares +
            " shares at " + currentPrice);
  System.out.println("Value: " + currentPrice * shares);
 }
 public void sell() {
  System.out.println(tickerSymbol + " sold");
 }
}

