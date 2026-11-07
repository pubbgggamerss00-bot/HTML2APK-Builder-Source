package com.android.apksig.internal.apk;

/* loaded from: classes.dex */
public class ApkSupportedSignature {
    public final SignatureAlgorithm algorithm;
    public final byte[] signature;

    public ApkSupportedSignature(SignatureAlgorithm signatureAlgorithm, byte[] bArr) {
        this.algorithm = signatureAlgorithm;
        this.signature = bArr;
    }
}
