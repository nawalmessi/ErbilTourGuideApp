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

public class HospitalsFragment extends Fragment {
    ListView list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hospitals, container, false);
        list = (ListView) view.findViewById(R.id.hospital_list);
        ArrayList<Place> array = new ArrayList<Place>();
        array.add(new Place(getString(R.string.zheen), getString(R.string.zheen_address), R.drawable.ic_zheen));
        array.add(new Place(getString(R.string.sardam), getString(R.string.sardam_address), R.drawable.ic_sardam));
        array.add(new Place(getString(R.string.alrasul), getString(R.string.alrasul_address), R.drawable.ic_alrasul));
        array.add(new Place(getString(R.string.par), getString(R.string.par_address), R.drawable.ic_par));
        PlaceAdapter placeAdapter = new PlaceAdapter(getContext(), place, array);
        list.setAdapter(placeAdapter);
        return view;
    }
}
