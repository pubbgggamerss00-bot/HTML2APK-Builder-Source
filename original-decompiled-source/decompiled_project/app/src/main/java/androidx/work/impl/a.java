package androidx.work.impl;

import a7.p;
import android.content.Context;
import android.content.res.Resources;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.basitce.htmltoapk.R;
import d7.s;
import e7.c;
import kotlin.jvm.internal.r;
import u6.s0;
import u6.t0;
import u6.u0;
import u6.w;
import x6.f;

/* loaded from: classes.dex */
public final class a {
    public static final t0 a(Context p02, androidx.work.a p12) throws Resources.NotFoundException {
        r.e(p02, "context");
        r.e(p12, "configuration");
        c cVar = new c(p12.f3118c);
        WorkDatabase.a aVar = WorkDatabase.Companion;
        Context applicationContext = p02.getApplicationContext();
        r.d(applicationContext, "context.applicationContext");
        s sVar = cVar.f8398a;
        r.d(sVar, "workTaskExecutor.serialTaskExecutor");
        l5.c cVar2 = p12.f3119d;
        boolean z10 = p02.getResources().getBoolean(R.bool.workmanager_test_configuration);
        aVar.getClass();
        WorkDatabase p32 = WorkDatabase.a.a(applicationContext, sVar, cVar2, z10);
        Context applicationContext2 = p02.getApplicationContext();
        r.d(applicationContext2, "context.applicationContext");
        p p42 = new p(applicationContext2, cVar);
        u6.r rVar = new u6.r(p02.getApplicationContext(), p12, cVar, p32);
        u0 schedulersCreator = u0.f29350a;
        r.e(schedulersCreator, "schedulersCreator");
        schedulersCreator.getClass();
        c p22 = cVar;
        r.e(p02, "p0");
        r.e(p12, "p1");
        r.e(p22, "p2");
        r.e(p32, "p3");
        r.e(p42, "p4");
        String str = w.f29356a;
        f fVar = new f(p02, p32, p12);
        d7.p.a(p02, SystemJobService.class, true);
        t6.s.d().a(w.f29356a, "Created SystemJobScheduler and enabled SystemJobService");
        return new t0(p02.getApplicationContext(), p12, cVar, p32, qg.p.j(fVar, new v6.c(p02, p12, p42, rVar, new s0(rVar, p22), p22)), rVar, p42);
    }
}
