package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import c7.j;
import d7.g;
import d7.q;
import d7.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import t6.c0;
import t6.s;
import u6.g0;
import u6.t0;
import u6.w;
import x6.b;
import x6.f;

/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3207e = s.f("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    public static final long f3208f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f3209a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f3210b;

    /* renamed from: c, reason: collision with root package name */
    public final q f3211c;

    /* renamed from: d, reason: collision with root package name */
    public int f3212d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3213a = s.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            if (((s.a) s.d()).f28051c <= 2) {
                Log.v(f3213a, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.c(context);
        }
    }

    public ForceStopRunnable(Context context, t0 t0Var) {
        this.f3209a = context.getApplicationContext();
        this.f3210b = t0Var;
        this.f3211c = t0Var.f29342g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i10 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long jCurrentTimeMillis = System.currentTimeMillis() + f3208f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z10;
        int i10;
        PendingIntent broadcast;
        q qVar = this.f3211c;
        t0 t0Var = this.f3210b;
        WorkDatabase workDatabase = t0Var.f29338c;
        a aVar = t0Var.f29337b;
        q qVar2 = t0Var.f29342g;
        workDatabase = t0Var.f29338c;
        String str = f.f32177f;
        Context context = this.f3209a;
        JobScheduler jobSchedulerB = b.b(context);
        ArrayList arrayListB = f.b(context, jobSchedulerB);
        ArrayList arrayListA = workDatabase.systemIdInfoDao().a();
        HashSet hashSet = new HashSet(arrayListB != null ? arrayListB.size() : 0);
        if (arrayListB != null && !arrayListB.isEmpty()) {
            int size = arrayListB.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListB.get(i11);
                i11++;
                JobInfo jobInfo = (JobInfo) obj;
                j jVarF = f.f(jobInfo);
                if (jVarF != null) {
                    hashSet.add(jVarF.f5006a);
                } else {
                    f.a(jobSchedulerB, jobInfo.getId());
                }
            }
        }
        int size2 = arrayListA.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                z10 = false;
                break;
            }
            Object obj2 = arrayListA.get(i12);
            i12++;
            if (!hashSet.contains((String) obj2)) {
                s.d().a(f.f32177f, "Reconciling jobs");
                z10 = true;
                break;
            }
        }
        if (z10) {
            workDatabase.beginTransaction();
            try {
                WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                int size3 = arrayListA.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj3 = arrayListA.get(i13);
                    i13++;
                    workSpecDao.e((String) obj3, -1L);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        WorkSpecDao workSpecDao2 = workDatabase.workSpecDao();
        WorkProgressDao workProgressDao = workDatabase.workProgressDao();
        workDatabase.beginTransaction();
        try {
            ArrayList arrayListO = workSpecDao2.o();
            boolean zIsEmpty = arrayListO.isEmpty();
            if (!zIsEmpty) {
                int size4 = arrayListO.size();
                int i14 = 0;
                while (i14 < size4) {
                    Object obj4 = arrayListO.get(i14);
                    i14++;
                    c0 c0Var = c0.f27994a;
                    String str2 = ((WorkSpec) obj4).f3167a;
                    workSpecDao2.x(c0Var, str2);
                    workSpecDao2.p(-512, str2);
                    workSpecDao2.e(str2, -1L);
                    z10 = z10;
                    arrayListO = arrayListO;
                }
            }
            boolean z11 = z10;
            workProgressDao.b();
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            boolean z12 = !zIsEmpty || z11;
            Long lA = qVar2.f7393a.preferenceDao().a("reschedule_needed");
            String str3 = f3207e;
            if (lA != null && lA.longValue() == 1) {
                s.d().a(str3, "Rescheduling Workers.");
                t0Var.e();
                qVar2.getClass();
                qVar2.f7393a.preferenceDao().b(new Preference("reschedule_needed", 0L));
                return;
            }
            try {
                i10 = Build.VERSION.SDK_INT;
                int i15 = i10 >= 31 ? 570425344 : PKIFailureInfo.duplicateCertReq;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                broadcast = PendingIntent.getBroadcast(context, -1, intent, i15);
            } catch (IllegalArgumentException e10) {
                e = e10;
                if (((s.a) s.d()).f28051c <= 5) {
                    Log.w(str3, "Ignoring exception", e);
                }
                s.d().a(str3, "Application was force-stopped, rescheduling.");
                t0Var.e();
                aVar.f3119d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                qVar.getClass();
                qVar.f7393a.preferenceDao().b(new Preference("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                return;
            } catch (SecurityException e11) {
                e = e11;
                if (((s.a) s.d()).f28051c <= 5) {
                }
                s.d().a(str3, "Application was force-stopped, rescheduling.");
                t0Var.e();
                aVar.f3119d.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                qVar.getClass();
                qVar.f7393a.preferenceDao().b(new Preference("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2)));
                return;
            }
            if (i10 >= 30) {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lA2 = qVar.f7393a.preferenceDao().a("last_force_stop_ms");
                    long jLongValue = lA2 != null ? lA2.longValue() : 0L;
                    for (int i16 = 0; i16 < historicalProcessExitReasons.size(); i16++) {
                        ApplicationExitInfo applicationExitInfoA = g.a(historicalProcessExitReasons.get(i16));
                        if (applicationExitInfoA.getReason() == 10 && applicationExitInfoA.getTimestamp() >= jLongValue) {
                            s.d().a(str3, "Application was force-stopped, rescheduling.");
                            t0Var.e();
                            aVar.f3119d.getClass();
                            long jCurrentTimeMillis22 = System.currentTimeMillis();
                            qVar.getClass();
                            qVar.f7393a.preferenceDao().b(new Preference("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis22)));
                            return;
                        }
                    }
                }
                if (z12) {
                    return;
                }
                s.d().a(str3, "Found unfinished work, scheduling it.");
                w.b(aVar, workDatabase, t0Var.f29340e);
                return;
            }
            if (broadcast == null) {
                c(context);
                s.d().a(str3, "Application was force-stopped, rescheduling.");
                t0Var.e();
                aVar.f3119d.getClass();
                long jCurrentTimeMillis222 = System.currentTimeMillis();
                qVar.getClass();
                qVar.f7393a.preferenceDao().b(new Preference("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis222)));
                return;
            }
            if (z12) {
            }
        } finally {
            workDatabase.endTransaction();
        }
    }

    public final boolean b() {
        a aVar = this.f3210b.f29337b;
        aVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f3207e;
        if (zIsEmpty) {
            s.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = r.a(this.f3209a, aVar);
        s.d().a(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f3209a;
        String str = f3207e;
        t0 t0Var = this.f3210b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    g0.a(context);
                    s.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e10) {
                        int i10 = this.f3212d + 1;
                        this.f3212d = i10;
                        if (i10 >= 3) {
                            String str2 = u3.j.a(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            s.d().c(str, str2, e10);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e10);
                            t0Var.f29337b.getClass();
                            throw illegalStateException;
                        }
                        long j10 = i10 * 300;
                        String str3 = "Retrying after " + j10;
                        if (((s.a) s.d()).f28051c <= 3) {
                            Log.d(str, str3, e10);
                        }
                        try {
                            Thread.sleep(this.f3212d * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e11) {
                    s.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                    t0Var.f29337b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            t0Var.d();
        }
    }
}
