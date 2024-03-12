package com.plcoding.androidstorage

import android.os.Build

/**
 * Created by Md.Rabius Sani Raju
 * on 4:21 PM11/3/24 2024
 */

inline fun <T> sdk29AndUp(onSdk29:()-> T): T?{
    return if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.Q){
        onSdk29()
    } else null
}