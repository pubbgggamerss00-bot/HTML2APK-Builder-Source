package s;

/* loaded from: classes.dex */
public final class r2 implements t {

    /* renamed from: a, reason: collision with root package name */
    public final g0[] f23915a;

    public r2(float f10, float f11, s sVar) {
        int iB = sVar.b();
        g0[] g0VarArr = new g0[iB];
        for (int i10 = 0; i10 < iB; i10++) {
            g0VarArr[i10] = new g0(f10, f11, sVar.a(i10));
        }
        this.f23915a = g0VarArr;
    }

    @Override // s.t
    public final f0 get(int i10) {
        return this.f23915a[i10];
    }
}
