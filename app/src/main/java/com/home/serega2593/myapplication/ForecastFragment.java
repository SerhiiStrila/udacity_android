package com.home.serega2593.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ForecastFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;

    public ForecastFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my, container, false);

        ArrayList<String> wather = new ArrayList<String>();
        wather.add(0, "Today-Sunny-88/63");
        wather.add(1, "Tomorrow-Foggy-70/46");
        wather.add(1, "Weds-Cloudy-72/63");
        wather.add(1, "Thurs-Rainy-64/51");
        wather.add(1, "Fri-Foggy-70/46");
        wather.add(1, "Sat-Sunny-76/68");

        mForecastAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, wather);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);

        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}