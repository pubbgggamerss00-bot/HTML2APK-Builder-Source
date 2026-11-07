package androidx.work.impl.utils;

import a2.e;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.k;
import androidx.work.p;
import com.google.android.gms.internal.ads.eu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m2.b;
import q0.a;
import r2.c;
import r2.l;
import r2.m;
import r2.s;
import s2.f;
import s2.j;
import v1.i;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    public static final String f1820v = k.e("ForceStopRunnable");

    /* renamed from: w, reason: collision with root package name */
    public static final long f1821w = TimeUnit.DAYS.toMillis(3650);
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final j2.k f1822t;

    /* renamed from: u, reason: collision with root package name */
    public int f1823u = 0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public static final String f1824a = k.e("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            if (((k.a) k.c()).f1831b <= 2) {
                Log.v(f1824a, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.c(context);
        }
    }

    public ForceStopRunnable(Context context, j2.k kVar) {
        this.s = context.getApplicationContext();
        this.f1822t = kVar;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i6 = a.a() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i6);
        long jCurrentTimeMillis = System.currentTimeMillis() + f1821w;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z6;
        WorkDatabase workDatabase;
        int i6;
        String string;
        String str = b.f13882w;
        Context context = this.s;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList arrayListE = b.e(context, jobScheduler);
        j2.k kVar = this.f1822t;
        com.google.android.gms.ads.mediation.customevent.b bVarK = kVar.f13476c.k();
        bVarK.getClass();
        i iVarA = i.a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) bVarK.s;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(iVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            HashSet hashSet = new HashSet(arrayListE != null ? arrayListE.size() : 0);
            if (arrayListE != null && !arrayListE.isEmpty()) {
                int size = arrayListE.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayListE.get(i7);
                    i7++;
                    JobInfo jobInfo = (JobInfo) obj;
                    PersistableBundle extras = jobInfo.getExtras();
                    if (extras != null) {
                        string = extras.containsKey("EXTRA_WORK_SPEC_ID") ? extras.getString("EXTRA_WORK_SPEC_ID") : null;
                    }
                    if (TextUtils.isEmpty(string)) {
                        b.c(jobScheduler, jobInfo.getId());
                    } else {
                        hashSet.add(string);
                    }
                }
            }
            int size2 = arrayList.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size2) {
                    z6 = false;
                    break;
                }
                Object obj2 = arrayList.get(i8);
                i8++;
                if (!hashSet.contains((String) obj2)) {
                    k.c().a(b.f13882w, "Reconciling jobs", new Throwable[0]);
                    z6 = true;
                    break;
                }
            }
            if (z6) {
                workDatabase = kVar.f13476c;
                workDatabase.c();
                try {
                    m mVarN = workDatabase.n();
                    int size3 = arrayList.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        Object obj3 = arrayList.get(i9);
                        i9++;
                        ((s) mVarN).l((String) obj3, -1L);
                    }
                    workDatabase.h();
                    workDatabase.f();
                } catch (Throwable th) {
                    throw th;
                }
            }
            workDatabase = kVar.f13476c;
            m mVarN2 = workDatabase.n();
            eu euVarM = workDatabase.m();
            workDatabase.c();
            try {
                s sVar = (s) mVarN2;
                ArrayList arrayListD = sVar.d();
                boolean zIsEmpty = arrayListD.isEmpty();
                if (!zIsEmpty) {
                    int size4 = arrayListD.size();
                    int i10 = 0;
                    while (i10 < size4) {
                        Object obj4 = arrayListD.get(i10);
                        i10++;
                        l lVar = (l) obj4;
                        sVar.p(p.s, lVar.f14280a);
                        sVar.l(lVar.f14280a, -1L);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) euVarM.f4395t;
                workDatabase_Impl2.b();
                r2.k kVar2 = (r2.k) euVarM.f4397v;
                e eVarA = kVar2.a();
                workDatabase_Impl2.c();
                try {
                    eVarA.e();
                    workDatabase_Impl2.h();
                    workDatabase_Impl2.f();
                    kVar2.c(eVarA);
                    workDatabase.h();
                    workDatabase.f();
                    boolean z7 = !zIsEmpty || z6;
                    Long lA = kVar.f13480g.f14361a.j().a("reschedule_needed");
                    String str2 = f1820v;
                    if (lA != null && lA.longValue() == 1) {
                        k.c().a(str2, "Rescheduling Workers.", new Throwable[0]);
                        kVar.e();
                        s2.i iVar = kVar.f13480g;
                        iVar.getClass();
                        iVar.f14361a.j().b(new c("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        int i11 = a.a() ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i11);
                        if (Build.VERSION.SDK_INT >= 30) {
                            if (broadcast != null) {
                                broadcast.cancel();
                            }
                            List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                            if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                                for (int i12 = 0; i12 < historicalProcessExitReasons.size(); i12++) {
                                    if (f.d(historicalProcessExitReasons.get(i12)).getReason() == 10) {
                                        i6 = 0;
                                    }
                                }
                            }
                            if (z7) {
                                return;
                            }
                            k.c().a(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                            j2.f.a(kVar.f13475b, kVar.f13476c, kVar.f13478e);
                            return;
                        }
                        if (broadcast == null) {
                            c(context);
                            i6 = 0;
                        }
                        if (z7) {
                        }
                    } catch (IllegalArgumentException e6) {
                        e = e6;
                        i6 = 0;
                        k.c().f(str2, "Ignoring exception", e);
                        k.c().a(str2, "Application was force-stopped, rescheduling.", new Throwable[i6]);
                        kVar.e();
                    } catch (SecurityException e7) {
                        e = e7;
                        i6 = 0;
                        k.c().f(str2, "Ignoring exception", e);
                        k.c().a(str2, "Application was force-stopped, rescheduling.", new Throwable[i6]);
                        kVar.e();
                    }
                    k.c().a(str2, "Application was force-stopped, rescheduling.", new Throwable[i6]);
                    kVar.e();
                } catch (Throwable th2) {
                    workDatabase_Impl2.f();
                    kVar2.c(eVarA);
                    throw th2;
                }
            } finally {
                workDatabase.f();
            }
        } finally {
            cursorG.close();
            iVarA.h();
        }
    }

    public final boolean b() {
        androidx.work.c cVar = this.f1822t.f13475b;
        cVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f1820v;
        if (zIsEmpty) {
            k.c().a(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zA = j.a(this.s, cVar);
        k.c().a(str, "Is default app process = " + zA, new Throwable[0]);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f1820v;
        j2.k kVar = this.f1822t;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                j2.j.a(this.s);
                k.c().a(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e6) {
                    int i6 = this.f1823u + 1;
                    this.f1823u = i6;
                    if (i6 >= 3) {
                        k.c().b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e6);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e6);
                        kVar.f13475b.getClass();
                        throw illegalStateException;
                    }
                    long j6 = i6 * 300;
                    k.c().a(str, "Retrying after " + j6, e6);
                    try {
                        Thread.sleep(this.f1823u * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            kVar.d();
        }
    }
}
