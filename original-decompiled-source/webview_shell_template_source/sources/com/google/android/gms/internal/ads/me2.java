package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class me2 {

    /* renamed from: a, reason: collision with root package name */
    public final AudioTrack f7105a;

    /* renamed from: b, reason: collision with root package name */
    public final pd2 f7106b;

    /* renamed from: c, reason: collision with root package name */
    public le2 f7107c = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.le2
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            me2 me2Var = this.f6678a;
            if (me2Var.f7107c == null || audioRouting.getRoutedDevice() == null) {
                return;
            }
            me2Var.f7106b.a(audioRouting.getRoutedDevice());
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.le2] */
    public me2(AudioTrack audioTrack, pd2 pd2Var) {
        this.f7105a = audioTrack;
        this.f7106b = pd2Var;
        audioTrack.addOnRoutingChangedListener(this.f7107c, new Handler(Looper.myLooper()));
    }
}
