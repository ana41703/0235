package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStateAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.RecyclerView.Adapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.google.android.gms.dynamic.IFragmentWrapper;


public class RecyclerView.Adapter extends FragmentStateAdapter {
private final int PAGE_COUNT = 3;
private String[] titles = new String[] { "➀→", "➁→", "➂" };

        RecyclerView.Adapter(FragmentManager fm) {
        super(fm);
        }

@Override
public int getItemCount() {
        return PAGE_COUNT;
        }

@Override
public CharSequence getPageTitle(int position) {
        return this.titles[position];
        }

@Override
public Fragment createFragment(int i) {
        switch(i){
        case 0:
        return new Flagment11();
        case 1:
        return new Flagment12();
default:
        return new Flagment13();
        }
        }
        }
