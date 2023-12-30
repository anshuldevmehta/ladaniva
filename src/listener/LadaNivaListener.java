package listener;

import lada.LadaNiva;

import java.beans.PropertyChangeListener;

public class LadaNivaListener
{
    public static PropertyChangeListener putEventListener = evt -> {
    if (LadaNiva.PROP_PUT.equals(evt.getPropertyName())) {
        System.out.println("Lada Niva Warming Up....new value..."+evt.getNewValue());
    }
   };

    public static PropertyChangeListener removeEventListener = evt -> {
        if (LadaNiva.PROP_PUT.equals(evt.getPropertyName())) {
            System.out.println("Lada Niva Cleaning Up....new value..."+evt.getNewValue());
        }
    };
}
