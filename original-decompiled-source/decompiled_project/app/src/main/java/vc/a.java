package vc;

import ad.b;
import gd.k;
import gd.t;
import gd.y;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class a implements sc.a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0312a f30747b = new C0312a();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f30748a;

    /* renamed from: vc.a$a, reason: collision with other inner class name */
    public class C0312a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return k.f11974b.f11976a.a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr) throws GeneralSecurityException {
        y.a(bArr.length);
        this.f30748a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec b(int i10, byte[] bArr) throws GeneralSecurityException, ClassNotFoundException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i10);
        } catch (ClassNotFoundException unused) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                return new IvParameterSpec(bArr, 0, i10);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // sc.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrA = t.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecB = b(bArrA.length, bArrA);
        C0312a c0312a = f30747b;
        c0312a.get().init(1, this.f30748a, algorithmParameterSpecB);
        if (bArr2 != null && bArr2.length != 0) {
            c0312a.get().updateAAD(bArr2);
        }
        int iDoFinal = c0312a.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(b.b(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // sc.a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecB = b(12, bArr);
        C0312a c0312a = f30747b;
        c0312a.get().init(2, this.f30748a, algorithmParameterSpecB);
        if (bArr2 != null && bArr2.length != 0) {
            c0312a.get().updateAAD(bArr2);
        }
        return c0312a.get().doFinal(bArr, 12, bArr.length - 12);
    }
}
