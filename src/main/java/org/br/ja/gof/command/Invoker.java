package org.br.ja.gof.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Bryan
 * Date: 3/12/14
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Invoker {

    private int lastCommand;

    List<Command> history = new ArrayList<>();

    public void executeCommand(Command command){
        command.execute();
        history.add(command);
        lastCommand = history.size() - 1;
    }

    public void redoNextCommand() {
        if (lastCommand < history.size()) {
            lastCommand++;
            history.get(lastCommand).execute();
        }
    }

    public void undoLastCommand(){
        if(lastCommand >= 0){
            history.get(lastCommand).undo();
            lastCommand--;
        }
    }
}
