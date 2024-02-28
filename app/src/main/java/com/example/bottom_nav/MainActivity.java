package com.example.bottom_nav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.bottom_nav.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        repFragment(new HomeFragment());

      binding.bottomNavView.setOnItemSelectedListener(item -> {
          int itemId = item.getItemId();
          if (itemId == R.id.home) {
              repFragment(new HomeFragment());
          } else if (itemId == R.id.profile) {
              repFragment(new ProfileFragment());
          } else if (itemId == R.id.settings) {
              repFragment(new SettingFragment());
          }

          return true;

        });

      }
    private void repFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_out, fragment);
        fragmentTransaction.commit();
    }

}