package v1;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f14797a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final g f14798b;

    /* renamed from: c, reason: collision with root package name */
    public volatile a2.e f14799c;

    public k(g gVar) {
        this.f14798b = gVar;
    }

    public final a2.e a() {
        this.f14798b.a();
        if (!this.f14797a.compareAndSet(false, true)) {
            String strB = b();
            g gVar = this.f14798b;
            gVar.a();
            gVar.b();
            return new a2.e(((a2.a) gVar.f14767c.g()).s.compileStatement(strB));
        }
        if (this.f14799c == null) {
            String strB2 = b();
            g gVar2 = this.f14798b;
            gVar2.a();
            gVar2.b();
            this.f14799c = new a2.e(((a2.a) gVar2.f14767c.g()).s.compileStatement(strB2));
        }
        return this.f14799c;
    }

    public abstract String b();

    public final void c(a2.e eVar) {
        if (eVar == this.f14799c) {
            this.f14797a.set(false);
        }
    }
}
