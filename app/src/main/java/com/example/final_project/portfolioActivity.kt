package com.example.final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.annotation.NonNull
import androidx.core.content.ContextCompat.startActivity
import com.airbnb.lottie.LottieAnimationView
import com.example.final_project.databinding.ActivityMainBinding
import com.example.final_project.databinding.ActivityPortfolioBinding
import com.example.final_project.databinding.ActivitySplashBinding
import android.graphics.drawable.ColorDrawable;
import android.net.Uri
import android.widget.Toast;

class portfolioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_portfolio)

        val binding = ActivityPortfolioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.portfolioButton.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.hallymButton.setOnClickListener {
            val url = "https://www.hallym.ac.kr/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
            finish()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_logout, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.logout -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "로그아웃", Toast.LENGTH_LONG).show()
                finish()
                true
            }
            else -> false
        }
    }
}
