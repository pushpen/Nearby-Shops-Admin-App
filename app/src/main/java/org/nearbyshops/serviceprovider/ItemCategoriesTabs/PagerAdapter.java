package org.nearbyshops.serviceprovider.ItemCategoriesTabs;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.nearbyshops.serviceprovider.ItemCategoriesTabs.ItemCategories.ItemCategoriesFragment;
import org.nearbyshops.serviceprovider.ItemCategoriesTabs.Items.ItemFragmentTwo;

/**
 * Created by sumeet on 27/6/16.
 */

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class PagerAdapter extends FragmentPagerAdapter {

//    DetachedTabs activity;

    public PagerAdapter(FragmentManager fm, ItemCategoriesTabs activity) {
        super(fm);

//        this.activity = activity;
    }


//    private ItemCategoriesFragment itemCategoriesFragment = new ItemCategoriesFragment();

//    private ItemFragmentTwo itemFragmentTwo = new ItemFragmentTwo();;

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a FragmentShopAdmins (defined as a static inner class below).



        if(position == 0)
        {
//            activity.setNotificationReceiver(itemCategoriesFragment);

//            return itemCategoriesFragment;

            return new ItemCategoriesFragment();
        }
        else if (position == 1)
        {

//            return itemFragmentTwo;

            return new ItemFragmentTwo();
        }


//        return PlaceholderFragment.newInstance(position + 1);

        return null;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {

            case 0:
                return titleCategories;
            case 1:
                return titleItems;
            case 2:
                return titleDetachedItemCategories;
            case 3:
                return titleDetachedItems;
        }
        return null;
    }



    private String titleCategories = "SubCategories(0/0)";
    private String titleItems = "Items(0/0)";
    private String titleDetachedItemCategories = "Detached Item-Categories (0/0)";
    private String titleDetachedItems = "Detached Items (0/0)";


    public void setTitle(String title, int tabPosition)
    {
        if(tabPosition == 0){

            titleCategories = title;
        }
        else if (tabPosition == 1)
        {

            titleItems = title;
        }else if(tabPosition == 2)
        {
            titleDetachedItemCategories = title;

        }else if(tabPosition == 3)
        {
            titleDetachedItems = title;
        }


        notifyDataSetChanged();
    }




}