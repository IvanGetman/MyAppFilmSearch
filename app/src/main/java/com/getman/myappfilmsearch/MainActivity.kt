package com.getman.myappfilmsearch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.getman.myappfilmsearch.databinding.ActivityMainBinding
import com.getman.myappfilmsearch.ui.home.HomeFragment
import com.getman.myappfilmsearch.ui.profile.ProfileFragment
import com.getman.myappfilmsearch.ui.search.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            openFragment(HomeFragment.newInstance())
        }

        val navView: BottomNavigationView = binding.navView

        navView.setOnNavigationItemSelectedListener(
            BottomNavigationView.OnNavigationItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.navigation_search -> {
                        val searchFragment = SearchFragment.newInstance()
                        openFragment(searchFragment)
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.navigation_home -> {
                        val homeFragment = HomeFragment.newInstance()
                        openFragment(homeFragment)
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.navigation_profile -> {
                        val profileFragment = ProfileFragment.newInstance()
                        openFragment(profileFragment)
                        return@OnNavigationItemSelectedListener true
                    }
                }
                false
            })
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction().apply {

            replace(R.id.container, fragment)
            addToBackStack(null)
            commit()
        }
    }
}