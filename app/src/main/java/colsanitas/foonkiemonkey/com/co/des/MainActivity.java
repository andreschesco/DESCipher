package colsanitas.foonkiemonkey.com.co.des;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;


public class MainActivity extends ActionBarActivity {

    private TextView plainText;
    private EditText cipherText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plainText = (TextView)findViewById(R.id.plaintext);
        cipherText = (EditText)findViewById(R.id.ciphertext);



    }


    public void cipher(View v){
        String cipherString= cipherText.getText().toString();
        cipherString = toBinary(cipherString);
        splitString(cipherString);
                

        plainText.setText(cipherString);
    }

    private String splitString(String cipherString) {
        if(cipherString.length()<64){

        }else if(cipherString.length()==64){

        }else{


        }



        return null;
    }


    private String toBinary(String info){
        String binary = "";
        byte[] infoBin = null;
        try {
            infoBin = info.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        for (byte b : infoBin) {
            System.out.println("c:" + (char) b + "-> "
                    + Integer.toBinaryString(b));
            binary=binary+Integer.toBinaryString(b);
        }
        return binary;


    }

}
