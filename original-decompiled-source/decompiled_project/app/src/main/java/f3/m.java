package f3;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f8820a;

    public static long a(int i10, int i11, int i12, long j10) {
        if ((i12 & 1) != 0) {
            i10 = (int) (j10 >> 32);
        }
        if ((i12 & 2) != 0) {
            i11 = (int) (j10 & BodyPartID.bodyIdMax);
        }
        return (i11 & BodyPartID.bodyIdMax) | (i10 << 32);
    }

    public static final boolean b(long j10, long j11) {
        return j10 == j11;
    }

    public static final long c(long j10, long j11) {
        return ((((int) (j10 >> 32)) - ((int) (j11 >> 32))) << 32) | ((((int) (j10 & BodyPartID.bodyIdMax)) - ((int) (j11 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
    }

    public static final long d(long j10, long j11) {
        return ((((int) (j10 >> 32)) + ((int) (j11 >> 32))) << 32) | ((((int) (j10 & BodyPartID.bodyIdMax)) + ((int) (j11 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
    }

    public static String e(long j10) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j10 >> 32));
        sb.append(", ");
        return b.b.a(sb, (int) (j10 & BodyPartID.bodyIdMax), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f8820a == ((m) obj).f8820a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8820a);
    }

    public final String toString() {
        return e(this.f8820a);
    }
}
