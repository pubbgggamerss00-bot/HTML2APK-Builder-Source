package hh;

import g7.i0;
import java.io.Serializable;
import org.bouncycastle.asn1.cmc.BodyPartID;
import zg.a;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13027a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final hh.a f13028b;

    public static final class a extends c implements Serializable {
        @Override // hh.c
        public final int a(int i10) {
            return c.f13028b.a(i10);
        }

        @Override // hh.c
        public final int b() {
            return c.f13028b.b();
        }

        @Override // hh.c
        public final int c(int i10) {
            return c.f13028b.c(i10);
        }

        @Override // hh.c
        public final int d(int i10, int i11) {
            return c.f13028b.d(0, i11);
        }

        @Override // hh.c
        public final long e() {
            return c.f13028b.e();
        }

        @Override // hh.c
        public final long f(long j10, long j11) {
            return c.f13028b.f(j10, j11);
        }

        public final float g() {
            return c.f13028b.g().nextFloat();
        }
    }

    static {
        xg.b.f33571a.getClass();
        Integer num = a.C0360a.f35074a;
        f13028b = (num == null || num.intValue() >= 34) ? new ih.a() : new b();
    }

    public abstract int a(int i10);

    public abstract int b();

    public abstract int c(int i10);

    public int d(int i10, int i11) {
        int iB;
        int i12;
        int iA;
        if (i11 <= i10) {
            throw new IllegalArgumentException(i0.b(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
        int i13 = i11 - i10;
        if (i13 > 0 || i13 == Integer.MIN_VALUE) {
            if (((-i13) & i13) == i13) {
                iA = a(31 - Integer.numberOfLeadingZeros(i13));
            } else {
                do {
                    iB = b() >>> 1;
                    i12 = iB % i13;
                } while ((i13 - 1) + (iB - i12) < 0);
                iA = i12;
            }
            return i10 + iA;
        }
        while (true) {
            int iB2 = b();
            if (i10 <= iB2 && iB2 < i11) {
                return iB2;
            }
        }
    }

    public abstract long e();

    public long f(long j10, long j11) {
        long jE;
        long j12;
        long jA;
        int iB;
        if (j11 <= j10) {
            throw new IllegalArgumentException(i0.b(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
        long j13 = j11 - j10;
        if (j13 > 0) {
            if (((-j13) & j13) == j13) {
                int i10 = (int) j13;
                int i11 = (int) (j13 >>> 32);
                if (i10 != 0) {
                    iB = a(31 - Integer.numberOfLeadingZeros(i10));
                } else if (i11 == 1) {
                    iB = b();
                } else {
                    jA = (a(31 - Integer.numberOfLeadingZeros(i11)) << 32) + (b() & BodyPartID.bodyIdMax);
                }
                jA = iB & BodyPartID.bodyIdMax;
            } else {
                do {
                    jE = e() >>> 1;
                    j12 = jE % j13;
                } while ((j13 - 1) + (jE - j12) < 0);
                jA = j12;
            }
            return j10 + jA;
        }
        while (true) {
            long jE2 = e();
            if (j10 <= jE2 && jE2 < j11) {
                return jE2;
            }
        }
    }
}
