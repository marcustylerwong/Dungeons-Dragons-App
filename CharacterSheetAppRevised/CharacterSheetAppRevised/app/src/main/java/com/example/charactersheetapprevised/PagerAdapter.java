package com.example.charactersheetapprevised;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public PagerAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = 5;
    }

    @NonNull






    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ChatFragment();
            case 1:
                return new StatusFragment();
            case 2:
                return new CallFragment();
            case 3:
                return new SkillsTwoFragment();
            case 4:
                return new SpellsAndSkillFragment();
            default:
                return null;

        }
    }
    public int getCount() {
        return numOfTabs;
    }
}
