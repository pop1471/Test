package com.example.acta.acta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class CountryInformationSriLanka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_information_sri_lanka);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        //Setting a back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_action_back);

        //Setting up a customized title
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        TextView mTitle = (TextView) myToolbar.findViewById(R.id.toolbar_title);
    }

    //Make Back button work
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void Go_CISriLankaInfo(View view) {
        Intent startNewActivity = new Intent(this, CountryInformationSriLankaGeneralInfo.class);
        startActivity(startNewActivity);
    }

    public void Go_CISriLankaLanguage(View view) {
        Intent startNewActivity = new Intent(this, CountryInformationSriLankaLanguage.class);
        startActivity(startNewActivity);
    }
}
