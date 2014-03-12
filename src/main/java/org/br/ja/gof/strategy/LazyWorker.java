package org.br.ja.gof.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: Bryan
 * Date: 3/12/14
 * Time: 3:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class LazyWorker implements Worker {
    @Override
    public void doWork() {
        System.out.println(LazyWorker.class.getName());
    }
}
