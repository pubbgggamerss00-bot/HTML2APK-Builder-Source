package gd;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import uc.b;
import wc.a;

/* loaded from: classes2.dex */
public final class e implements sc.a {

    /* renamed from: a, reason: collision with root package name */
    public final uc.b f11961a;

    public e(byte[] bArr) throws GeneralSecurityException {
        if (!a.EnumC0318a.f31491b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f11961a = new uc.b(bArr);
    }

    @Override // sc.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrA = t.a(12);
        uc.b bVar = this.f11961a;
        boolean z10 = bVar.f29699b;
        if (bArrA.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[z10 ? bArr.length + 28 : bArr.length + 16];
        if (z10) {
            System.arraycopy(bArrA, 0, bArr3, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpecA = uc.b.a(bArrA);
        b.a aVar = uc.b.f29697c;
        aVar.get().init(1, bVar.f29698a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            aVar.get().updateAAD(bArr2);
        }
        int iDoFinal = aVar.get().doFinal(bArr, 0, bArr.length, bArr3, z10 ? 12 : 0);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(ad.b.b(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // sc.a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        uc.b bVar = this.f11961a;
        boolean z10 = bVar.f29699b;
        if (bArrCopyOf.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr.length < (z10 ? 28 : 16)) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (z10 && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = uc.b.a(bArrCopyOf);
        b.a aVar = uc.b.f29697c;
        aVar.get().init(2, bVar.f29698a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            aVar.get().updateAAD(bArr2);
        }
        int i10 = z10 ? 12 : 0;
        int length = bArr.length;
        if (z10) {
            length -= 12;
        }
        return aVar.get().doFinal(bArr, i10, length);
    }
}
