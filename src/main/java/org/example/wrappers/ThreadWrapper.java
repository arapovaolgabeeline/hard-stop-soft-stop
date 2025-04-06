package org.example.wrappers;

import org.example.functions.IHandler;
import org.example.functions.IThreadWrapper;

public class ThreadWrapper implements IThreadWrapper {
    private IHandler handler;
    private final Thread thread;

    public ThreadWrapper(IHandler handler, Thread thread) {
        this.handler = handler;
        this.thread = thread;
    }

    @Override
    public void setupHandler(IHandler handler) {
        this.handler = handler;
    }

}
