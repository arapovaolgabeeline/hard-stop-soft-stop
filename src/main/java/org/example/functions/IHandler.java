package org.example.functions;

import org.example.commands.ICommand;

@FunctionalInterface
public interface IHandler {

    ICommand handle(ICommand command, Exception ex);

}
