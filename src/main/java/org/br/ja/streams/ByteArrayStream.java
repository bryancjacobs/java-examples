package org.br.ja.streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Bryan
 * Date: 3/12/14
 * Time: 7:44 PM
 */
public class ByteArrayStream {
    // Simple example of playing with stream
    public static void main(String[] args) {
        inefficentRead();

        moreEfficientRead();
    }

    private static void inefficentRead() {
        ByteArrayInputStream bais = new ByteArrayInputStream("hello".getBytes());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // this is a very inefficient read because each byte is read
        int counter = 0;
        while(true){
            counter++;
            int read = bais.read();

            if(read == -1){
                break;
            }

            baos.write(read);
        }

        System.out.println("counter: " + counter);
        System.out.println(baos.toString());
    }

    private static void moreEfficientRead(){
        ByteArrayInputStream bais = new ByteArrayInputStream("hello".getBytes());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] buffer = new byte[256];
        int counter = 0;
        while(true){

            int read = bais.read(buffer,0,buffer.length );

            if(read == -1){
                break;
            }

            baos.write(buffer, 0, buffer.length);
            counter++;
        }


        System.out.println("counter: " + counter);
        System.out.println(baos.toString());

    }
}
