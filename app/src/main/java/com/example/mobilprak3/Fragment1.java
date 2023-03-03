package com.example.mobilprak3;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment1 extends Fragment {

    @Nullable
    private TextView t1;
    private View rootView;
    private static final String TAG = "MyApp";

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public Fragment1() {

        super(R.layout.fragment_1);

    }
    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();

        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "on Create");
        CharSequence text = "First fragment created";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getActivity(), text, duration);
        toast.show();

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }
    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "on Start");
        CharSequence text = "First fragment Started";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getActivity(), text, duration);
        toast.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "on Resume");
        CharSequence text = "First fragment resumed";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getActivity(), text, duration);
        toast.show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "on Destroy");
        CharSequence text = "First fragment destroyed";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getActivity(), text, duration);
        toast.show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_1, container, false);
        return rootView;
    }




}