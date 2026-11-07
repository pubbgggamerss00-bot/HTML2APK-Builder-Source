package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yd2 extends Exception {
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f10933t;

    /* JADX WARN: Illegal instructions before constructor call */
    public yd2(int i6, int i7, int i8, int i9, w wVar, boolean z6, RuntimeException runtimeException) {
        String strValueOf = String.valueOf(wVar);
        StringBuilder sbA = androidx.camera.camera2.internal.g0.a("AudioTrack init failed ", i6, " Config(", i7, ", ");
        sbA.append(i8);
        sbA.append(", ");
        sbA.append(i9);
        sbA.append(") ");
        sbA.append(strValueOf);
        sbA.append(true != z6 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : " (recoverable)");
        super(sbA.toString(), runtimeException);
        this.s = i6;
        this.f10933t = z6;
    }
}
