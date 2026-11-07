package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lg2 implements kg2 {
    @Override // com.google.android.gms.internal.ads.kg2
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.kg2
    public final boolean b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.kg2
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.kg2
    public final MediaCodecInfo zzb(int i6) {
        return MediaCodecList.getCodecInfoAt(i6);
    }

    @Override // com.google.android.gms.internal.ads.kg2
    public final boolean zze() {
        return false;
    }
}
