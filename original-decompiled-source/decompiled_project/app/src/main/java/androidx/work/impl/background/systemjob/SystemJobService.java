package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import c7.j;
import gb.h;
import i8.n;
import java.util.Arrays;
import java.util.HashMap;
import t6.s;
import u6.e;
import u6.r;
import u6.s0;
import u6.t0;
import u6.x;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements e {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3150e = s.f("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public t0 f3151a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3152b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final h f3153c = new h();

    /* renamed from: d, reason: collision with root package name */
    public s0 f3154d;

    public static class a {
        public static int a(JobParameters jobParameters) {
            int stopReason = jobParameters.getStopReason();
            String str = SystemJobService.f3150e;
            switch (stopReason) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return stopReason;
                default:
                    return -512;
            }
        }
    }

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(n.d("Cannot invoke ", str, " on a background thread"));
        }
    }

    public static j c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // u6.e
    public final void b(j jVar, boolean z10) {
        a("onExecuted");
        s.d().a(f3150e, jVar.f5006a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.f3152b.remove(jVar);
        this.f3153c.c(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            t0 t0VarB = t0.b(getApplicationContext());
            this.f3151a = t0VarB;
            r rVar = t0VarB.f29341f;
            this.f3154d = new s0(rVar, t0VarB.f29339d);
            rVar.a(this);
        } catch (IllegalStateException e10) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
            }
            s.d().g(f3150e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        t0 t0Var = this.f3151a;
        if (t0Var != null) {
            t0Var.f29341f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        t0 t0Var = this.f3151a;
        String str = f3150e;
        if (t0Var == null) {
            s.d().a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j jVarC = c(jobParameters);
        if (jVarC == null) {
            s.d().b(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.f3152b;
        if (map.containsKey(jVarC)) {
            s.d().a(str, "Job is already being executed by SystemJobService: " + jVarC);
            return false;
        }
        s.d().a(str, "onStartJob for " + jVarC);
        map.put(jVarC, jobParameters);
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (jobParameters.getTriggeredContentUris() != null) {
            aVar.f3115b = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            aVar.f3114a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        jobParameters.getNetwork();
        this.f3154d.c(this.f3153c.d(jVarC), aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.f3151a == null) {
            s.d().a(f3150e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j jVarC = c(jobParameters);
        if (jVarC == null) {
            s.d().b(f3150e, "WorkSpec id not found!");
            return false;
        }
        s.d().a(f3150e, "onStopJob for " + jVarC);
        this.f3152b.remove(jVarC);
        x xVarC = this.f3153c.c(jVarC);
        if (xVarC != null) {
            int iA = Build.VERSION.SDK_INT >= 31 ? a.a(jobParameters) : -512;
            s0 s0Var = this.f3154d;
            s0Var.getClass();
            s0Var.a(xVarC, iA);
        }
        r rVar = this.f3151a.f29341f;
        String str = jVarC.f5006a;
        synchronized (rVar.f29326k) {
            zContains = rVar.f29324i.contains(str);
        }
        return !zContains;
    }
}
