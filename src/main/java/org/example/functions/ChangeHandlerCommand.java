package org.example.functions;

import org.example.commands.ICommand;

public class ChangeHandlerCommand implements ICommand {
    private final IThreadWrapper thread;
    private final IHandler handler;

    public ChangeHandlerCommand(IThreadWrapper thread, IHandler handler) {
        this.thread = thread;
        this.handler = handler;
    }

    @Override
    public void execute() {
        this.thread.setupHandler(handler);
    }

}
