package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n92 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7352a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7353b;

    /* renamed from: c, reason: collision with root package name */
    public int f7354c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f7355d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f7356e;

    /* renamed from: f, reason: collision with root package name */
    public int f7357f;

    /* renamed from: g, reason: collision with root package name */
    public int f7358g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f7359i;

    /* renamed from: j, reason: collision with root package name */
    public final o82 f7360j;

    public n92() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f7359i = cryptoInfo;
        this.f7360j = j31.f5914a >= 24 ? new o82(cryptoInfo) : null;
    }

    public final void a(int i6) {
        if (i6 == 0) {
            return;
        }
        if (this.f7355d == null) {
            int[] iArr = new int[1];
            this.f7355d = iArr;
            this.f7359i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f7355d;
        iArr2[0] = iArr2[0] + i6;
    }
}
