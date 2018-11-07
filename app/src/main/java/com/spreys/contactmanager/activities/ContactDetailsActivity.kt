package com.spreys.contactmanager.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.spreys.contactmanager.Contact
import com.spreys.contactmanager.fragments.ContactDetailsFragment
import com.spreys.contactmanager.R


class ContactDetailsActivity: AppCompatActivity() {
    companion object {
        val EXTRA_CONTACT = "contact"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)

        val contact = intent.extras?.get(EXTRA_CONTACT) as Contact

        val fragment = ContactDetailsFragment.newInstance(contact)

        supportFragmentManager.beginTransaction()
                .replace(R.id.contact_details_container, fragment)
                .commit()
    }
}