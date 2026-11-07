package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cu1 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f3664a = null;

    /* renamed from: b, reason: collision with root package name */
    public Integer f3665b = null;

    /* renamed from: c, reason: collision with root package name */
    public Integer f3666c = null;

    /* renamed from: d, reason: collision with root package name */
    public Integer f3667d = null;

    /* renamed from: e, reason: collision with root package name */
    public du1 f3668e = null;

    /* renamed from: f, reason: collision with root package name */
    public eu1 f3669f = eu1.f4403w;

    public final void a(int i6) {
        if (i6 != 16 && i6 != 24 && i6 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i6)));
        }
        this.f3664a = Integer.valueOf(i6);
    }

    public final void b(int i6) {
        if (i6 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i6)));
        }
        this.f3665b = Integer.valueOf(i6);
    }

    public final void c(int i6) {
        if (i6 < 12 || i6 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i6)));
        }
        this.f3666c = Integer.valueOf(i6);
    }

    public final void d(int i6) {
        if (i6 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i6)));
        }
        this.f3667d = Integer.valueOf(i6);
    }

    public final fu1 e() {
        if (this.f3664a == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.f3665b == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.f3666c == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.f3667d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f3668e == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        int iIntValue = num.intValue();
        du1 du1Var = this.f3668e;
        if (du1Var == du1.f4031c) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (du1Var == du1.f4032d) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (du1Var == du1.f4033e) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (du1Var == du1.f4034f) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (du1Var != du1.f4035g) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new fu1(this.f3664a.intValue(), this.f3665b.intValue(), this.f3666c.intValue(), this.f3667d.intValue(), this.f3669f, this.f3668e);
    }
}
