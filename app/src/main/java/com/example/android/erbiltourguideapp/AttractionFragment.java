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

public class AttractionFragment extends Fragment {
    ListView list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.attractions, container, false);
        list = (ListView) view.findViewById(R.id.attractions_list);
        ArrayList<Place> array = new ArrayList<Place>();
        array.add(new Place(getString(R.string.Erbil_citadel), getString(R.string.citadel_address), R.drawable.ic_erbil_citadle));
        array.add(new Place(getString(R.string.kurdish_meseum), getString(R.string.kurdish_museum_address), R.drawable.ic_kurdish_textile_museum));
        array.add(new Place(getString(R.string.minaret), getString(R.string.minaret_address), R.drawable.ic_minaret));
        PlaceAdapter placeAdapter = new PlaceAdapter(getContext(), place, array);
        list.setAdapter(placeAdapter);
        return view;

    }
}
