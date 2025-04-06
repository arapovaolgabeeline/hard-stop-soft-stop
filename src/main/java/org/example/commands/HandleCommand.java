package org.example.commands;

import org.example.handlers.ExceptionHandler;

import java.util.concurrent.BlockingQueue;

public class HandleCommand {
    private final BlockingQueue<ICommand> commandsQueue;

    public HandleCommand(BlockingQueue<ICommand> commandsQueue) {
        this.commandsQueue = commandsQueue;
    }

    public void handle() {
        ICommand command;
        try {
            // В цикле получает из потокобезопасной очереди команду и запускает ее
            command = commandsQueue.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            command.execute();
        } catch (Exception ex) { // Выброс исключения из команды не должен прерывать выполнение потока.
            ExceptionHandler.handle(command, ex).execute();
        }
    }
}
