package com.wch.pattern.state;

/**
 * Created by chunhai.wang on 2015/11/16.
 */
public class Context {

    public final static OpenningState openningState = new OpenningState();
    public final static ClosingState closingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(final LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void stop() {
        this.liftState.stop();
    }

    public void run() {
        this.liftState.run();
    }

}
