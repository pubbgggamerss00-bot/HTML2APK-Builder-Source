package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c32 {

    /* renamed from: d, reason: collision with root package name */
    public static final fw1 f3388d = new fw1(1);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f3389a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3390b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3391c;

    public c32(int i6, byte[] bArr) throws GeneralSecurityException {
        if (!aa1.j(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        q32.a(bArr.length);
        this.f3389a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f3388d.get()).getBlockSize();
        this.f3391c = blockSize;
        if (i6 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f3390b = i6;
    }
}
