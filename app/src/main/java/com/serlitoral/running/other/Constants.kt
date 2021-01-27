package com.serlitoral.running.other

import android.graphics.Color
import com.github.mikephil.charting.data.LineDataSet

class Constants {

    companion object {
        const val MAP_VIEW_BUNDLE_KEY = "MapViewBundleKey"

        const val REQUEST_CODE_LOCATION_PERMISSION = 0

        //Database
        const val DATABASE_NAME = "running_db"

        //Opciones de Seguimeinto
        const val LOCATION_UPDATE_INTERVAL = 5000L
        const val FASTEST_LOCATION_UPDATE_INTERVAL = 2000L

        //Opciones del Mapa
        const val POLYLINE_COLOR = Color.RED
        const val POLYLINE_WIDTH = 8f
        const val MAP_ZOOM = 15f

        //Temporizador
        const val TIMER_UPDATE_INTERVAL = 50L

        //Gráfico
        val LINE_DATA_MODE = LineDataSet.Mode.CUBIC_BEZIER

        //MapView
        const val MAP_VIEW_HEIGHT_IN_DP = 200f

        //Notificaciones
        const val NOTIFICATION_CHANNEL_ID = "tracking_channel"
        const val NOTIFICATION_CHANNEL_NAME = "Tracking"
        const val NOTIFICATION_ID = 1

        //Shared Preferences
        const val SHARED_PREFERENCES_NAME = "sharedPref"
        const val KEY_NAME = "KEY_NAME"
        const val KEY_WEIGHT = "KEY_WEIGHT"
        const val KEY_FIRST_TIME_TOGGLE = "KEY_FIRST_TIME_TOGGLE"

        //Servicio Intent
        const val ACTION_SHOW_TRACKING_FRAGMENT = "ACTION_SHOW_TRACKING_FRAGMENT"
        const val ACTION_START_OR_RESUME_SERVICE = "ACTION_START_SERVICE"
        const val ACTION_PAUSE_SERVICE = "ACTION_PAUSE_SERVICE"
        const val ACTION_STOP_SERVICE = "ACTION_STOP_SERVICE"
    }
}