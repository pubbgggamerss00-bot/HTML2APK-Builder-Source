package b9;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4103b;

    public /* synthetic */ t1(Object obj, int i10) {
        this.f4102a = i10;
        this.f4103b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f4102a;
        int i11 = 0;
        Object obj = this.f4103b;
        switch (i10) {
            case 0:
                ((eh.l) obj).invoke(0);
                break;
            case 1:
                ((p5.x) obj).b(new e9.n(0), e2.j.f24640c.f24627a);
                break;
            case 2:
                t8.m3 m3Var = (t8.m3) obj;
                String str = m3Var.f28315j;
                if (str == null) {
                    str = "";
                }
                m3Var.j(str);
                break;
            default:
                u6.t0 t0Var = (u6.t0) obj;
                WorkDatabase workDatabase = t0Var.f29338c;
                int i12 = Build.VERSION.SDK_INT;
                Context context = t0Var.f29336a;
                String str2 = x6.f.f32177f;
                if (i12 >= 34) {
                    x6.b.b(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListB = x6.f.b(context, jobScheduler);
                if (arrayListB != null && !arrayListB.isEmpty()) {
                    int size = arrayListB.size();
                    while (i11 < size) {
                        Object obj2 = arrayListB.get(i11);
                        i11++;
                        x6.f.a(jobScheduler, ((JobInfo) obj2).getId());
                    }
                }
                workDatabase.workSpecDao().z();
                u6.w.b(t0Var.f29337b, workDatabase, t0Var.f29340e);
                break;
        }
        return pg.f0.f21461a;
    }
}
