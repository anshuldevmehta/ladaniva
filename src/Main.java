import lada.LadaNiva;

import java.beans.PropertyChangeListener;

public class Main {
    public static void main(String[] args) {

        PropertyChangeListener propertyChangeListener = evt -> {
            if (LadaNiva.PROP_PUT.equals(evt.getPropertyName())) {
                System.out.println("Lada Niva Warming Up....");
            }
        };

        System.out.println("Hello world!");
        LadaNiva theCommando=new LadaNiva();
        theCommando.addPropertyChangeListener(propertyChangeListener);
        theCommando.put("ok","test");
    }



}