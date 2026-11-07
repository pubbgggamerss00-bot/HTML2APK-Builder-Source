package w6;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import c7.j;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.r;
import t6.s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f31276a = s.f("Alarms");

    public static void a(Context context, j jVar, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = b.f31277f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        b.d(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i10, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        s.d().a(f31276a, "Cancelling existing alarm with (workSpecId, systemId) (" + jVar + ", " + i10 + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, j jVar, long j10) {
        SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        SystemIdInfo systemIdInfoE = systemIdInfoDao.e(jVar);
        if (systemIdInfoE != null) {
            int i10 = systemIdInfoE.f3166c;
            a(context, jVar, i10);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = b.f31277f;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            b.d(intent, jVar);
            PendingIntent service = PendingIntent.getService(context, i10, intent, 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j10, service);
                return;
            }
            return;
        }
        final cc.f fVar = new cc.f(workDatabase);
        Object objRunInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: d7.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase2 = (WorkDatabase) fVar.f5363a;
                Long lA = workDatabase2.preferenceDao().a("next_alarm_manager_id");
                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                workDatabase2.preferenceDao().b(new Preference("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            }
        });
        r.d(objRunInTransaction, "workDatabase.runInTransa…NAGER_ID_KEY) }\n        )");
        int iIntValue = ((Number) objRunInTransaction).intValue();
        systemIdInfoDao.b(new SystemIdInfo(jVar.f5006a, jVar.f5007b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = b.f31277f;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        b.d(intent2, jVar);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j10, service2);
        }
    }
}
