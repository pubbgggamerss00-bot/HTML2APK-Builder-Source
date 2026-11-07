package m2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.d;
import androidx.work.e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.k;
import androidx.work.o;
import androidx.work.p;
import j2.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import r2.c;
import r2.l;
import r2.s;
import s2.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: w, reason: collision with root package name */
    public static final String f13882w = k.e("SystemJobScheduler");
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final JobScheduler f13883t;

    /* renamed from: u, reason: collision with root package name */
    public final j2.k f13884u;

    /* renamed from: v, reason: collision with root package name */
    public final a f13885v;

    public b(Context context, j2.k kVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.s = context;
        this.f13884u = kVar;
        this.f13883t = jobScheduler;
        this.f13885v = aVar;
    }

    public static void c(JobScheduler jobScheduler, int i6) {
        try {
            jobScheduler.cancel(i6);
        } catch (Throwable th) {
            k.c().b(f13882w, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i6)), th);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            k.c().b(f13882w, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // j2.e
    public final void a(l... lVarArr) {
        String str;
        String str2;
        int i6;
        String str3 = "Skipping scheduling ";
        String str4 = f13882w;
        j2.k kVar = this.f13884u;
        WorkDatabase workDatabase = kVar.f13476c;
        g gVar = new g(workDatabase);
        int length = lVarArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i8 < length) {
            l lVar = lVarArr[i8];
            workDatabase.c();
            try {
                l lVarI = ((s) workDatabase.n()).i(lVar.f14280a);
                if (lVarI == null) {
                    k.c().f(str4, str3 + lVar.f14280a + " because it's no longer in the DB", new Throwable[i7]);
                    workDatabase.h();
                } else if (lVarI.f14281b != p.s) {
                    k.c().f(str4, str3 + lVar.f14280a + " because it is no longer enqueued", new Throwable[i7]);
                    workDatabase.h();
                } else {
                    r2.e eVarA = workDatabase.k().a(lVar.f14280a);
                    if (eVarA != null) {
                        i6 = eVarA.f14273b;
                        str = str3;
                        str2 = str4;
                    } else {
                        kVar.f13475b.getClass();
                        int i9 = kVar.f13475b.f1762g;
                        synchronized (g.class) {
                            int iA = gVar.a("next_job_scheduler_id");
                            if (iA < 0 || iA > i9) {
                                str = str3;
                                str2 = str4;
                                gVar.f14359a.j().b(new c("next_job_scheduler_id", 1));
                                i6 = 0;
                            } else {
                                str = str3;
                                str2 = str4;
                                i6 = iA;
                            }
                        }
                    }
                    if (eVarA == null) {
                        kVar.f13476c.k().d(new r2.e(lVar.f14280a, i6));
                    }
                    f(lVar, i6);
                    workDatabase.h();
                    i8++;
                    str3 = str;
                    str4 = str2;
                    i7 = 0;
                }
                workDatabase.f();
                str = str3;
                str2 = str4;
                i8++;
                str3 = str;
                str4 = str2;
                i7 = 0;
            } finally {
                workDatabase.f();
            }
        }
    }

    @Override // j2.e
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    @Override // j2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(String str) {
        String string;
        Context context = this.s;
        JobScheduler jobScheduler = this.f13883t;
        ArrayList arrayListE = e(context, jobScheduler);
        int i6 = 0;
        ArrayList arrayList = null;
        if (arrayListE != null) {
            ArrayList arrayList2 = new ArrayList(2);
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
                if (str.equals(string)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i6 < size2) {
            Object obj2 = arrayList.get(i6);
            i6++;
            c(jobScheduler, ((Integer) obj2).intValue());
        }
        this.f13884u.f13476c.k().e(str);
    }

    public final void f(l lVar, int i6) {
        int i7;
        JobScheduler jobScheduler = this.f13883t;
        a aVar = this.f13885v;
        aVar.getClass();
        d dVar = lVar.f14288j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", lVar.f14280a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", lVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i6, aVar.f13881a).setRequiresCharging(dVar.f1765b).setRequiresDeviceIdle(dVar.f1766c).setExtras(persistableBundle);
        androidx.work.l lVar2 = dVar.f1764a;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 30 || lVar2 != androidx.work.l.f1836x) {
            int iOrdinal = lVar2.ordinal();
            if (iOrdinal == 0) {
                i7 = 0;
            } else if (iOrdinal != 1) {
                i7 = 2;
                if (iOrdinal != 2) {
                    i7 = 3;
                    if (iOrdinal != 3) {
                        i7 = 4;
                        if (iOrdinal != 4 || i8 < 26) {
                            k.c().a(a.f13880b, "API version too low. Cannot convert network type value " + lVar2, new Throwable[0]);
                            i7 = 1;
                        }
                    }
                }
            } else {
                i7 = 1;
            }
            extras.setRequiredNetworkType(i7);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!dVar.f1766c) {
            extras.setBackoffCriteria(lVar.f14291m, lVar.f14290l == androidx.work.a.f1752t ? 0 : 1);
        }
        long jMax = Math.max(lVar.a() - System.currentTimeMillis(), 0L);
        if (i8 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!lVar.f14295q) {
            extras.setImportantWhileForeground(true);
        }
        if (dVar.h.f1771a.size() > 0) {
            Iterator it = dVar.h.f1771a.iterator();
            while (it.hasNext()) {
                e.a aVar2 = (e.a) it.next();
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(aVar2.f1772a, aVar2.f1773b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(dVar.f1769f);
            extras.setTriggerContentMaxDelay(dVar.f1770g);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(dVar.f1767d);
            extras.setRequiresStorageNotLow(dVar.f1768e);
        }
        boolean z6 = lVar.f14289k > 0;
        if (q0.a.a() && lVar.f14295q && !z6) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        k kVarC = k.c();
        String str = lVar.f14280a;
        String str2 = f13882w;
        kVarC.a(str2, "Scheduling work ID " + str + " Job ID " + i6, new Throwable[0]);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                k.c().f(str2, "Unable to schedule work ID " + lVar.f14280a, new Throwable[0]);
                if (lVar.f14295q && lVar.f14296r == o.s) {
                    lVar.f14295q = false;
                    k.c().a(str2, "Scheduling a non-expedited job (work ID " + lVar.f14280a + ")", new Throwable[0]);
                    f(lVar, i6);
                }
            }
        } catch (IllegalStateException e6) {
            ArrayList arrayListE = e(this.s, jobScheduler);
            int size = arrayListE != null ? arrayListE.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            j2.k kVar = this.f13884u;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(((s) kVar.f13476c.n()).e().size()), Integer.valueOf(kVar.f13475b.h));
            k.c().b(str2, str3, new Throwable[0]);
            throw new IllegalStateException(str3, e6);
        } catch (Throwable th) {
            k.c().b(str2, "Unable to schedule " + lVar, th);
        }
    }
}
