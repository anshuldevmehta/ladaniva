import lada.LadaNiva;
import listener.LadaNivaListener;

import java.beans.PropertyChangeListener;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello Russia!");
        LadaNiva theCommando=new LadaNiva();
        theCommando.addPropertyChangeListener(LadaNivaListener.putEventListener);
        theCommando.addPropertyChangeListener(LadaNivaListener.removeEventListener);
        theCommando.put("ok","test");
        theCommando.remove("ok");
        System.out.println("Was The Value Really Removed:"+theCommando.get("ok"));

    }



}