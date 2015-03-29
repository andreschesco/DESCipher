package colsanitas.foonkiemonkey.com.co.des;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;


public class CipherActivity extends ActionBarActivity {


    private TextView plainText;
    private EditText cipherText;
    private RadioButton desBtn, aesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plainText = (TextView) findViewById(R.id.plaintext);
        cipherText = (EditText) findViewById(R.id.ciphertext);
        desBtn = (RadioButton) findViewById(R.id.rbtn_des);
        aesBtn = (RadioButton) findViewById(R.id.rbtn_aes);


    }


    public void cipher(View v) {

        String textCipher = cipherText.getText().toString();

        if (aesBtn.isChecked()) {
            Intent intent = new Intent(this, AESActivity.class);
            intent.putExtra("text", textCipher);
            startActivity(intent);
        } else if (desBtn.isChecked()) {
            Intent intent = new Intent(this, DESActivity.class);
            intent.putExtra("text", textCipher);
            startActivity(intent);
        } else {
            String texto = getResources().getString(R.string.no_selected);
            Toast toast = Toast.makeText(this, texto, Toast.LENGTH_SHORT);
            toast.show();
        }


//
//        cipherString = toBinary(cipherString);
//        splitString(cipherString);
//
//
//        plainText.setText(cipherString);
    }

    public void desClick(View v) {
        if (aesBtn.isChecked()) {
            aesBtn.setChecked(false);
        }

    }

    public void aesClick(View v) {
        if (desBtn.isChecked()) {
            desBtn.setChecked(false);
        }
    }

    private String splitString(String cipherString) {
        if (cipherString.length() < 64) {

        } else if (cipherString.length() == 64) {

        } else {


        }


        return null;
    }


    private String toBinary(String info) {
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
            binary = binary + Integer.toBinaryString(b);
        }
        return binary;


    }
}
