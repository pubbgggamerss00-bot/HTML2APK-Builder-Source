package com.htmltoapk.template;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.ads.RequestConfiguration;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class AlarmReceiver extends BroadcastReceiver {
    public static final String ACTION_RESTORE = "com.htmltoapk.template.RESTORE_ALARMS";
    private static final String CHANNEL_ID = "htmltoapk_scheduled_channel";
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_ID = "id";
    private static final String EXTRA_MESSAGE = "message";
    private static final String EXTRA_REPEAT_INTERVAL_MS = "repeatIntervalMs";
    private static final String EXTRA_TITLE = "title";
    private static final String TAG = "AlarmReceiver";

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Companion {

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static final class ScheduleOutcome {
            private final boolean exact;
            private final boolean success;

            public ScheduleOutcome(boolean z6, boolean z7) {
                this.success = z6;
                this.exact = z7;
            }

            public static /* synthetic */ ScheduleOutcome copy$default(ScheduleOutcome scheduleOutcome, boolean z6, boolean z7, int i6, Object obj) {
                if ((i6 & 1) != 0) {
                    z6 = scheduleOutcome.success;
                }
                if ((i6 & 2) != 0) {
                    z7 = scheduleOutcome.exact;
                }
                return scheduleOutcome.copy(z6, z7);
            }

            public final boolean component1() {
                return this.success;
            }

            public final boolean component2() {
                return this.exact;
            }

            public final ScheduleOutcome copy(boolean z6, boolean z7) {
                return new ScheduleOutcome(z6, z7);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ScheduleOutcome)) {
                    return false;
                }
                ScheduleOutcome scheduleOutcome = (ScheduleOutcome) obj;
                return this.success == scheduleOutcome.success && this.exact == scheduleOutcome.exact;
            }

            public final boolean getExact() {
                return this.exact;
            }

            public final boolean getSuccess() {
                return this.success;
            }

            public final String getWarning() {
                return !this.success ? "alarm_failed" : !this.exact ? "inexact_alarm" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }

            public int hashCode() {
                return Boolean.hashCode(this.exact) + (Boolean.hashCode(this.success) * 31);
            }

            public String toString() {
                return "ScheduleOutcome(success=" + this.success + ", exact=" + this.exact + ")";
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        private final ScheduleOutcome armAlarm(Context context, String str, String str2, String str3, long j6, long j7) {
            try {
                Object systemService = context.getSystemService("alarm");
                kotlin.jvm.internal.j.c("null cannot be cast to non-null type android.app.AlarmManager", systemService);
                AlarmManager alarmManager = (AlarmManager) systemService;
                Intent intent = new Intent(context, (Class<?>) AlarmReceiver.class);
                intent.putExtra(AlarmReceiver.EXTRA_ID, str);
                intent.putExtra(AlarmReceiver.EXTRA_TITLE, str2);
                intent.putExtra(AlarmReceiver.EXTRA_MESSAGE, str3);
                intent.putExtra(AlarmReceiver.EXTRA_REPEAT_INTERVAL_MS, j7);
                int i6 = Build.VERSION.SDK_INT;
                PendingIntent broadcast = PendingIntent.getBroadcast(context, str.hashCode(), intent, 67108864 | 134217728);
                if (i6 < 31 || canScheduleExactAlarms(context)) {
                    try {
                        alarmManager.setExactAndAllowWhileIdle(0, j6, broadcast);
                        return new ScheduleOutcome(true, true);
                    } catch (SecurityException unused) {
                    }
                }
                alarmManager.setAndAllowWhileIdle(0, j6, broadcast);
                return new ScheduleOutcome(true, false);
            } catch (Exception e6) {
                Log.e(AlarmReceiver.TAG, "Failed to schedule alarm", e6);
                return new ScheduleOutcome(false, false);
            }
        }

        public final boolean canScheduleExactAlarms(Context context) {
            kotlin.jvm.internal.j.e("context", context);
            Object systemService = context.getSystemService("alarm");
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type android.app.AlarmManager", systemService);
            AlarmManager alarmManager = (AlarmManager) systemService;
            if (Build.VERSION.SDK_INT < 31) {
                return true;
            }
            try {
                return alarmManager.canScheduleExactAlarms();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void cancelAlarm(Context context, String str) {
            kotlin.jvm.internal.j.e("context", context);
            kotlin.jvm.internal.j.e(AlarmReceiver.EXTRA_ID, str);
            Object systemService = context.getSystemService("alarm");
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type android.app.AlarmManager", systemService);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, str.hashCode(), new Intent(context, (Class<?>) AlarmReceiver.class), 134217728 | 67108864);
            ((AlarmManager) systemService).cancel(broadcast);
            broadcast.cancel();
            AlarmStore.INSTANCE.remove(context, str);
        }

        public final Long nextTriggerAt$template_adsRelease(long j6, long j7, long j8) {
            if (j7 > 0) {
                return j6 > j8 ? Long.valueOf(j6) : Long.valueOf(((((j8 - j6) / j7) + 1) * j7) + j6);
            }
            if (j6 > j8) {
                return Long.valueOf(j6);
            }
            return null;
        }

        public final void rescheduleAll(Context context) {
            Context context2 = context;
            kotlin.jvm.internal.j.e("context", context2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (AlarmRecord alarmRecord : AlarmStore.INSTANCE.all(context2)) {
                Companion companion = AlarmReceiver.Companion;
                Long lNextTriggerAt$template_adsRelease = companion.nextTriggerAt$template_adsRelease(alarmRecord.getTriggerAt(), alarmRecord.getRepeatIntervalMs(), jCurrentTimeMillis);
                long j6 = jCurrentTimeMillis;
                if (lNextTriggerAt$template_adsRelease == null) {
                    AlarmStore.INSTANCE.remove(context2, alarmRecord.getId());
                } else {
                    if (lNextTriggerAt$template_adsRelease.longValue() != alarmRecord.getTriggerAt()) {
                        AlarmStore.INSTANCE.save(context2, alarmRecord.getId(), alarmRecord.getTitle(), alarmRecord.getMessage(), lNextTriggerAt$template_adsRelease.longValue(), alarmRecord.getRepeatIntervalMs());
                    }
                    companion.armAlarm(context, alarmRecord.getId(), alarmRecord.getTitle(), alarmRecord.getMessage(), lNextTriggerAt$template_adsRelease.longValue(), alarmRecord.getRepeatIntervalMs());
                }
                context2 = context;
                jCurrentTimeMillis = j6;
            }
        }

        public final ScheduleOutcome scheduleAlarm(Context context, String str, String str2, String str3, long j6, long j7) {
            kotlin.jvm.internal.j.e("context", context);
            kotlin.jvm.internal.j.e(AlarmReceiver.EXTRA_ID, str);
            kotlin.jvm.internal.j.e(AlarmReceiver.EXTRA_TITLE, str2);
            kotlin.jvm.internal.j.e(AlarmReceiver.EXTRA_MESSAGE, str3);
            AlarmStore.INSTANCE.save(context, str, str2, str3, j6, j7);
            return armAlarm(context, str, str2, str3, j6, j7);
        }

        private Companion() {
        }
    }

    private final void showNotification(Context context, String str, String str2, String str3) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33 && k0.a.a(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            Log.w(TAG, "Notification '" + str + "' dropped: POST_NOTIFICATIONS not granted");
            return;
        }
        Object systemService = context.getSystemService("notification");
        kotlin.jvm.internal.j.c("null cannot be cast to non-null type android.app.NotificationManager", systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (i6 >= 26) {
            com.google.android.gms.ads.internal.util.o.c();
            notificationManager.createNotificationChannel(c3.e.c());
        }
        i0.m mVar = new i0.m(context, CHANNEL_ID);
        mVar.f13331p.icon = android.R.drawable.ic_dialog_info;
        mVar.f13321e = i0.m.b(str2);
        mVar.f13322f = i0.m.b(str3);
        mVar.f13324i = 0;
        mVar.c();
        notificationManager.notify(str.hashCode(), mVar.a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws JSONException {
        kotlin.jvm.internal.j.e("context", context);
        kotlin.jvm.internal.j.e("intent", intent);
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) || "android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction()) || ACTION_RESTORE.equals(intent.getAction())) {
            Companion.rescheduleAll(context);
            return;
        }
        String stringExtra = intent.getStringExtra(EXTRA_ID);
        if (stringExtra == null) {
            return;
        }
        String stringExtra2 = intent.getStringExtra(EXTRA_TITLE);
        String str = stringExtra2 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : stringExtra2;
        String stringExtra3 = intent.getStringExtra(EXTRA_MESSAGE);
        String str2 = stringExtra3 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : stringExtra3;
        long longExtra = intent.getLongExtra(EXTRA_REPEAT_INTERVAL_MS, 0L);
        showNotification(context, stringExtra, str, str2);
        if (longExtra <= 0) {
            AlarmStore.INSTANCE.remove(context, stringExtra);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() + longExtra;
        AlarmStore.INSTANCE.save(context, stringExtra, str, str2, jCurrentTimeMillis, longExtra);
        Companion.scheduleAlarm(context, stringExtra, str, str2, jCurrentTimeMillis, longExtra);
    }
}
