package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mg2 implements kg2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7154a;

    /* renamed from: b, reason: collision with root package name */
    public MediaCodecInfo[] f7155b;

    public mg2(boolean z6, boolean z7) {
        int i6 = 1;
        if (!z6 && !z7) {
            i6 = 0;
        }
        this.f7154a = i6;
    }

    @Override // com.google.android.gms.internal.ads.kg2
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.kg2
    public final boolean b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.kg2
    public final int zza() {
        if (this.f7155b == null) {
            this.f7155b = new MediaCodecList(this.f7154a).getCodecInfos();
        }
        return this.f7155b.length;
    }

    @Override // com.google.android.gms.internal.ads.kg2
    public final MediaCodecInfo zzb(int i6) {
        if (this.f7155b == null) {
            this.f7155b = new MediaCodecList(this.f7154a).getCodecInfos();
        }
        return this.f7155b[i6];
    }

    @Override // com.google.android.gms.internal.ads.kg2
    public final boolean zze() {
        return true;
    }
}
