package io.keiji.helloandroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MyActivity extends ActionBarActivity {

    private Button buttonPushMe;
    private ImageView imageAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        buttonPushMe = (Button) findViewById(R.id.btn_pushme);
        buttonPushMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                buttonPushMe.setText("Pushed");
                imageAndroid.setImageResource(R.drawable.cogoo2);
            }
        });

        imageAndroid = (ImageView) findViewById(R.id.iv_android);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
