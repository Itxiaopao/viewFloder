package Listener;

import java.util.HashSet;
import java.util.Set;

/**
 * 事件源
 */
public class ApplicationContext {

    /**
     * 存放所有的监听器
     */
    Set<ApplicationListener> listeners;

    public ApplicationContext() {
        this.listeners = new HashSet<>();
    }

    /**
     * 添加监听器
     * @param listener 监听器
     */
    public void addApplicationListener(ApplicationListener listener) {
        this.listeners.add(listener);
    }

    /**
     * 发布事件
     * 回调所有监听器的回调方法
     * @param event 事件
     */
    public void publishEvent(ApplicationEvent event) {
        for (ApplicationListener listener : listeners) {
            listener.executeListener(event);
        }
    }
}
