package t6;

import k3.d;
import t6.w;

/* loaded from: classes.dex */
public final class a0 {
    public static final x a(final c2.y tracer, final String label, final e7.a executor, final eh.a aVar) {
        kotlin.jvm.internal.r.e(tracer, "tracer");
        kotlin.jvm.internal.r.e(label, "label");
        kotlin.jvm.internal.r.e(executor, "executor");
        final androidx.lifecycle.a0 a0Var = new androidx.lifecycle.a0(0);
        k3.d.a(new d.c() { // from class: t6.y
            @Override // k3.d.c
            public final Object a(final d.a aVar2) {
                final c2.y yVar = tracer;
                final String str = label;
                final eh.a aVar3 = aVar;
                final androidx.lifecycle.a0 a0Var2 = a0Var;
                executor.execute(new Runnable() { // from class: t6.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str2 = str;
                        eh.a aVar4 = aVar3;
                        androidx.lifecycle.a0 a0Var3 = a0Var2;
                        d.a aVar5 = aVar2;
                        c2.y yVar2 = yVar;
                        yVar2.getClass();
                        boolean zB = m6.a.b();
                        if (zB) {
                            try {
                                yVar2.c(str2);
                            } finally {
                                if (zB) {
                                    yVar2.d();
                                }
                            }
                        }
                        try {
                            aVar4.invoke();
                            w.a.c cVar = w.f28060a;
                            a0Var3.i(cVar);
                            aVar5.a(cVar);
                        } catch (Throwable th2) {
                            a0Var3.i(new w.a.C0290a(th2));
                            aVar5.b(th2);
                        }
                        pg.f0 f0Var = pg.f0.f21461a;
                    }
                });
                return pg.f0.f21461a;
            }
        });
        return new x();
    }
}
