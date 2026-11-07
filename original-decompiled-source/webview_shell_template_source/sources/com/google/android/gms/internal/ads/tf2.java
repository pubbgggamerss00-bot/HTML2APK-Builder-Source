package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tf2 {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f9267a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public LoudnessCodecController f9268b;

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f9267a.remove(mediaCodec) || (loudnessCodecController = this.f9268b) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }
}
