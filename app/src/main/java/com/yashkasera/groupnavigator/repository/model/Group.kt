package com.yashkasera.groupnavigator.repository.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * @author yashkasera
 * Created 21/04/22 at 12:16 AM
 */
@Parcelize
data class Group(
    val id: String,
    val name: String,
    val members: List<Member>
) : Parcelable
