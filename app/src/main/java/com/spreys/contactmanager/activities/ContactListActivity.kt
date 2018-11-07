package com.spreys.contactmanager.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.spreys.contactmanager.Contact
import com.spreys.contactmanager.PokemanList
import com.spreys.contactmanager.adapters.ContactPagerAdapter
//import com.spreys.contactmanager.MockDataGenerator
import com.spreys.contactmanager.PokemanService
import com.spreys.contactmanager.R
import kotlinx.android.synthetic.main.activity_contact_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ContactListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list)

        val retrofit = Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

        val service = retrofit.create(PokemanService::class.java)

        val context = this

        service.get().enqueue(object: Callback<PokemanList>{
            override fun onFailure(call: Call<PokemanList>, t: Throwable) {
                Toast.makeText(context, "failed to get Pokemans: ${t.message}", Toast.LENGTH_LONG).show()
            }

            override fun onResponse(call: Call<PokemanList>, response: Response<PokemanList>) {
                val contacts = ArrayList(response.body()?.results)
                pager.adapter = ContactPagerAdapter(supportFragmentManager, contacts)
            }
        })
//        var contacts = ArrayList()

//        val contacts = MockDataGenerator.getMockContacts(50)

    }
}