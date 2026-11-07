package kc;

/* loaded from: classes2.dex */
public final class n extends o {

    /* renamed from: a, reason: collision with root package name */
    public final int f16295a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16296b;

    public n(int i10, long j10) {
        this.f16295a = i10;
        this.f16296b = j10;
    }

    @Override // kc.o
    public final int a() {
        return this.f16295a;
    }

    @Override // kc.o
    public final long b() {
        return this.f16296b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f16295a == oVar.a() && this.f16296b == oVar.b();
    }

    public final int hashCode() {
        long j10 = this.f16296b;
        return ((int) ((j10 >>> 32) ^ j10)) ^ ((this.f16295a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.f16295a);
        sb.append(", eventTimestamp=");
        return com.android.apksig.internal.apk.a.a(this.f16296b, "}", sb);
    }
}
