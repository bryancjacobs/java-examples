package org.br.ja.gof.templateMethod;

/**
 * Created with IntelliJ IDEA.
 * User: Bryan
 * Date: 3/12/14
 * Time: 5:03 PM
 */
public class FrameworkClass {

    AbstractClass abstractClass;

    public void setAbstractClass(AbstractClass abstractClass){
        this.abstractClass = abstractClass;
    }

    public void dowWork(){
        abstractClass.largeAlgorithm();
    }

}
