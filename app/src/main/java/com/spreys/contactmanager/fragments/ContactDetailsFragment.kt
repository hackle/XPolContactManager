package com.spreys.contactmanager.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.spreys.contactmanager.Contact
import com.spreys.contactmanager.R
import com.spreys.contactmanager.activities.ContactDetailsActivity
import kotlinx.android.synthetic.main.fragment_contact_details.*


class ContactDetailsFragment : Fragment() {

    companion object {
        fun newInstance(contact: Contact): ContactDetailsFragment {
            val myFragment = ContactDetailsFragment()

            val args = Bundle()
            args.putParcelable(ContactDetailsActivity.EXTRA_CONTACT, contact)
            myFragment.arguments = args

            return myFragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_contact_details, container, false)
    }

    override fun onResume() {
        super.onResume()

        val contact = arguments?.getParcelable(ContactDetailsActivity.EXTRA_CONTACT) as Contact

        with(contact) {
            activity_details_name.text = this.name
//            activity_details_mobile.text = this.mobile
//            activity_details_landline.text = this.landline
//            activity_details_email.text = this.email
        }

        activity_details_mobile.setOnClickListener {
//            dialNumber(contact.mobile)
        }

        activity_details_landline.setOnClickListener {
//            dialNumber(contact.landline)
        }

        activity_details_email.setOnClickListener {
//            val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts(
//                    "mailto", contact.email, null))
//            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Hello there!")
//            emailIntent.putExtra(Intent.EXTRA_TEXT, "Hi ${contact.firstName},")
//            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
    }

    private fun dialNumber(number: String?) {
        with(number) {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$this"))
            startActivity(intent)
        }
    }
}