package t2;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f27837b = k0.a(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f27838c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f27839a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean b(long j10) {
        return ((int) (j10 >> 32)) == ((int) (j10 & BodyPartID.bodyIdMax));
    }

    public static final int c(long j10) {
        return d(j10) - e(j10);
    }

    public static final int d(long j10) {
        return Math.max((int) (j10 >> 32), (int) (j10 & BodyPartID.bodyIdMax));
    }

    public static final int e(long j10) {
        return Math.min((int) (j10 >> 32), (int) (j10 & BodyPartID.bodyIdMax));
    }

    public static final boolean f(long j10) {
        return ((int) (j10 >> 32)) > ((int) (j10 & BodyPartID.bodyIdMax));
    }

    public static String g(long j10) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j10 >> 32));
        sb.append(", ");
        return b.b.a(sb, (int) (j10 & BodyPartID.bodyIdMax), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            return this.f27839a == ((j0) obj).f27839a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27839a);
    }

    public final String toString() {
        return g(this.f27839a);
    }
}
