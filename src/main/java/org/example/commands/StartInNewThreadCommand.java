package org.example.commands;

public class StartInNewThreadCommand implements ICommand {
    private final ICommand command;

    public StartInNewThreadCommand(ICommand command) {
        this.command = command;
    }

    @Override
    public void execute() {
        new Thread(command::execute);
    }

}
