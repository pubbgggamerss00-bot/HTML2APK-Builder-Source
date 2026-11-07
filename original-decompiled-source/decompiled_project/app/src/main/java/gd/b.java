package gd;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import wc.a;

/* loaded from: classes2.dex */
public final class b implements o {

    /* renamed from: d, reason: collision with root package name */
    public static final a f11937d = new a();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f11938a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11939b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11940c;

    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return k.f11974b.f11976a.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public b(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!a.EnumC0318a.f31491b.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        y.a(bArr.length);
        this.f11938a = new SecretKeySpec(bArr, "AES");
        int blockSize = f11937d.get().getBlockSize();
        this.f11940c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f11939b = i10;
    }

    @Override // gd.o
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f11939b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int length2 = bArr.length;
        int i11 = this.f11939b;
        byte[] bArr3 = new byte[length2 - i11];
        b(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
        return bArr3;
    }

    public final void b(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) throws GeneralSecurityException {
        Cipher cipher = f11937d.get();
        byte[] bArr4 = new byte[this.f11940c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f11939b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f11938a;
        if (z10) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // gd.o
    public final byte[] encrypt(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f11939b;
        if (length > Integer.MAX_VALUE - i10) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - i10));
        }
        byte[] bArr2 = new byte[bArr.length + i10];
        byte[] bArrA = t.a(i10);
        System.arraycopy(bArrA, 0, bArr2, 0, i10);
        b(bArr, 0, bArr.length, bArr2, this.f11939b, bArrA, true);
        return bArr2;
    }
}
