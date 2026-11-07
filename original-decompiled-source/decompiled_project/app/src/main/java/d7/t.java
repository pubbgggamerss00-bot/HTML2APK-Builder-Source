package d7;

import java.util.Set;
import u6.z0;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final u6.r f7400a;

    /* renamed from: b, reason: collision with root package name */
    public final u6.x f7401b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7402c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7403d;

    public t(u6.r processor, u6.x token, boolean z10, int i10) {
        kotlin.jvm.internal.r.e(processor, "processor");
        kotlin.jvm.internal.r.e(token, "token");
        this.f7400a = processor;
        this.f7401b = token;
        this.f7402c = z10;
        this.f7403d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zD;
        z0 z0VarB;
        if (this.f7402c) {
            u6.r rVar = this.f7400a;
            u6.x xVar = this.f7401b;
            int i10 = this.f7403d;
            rVar.getClass();
            String str = xVar.f29358a.f5006a;
            synchronized (rVar.f29326k) {
                z0VarB = rVar.b(str);
            }
            zD = u6.r.d(str, z0VarB, i10);
        } else {
            u6.r rVar2 = this.f7400a;
            u6.x xVar2 = this.f7401b;
            int i11 = this.f7403d;
            rVar2.getClass();
            String str2 = xVar2.f29358a.f5006a;
            synchronized (rVar2.f29326k) {
                try {
                    if (rVar2.f29321f.get(str2) != null) {
                        t6.s.d().a(u6.r.f29315l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) rVar2.f29323h.get(str2);
                        if (set != null && set.contains(xVar2)) {
                            zD = u6.r.d(str2, rVar2.b(str2), i11);
                        }
                    }
                    zD = false;
                } finally {
                }
            }
        }
        t6.s.d().a(t6.s.f("StopWorkRunnable"), "StopWorkRunnable for " + this.f7401b.f29358a.f5006a + "; Processor.stopWork = " + zD);
    }
}
