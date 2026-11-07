package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o32 implements e02 {

    /* renamed from: a, reason: collision with root package name */
    public final n32 f7589a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7590b;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f7591c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7592d;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public o32(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        int i6;
        n32 n32Var = new n32(this);
        this.f7589a = n32Var;
        if (!aa1.j(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f7590b = str;
        this.f7591c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    i6 = 20;
                    this.f7592d = i6;
                    n32Var.get();
                    return;
                }
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    i6 = 28;
                    this.f7592d = i6;
                    n32Var.get();
                    return;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    i6 = 32;
                    this.f7592d = i6;
                    n32Var.get();
                    return;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    i6 = 48;
                    this.f7592d = i6;
                    n32Var.get();
                    return;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    i6 = 64;
                    this.f7592d = i6;
                    n32Var.get();
                    return;
                }
                break;
        }
        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
    }

    @Override // com.google.android.gms.internal.ads.e02
    public final byte[] a(int i6, byte[] bArr) throws IllegalStateException, InvalidAlgorithmParameterException {
        if (i6 > this.f7592d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        n32 n32Var = this.f7589a;
        ((Mac) n32Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) n32Var.get()).doFinal(), i6);
    }
}
