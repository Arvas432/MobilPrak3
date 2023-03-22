package com.example.mobilprak3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainer;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends FragmentActivity {

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
        FragmentContainerView fgc = (FragmentContainerView)findViewById(R.id.fragmentContainerView);
        FragmentManager fm = getSupportFragmentManager();
        Fragment1 f1 = new Fragment1();
        AirportFragment af = new AirportFragment();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragmentContainerView, f1)
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

        Button1.setOnClickListener(listener1);
    }

}