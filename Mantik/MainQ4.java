import java.util.*;

public class MainQ4 {
    interface Action {
        void run();
    }

    static class ActionQueue {
        private final Queue<Action> pending = new ArrayDeque<Action>();

        void schedule(Action action) {
            // TODO: store, do not run yet
            pending.offer(action);
        }

        void runAll() {
            // TODO: poll and run in order
            while(!pending.isEmpty()){
                Action currentAction = pending.poll();
                currentAction.run();
            }
        }
    } 

    public static void main(String[] args) {
        ActionQueue queue = new ActionQueue();
        queue.schedule(new Action() {
            public void run() {
                System.out.println("first");
            }
        });
        queue.schedule(new Action() {
            public void run() {
                System.out.println("second");
            }
        });
        queue.runAll();
    }
}