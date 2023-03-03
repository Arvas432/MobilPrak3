package com.example.mobilprak3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment2 extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private static final String TAG = "MyApp";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment2() {

        super(R.layout.fragment_2);
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment2 newInstance(String param1, String param2) {
        Fragment2 fragment = new Fragment2();
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
        CharSequence text = "Second fragment created";
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
        CharSequence text = "Second fragment Started";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getActivity(), text, duration);
        toast.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "on Resume");
        CharSequence text = "Second fragment resumed";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getActivity(), text, duration);
        toast.show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false);
    }
}
