package org.example.commands;

import java.util.concurrent.BlockingQueue;

/**
 * Останавливает цикл выполнения команд из пункта 1, не дожидаясь их полного завершения
 * */
public class HardStopCommand implements ICommand {
    private final BlockingQueue<ICommand> commandsQueue;

    public HardStopCommand(BlockingQueue<ICommand> commandsQueue) {
        this.commandsQueue = commandsQueue;
    }

    @Override
    public void execute() {
        
    }

}
