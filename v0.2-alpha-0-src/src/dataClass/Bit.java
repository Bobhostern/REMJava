package dataClass;

import dataClass.Interfaces.BitInterface;

/**
 *
 * @author onigiri
 */
public class Bit implements BitInterface {
    private boolean datanum;
    
    public Bit() {
        datanum = false;
    }
    
    public void changeTo0() {
        datanum = false;
    }
    
    public void changeTo1() {
        datanum = true;
    }
    
    public String returnValue() {
        String data = "";
        if (datanum) {
            data = "1";
        } else if (!datanum) {
            data = "0";
        }
        
        return data;
    }
    
    @Override
    public String toString() {
        String x = this.returnValue();
        return x;
    }
}
