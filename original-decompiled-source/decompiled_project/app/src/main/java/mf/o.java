package mf;

import cf.u;

/* loaded from: classes2.dex */
public final class o implements jf.c {

    /* renamed from: a, reason: collision with root package name */
    public final cf.d f18221a;

    /* renamed from: b, reason: collision with root package name */
    public int f18222b = -1;

    public o() {
        cf.d dVar = new cf.d();
        this.f18221a = dVar;
        dVar.O0(cf.l.f5532w2, cf.l.I0);
    }

    @Override // jf.c
    public final cf.b Z() {
        return this.f18221a;
    }

    public final String a() {
        cf.b bVarV0 = this.f18221a.v0(cf.l.N0);
        if (bVarV0 instanceof cf.l) {
            return ((cf.l) bVarV0).f5545b;
        }
        return null;
    }

    public final g8.b b() {
        cf.d dVar = (cf.d) this.f18221a.v0(cf.l.f5498n2);
        if (dVar == null) {
            return null;
        }
        byte[] bArr = ((u) dVar.v0(cf.l.J1)).f5565b;
        if (bArr.length >= 12) {
            return new g8.b(bArr);
        }
        return null;
    }

    public final void c(int i10, boolean z10) {
        int i11 = this.f18222b;
        cf.d dVar = this.f18221a;
        if (i11 == -1) {
            this.f18222b = dVar.G0(cf.l.D0, null, 0);
        }
        int i12 = this.f18222b;
        int i13 = z10 ? i10 | i12 : (~i10) & i12;
        dVar.N0(cf.l.D0, i13);
        this.f18222b = i13;
    }

    public o(cf.d dVar) {
        this.f18221a = dVar;
    }
}
