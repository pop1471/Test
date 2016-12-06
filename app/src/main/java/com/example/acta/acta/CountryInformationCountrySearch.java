package com.example.acta.acta;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class CountryInformationCountrySearch extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_information_country_search);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        //Setting up hamburger icon
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_action_menu);

        //Setting up a customized title
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        TextView mTitle = (TextView) myToolbar.findViewById(R.id.toolbar_title);
    }

    public void Go_CISouthKorea(View view) {
        Intent startNewActivity = new Intent(this, CountryInformationSouthKorea.class);
        startActivity(startNewActivity);
    }

    public void Go_CIBurundi(View view) {
        Intent startNewActivity = new Intent(this, CountryInformationBurundi.class);
        startActivity(startNewActivity);
    }

    public void Go_CISriLanka(View view) {
        Intent startNewActivity = new Intent(this, CountryInformationSriLanka.class);
        startActivity(startNewActivity);
    }
}
