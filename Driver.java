import java.util.Random;

class Driver {
  public static void main(String[] args) {
    new Driver();
  }
  
  private final int NUM_RESIDENTS = 20;
  private Resident[][] livingSpace;
  
  public Driver() {
    livingSpace = new Resident[NUM_RESIDENTS][NUM_RESIDENTS];
    Random r = new Random();
    
    for (int i = 0; i < NUM_RESIDENTS; i += 1) {
      for (int j = 0; j < NUM_RESIDENTS; j += 1) {
        int num = r.nextInt(10);
        if (num < 4) {
          livingSpace[i][j] = new Resident(0, 0, 0, livingSpace);
        } else if (num < 8) {
          livingSpace[i][j] = new Resident(1, 0, 0, livingSpace);
        } else {
          livingSpace[i][j] = null;
        }
      }
    }
    
    print();
    
    
  }
  
  private void print() {
    for (int i = 0; i < NUM_RESIDENTS; i += 1) {
      for (int j = 0; j < NUM_RESIDENTS; j += 1) {
        Resident r = livingSpace[i][j];
        String resident = " ";
        if (r == null) {
          resident += "-";
        } else {
          resident += "" + r.getType();
        }
        resident += " ";
        System.out.print(resident);
      }
      System.out.println();
    }
  }
}
