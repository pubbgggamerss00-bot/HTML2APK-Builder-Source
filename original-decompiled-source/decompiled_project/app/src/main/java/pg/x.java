package pg;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class x implements Comparable<x> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f21487b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f21488a;

    public static final class a {
    }

    @Override // java.lang.Comparable
    public final int compareTo(x xVar) {
        return kotlin.jvm.internal.r.f(this.f21488a ^ PKIFailureInfo.systemUnavail, xVar.f21488a ^ PKIFailureInfo.systemUnavail);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f21488a == ((x) obj).f21488a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21488a);
    }

    public final String toString() {
        return String.valueOf(this.f21488a & BodyPartID.bodyIdMax);
    }
}
