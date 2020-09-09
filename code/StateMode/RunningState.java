package Mode.StateMode;

public class RunningState extends LiftState{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void stop() {
        super.context.setCurrentLiftState(Context.stoppingState);
        super.context.getCurrentLiftState().stop();
    }

    @Override
    public void run() {
        System.out.println("电梯上下执行");
    }
}
