package org.br.ja.gof.command;

/**
 * Created with IntelliJ IDEA.
 * User: Bryan
 * Date: 3/12/14
 * Time: 3:45 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Command {

    public void execute();

    public void undo();
}
