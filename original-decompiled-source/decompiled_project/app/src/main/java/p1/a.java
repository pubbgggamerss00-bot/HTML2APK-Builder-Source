package p1;

import org.bouncycastle.asn1.cmc.BodyPartID;
import x0.d3;
import z.z0;

/* loaded from: classes.dex */
public final class a {
    public static long a(float f10) {
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & BodyPartID.bodyIdMax);
    }

    public static long b(long j10, z0 z0Var) {
        z0 z0Var2 = z0.f34696a;
        return f3.c.a(z0Var == z0Var2 ? f3.b.k(j10) : f3.b.j(j10), z0Var == z0Var2 ? f3.b.i(j10) : f3.b.h(j10), z0Var == z0Var2 ? f3.b.j(j10) : f3.b.k(j10), z0Var == z0Var2 ? f3.b.h(j10) : f3.b.i(j10));
    }

    public static long c(int i10, long j10) {
        return f3.c.a(0, f3.b.i(j10), (i10 & 4) != 0 ? f3.b.j(j10) : 0, f3.b.h(j10));
    }

    public static final void d(d3 d3Var, x0.d dVar, int i10) {
        while (true) {
            int i11 = d3Var.f31653v;
            if (i10 > i11 && i10 < d3Var.f31652u) {
                return;
            }
            if (i11 == 0 && i10 == 0) {
                return;
            }
            d3Var.L();
            if (d3Var.w(d3Var.f31653v)) {
                dVar.f();
            }
            d3Var.i();
        }
    }

    public static final long e(long j10, z0 z0Var) {
        return z0Var == z0.f34696a ? f3.c.a(f3.b.k(j10), f3.b.i(j10), f3.b.j(j10), f3.b.h(j10)) : f3.c.a(f3.b.j(j10), f3.b.h(j10), f3.b.k(j10), f3.b.i(j10));
    }
}
