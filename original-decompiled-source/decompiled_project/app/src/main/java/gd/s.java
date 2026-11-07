package gd;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class s implements sc.n {

    /* renamed from: a, reason: collision with root package name */
    public final dd.a f11991a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11992b;

    public s(dd.a aVar, int i10) throws GeneralSecurityException {
        this.f11991a = aVar;
        this.f11992b = i10;
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(i10, new byte[0]);
    }

    @Override // sc.n
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // sc.n
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        return this.f11991a.a(this.f11992b, bArr);
    }
}
