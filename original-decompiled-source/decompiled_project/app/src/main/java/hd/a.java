package hd;

import gd.m;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f12988a;

    public a(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        this.f12988a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return new a(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f12988a, this.f12988a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12988a);
    }

    public final String toString() {
        return "Bytes(" + m.b(this.f12988a) + ")";
    }
}
