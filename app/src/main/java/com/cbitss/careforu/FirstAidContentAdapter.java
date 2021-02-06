package com.cbitss.careforu;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by Rishab on 1/3/2017.
 */

public class FirstAidContentAdapter extends FragmentStatePagerAdapter {

    int tabno;
    public FirstAidContentAdapter(FragmentManager fm, int t)
    {
        super(fm);
        tabno=t;
    }
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0: FirstAidTips firstAidTips= new FirstAidTips();
                return firstAidTips;
            case 1: FirstAidOffline firstAidOffline= new FirstAidOffline();
                return firstAidOffline;
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabno;
    }
}
