package com.example.mobilprak3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainer;
import androidx.fragment.app.FragmentContainerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public MainActivity()
    {
        super(R.layout.activity_main);
    }

    private int currfragment = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Button1 = (Button)findViewById(R.id.SwitchButton);
        Button Button2 = (Button)findViewById(R.id.airportbutton);
        FragmentContainerView fgc = (FragmentContainerView)findViewById(R.id.fragmentContainerView);
        if (savedInstanceState == null) {
            Bundle bundle = new Bundle();
            bundle.putInt("some_int", 0);
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragmentContainerView, Fragment1.class, bundle)
                    .commit();
        }
        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (savedInstanceState == null) {
                    fgc.removeAllViewsInLayout();
                    Bundle bundle = new Bundle();
                    bundle.putString("some_string", "amog");
                    if(currfragment == 1)
                    {
                        getSupportFragmentManager().beginTransaction()
                                .setReorderingAllowed(true)
                                .add(R.id.fragmentContainerView, Fragment2.class, bundle)
                                .commit();
                        currfragment++;
                    }
                    else if(currfragment == 2)
                    {
                        getSupportFragmentManager().beginTransaction()
                                .setReorderingAllowed(true)
                                .add(R.id.fragmentContainerView, Fragment3.class, bundle)
                                .commit();
                        currfragment++;
                    }
                    else if(currfragment == 3)
                    {
                        getSupportFragmentManager().beginTransaction()
                                .setReorderingAllowed(true)
                                .add(R.id.fragmentContainerView, Fragment1.class, bundle)
                                .commit();
                        currfragment = 1;
                    }

                }
            }
        };
        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (savedInstanceState == null) {
                    fgc.removeAllViewsInLayout();
                    Bundle bundle = new Bundle();
                    bundle.putString("data_string", "some text");
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .add(R.id.fragmentContainerView, AirportFragment.class, bundle)
                            .commit();

                }

            }
        };
        Button1.setOnClickListener(listener1);
        Button2.setOnClickListener(listener2);
    }

}