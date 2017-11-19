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

public class HotelFragment extends Fragment {
    ListView list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hotels, container, false);
        list = (ListView) view.findViewById(R.id.hotels_list);
        ArrayList<Place> array = new ArrayList<Place>();
        array.add(new Place(getString(R.string.divan), getString(R.string.divan_address), R.drawable.ic_divan));
        array.add(new Place(getString(R.string.darin), getString(R.string.darin_address), R.drawable.ic_darin_hotel));
        array.add(new Place(getString(R.string.classy), getString(R.string.calssy_address), R.drawable.ic_classy_hotel));
        array.add(new Place(getString(R.string.blue_mercury), getString(R.string.blue_mercury_address), R.drawable.ic_blue_mercury));
        PlaceAdapter placeAdapter = new PlaceAdapter(getContext(), place, array);
        list.setAdapter(placeAdapter);
        return view;

    }

}


