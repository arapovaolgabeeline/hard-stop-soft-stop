package org.example.commands;

public class StartGameCommand implements ICommand {
    // было: private static final BlockingQueue<ICommand> COMMANDS_QUEUE = new ArrayBlockingQueue<>(100);
    private final ICommand handleCommand;

    public StartGameCommand(ICommand handleCommand) {
        this.handleCommand = handleCommand;
    }

    @Override
    public void execute() {
        while (handle()) ;
    }

    private boolean handle() {
        boolean stop = false;
        handleCommand.execute();
        return !stop;
    }

}
