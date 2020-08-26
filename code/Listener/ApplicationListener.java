package Listener;

import java.util.EventListener;

/**
 * 监听器
 */
public interface ApplicationListener extends EventListener {
    void executeListener(ApplicationEvent event);
}
