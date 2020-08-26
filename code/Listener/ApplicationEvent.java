package Listener;

import java.util.EventObject;

/**
 * 事件
 */
public class ApplicationEvent extends EventObject {
    private static final long serialVersionUID = 1840381414867073578L;

    public ApplicationEvent(Object source) {
        super(source);
    }
}
