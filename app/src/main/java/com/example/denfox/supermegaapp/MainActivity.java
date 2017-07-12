package com.example.denfox.supermegaapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //TODO: Don't forget to declare your class here.
    private SomeSecondClass someSecondClass;

    private IgorMetlin igorMetlin;
    private Mischenko mischenko;
    private Peters peters;
    private Nedomovny nedomovny;
    private Sibichenko sibichenko;
    private Volkov volkov;
    private SerdunDmitro serdunDmitro;
    private ZaychenkoEugene zaychenkoEugene;
    private GorpenkoDan gorpenkoDan;
    private Provotorov provotorov;
    private Cherepinina cherepinina;
    private Romasiuk romasiuk;
    private Kuchura kuchura;
    private AfanasievV afanasiev;
    private Lenskaya katarinaLenskaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        initSomeClassStuff();

        //TODO: Put your classes-init here!!!

        igorMetlin = new IgorMetlin();
        mischenko = new Mischenko();
        peters = new Peters();
        nedomovny = new Nedomovny();
        sibichenko = new Sibichenko();
        volkov = Volkov.getInstance();
        serdunDmitro = SerdunDmitro.getInstance();
        zaychenkoEugene = new ZaychenkoEugene();
        gorpenkoDan = new GorpenkoDan();
        sibichenko = new Sibichenko(MainActivity.this);
        volkov = Volkov.getInstance();
        serdunDmitro = SerdunDmitro.getInstance();
        zaychenkoEugene = new ZaychenkoEugene();
        provotorov = new Provotorov();
        cherepinina = new Cherepinina();
        romasiuk = new Romasiuk();
        kuchura = new Kuchura("Oleg");

        afanasiev = new AfanasievV();
        katarinaLenskaya = new Lenskaya();
    }

    private void initSomeClassStuff() {
        someSecondClass = new SomeSecondClass(true, false);

        someSecondClass.doSomethingElse();
        someSecondClass.doSomethingTruly();
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        someSecondClass.doSomethingTruly();
    }


}
