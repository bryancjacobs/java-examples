package org.br.ja.gof.command;

/**
 * Created with IntelliJ IDEA.
 * User: Bryan
 * Date: 3/12/14
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommandMain {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Command command = new AwesomeCommand();

        invoker.executeCommand(command);
        invoker.executeCommand(command);
        invoker.undoLastCommand();
        invoker.redoNextCommand();
        invoker.undoLastCommand();
    }


}
