package gd;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j implements sc.a {

    /* renamed from: a, reason: collision with root package name */
    public final o f11971a;

    /* renamed from: b, reason: collision with root package name */
    public final sc.n f11972b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11973c;

    public j(o oVar, sc.n nVar, int i10) {
        this.f11971a = oVar;
        this.f11972b = nVar;
        this.f11973c = i10;
    }

    @Override // sc.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrEncrypt = this.f11971a.encrypt(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return h.a(bArrEncrypt, this.f11972b.b(h.a(bArr2, bArrEncrypt, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // sc.a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f11973c;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i10, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f11972b.a(bArrCopyOfRange2, h.a(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f11971a.a(bArrCopyOfRange);
    }
}
