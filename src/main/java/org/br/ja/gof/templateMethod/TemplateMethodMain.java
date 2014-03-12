package org.br.ja.gof.templateMethod;

/**
 * Created with IntelliJ IDEA.
 * User: Bryan
 * Date: 3/12/14
 * Time: 5:02 PM
 */
public class TemplateMethodMain {

    public static void main(String[] args){
        FrameworkClass frameworkClass = new FrameworkClass();
        frameworkClass.setAbstractClass(new ContreteClass());

        frameworkClass.dowWork();
    }

}
