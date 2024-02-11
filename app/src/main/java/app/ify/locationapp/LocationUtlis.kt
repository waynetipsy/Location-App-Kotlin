package app.ify.locationapp

import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat
import app.ify.locationapp.Manifest.*
import android.Manifest

class LocationUtlis (val context: Context){
   fun hasLocationPermission(context: Context):Boolean {
       return ContextCompat.checkSelfPermission(
               context,
               Manifest.permission.ACCESS_FINE_LOCATION
           ) == PackageManager.PERMISSION_GRANTED
               &&
               ContextCompat.checkSelfPermission(
                   context,
                   Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED
   }
}