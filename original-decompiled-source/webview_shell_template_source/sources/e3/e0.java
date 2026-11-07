package e3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e0<ResultT> extends w {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f12874b;

    /* renamed from: c, reason: collision with root package name */
    public final v3.f<ResultT> f12875c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.work.j f12876d;

    public e0(int i6, c0 c0Var, v3.f fVar, androidx.work.j jVar) {
        super(i6);
        this.f12875c = fVar;
        this.f12874b = c0Var;
        this.f12876d = jVar;
        if (i6 == 2 && c0Var.f12880b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // e3.g0
    public final void a(Status status) {
        this.f12876d.getClass();
        this.f12875c.a(status.f2400u != null ? new d3.h(status) : new d3.b(status));
    }

    @Override // e3.g0
    public final void b(Exception exc) {
        this.f12875c.a(exc);
    }

    @Override // e3.g0
    public final void c(r<?> rVar) throws DeadObjectException {
        v3.f<ResultT> fVar = this.f12875c;
        try {
            c0 c0Var = this.f12874b;
            c0Var.f12865d.f12882a.accept(rVar.f12894t, fVar);
        } catch (DeadObjectException e6) {
            throw e6;
        } catch (RemoteException e7) {
            a(g0.e(e7));
        } catch (RuntimeException e8) {
            fVar.a(e8);
        }
    }

    @Override // e3.g0
    public final void d(j jVar, boolean z6) {
        Map<v3.f<?>, Boolean> map = jVar.f12889b;
        Boolean boolValueOf = Boolean.valueOf(z6);
        v3.f<ResultT> fVar = this.f12875c;
        map.put(fVar, boolValueOf);
        v3.p pVar = fVar.f14800a;
        com.google.android.gms.ads.mediation.customevent.a aVar = new com.google.android.gms.ads.mediation.customevent.a(jVar, fVar, 14, false);
        pVar.getClass();
        pVar.f14816b.b(new v3.k(v3.g.f14801a, aVar));
        pVar.m();
    }

    @Override // e3.w
    public final boolean f(r<?> rVar) {
        return this.f12874b.f12880b;
    }

    @Override // e3.w
    public final c3.d[] g(r<?> rVar) {
        return this.f12874b.f12879a;
    }
}
