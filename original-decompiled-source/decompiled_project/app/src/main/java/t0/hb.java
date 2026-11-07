package t0;

/* loaded from: classes.dex */
public final class hb {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26014a;

    /* renamed from: b, reason: collision with root package name */
    public final u0.a0<ib> f26015b;

    public hb(boolean z10, f3.d dVar, ib ibVar, eh.l lVar) {
        this.f26014a = z10;
        if (z10 && ibVar == ib.f26110c) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        this.f26015b = new u0.a0<>(ibVar, new k3.f(dVar, 1), new gb(dVar), db.f25689b, lVar);
    }

    public static Object a(hb hbVar, ib ibVar, vg.i iVar) {
        u0.a0<ib> a0Var = hbVar.f26015b;
        Object objB = androidx.compose.material3.internal.a.b(a0Var, ibVar, a0Var.f28951k.getFloatValue(), iVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }

    public final Object b(vg.i iVar) {
        Object objA = a(this, ib.f26108a, iVar);
        return objA == ug.a.f29706a ? objA : pg.f0.f21461a;
    }

    public final boolean c() {
        return this.f26015b.f28947g.getValue() != ib.f26108a;
    }

    public final Object d(vg.i iVar) {
        if (this.f26014a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object objA = a(this, ib.f26110c, iVar);
        return objA == ug.a.f29706a ? objA : pg.f0.f21461a;
    }
}
