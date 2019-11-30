package entities;


import services.impl.Finisher;

public abstract class Character implements Finisher {
    private  String name;
    private String type;

  public String djap(){
      return "gedjaped";
  }

  public String slide(){
      return "slided";
  }

    @Override
    public String finsher() {
        return "dood";
    }
}
