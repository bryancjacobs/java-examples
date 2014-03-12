package org.br.ja.gof.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: Bryan
 * Date: 3/12/14
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class HardWorker implements Worker {
    @Override
    public void doWork() {
        System.out.println(HardWorker.class.getName());
    }
}
