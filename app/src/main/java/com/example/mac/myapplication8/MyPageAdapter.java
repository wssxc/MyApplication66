package com.example.mac.myapplication8;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {
    public MyPageAdapter(FragmentManager manager){
        super(manager);
    }
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new FFragment();
        }else  if(position==1){
            return new SFragment();
        }else{
            return new TFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
