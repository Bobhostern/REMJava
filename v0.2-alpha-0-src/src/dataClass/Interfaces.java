package dataClass;

/**
 *
 * @author onigiri
 */
public class Interfaces {
    interface BitInterface {
        public void changeTo0();
        public void changeTo1();
        public String returnValue();
        @Override
        public String toString();
    }
    
    interface ByteInterface {
        
    }
    
    interface EnumModuleInterface {
        public void addEnumItem(String item);
        public boolean matchEnum(String item);
        public void removeEnumItem(String item);
    }
}
