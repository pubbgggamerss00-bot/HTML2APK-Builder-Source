package f3;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f8818a;

    public static String a(long j10) {
        if (j10 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) h.b(Float.intBitsToFloat((int) (j10 >> 32)))) + ", " + ((Object) h.b(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f8818a == ((j) obj).f8818a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8818a);
    }

    public final String toString() {
        return a(this.f8818a);
    }
}
