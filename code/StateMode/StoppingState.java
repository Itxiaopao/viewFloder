package Mode.StateMode;

public class StoppingState extends LiftState{
    @Override
    public void open() {
        super.context.setCurrentLiftState(Context.openningState);
        super.context.getCurrentLiftState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void stop() {
        System.out.println("电梯停止");
    }

    @Override
    public void run() {
        super.context.setCurrentLiftState(Context.runningState);
        super.context.getCurrentLiftState().run();
    }
}
