package oh;

import java.io.Serializable;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class a implements Comparable<a>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0219a f19146c = new C0219a();

    /* renamed from: d, reason: collision with root package name */
    public static final a f19147d = new a(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f19148a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19149b;

    /* renamed from: oh.a$a, reason: collision with other inner class name */
    public static final class C0219a {
    }

    public a(long j10, long j11) {
        this.f19148a = j10;
        this.f19149b = j11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        a other = aVar;
        r.e(other, "other");
        long j10 = other.f19148a;
        long j11 = this.f19148a;
        return j11 != j10 ? Long.compareUnsigned(j11, j10) : Long.compareUnsigned(this.f19149b, other.f19149b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19148a == aVar.f19148a && this.f19149b == aVar.f19149b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19148a ^ this.f19149b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        b.a(this.f19148a, bArr, 0, 0, 4);
        bArr[8] = 45;
        b.a(this.f19148a, bArr, 9, 4, 6);
        bArr[13] = 45;
        b.a(this.f19148a, bArr, 14, 6, 8);
        bArr[18] = 45;
        b.a(this.f19149b, bArr, 19, 0, 2);
        bArr[23] = 45;
        b.a(this.f19149b, bArr, 24, 2, 8);
        return new String(bArr, mh.a.f18238b);
    }
}
