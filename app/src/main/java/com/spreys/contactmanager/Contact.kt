package com.spreys.contactmanager

import android.os.Parcel
import android.os.Parcelable

data class Contact(var firstName: String?,
              var lastName: String?,
              var mobile: String?,
              var landline: String?) : Parcelable {

    val name: String = "$firstName $lastName"
    val email: String = "$firstName@spreys.com"

    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(firstName)
        parcel.writeString(lastName)
        parcel.writeString(mobile)
        parcel.writeString(landline)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Contact> {
        override fun createFromParcel(parcel: Parcel): Contact {
            return Contact(parcel)
        }

        override fun newArray(size: Int): Array<Contact?> {
            return arrayOfNulls(size)
        }
    }
}
