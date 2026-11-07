package gd;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class z implements sc.a {

    /* renamed from: a, reason: collision with root package name */
    public final uc.h f12011a;

    public z(byte[] bArr) throws GeneralSecurityException {
        this.f12011a = new uc.h(bArr);
    }

    @Override // sc.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrA = t.a(24);
        byteBufferAllocate.put(bArrA);
        this.f12011a.b(byteBufferAllocate, bArrA, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // sc.a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return this.f12011a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }
}
