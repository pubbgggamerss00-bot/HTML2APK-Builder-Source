package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class x0 implements u0, f3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f3.d f30115a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30116b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30117c;

    /* renamed from: d, reason: collision with root package name */
    public final yh.c f30118d = new yh.c();

    public x0(f3.d dVar) {
        this.f30115a = dVar;
    }

    @Override // f3.d
    public final long E(long j10) {
        return this.f30115a.E(j10);
    }

    @Override // f3.d
    public final float G0() {
        return this.f30115a.G0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // v.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G1(vg.c cVar) {
        w0 w0Var;
        x0 x0Var;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i10 = w0Var.f30108d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                w0Var.f30108d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                w0Var = new w0(this, cVar);
            }
        }
        Object obj = w0Var.f30106b;
        ug.a aVar = ug.a.f29706a;
        int i11 = w0Var.f30108d;
        if (i11 == 0) {
            pg.q.b(obj);
            if (this.f30116b || this.f30117c) {
                x0Var = this;
                return Boolean.valueOf(x0Var.f30116b);
            }
            w0Var.f30105a = this;
            w0Var.f30108d = 1;
            if (this.f30118d.h(w0Var) == aVar) {
                return aVar;
            }
            x0Var = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x0Var = w0Var.f30105a;
            pg.q.b(obj);
        }
        x0Var.f30118d.l(null);
        return Boolean.valueOf(x0Var.f30116b);
    }

    @Override // f3.d
    public final float N0(float f10) {
        return this.f30115a.N0(f10);
    }

    @Override // f3.d
    public final int T0(long j10) {
        return this.f30115a.T0(j10);
    }

    @Override // f3.d
    public final int b1(float f10) {
        return this.f30115a.b1(f10);
    }

    @Override // f3.d
    public final float getDensity() {
        return this.f30115a.getDensity();
    }

    public final void m() {
        this.f30117c = true;
        yh.c cVar = this.f30118d;
        if (cVar.d()) {
            cVar.l(null);
        }
    }

    @Override // f3.d
    public final long o(float f10) {
        return this.f30115a.o(f10);
    }

    @Override // f3.d
    public final long p(long j10) {
        return this.f30115a.p(j10);
    }

    @Override // f3.d
    public final float q(long j10) {
        return this.f30115a.q(j10);
    }

    public final void r() {
        this.f30116b = true;
        yh.c cVar = this.f30118d;
        if (cVar.d()) {
            cVar.l(null);
        }
    }

    @Override // f3.d
    public final float r1(long j10) {
        return this.f30115a.r1(j10);
    }

    @Override // f3.d
    public final long t(float f10) {
        return this.f30115a.t(f10);
    }

    @Override // f3.d
    public final float u(int i10) {
        return this.f30115a.u(i10);
    }

    @Override // f3.d
    public final float v(float f10) {
        return this.f30115a.v(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(vg.c cVar) {
        v0 v0Var;
        x0 x0Var;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i10 = v0Var.f30100d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                v0Var.f30100d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                v0Var = new v0(this, cVar);
            }
        }
        Object obj = v0Var.f30098b;
        ug.a aVar = ug.a.f29706a;
        int i11 = v0Var.f30100d;
        if (i11 == 0) {
            pg.q.b(obj);
            v0Var.f30097a = this;
            v0Var.f30100d = 1;
            if (this.f30118d.h(v0Var) == aVar) {
                return aVar;
            }
            x0Var = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x0Var = v0Var.f30097a;
            pg.q.b(obj);
        }
        x0Var.f30116b = false;
        x0Var.f30117c = false;
        return pg.f0.f21461a;
    }
}
