package c0;

import java.util.List;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4456a;

    /* renamed from: b, reason: collision with root package name */
    public final m0[] f4457b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f4458c;

    /* renamed from: d, reason: collision with root package name */
    public final List<c> f4459d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4460e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4461f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4462g;

    public n0(int i10, m0[] m0VarArr, s0 s0Var, List list, int i11) {
        this.f4456a = i10;
        this.f4457b = m0VarArr;
        this.f4458c = s0Var;
        this.f4459d = list;
        this.f4460e = i11;
        int iMax = 0;
        for (m0 m0Var : m0VarArr) {
            iMax = Math.max(iMax, m0Var.f4445o);
        }
        this.f4461f = iMax;
        int i12 = iMax + this.f4460e;
        this.f4462g = i12 >= 0 ? i12 : 0;
    }

    public final m0[] a(int i10, int i11, int i12) {
        m0[] m0VarArr = this.f4457b;
        int length = m0VarArr.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            m0 m0Var = m0VarArr[i13];
            int i16 = i14 + 1;
            int i17 = (int) this.f4459d.get(i14).f4355a;
            int i18 = i10;
            m0Var.q(i18, this.f4458c.f4481b[i15], i11, i12, this.f4456a, i15);
            pg.f0 f0Var = pg.f0.f21461a;
            i15 += i17;
            i13++;
            i10 = i18;
            i14 = i16;
        }
        return m0VarArr;
    }
}
