package com.example.android.erbiltourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.erbiltourguideapp.R.layout.place;

/**
 * Created by High Spec on 10/16/2017.
 */


public class ShoppingMallsFragment extends Fragment {
    ListView list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shopping_malls, container, false);
        list = (ListView) view.findViewById(R.id.shopping_malls_list);
        ArrayList<Place> array = new ArrayList<Place>();
        array.add(new Place(getString(R.string.family), getString(R.string.family_address), R.drawable.ic_family_mall));
        array.add(new Place(getString(R.string.majidi), getString(R.string.majidi_address), R.drawable.ic_majidi_mall));
        array.add(new Place(getString(R.string.mega), getString(R.string.mega_address), R.drawable.ic_mega_mall));
        array.add(new Place(getString(R.string.royal), getString(R.string.royal_address), R.drawable.ic_royal_mall));
        PlaceAdapter placeAdapter = new PlaceAdapter(getContext(), place, array);
        list.setAdapter(placeAdapter);
        return view;

    }
}

