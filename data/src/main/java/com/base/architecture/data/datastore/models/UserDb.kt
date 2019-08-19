package com.base.architecture.data.datastore.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.base.architecture.domain.entities.models.User

/**
 * Created by Rupesh on 5/8/2019.
 */

@Entity
data class UserDb(@PrimaryKey val userId: Long)

fun UserDb.toUser(): User{
    return User(userId.toString())
}