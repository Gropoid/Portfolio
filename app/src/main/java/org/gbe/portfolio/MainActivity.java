package org.gbe.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.button)
    protected Button appButtonOne;
    @Bind(R.id.button2)
    protected Button appButtonTwo;
    @Bind(R.id.button3)
    protected Button appButtonThree;
    @Bind(R.id.button4)
    protected Button appButtonFour;
    @Bind(R.id.button5)
    protected Button appButtonFive;
    @Bind(R.id.button6)
    protected Button appButtonSix;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @OnClick(R.id.button)
    public void onButtonOneClicked(Button button) {
        Toast.makeText(getBaseContext(),
                "This button will launch " + button.getText().toString()
                + ". Work in progress...", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.button2)
    public void onButtonTwoClicked(Button button) {
        Toast.makeText(getBaseContext(),
                "This button will launch " + button.getText().toString()
                        + ". Work in progress...", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button3)
    public void onButtonThreeClicked(Button button) {
        Toast.makeText(getBaseContext(),
                "This button will launch " + button.getText().toString()
                        + ". Work in progress...", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button4)
    public void onButtonFourClicked(Button button) {
        Toast.makeText(getBaseContext(),
                "This button will launch " + button.getText().toString()
                        + ". Work in progress...", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button5)
    public void onButtonFiveClicked(Button button) {
        Toast.makeText(getBaseContext(),
                "This button will launch " + button.getText().toString()
                        + ". Work in progress...", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button6)
    public void onButtonSixClicked(Button button) {
        Toast.makeText(getBaseContext(),
                "This button will launch " + button.getText().toString()
                        + ". Work in progress...", Toast.LENGTH_SHORT).show();
    }
}
