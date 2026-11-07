package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fz1 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f4830a = null;

    /* renamed from: b, reason: collision with root package name */
    public Integer f4831b = null;

    /* renamed from: c, reason: collision with root package name */
    public jv1 f4832c = jv1.B;

    public final void a(int i6) {
        if (i6 != 16 && i6 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i6 * 8)));
        }
        this.f4830a = Integer.valueOf(i6);
    }

    public final void b(int i6) {
        if (i6 < 10 || i6 > 16) {
            throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Invalid tag size for AesCmacParameters: "));
        }
        this.f4831b = Integer.valueOf(i6);
    }

    public final gz1 c() throws GeneralSecurityException {
        Integer num = this.f4830a;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.f4831b != null) {
            return new gz1(num.intValue(), this.f4831b.intValue(), this.f4832c);
        }
        throw new GeneralSecurityException("tag size not set");
    }
}
