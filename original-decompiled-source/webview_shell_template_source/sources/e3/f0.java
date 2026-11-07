package e3;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f0 extends d0<Boolean> {

    /* renamed from: c, reason: collision with root package name */
    public final f<?> f12877c;

    public f0(f<?> fVar, v3.f<Boolean> fVar2) {
        super(fVar2);
        this.f12877c = fVar;
    }

    @Override // e3.w
    public final boolean f(r<?> rVar) {
        if (((a0) rVar.f12898x.get(this.f12877c)) == null) {
            return false;
        }
        throw null;
    }

    @Override // e3.w
    public final c3.d[] g(r<?> rVar) {
        if (((a0) rVar.f12898x.get(this.f12877c)) == null) {
            return null;
        }
        throw null;
    }

    @Override // e3.d0
    public final void h(r<?> rVar) {
        if (((a0) rVar.f12898x.remove(this.f12877c)) != null) {
            throw null;
        }
        v3.f<T> fVar = this.f12873b;
        Boolean bool = Boolean.FALSE;
        v3.p pVar = fVar.f14800a;
        synchronized (pVar.f14815a) {
            try {
                if (pVar.f14817c) {
                    return;
                }
                pVar.f14817c = true;
                pVar.f14819e = bool;
                pVar.f14816b.c(pVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e3.g0
    public final /* bridge */ /* synthetic */ void d(j jVar, boolean z6) {
    }
}
