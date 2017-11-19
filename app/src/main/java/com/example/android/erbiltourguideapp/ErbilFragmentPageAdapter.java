package com.example.android.erbiltourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by High Spec on 10/16/2017.
 */

public class ErbilFragmentPageAdapter extends FragmentPagerAdapter {
    Context context;
    String[] titles;

    public ErbilFragmentPageAdapter(FragmentManager fm, Context Context) {
        super(fm);
        this.context = Context;
        String[] Tabtitles = {context.getString(R.string.cafe_and_Resturants), context.getString(R.string.hotels), context.getString(R.string.shopping_malls), context.getString(R.string.attractions), "Hospitals"};
        titles = Tabtitles;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new CafeAndResturantsFragment();
            case 1:
                return new HotelFragment();
            case 2:
                return new ShoppingMallsFragment();
            case 3:
                return new AttractionFragment();
            default:
                return new HospitalsFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
