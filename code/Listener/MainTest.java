package Listener;

public class MainTest {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ApplicationContext();

        /**
         * 添加监听事件源为整型的监听器
         */
        applicationContext.addApplicationListener(event -> {
            Object source = event.getSource();
            if (source instanceof Integer) {
                int now = (int) source;
                System.out.println("检测到事件源为整型：事件源变为" + now);
            }
        });

        /**
         * 添加监听事件源为字符串类型的监听器
         */
        applicationContext.addApplicationListener(event -> {
            Object source = event.getSource();
            if (source instanceof String) {
                String now = (String) source;
                System.out.println("检测到事件源为字符串类型：事件源变为" + now);
            }
        });

        /**
         * 发布事件
         */
//        applicationContext.publishEvent(new ApplicationEvent(1001));
        applicationContext.publishEvent(new ApplicationEvent("Hello"));
        applicationContext.publishEvent(new ApplicationEvent(1));

    }
}
