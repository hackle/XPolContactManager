package com.spreys.contactmanager

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_contact_list.*

class ContactListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list)

        val contacts = MockDataGenerator.getMockContacts(50)

        recyclerView.adapter = ContactsAdapter(this, contacts)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
