package sports.scavengerhunt.view;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import sports.scavengerhunt.R;

public class LobbyActivity extends ActionBarActivity {

    private boolean fReady;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lobby, menu);
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

    public void readySelected(View v){

        if(!fReady) {
            v.setBackgroundColor(getResources().getColor(R.color.button_green));
            ((Button)v).setText("Ready!");
            ((TextView)findViewById(R.id.lobby_status_text)).setText("Waiting on the others..."); //TODO resource
            fReady = true;
        } else {
            v.setBackgroundColor(getResources().getColor(R.color.button_grey));
            ((Button)v).setText("Not ready");
            ((TextView)findViewById(R.id.lobby_status_text)).setText("Let the others know you're ready!"); //TODO resource
            fReady = false;
        }

    }
}
