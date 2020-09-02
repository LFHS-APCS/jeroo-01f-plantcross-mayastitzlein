/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    
    // Put any helpermethods here
    public void hoptoStart () {
      this.hop();
      this.hop();
      this.hop();
      this.hop();
      this.hop();
      this.hop();
      this.turn(RIGHT);
      this.hop();
      this.hop();
      this.hop();
      this.hop();
      this.hop();
      this.hop();
      this.turn(RIGHT);
    }

    public void plantHop () {
      this.plant();
      this.hop();
    }

    public void plantturnLefthop () {
      this.plant();
      this.turn(LEFT);
      this.hop();
    }

    public void straightarmFirstside () {
      this.plantHop();
      this.plantHop();
      this.plantHop();
    }

    public void aroundArm () {
      this.plantturnLefthop();
      this.plantHop();
      this.plantturnLefthop();
    }

    public void straightarmSecondside () {
      this.plantHop();
      this.plantHop();
      this.turn(RIGHT);
    }

    public void crossArm () {
      this.straightarmFirstside();
      this.aroundArm();
      this.straightarmSecondside();
    }

    public void hopAway () {
      this.hop();
      this.turn(RIGHT);
      this.hop();
    }

    public void plantCross () {
      this.hoptoStart();
      this.crossArm();
      this.crossArm();
      this.crossArm();
      this.crossArm();
      this.hopAway();
    }
    
    
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
