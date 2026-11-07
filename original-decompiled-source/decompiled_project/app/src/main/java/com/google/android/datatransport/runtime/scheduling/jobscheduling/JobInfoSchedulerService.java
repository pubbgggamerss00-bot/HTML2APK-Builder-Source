package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import ba.a;
import l4.e;
import o9.c;
import r9.j;
import r9.u;
import x9.f;
import x9.q;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5837a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        u.b(getApplicationContext());
        if (string == null) {
            throw new NullPointerException("Null backendName");
        }
        c cVarB = a.b(i10);
        byte[] bArrDecode = string2 != null ? Base64.decode(string2, 0) : null;
        q qVar = u.a().f23319d;
        qVar.f33510e.execute(new f(qVar, new j(string, bArrDecode, cVarB), i11, new e(1, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
