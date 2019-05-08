package com.base.architecture.data.datastore.typeconvertors

import androidx.room.TypeConverter
import android.net.Uri
import java.util.*

/**
 * Created by Rupesh on 5/8/2019.
 */

class Converters {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time?.toLong()
    }

    @TypeConverter
    fun fromStringToUri(string: String?): Uri? {
        return string?.let { Uri.parse(string) }
    }

    @TypeConverter
    fun fromUriToString(uri: Uri?): String? {
        return uri?.toString()
    }
}