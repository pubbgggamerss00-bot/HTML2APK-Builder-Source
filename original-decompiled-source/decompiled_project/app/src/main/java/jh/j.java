package jh;

import di.t;
import h1.y;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public class j extends t {
    public static double k(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float l(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int m(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long n(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        StringBuilder sbA = y.a("Cannot coerce value to an empty range: maximum ", " is less than minimum ", j12);
        sbA.append(j11);
        sbA.append('.');
        throw new IllegalArgumentException(sbA.toString());
    }

    public static Comparable o(Float f10, d dVar) {
        float f11 = dVar.f15743b;
        float f12 = dVar.f15742a;
        if (!dVar.a()) {
            return (!dVar.b(f10, Float.valueOf(f12)) || dVar.b(Float.valueOf(f12), f10)) ? (!dVar.b(Float.valueOf(f11), f10) || dVar.b(f10, Float.valueOf(f11))) ? f10 : Float.valueOf(f11) : Float.valueOf(f12);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + dVar + '.');
    }

    public static e p(g gVar, int i10) {
        r.e(gVar, "<this>");
        boolean z10 = i10 > 0;
        Integer numValueOf = Integer.valueOf(i10);
        if (!z10) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i11 = gVar.f15744a;
        int i12 = gVar.f15745b;
        if (gVar.f15746c <= 0) {
            i10 = -i10;
        }
        return new e(i11, i12, i10);
    }

    public static g q(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new g(i10, i11 - 1, 1);
        }
        g gVar = g.f15751d;
        return g.f15751d;
    }
}
