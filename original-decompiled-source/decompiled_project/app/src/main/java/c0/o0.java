package c0;

import c0.v0;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f4463a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4464b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4465c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f4466d;

    /* renamed from: e, reason: collision with root package name */
    public final v0 f4467e;

    public o0(s0 s0Var, int i10, int i11, a0 a0Var, v0 v0Var) {
        this.f4463a = s0Var;
        this.f4464b = i10;
        this.f4465c = i11;
        this.f4466d = a0Var;
        this.f4467e = v0Var;
    }

    public final long a(int i10, int i11) {
        int i12;
        s0 s0Var = this.f4463a;
        int[] iArr = s0Var.f4480a;
        if (i11 == 1) {
            i12 = iArr[i10];
        } else {
            int i13 = (i11 + i10) - 1;
            int[] iArr2 = s0Var.f4481b;
            i12 = (iArr2[i13] + iArr[i13]) - iArr2[i10];
        }
        if (i12 < 0) {
            i12 = 0;
        }
        if (i12 < 0) {
            f3.l.a("width must be >= 0");
        }
        return f3.c.h(i12, i12, 0, Integer.MAX_VALUE);
    }

    public abstract n0 b(int i10, m0[] m0VarArr, List<c> list, int i11);

    public final n0 c(int i10) {
        v0.c cVarB = this.f4467e.b(i10);
        int i11 = cVarB.f4500a;
        List<c> list = cVarB.f4501b;
        int size = list.size();
        int i12 = (size == 0 || i11 + size == this.f4464b) ? 0 : this.f4465c;
        m0[] m0VarArr = new m0[size];
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            int i15 = (int) list.get(i14).f4355a;
            m0 m0VarB = this.f4466d.b(i11 + i14, i13, i15, i12, a(i13, i15));
            i13 += i15;
            pg.f0 f0Var = pg.f0.f21461a;
            m0VarArr[i14] = m0VarB;
        }
        return b(i10, m0VarArr, list, i12);
    }
}
