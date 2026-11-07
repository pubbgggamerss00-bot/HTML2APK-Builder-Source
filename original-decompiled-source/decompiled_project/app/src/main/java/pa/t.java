package pa;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class t extends s {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f21405b;

    public t(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f21405b = bArr;
    }

    @Override // pa.s
    public final byte[] c() {
        return this.f21405b;
    }
}
