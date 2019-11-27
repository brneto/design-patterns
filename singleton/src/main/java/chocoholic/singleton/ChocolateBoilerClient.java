package chocoholic.singleton;

import chocoholic.singleton.doublechecked.ChocolateBoiler;

public class ChocolateBoilerClient {

  public static void main(String[] args) {
    ChocolateBoiler boiler = ChocolateBoiler.getInstance();
    boiler.fill();
    boiler.boil();
    boiler.drain();
  }

}
