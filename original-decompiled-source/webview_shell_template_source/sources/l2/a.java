package l2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.k;
import s2.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13820a = k.e("Alarms");

    public static void a(Context context, String str, int i6) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i6, b.a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        k.c().a(f13820a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i6 + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, j2.k kVar, String str, long j6) {
        int iA;
        WorkDatabase workDatabase = kVar.f13476c;
        com.google.android.gms.ads.mediation.customevent.b bVarK = workDatabase.k();
        r2.e eVarA = bVarK.a(str);
        if (eVarA != null) {
            a(context, str, eVarA.f14273b);
            int i6 = eVarA.f14273b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i6, b.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j6, service);
                return;
            }
            return;
        }
        g gVar = new g(workDatabase);
        synchronized (g.class) {
            iA = gVar.a("next_alarm_manager_id");
        }
        bVarK.d(new r2.e(str, iA));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, iA, b.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j6, service2);
        }
    }
}
