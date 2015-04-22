package com.example.tyronehou.magis_android;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.ActionBarActivity;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.TableLayout;
        import android.widget.TableRow;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.view.View;

/**
 * Created by Adrian on 4/12/2015.
 */

public class Announcements extends ActionBarActivity {

    private String[] Announce = {"1. Boston Marathon Today!", "Application Deadline 5/24/15", "Pep Rally 4/4/15"};

    TableLayout aNtable;
    Button goToCollege;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.announcements);

        aNtable = (TableLayout) findViewById(R.id.announceTable);
        goToCollege = (Button) findViewById(R.id.college);

        goToCollege.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent collegeIntent = new Intent(getApplicationContext(), College.class);
                startActivity(collegeIntent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
