package net.gotev.uploadservice

import android.os.Parcel
import android.os.Parcelable

class LargeIcon() : Parcelable {
    var path: String? = null
    var width = -1
    var height = -1

    constructor(parcel: Parcel) : this() {
        path = parcel.readString()
        width = parcel.readInt()
        height = parcel.readInt()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(path)
        parcel.writeInt(width)
        parcel.writeInt(height)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<LargeIcon> {
        override fun createFromParcel(parcel: Parcel): LargeIcon {
            return LargeIcon(parcel)
        }

        override fun newArray(size: Int): Array<LargeIcon?> {
            return arrayOfNulls(size)
        }
    }
}