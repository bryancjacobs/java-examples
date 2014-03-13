package org.br.ja.streams;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * User: Bryan
 * Date: 3/12/14
 * Time: 11:40 PM
 */
public class LoadPropertyFile {
    public static void main(String[] args)  {
        InputStream in = LoadPropertyFile.class.getClassLoader().getResourceAsStream("org/br/ja/streams/dev.properties");

        Properties props = new Properties();
        try {
            props.load(in);

            System.out.println(props.getProperty("url"));

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
