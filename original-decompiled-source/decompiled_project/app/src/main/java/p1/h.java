package p1;

import b8.n;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f21143a;

    public /* synthetic */ h(long j10) {
        this.f21143a = j10;
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
    }

    public static final float c(long j10) {
        return Math.min(Float.intBitsToFloat((int) ((j10 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j10 & 2147483647L)));
    }

    public static final float d(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final boolean e(long j10) {
        long j11 = (~((((-9223372034707292160L) & j10) >>> 31) * (-1))) & j10;
        return (((j11 & BodyPartID.bodyIdMax) & (j11 >>> 32)) == 0) | (j10 == 9205357640488583168L);
    }

    public static String f(long j10) {
        if (j10 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + n.e(Float.intBitsToFloat((int) (j10 >> 32))) + ", " + n.e(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f21143a == ((h) obj).f21143a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21143a);
    }

    public final String toString() {
        return f(this.f21143a);
    }
}
