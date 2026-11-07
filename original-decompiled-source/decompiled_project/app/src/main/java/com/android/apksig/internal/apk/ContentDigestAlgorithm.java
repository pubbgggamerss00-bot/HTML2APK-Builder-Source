package com.android.apksig.internal.apk;

/* loaded from: classes.dex */
public enum ContentDigestAlgorithm {
    CHUNKED_SHA256(1, "SHA-256", 32),
    CHUNKED_SHA512(2, "SHA-512", 64),
    VERITY_CHUNKED_SHA256(3, "SHA-256", 32),
    SHA256(4, "SHA-256", 32);

    private final int mChunkDigestOutputSizeBytes;
    private final int mId;
    private final String mJcaMessageDigestAlgorithm;

    ContentDigestAlgorithm(int i10, String str, int i11) {
        this.mId = i10;
        this.mJcaMessageDigestAlgorithm = str;
        this.mChunkDigestOutputSizeBytes = i11;
    }

    public int getChunkDigestOutputSizeBytes() {
        return this.mChunkDigestOutputSizeBytes;
    }

    public int getId() {
        return this.mId;
    }

    public String getJcaMessageDigestAlgorithm() {
        return this.mJcaMessageDigestAlgorithm;
    }
}
