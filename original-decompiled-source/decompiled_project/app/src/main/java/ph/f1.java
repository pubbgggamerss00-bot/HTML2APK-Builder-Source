package ph;

/* loaded from: classes2.dex */
public abstract class f1 extends g0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f21529f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f21530c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21531d;

    /* renamed from: e, reason: collision with root package name */
    public qg.l<x0<?>> f21532e;

    @Override // ph.g0
    public final g0 G0(int i10) {
        uh.i.a(i10);
        return this;
    }

    public final void H0(boolean z10) {
        long j10 = this.f21530c - (z10 ? 4294967296L : 1L);
        this.f21530c = j10;
        if (j10 <= 0 && this.f21531d) {
            shutdown();
        }
    }

    public final void I0(x0<?> x0Var) {
        qg.l<x0<?>> lVar = this.f21532e;
        if (lVar == null) {
            lVar = new qg.l<>();
            this.f21532e = lVar;
        }
        lVar.addLast(x0Var);
    }

    public final void J0(boolean z10) {
        this.f21530c = (z10 ? 4294967296L : 1L) + this.f21530c;
        if (z10) {
            return;
        }
        this.f21531d = true;
    }

    public long K0() {
        return !L0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean L0() {
        qg.l<x0<?>> lVar = this.f21532e;
        if (lVar == null) {
            return false;
        }
        x0<?> x0VarRemoveFirst = lVar.isEmpty() ? null : lVar.removeFirst();
        if (x0VarRemoveFirst == null) {
            return false;
        }
        x0VarRemoveFirst.run();
        return true;
    }

    public void shutdown() {
    }
}
