package com.example.liquidityview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

/**
 * Created by QuanPhan on 4/14/18.
 */

public class ThirdFragment extends Fragment {

    View myView;
    HorizontalBarChart barChart;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.third_layout, container, false);

        return myView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        HorizontalBarChart barChart = (HorizontalBarChart) myView.findViewById(R.id.chart3);


        ArrayList<BarEntry> barEntries = new ArrayList<>();

        barEntries.add(new BarEntry(1, 2000f));
        barEntries.add(new BarEntry(2, 500f));
        barEntries.add(new BarEntry(3, 1000f));

        BarDataSet barDataSet = new BarDataSet(barEntries, "Categories");

        BarData data = new BarData(barDataSet);
        data.setBarWidth(0.9f);

        barChart.setData(data);
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barChart.animateXY(2000,2000);
        barDataSet.setValueTextSize(15f);
    }
}




