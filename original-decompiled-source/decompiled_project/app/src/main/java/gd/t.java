package gd;

import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11993a = new a();

    public class a extends ThreadLocal<SecureRandom> {
        @Override // java.lang.ThreadLocal
        public final SecureRandom initialValue() {
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextLong();
            return secureRandom;
        }
    }

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        f11993a.get().nextBytes(bArr);
        return bArr;
    }
}
