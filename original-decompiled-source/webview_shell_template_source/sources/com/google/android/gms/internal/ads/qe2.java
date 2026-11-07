package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qe2 extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ re2 f8362a;

    public qe2(re2 re2Var) {
        this.f8362a = re2Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i6) {
        audioTrack.equals(this.f8362a.f8620c.f9254p);
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f8362a.f8620c.f9254p)) {
            this.f8362a.f8620c.M = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        audioTrack.equals(this.f8362a.f8620c.f9254p);
    }
}
