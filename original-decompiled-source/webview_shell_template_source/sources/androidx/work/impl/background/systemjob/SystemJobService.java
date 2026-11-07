package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.camera.camera2.internal.k0;
import androidx.camera.core.c;
import androidx.work.WorkerParameters;
import androidx.work.k;
import j2.b;
import j2.d;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* renamed from: u, reason: collision with root package name */
    public static final String f1812u = k.e("SystemJobService");
    public j2.k s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f1813t = new HashMap();

    @Override // j2.b
    public final void c(String str, boolean z6) {
        JobParameters jobParameters;
        k.c().a(f1812u, c.b(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.f1813t) {
            jobParameters = (JobParameters) this.f1813t.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z6);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            j2.k kVarB = j2.k.b(getApplicationContext());
            this.s = kVarB;
            kVarB.f13479f.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            k.c().f(f1812u, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        j2.k kVar = this.s;
        if (kVar != null) {
            kVar.f13479f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras;
        if (this.s == null) {
            k.c().a(f1812u, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            k.c().b(f1812u, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f1813t) {
            try {
                if (this.f1813t.containsKey(string)) {
                    k.c().a(f1812u, "Job is already being executed by SystemJobService: " + string, new Throwable[0]);
                    return false;
                }
                k.c().a(f1812u, "onStartJob for " + string, new Throwable[0]);
                this.f1813t.put(string, jobParameters);
                int i6 = Build.VERSION.SDK_INT;
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    aVar.f1750b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    aVar.f1749a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i6 >= 28) {
                    aVar.f1751c = jobParameters.getNetwork();
                }
                this.s.f(string, aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        PersistableBundle extras;
        if (this.s == null) {
            k.c().a(f1812u, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            k.c().b(f1812u, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        k.c().a(f1812u, k0.a("onStopJob for ", string), new Throwable[0]);
        synchronized (this.f1813t) {
            this.f1813t.remove(string);
        }
        this.s.g(string);
        d dVar = this.s.f13479f;
        synchronized (dVar.C) {
            zContains = dVar.A.contains(string);
        }
        return !zContains;
    }
}
