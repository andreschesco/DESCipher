package colsanitas.foonkiemonkey.com.co.des;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class LearningActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
    }


    public void conceptsClick(View v) {
        Intent intent = new Intent(this, ConceptsActivity.class);
        startActivity(intent);
    }

    public void escapeClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
