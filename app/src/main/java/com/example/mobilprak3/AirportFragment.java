package com.example.mobilprak3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AirportFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AirportFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AirportFragment() {
        // Required empty public constructor
        super(R.layout.fragment_airport);
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AirportFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AirportFragment newInstance(String param1, String param2) {
        AirportFragment fragment = new AirportFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_airport, container, false);
        String name = requireArguments().getString("name");
        TextView tw = view.findViewById(R.id.nametext);
        TextView tw2 = view.findViewById(R.id.textView);
        tw.setText(name);
        ImageButton back = view.findViewById(R.id.btn_menu_more);
        back.setOnClickListener((back1) ->
        {
            Bundle result = new Bundle();
            result.putString("info", tw2.getText().toString());
            getParentFragmentManager().setFragmentResult("RequestKey",result);
            requireActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
            requireActivity().getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).add(R.id.fragmentContainerView, Fragment1.class, result).commit();
        });

        return view;
    }
}