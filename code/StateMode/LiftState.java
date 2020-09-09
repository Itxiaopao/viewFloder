package Mode.StateMode;

public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 电梯开门
     */
    public abstract void open();

    /**
     * 电梯关门
     */
    public abstract void close();

    /**
     * 电器停止
     */
    public abstract void stop();

    /**
     * 电器运行
     */
    public abstract void run();

}
