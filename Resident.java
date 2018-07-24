
public class Resident {
  
  private int type;
  private double outBias;
  private double inBias;
  
  private boolean isUnhappy;
  private Resident[][] livingSpace;
  
  public Resident(int type, double outBias, double inBias, Resident[][] livingSpace) {
    this.type = type;
    this.outBias = outBias;
    this.inBias = inBias;
  }
  
  public int getType() {
    return type;
  }
  
  public boolean isUnhappy() {
    return isUnhappy;
  }
  
  public double outBias() {
    return outBias;
  }
  
  public double inBias() {
    return inBias;
  }
}
