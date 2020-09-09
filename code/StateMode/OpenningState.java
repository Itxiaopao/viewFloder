package Mode.StateMode;

public class OpenningState extends LiftState{
    @Override
    public void open() {
        System.out.println("执行open");
    }

    @Override
    public void close() {
        //状态修改
        super.context.setCurrentLiftState(Context.closeingState);
        //动作委托给CloseState执行
        super.context.getCurrentLiftState().close();
    }

    @Override
    public void stop() {

    }

    @Override
    public void run() {

    }
}
