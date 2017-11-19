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

public class CafeAndResturantsFragment extends Fragment {
    ListView list;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cafe_and_resturants, container, false);
        list = (ListView) view.findViewById(R.id.cafe_and_resturants_list);
        ArrayList<Place> array = new ArrayList<Place>();
        array.add(new Place(getString(R.string.jannet_erbil), getString(R.string.jannet_erbil_address), R.drawable.ic_jannet_erbil));
        array.add(new Place(getString(R.string.naranj), getString(R.string.naranj_address), R.drawable.ic_narenj));
        array.add(new Place(getString(R.string.kabab_yaseen), getString(R.string.kabab_address), R.drawable.ic_kabab_yaseen));
        array.add(new Place(getString(R.string.papacedo), getString(R.string.papacedo_address), R.drawable.ic_papasedo));
        array.add(new Place(getString(R.string.saj_alreef), getString(R.string.saj_alreef_address), R.drawable.ic_saj_alreef));
        PlaceAdapter placeAdapter = new PlaceAdapter(getContext(), place, array);
        list.setAdapter(placeAdapter);
        return view;

    }
}

