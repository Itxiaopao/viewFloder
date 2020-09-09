package Mode.StateMode;

public class CloseingState extends LiftState{
    @Override
    public void open() {
        this.context.setCurrentLiftState(Context.openningState);
        this.context.getCurrentLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("执行电梯门关闭");
    }

    @Override
    public void stop() {
        this.context.setCurrentLiftState(Context.stoppingState);
        this.context.getCurrentLiftState().stop();
    }

    @Override
    public void run() {
        this.context.setCurrentLiftState(Context.runningState);
        this.context.getCurrentLiftState().run();
    }
}
