package {{packageName}}

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

/**
 * Yalnizca sistem broadcast'lerini (BOOT_COMPLETED / MY_PACKAGE_REPLACED) dinler.
 * AlarmReceiver'dan ayri tutuluyor: alarm alicisi exported olursa ucuncu taraf uygulamalari
 * rastgele baslik/icerikle bildirim tetikleyebilir. BOOT_COMPLETED korumali bir broadcast
 * oldugu icin burada exported=true guvenlidir.
 */
class BootReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        AlarmReceiver.rescheduleAll(context)
    }
}
