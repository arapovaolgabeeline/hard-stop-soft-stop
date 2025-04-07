package org.example.commands;

/**
 * Останавливает цикл выполнения команд из пункта 1, не дожидаясь их полного завершения
 * */
public class HardStopCommand implements ICommand {
    private final ThreadLocal<Boolean> stop;
    private final Thread thread;

    public HardStopCommand(ThreadLocal<Boolean> stop, Thread thread) {
        this.stop = stop;
        this.thread = thread;
    }

    @Override
    public void execute() {
        if (Thread.currentThread() != thread) {
            throw new RuntimeException("Hard stop command thread does not belong to the thread");
        }
        stop.set(true);
    }

}
