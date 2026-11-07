package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rg2 implements xf2 {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f8634a;

    public rg2(MediaCodec mediaCodec) {
        this.f8634a = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.xf2
    public final void a(Bundle bundle) {
        this.f8634a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.xf2
    public final void b(int i6, int i7, long j6, int i8) throws MediaCodec.CryptoException {
        this.f8634a.queueInputBuffer(i6, 0, i7, j6, i8);
    }

    @Override // com.google.android.gms.internal.ads.xf2
    public final void c(int i6, n92 n92Var, long j6) throws MediaCodec.CryptoException {
        this.f8634a.queueSecureInputBuffer(i6, 0, n92Var.f7359i, j6, 0);
    }

    @Override // com.google.android.gms.internal.ads.xf2
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.xf2
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.xf2
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.xf2
    public final void zzh() {
    }
}
