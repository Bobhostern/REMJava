/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author onigiri
 */

public class EnumModule implements Interfaces.EnumModuleInterface {
    
    private List<String> enums;
    
    public EnumModule()
    {
        enums = new ArrayList<>();
    }
    
    @Override
    public void addEnumItem(String item)
    {
        enums.add(item);
    }

    @Override
    public boolean matchEnum(String item) {
        Iterator<String> ite = enums.iterator();
        for(;;)
        {
            if(ite.hasNext())
            {
                String hax = ite.next();
                if(hax.equals(item))
                {
                    return true;
                }
            }
            else
            {
                break;
            }
        }
        return false;
    }

    @Override
    public void removeEnumItem(String item) {
        enums.remove(item);
    }
}
