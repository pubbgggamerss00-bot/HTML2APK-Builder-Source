package p;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f20623a;

    public static long a(int i10, int i11) {
        return (i11 & BodyPartID.bodyIdMax) | (i10 << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f20623a == ((g) obj).f20623a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20623a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j10 = this.f20623a;
        sb.append((int) (j10 >> 32));
        sb.append(", ");
        return b.b.a(sb, (int) (j10 & BodyPartID.bodyIdMax), ')');
    }
}
