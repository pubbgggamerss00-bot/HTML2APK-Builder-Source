package com.basitce.htmltoapk.util;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.controllers.identityauth.createpassword.c;
import java.util.List;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class LauncherNameJob extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5831a = 0;

    public static final class a {
        public static void a(Context context) {
            r.e(context, "context");
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService(JobScheduler.class);
            if (jobScheduler != null && jobScheduler.getPendingJob(19534) == null) {
                try {
                    jobScheduler.schedule(new JobInfo.Builder(19534, new ComponentName(context, (Class<?>) LauncherNameJob.class)).setMinimumLatency(60000L).setBackoffCriteria(60000L, 0).build());
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters params) {
        r.e(params, "params");
        List<String> list = com.basitce.htmltoapk.util.a.f5832a;
        Context applicationContext = getApplicationContext();
        r.d(applicationContext, "getApplicationContext(...)");
        if (com.basitce.htmltoapk.util.a.f5834c > 0) {
            new Handler(Looper.getMainLooper()).post(new c(1, this, params));
            return true;
        }
        com.basitce.htmltoapk.util.a.a(applicationContext);
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters params) {
        r.e(params, "params");
        return true;
    }
}
