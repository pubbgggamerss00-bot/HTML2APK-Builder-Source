package x6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.r;
import t6.s;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f32172a;

    static {
        String strF = s.f("SystemJobScheduler");
        r.d(strF, "tagWithPrefix(\"SystemJobScheduler\")");
        f32172a = strF;
    }

    public static final List<JobInfo> a(JobScheduler jobScheduler) {
        r.e(jobScheduler, "<this>");
        try {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            r.d(allPendingJobs, "jobScheduler.allPendingJobs");
            return allPendingJobs;
        } catch (Throwable th2) {
            s.d().c(f32172a, "getAllPendingJobs() is not reliable on this device.", th2);
            return null;
        }
    }

    public static final JobScheduler b(Context context) {
        r.e(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        r.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        r.d(jobSchedulerForNamespace, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        return jobSchedulerForNamespace;
    }
}
