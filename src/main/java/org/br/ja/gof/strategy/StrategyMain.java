package org.br.ja.gof.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Bryan
 * Date: 3/12/14
 * Time: 3:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class StrategyMain {

    private static final String LW = "lw";

    private static final String HW = "hw";

    private static Map<String, Worker> map;

    // this could be replaced with a simple factory pattern
    static {
        map = new HashMap<>();

        map.put(LW, new LazyWorker());

        map.put(HW, new HardWorker());
    }

    public static void main(String[] args) {

        if (args.length != 1) {
            invalidOption();
        }

        String option = args[0].toLowerCase();

        Worker worker = map.get(option);

        if (worker == null) {
            invalidOption();
        }

        worker.doWork();
    }


    private static void invalidOption(){
        System.out.println("acceptable values: lw or hw");
        System.exit(500);
    }

}
