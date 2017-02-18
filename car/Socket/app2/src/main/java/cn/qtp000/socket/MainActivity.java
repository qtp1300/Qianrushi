package cn.qtp000.socket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainActivity extends AppCompatActivity {
    private static String IpAdd = "192.168.1.1";
    private static int port = 13004;
    Socket soc = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but1= (Button) findViewById(R.id.button);
        but1.setOnClickListener(new Listener1());
    }

    public void lianjie() /*throws IOException*/ {
        System.out.println("开始连接");
        try {
            soc = new Socket(IpAdd,port);
////            OutputStreamWriter strwr = new OutputStreamWriter(soc.getOutputStream());
////            strwr.write("hello");
//
////            BufferedWriter bfwr = new strwr;
//            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())),true);
//
//
        }
//        catch (UnknownHostException e1)
//        {
//            System.out.println("出错了");
////            e1.printStackTrace();
//        }
        catch (IOException e1)
        {
//            System.out.println("出错了");
////            e1.printStackTrace();
        }


    }
    class Listener1 implements android.view.View.OnClickListener
    {
        public void onClick(View view)
        {
            System.out.println("按键生效");
            lianjie();
        }
    }
}
