package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ce2 {

    /* renamed from: a, reason: collision with root package name */
    public final be2 f3544a;

    /* renamed from: b, reason: collision with root package name */
    public int f3545b;

    /* renamed from: c, reason: collision with root package name */
    public long f3546c;

    /* renamed from: d, reason: collision with root package name */
    public long f3547d;

    /* renamed from: e, reason: collision with root package name */
    public long f3548e;

    /* renamed from: f, reason: collision with root package name */
    public long f3549f;

    public ce2(AudioTrack audioTrack) {
        this.f3544a = new be2(audioTrack);
        a(0);
    }

    public final void a(int i6) {
        this.f3545b = i6;
        long j6 = 10000;
        if (i6 == 0) {
            this.f3548e = 0L;
            this.f3549f = -1L;
            this.f3546c = System.nanoTime() / 1000;
        } else {
            if (i6 == 1) {
                this.f3547d = 10000L;
                return;
            }
            j6 = (i6 == 2 || i6 == 3) ? 10000000L : 500000L;
        }
        this.f3547d = j6;
    }
}
