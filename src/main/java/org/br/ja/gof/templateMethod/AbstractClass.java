package org.br.ja.gof.templateMethod;

/**
 * Created with IntelliJ IDEA.
 * User: Bryan
 * Date: 3/12/14
 * Time: 5:00 PM
 */
public abstract class AbstractClass {

    public abstract void smallAlgorithm();

    public final void largeAlgorithm(){
        System.out.println("do large work");

        smallAlgorithm();

        System.out.println("do more large work");
    }
}
