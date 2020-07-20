package com.netflixclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.netflixclone.Fragments.ComingSoonPage;
import com.netflixclone.Fragments.DownloadsPage;
import com.netflixclone.Fragments.Home_Page;
import com.netflixclone.Fragments.MorePage;
import com.netflixclone.Fragments.Seach_Page;

public class HomePageActivity extends AppCompatActivity {
    BottomNavigationView bottomNavi;
    Toolbar toolbarss;
    Fragment selectedFragment=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }




    private BottomNavigationView.OnNavigationItemReselectedListener onNavigationItemReselectedListener
            = new BottomNavigationView.OnNavigationItemReselectedListener() {

        @Override
        public void onNavigationItemReselected(@NonNull MenuItem item) {

        }
    };

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener=
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    switch (menuItem.getItemId()){
                        case R.id.page_1:
                            if(selectedFragment.equals(new Home_Page())){
                            }else{
                                selectedFragment=new Home_Page();
                            }
                            break;
                        case R.id.page_2:
                            selectedFragment=new Seach_Page();
                            break;
                        case R.id.page_3:
                            selectedFragment=new ComingSoonPage();
                            break;
                        case R.id.page_4:
                            selectedFragment=new DownloadsPage();
                            break;
                        case R.id.page_5:
                            selectedFragment=new MorePage();
                            break;
                    }
                    if (selectedFragment!=null){
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                selectedFragment).commit();
                    }

                    return true;

                }
            };
}
