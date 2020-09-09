package Mode.StateMode;

public class TestStateMode {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentLiftState(new CloseingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
