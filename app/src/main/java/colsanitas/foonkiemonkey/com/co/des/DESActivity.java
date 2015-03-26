package colsanitas.foonkiemonkey.com.co.des;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class DESActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_des);

        String text = getIntent().getExtras().getString("text");
        System.out.println(text);
    }

}
