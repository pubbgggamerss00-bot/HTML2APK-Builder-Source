package gd;

import gd.l;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import wc.a;

/* loaded from: classes2.dex */
public final class r implements dd.a {

    /* renamed from: a, reason: collision with root package name */
    public final a f11986a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11987b;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f11988c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11989d;

    public class a extends ThreadLocal<Mac> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        public final Mac initialValue() throws InvalidKeyException {
            r rVar = r.this;
            try {
                k<l.e, Mac> kVar = k.f11975c;
                Mac macA = kVar.f11976a.a(rVar.f11987b);
                macA.init(rVar.f11988c);
                return macA;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public r(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        a aVar = new a();
        this.f11986a = aVar;
        if (!a.EnumC0318a.f31491b.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f11987b = str;
        this.f11988c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                this.f11989d = 20;
                break;
            case "HMACSHA224":
                this.f11989d = 28;
                break;
            case "HMACSHA256":
                this.f11989d = 32;
                break;
            case "HMACSHA384":
                this.f11989d = 48;
                break;
            case "HMACSHA512":
                this.f11989d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        aVar.get();
    }

    @Override // dd.a
    public final byte[] a(int i10, byte[] bArr) throws IllegalStateException, GeneralSecurityException {
        if (i10 > this.f11989d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        a aVar = this.f11986a;
        aVar.get().update(bArr);
        return Arrays.copyOf(aVar.get().doFinal(), i10);
    }
}
