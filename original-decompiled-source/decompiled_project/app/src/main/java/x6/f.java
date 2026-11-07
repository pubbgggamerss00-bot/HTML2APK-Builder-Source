package x6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import c7.i0;
import c7.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.r;
import qg.o;
import qg.x;
import t6.b0;
import t6.c0;
import t6.e;
import t6.s;
import u6.t;

/* loaded from: classes.dex */
public final class f implements t {

    /* renamed from: f, reason: collision with root package name */
    public static final String f32177f = s.f("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f32178a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f32179b;

    /* renamed from: c, reason: collision with root package name */
    public final e f32180c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkDatabase f32181d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.work.a f32182e;

    public f(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        JobScheduler jobSchedulerB = b.b(context);
        e eVar = new e(context, aVar.f3119d, aVar.f3127l);
        this.f32178a = context;
        this.f32179b = jobSchedulerB;
        this.f32180c = eVar;
        this.f32181d = workDatabase;
        this.f32182e = aVar;
    }

    public static void a(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            s.d().c(f32177f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listA = b.a(jobScheduler);
        if (listA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listA.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listA) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // u6.t
    public final void c(WorkSpec... workSpecArr) {
        int iIntValue;
        androidx.work.a aVar = this.f32182e;
        WorkDatabase workDatabase = this.f32181d;
        final cc.f fVar = new cc.f(workDatabase);
        for (WorkSpec workSpec : workSpecArr) {
            workDatabase.beginTransaction();
            try {
                WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                String str = workSpec.f3167a;
                WorkSpec workSpecS = workSpecDao.s(str);
                String str2 = f32177f;
                if (workSpecS == null) {
                    s.d().g(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.setTransactionSuccessful();
                } else if (workSpecS.f3168b != c0.f27994a) {
                    s.d().g(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.setTransactionSuccessful();
                } else {
                    j jVarA = i0.a(workSpec);
                    SystemIdInfo systemIdInfoE = workDatabase.systemIdInfoDao().e(jVarA);
                    if (systemIdInfoE != null) {
                        iIntValue = systemIdInfoE.f3166c;
                    } else {
                        aVar.getClass();
                        final int i10 = aVar.f3124i;
                        Object objRunInTransaction = ((WorkDatabase) fVar.f5363a).runInTransaction((Callable<Object>) new Callable() { // from class: d7.k
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = (WorkDatabase) fVar.f5363a;
                                Long lA = workDatabase2.preferenceDao().a("next_job_scheduler_id");
                                int i11 = 0;
                                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                                workDatabase2.preferenceDao().b(new Preference("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i10) {
                                    workDatabase2.preferenceDao().b(new Preference("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i11 = iLongValue;
                                }
                                return Integer.valueOf(i11);
                            }
                        });
                        r.d(objRunInTransaction, "workDatabase.runInTransa…d\n            }\n        )");
                        iIntValue = ((Number) objRunInTransaction).intValue();
                    }
                    if (systemIdInfoE == null) {
                        workDatabase.systemIdInfoDao().b(new SystemIdInfo(jVarA.f5006a, jVarA.f5007b, iIntValue));
                    }
                    g(workSpec, iIntValue);
                    workDatabase.setTransactionSuccessful();
                }
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    @Override // u6.t
    public final boolean d() {
        return true;
    }

    @Override // u6.t
    public final void e(String str) {
        ArrayList arrayList;
        Context context = this.f32178a;
        JobScheduler jobScheduler = this.f32179b;
        ArrayList arrayListB = b(context, jobScheduler);
        int i10 = 0;
        if (arrayListB == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = arrayListB.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListB.get(i11);
                i11++;
                JobInfo jobInfo = (JobInfo) obj;
                j jVarF = f(jobInfo);
                if (jVarF != null && str.equals(jVarF.f5006a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            a(jobScheduler, ((Integer) obj2).intValue());
        }
        this.f32181d.systemIdInfoDao().g(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(WorkSpec workSpec, int i10) {
        int i11;
        String str;
        e eVar = this.f32180c;
        eVar.getClass();
        t6.e eVar2 = workSpec.f3176j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = workSpec.f3167a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", workSpec.f3186t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", workSpec.c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i10, eVar.f32174a).setRequiresCharging(eVar2.f28004c);
        boolean z10 = eVar2.f28005d;
        JobInfo.Builder builder = requiresCharging.setRequiresDeviceIdle(z10).setExtras(persistableBundle);
        NetworkRequest networkRequestA = eVar2.a();
        int i12 = Build.VERSION.SDK_INT;
        if (networkRequestA != null) {
            r.e(builder, "builder");
            builder.setRequiredNetwork(networkRequestA);
        } else {
            t6.t tVar = eVar2.f28002a;
            if (i12 < 30 || tVar != t6.t.f28057f) {
                int iOrdinal = tVar.ordinal();
                if (iOrdinal == 0) {
                    i11 = 0;
                } else if (iOrdinal != 1) {
                    i11 = 2;
                    if (iOrdinal != 2) {
                        i11 = 3;
                        if (iOrdinal != 3) {
                            i11 = 4;
                            if (iOrdinal != 4) {
                                s.d().a(e.f32173d, "API version too low. Cannot convert network type value " + tVar);
                                i11 = 1;
                            }
                        }
                    }
                } else {
                    i11 = 1;
                }
                builder.setRequiredNetworkType(i11);
            } else {
                builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        }
        if (!z10) {
            builder.setBackoffCriteria(workSpec.f3179m, workSpec.f3178l == t6.a.f27987b ? 0 : 1);
        }
        long jMax = Math.max(workSpec.a() - eVar.f32175b.a(), 0L);
        if (i12 <= 28 || jMax > 0) {
            builder.setMinimumLatency(jMax);
        } else if (!workSpec.f3183q && eVar.f32176c) {
            builder.setImportantWhileForeground(true);
        }
        if (eVar2.b()) {
            for (e.a aVar : eVar2.f28010i) {
                builder.addTriggerContentUri(new JobInfo.TriggerContentUri(aVar.f28011a, aVar.f28012b ? 1 : 0));
            }
            builder.setTriggerContentUpdateDelay(eVar2.f28008g);
            builder.setTriggerContentMaxDelay(eVar2.f28009h);
        }
        builder.setPersisted(false);
        int i13 = Build.VERSION.SDK_INT;
        builder.setRequiresBatteryNotLow(eVar2.f28006e);
        builder.setRequiresStorageNotLow(eVar2.f28007f);
        Object[] objArr = workSpec.f3177k > 0;
        boolean z11 = jMax > 0;
        if (i13 >= 31 && workSpec.f3183q && objArr == false && !z11) {
            builder.setExpedited(true);
        }
        if (i13 >= 35 && (str = workSpec.f3190x) != null) {
            builder.setTraceTag(str);
        }
        JobInfo jobInfoBuild = builder.build();
        String str3 = f32177f;
        s.d().a(str3, "Scheduling work ID " + str2 + "Job ID " + i10);
        try {
            if (this.f32179b.schedule(jobInfoBuild) == 0) {
                s.d().g(str3, "Unable to schedule work ID " + str2);
                if (workSpec.f3183q && workSpec.f3184r == b0.f27989a) {
                    workSpec.f3183q = false;
                    s.d().a(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                    g(workSpec, i10);
                }
            }
        } catch (IllegalStateException e10) {
            String str4 = b.f32172a;
            Context context = this.f32178a;
            r.e(context, "context");
            WorkDatabase workDatabase = this.f32181d;
            r.e(workDatabase, "workDatabase");
            androidx.work.a configuration = this.f32182e;
            r.e(configuration, "configuration");
            int i14 = Build.VERSION.SDK_INT;
            int i15 = i14 >= 31 ? 150 : 100;
            int size = workDatabase.workSpecDao().l().size();
            String strI = "<faulty JobScheduler failed to getPendingJobs>";
            if (i14 >= 34) {
                JobScheduler jobSchedulerB = b.b(context);
                List<JobInfo> listA = b.a(jobSchedulerB);
                if (listA != null) {
                    ArrayList arrayListB = b(context, jobSchedulerB);
                    int size2 = arrayListB != null ? listA.size() - arrayListB.size() : 0;
                    String strB = size2 == 0 ? null : i8.c.b(size2, " of which are not owned by WorkManager");
                    Object systemService = context.getSystemService("jobscheduler");
                    r.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                    ArrayList arrayListB2 = b(context, (JobScheduler) systemService);
                    int size3 = arrayListB2 != null ? arrayListB2.size() : 0;
                    strI = x.I(o.s(new String[]{listA.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", strB, size3 != 0 ? i8.c.b(size3, " from WorkManager in the default namespace") : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListB3 = b(context, b.b(context));
                if (arrayListB3 != null) {
                    strI = arrayListB3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb = new StringBuilder("JobScheduler ");
            sb.append(i15);
            sb.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb.append(strI);
            sb.append(".\nThere are ");
            sb.append(size);
            sb.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strA = b.b.a(sb, configuration.f3126k, '.');
            s.d().b(str3, strA);
            throw new IllegalStateException(strA, e10);
        } catch (Throwable th2) {
            s.d().c(str3, "Unable to schedule " + workSpec, th2);
        }
    }
}
