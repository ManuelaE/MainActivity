package activity_main.mainactivity;

import android.util.Log;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente extends Thread{

    //Control + o
    @Override
    public void run() {

        try {
            Socket s = new Socket("10.0.2.2", 5000);
            //Log.e("debug", "Conexión exitosa");

            OutputStream os = s.getOutputStream();
            PrintWriter out = new PrintWriter( new OutputStreamWriter(os));
            out.println("Hola mundo, funciona");
            //para mandar
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
