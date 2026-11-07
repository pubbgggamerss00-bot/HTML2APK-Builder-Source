package d2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f7319a;

    /* renamed from: b, reason: collision with root package name */
    public float f7320b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7319a == aVar.f7319a && Float.compare(this.f7320b, aVar.f7320b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7320b) + (Long.hashCode(this.f7319a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f7319a);
        sb.append(", dataPoint=");
        return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f7320b, ')');
    }
}
