package ej6;

import java.util.ArrayList;
import java.util.List;

public class Chat implements IMediator {
    private List<Empleado> chat = new ArrayList<>();

    public void addChat(Empleado cliente){
        chat.add(cliente);
    }

    @Override
    public void send(String msg, String tipo, Empleado receiver, Empleado sender) {
        if (tipo.equals("Dm")){
            receiver.receive(msg);
        } else if (tipo.equals("Grupal")){
            for (Empleado c : chat) {
                if(!c.equals(sender)){
                    c.receive(msg);
                }
            }
        }
    }
}
