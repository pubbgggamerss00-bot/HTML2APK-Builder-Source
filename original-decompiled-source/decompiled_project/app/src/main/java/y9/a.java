package y9;

import org.bouncycastle.asn1.x509.DisplayText;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f34316f = new a(10485760, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f34317a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34318b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34319c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34320d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34321e;

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.f34317a = j10;
        this.f34318b = i10;
        this.f34319c = i11;
        this.f34320d = j11;
        this.f34321e = i12;
    }

    public final int a() {
        return this.f34319c;
    }

    public final long b() {
        return this.f34320d;
    }

    public final int c() {
        return this.f34318b;
    }

    public final int d() {
        return this.f34321e;
    }

    public final long e() {
        return this.f34317a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f34317a == aVar.e() && this.f34318b == aVar.c() && this.f34319c == aVar.a() && this.f34320d == aVar.b() && this.f34321e == aVar.d();
    }

    public final int hashCode() {
        long j10 = this.f34317a;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f34318b) * 1000003) ^ this.f34319c) * 1000003;
        long j11 = this.f34320d;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f34321e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f34317a);
        sb.append(", loadBatchSize=");
        sb.append(this.f34318b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f34319c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f34320d);
        sb.append(", maxBlobByteSizePerRow=");
        return x0.a.a(sb, this.f34321e, "}");
    }
}
