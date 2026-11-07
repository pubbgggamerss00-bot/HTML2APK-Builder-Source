package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l70 {

    /* renamed from: a, reason: collision with root package name */
    public final AudioAttributes f6595a;

    public /* synthetic */ l70() {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i6 = j31.f5914a;
        if (i6 >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (i6 >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.f6595a = usage.build();
    }
}
