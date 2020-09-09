package Mode.StateMode;

/**
 * Context是一个环境角色，它的作用是串联各个状态的过渡，在LiftSate抽象类中我们定义并把这个环境角色聚合进来，
 * 并传递到子类，也就是4个具体的实现类中自己根据环境来决定如何进行状态的过渡
 */
public class Context {

    public final static OpenningState openningState = new OpenningState();
    public final static CloseingState closeingState = new CloseingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();
    /**
     * 设置当前的状态
     */
    private LiftState currentLiftState;

    public LiftState getCurrentLiftState(){
        return this.currentLiftState;
    }

    public void setCurrentLiftState(LiftState currentLiftState){
        this.currentLiftState = currentLiftState;
        //修改共享操作变量
        this.currentLiftState.setContext(this);
    }


    public void close(){
        this.currentLiftState.close();
    }

    public void open(){
        this.currentLiftState.open();
    }

    public void stop(){
        this.currentLiftState.stop();
    }

    public void run(){
        this.currentLiftState.run();
    }
}
