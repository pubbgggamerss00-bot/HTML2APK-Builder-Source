package x9;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import x9.e;

/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33474a;

    /* renamed from: b, reason: collision with root package name */
    public final y9.d f33475b;

    /* renamed from: c, reason: collision with root package name */
    public final e f33476c;

    public d(Context context, y9.d dVar, e eVar) {
        this.f33474a = context;
        this.f33475b = dVar;
        this.f33476c = eVar;
    }

    @Override // x9.w
    public final void a(r9.r rVar, int i10, boolean z10) {
        Context context = this.f33474a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(rVar.a().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(ba.a.a(rVar.c())).array());
        if (rVar.b() != null) {
            adler32.update(rVar.b());
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        v9.a.a(rVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        long jT = this.f33475b.T(rVar);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        o9.c cVarC = rVar.c();
        e eVar = this.f33476c;
        builder.setMinimumLatency(eVar.b(cVarC, jT, i10));
        Set<e.b> setB = eVar.c().get(cVarC).b();
        if (setB.contains(e.b.f33477a)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setB.contains(e.b.f33479c)) {
            builder.setRequiresCharging(true);
        }
        if (setB.contains(e.b.f33478b)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", rVar.a());
        persistableBundle.putInt("priority", ba.a.a(rVar.c()));
        if (rVar.b() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(rVar.b(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {rVar, Integer.valueOf(value), Long.valueOf(eVar.b(rVar.c(), jT, i10)), Long.valueOf(jT), Integer.valueOf(i10)};
        String strConcat = "TRuntime.".concat("JobInfoScheduler");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }

    @Override // x9.w
    public final void b(r9.r rVar, int i10) {
        a(rVar, i10, false);
    }
}
