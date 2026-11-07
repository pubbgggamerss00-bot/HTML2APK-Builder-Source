package uc;

import android.os.Build;
import gd.k;
import gd.y;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import wc.a;
import zc.w;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f29697c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f29698a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29699b;

    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return k.f11974b.f11976a.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public b(byte[] bArr) throws GeneralSecurityException {
        if (!a.EnumC0318a.f31491b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        y.a(bArr.length);
        this.f29698a = new SecretKeySpec(bArr, "AES");
        this.f29699b = true;
    }

    public static AlgorithmParameterSpec a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            int i10 = w.f35049a;
            Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
            if ((numValueOf != null ? numValueOf.intValue() : -1) <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, length);
    }
}
