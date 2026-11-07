package x0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31984a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31985b;

    /* renamed from: c, reason: collision with root package name */
    public int f31986c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f31987d;

    /* renamed from: e, reason: collision with root package name */
    public final p.y<q0> f31988e;

    /* renamed from: f, reason: collision with root package name */
    public final pg.s f31989f;

    public z1(ArrayList arrayList, int i10) {
        this.f31984a = arrayList;
        this.f31985b = i10;
        if (i10 < 0) {
            b2.a("Invalid start index");
        }
        this.f31987d = new ArrayList();
        p.y<q0> yVar = new p.y<>();
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            x0 x0Var = (x0) this.f31984a.get(i12);
            int i13 = x0Var.f31960c;
            int i14 = x0Var.f31961d;
            yVar.h(i13, new q0(i12, i11, i14));
            i11 += i14;
        }
        this.f31988e = yVar;
        this.f31989f = e9.w0.b(new o1.l0(this, 1));
    }

    public final boolean a(int i10, int i11) {
        int i12;
        p.y<q0> yVar = this.f31988e;
        q0 q0VarB = yVar.b(i10);
        if (q0VarB == null) {
            return false;
        }
        int i13 = q0VarB.f31876b;
        int i14 = i11 - q0VarB.f31877c;
        q0VarB.f31877c = i11;
        if (i14 == 0) {
            return true;
        }
        Object[] objArr = yVar.f20645c;
        long[] jArr = yVar.f20643a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        while (true) {
            long j10 = jArr[i15];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j10) < 128) {
                        q0 q0Var = (q0) objArr[(i15 << 3) + i17];
                        if (q0Var.f31876b >= i13 && !q0Var.equals(q0VarB) && (i12 = q0Var.f31876b + i14) >= 0) {
                            q0Var.f31876b = i12;
                        }
                    }
                    j10 >>= 8;
                }
                if (i16 != 8) {
                    return true;
                }
            }
            if (i15 == length) {
                return true;
            }
            i15++;
        }
    }
}
