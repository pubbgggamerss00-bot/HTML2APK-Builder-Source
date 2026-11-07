package androidx.lifecycle;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ya.b f2373a = new ya.b();

    public static final l5.a a(w0 w0Var) {
        l5.a aVar;
        kotlin.jvm.internal.r.e(w0Var, "<this>");
        synchronized (f2373a) {
            aVar = (l5.a) w0Var.d("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                tg.h hVarH0 = tg.i.f28768a;
                try {
                    wh.c cVar = ph.z0.f21632a;
                    hVarH0 = uh.o.f29764a.H0();
                } catch (IllegalStateException | pg.m unused) {
                }
                l5.a aVar2 = new l5.a(hVarH0.plus(ah.l.a()));
                w0Var.b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }
}
