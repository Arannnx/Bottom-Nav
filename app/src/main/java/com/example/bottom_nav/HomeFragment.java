package com.example.bottom_nav;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        // Inflate the layout for this fragmen

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        CardView googlemap = view.findViewById(R.id.map);
        googlemap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleMap();
            }
        });

        CardView facebook = view.findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFacebook();
            }
        });

        CardView food = view.findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFood();
            }
        });

        CardView games = view.findViewById(R.id.games);
        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGames();
            }
        });

        CardView discord = view.findViewById(R.id.discord);
        discord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDiscord();
            }
        });

        return view;
    }

    public void openDiscord() {
        Intent intent = new Intent(getActivity(), Discord.class);
        startActivity(intent);
    }


    public void openGoogleMap() {
        Intent intent = new Intent(getActivity(), GoogleMap.class);
        startActivity(intent);
    }

    public void openFacebook() {
        Intent intent = new Intent(getActivity(), Facebook.class);
        startActivity(intent);
    }

    public void openFood() {
        Intent intent = new Intent(getActivity(), Food.class);
        startActivity(intent);
    }

    public void openGames() {
        Intent intent = new Intent(getActivity(), Games.class);
        startActivity(intent);
    }

}