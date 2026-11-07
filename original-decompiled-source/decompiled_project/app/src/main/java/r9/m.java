package r9;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final o9.b f23302a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f23303b;

    public m(o9.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f23302a = bVar;
        this.f23303b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f23302a.equals(mVar.f23302a)) {
            return Arrays.equals(this.f23303b, mVar.f23303b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23302a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f23303b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f23302a + ", bytes=[...]}";
    }
}
