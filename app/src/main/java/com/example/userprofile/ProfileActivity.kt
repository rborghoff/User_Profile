package com.example.userprofile

import android.os.Bundle
import android.os.PersistableBundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.active_profile.*


class ProfileActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.active_profile)
        initViews()
    }
    private fun initViews(){
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "This is your profile!"
        val profile = intent.getParcelableExtra<Profile>(PROFILE_EXTRA)

        if (profile != null){
            tvName.text = getString(R.string.name, profile.firstname, profile.lastName)
            tvDescription.text = profile.description
            if(profile.imgUrl != null) ivProfileImage.setImageURI(profile.imgUrl)
        }
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
    companion object{
        const val PROFILE_EXTRA = "PROFILE_EXTRA"
    }

}