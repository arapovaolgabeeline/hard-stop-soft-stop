package org.example.commands;

public class StartGameCommand implements ICommand {
    // было: private static final BlockingQueue<ICommand> COMMANDS_QUEUE = new ArrayBlockingQueue<>(100);
    private final ICommand handleCommand;
    private final boolean stop;

    public StartGameCommand(ICommand handleCommand, boolean stop) {
        this.handleCommand = handleCommand;
        this.stop = stop;
    }

    @Override
    public void execute() {
        while (handle()) ;
    }

    private boolean handle() {
        handleCommand.execute();
        return !stop;
    }

}
