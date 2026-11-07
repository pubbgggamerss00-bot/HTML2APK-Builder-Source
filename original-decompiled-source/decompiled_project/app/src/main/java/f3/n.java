package f3;

import androidx.datastore.preferences.protobuf.a1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final n f8821e = new n(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f8822a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8823b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8824c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8825d;

    public n(int i10, int i11, int i12, int i13) {
        this.f8822a = i10;
        this.f8823b = i11;
        this.f8824c = i12;
        this.f8825d = i13;
    }

    public final long a() {
        return (((b() / 2) + this.f8823b) & BodyPartID.bodyIdMax) | (((d() / 2) + this.f8822a) << 32);
    }

    public final int b() {
        return this.f8825d - this.f8823b;
    }

    public final long c() {
        return (this.f8822a << 32) | (this.f8823b & BodyPartID.bodyIdMax);
    }

    public final int d() {
        return this.f8824c - this.f8822a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f8822a == nVar.f8822a && this.f8823b == nVar.f8823b && this.f8824c == nVar.f8824c && this.f8825d == nVar.f8825d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8825d) + a1.a(this.f8824c, a1.a(this.f8823b, Integer.hashCode(this.f8822a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f8822a);
        sb.append(", ");
        sb.append(this.f8823b);
        sb.append(", ");
        sb.append(this.f8824c);
        sb.append(", ");
        return b.b.a(sb, this.f8825d, ')');
    }
}
