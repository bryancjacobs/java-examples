package org.br.ja.gof.command;

/**
 * Created with IntelliJ IDEA.
 * User: Bryan
 * Date: 3/12/14
 * Time: 3:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class AwesomeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Executing: " + AwesomeCommand.class.getName());
    }

    @Override
    public void undo() {
        System.out.println("Undoing: " + AwesomeCommand.class.getName() );
    }
}
