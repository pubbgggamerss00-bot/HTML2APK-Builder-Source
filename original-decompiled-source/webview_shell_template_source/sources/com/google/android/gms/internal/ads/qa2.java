package com.google.android.gms.internal.ads;

import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qa2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8287a;

    /* renamed from: b, reason: collision with root package name */
    public int f8288b;

    /* renamed from: c, reason: collision with root package name */
    public int f8289c;

    /* renamed from: d, reason: collision with root package name */
    public int f8290d;

    /* renamed from: e, reason: collision with root package name */
    public int f8291e;

    /* renamed from: f, reason: collision with root package name */
    public int f8292f;

    /* renamed from: g, reason: collision with root package name */
    public int f8293g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f8294i;

    /* renamed from: j, reason: collision with root package name */
    public int f8295j;

    /* renamed from: k, reason: collision with root package name */
    public long f8296k;

    /* renamed from: l, reason: collision with root package name */
    public int f8297l;

    public final synchronized void a() {
    }

    public final String toString() {
        int i6 = this.f8287a;
        int i7 = this.f8288b;
        int i8 = this.f8289c;
        int i9 = this.f8290d;
        int i10 = this.f8291e;
        int i11 = this.f8292f;
        int i12 = this.f8293g;
        int i13 = this.h;
        int i14 = this.f8294i;
        int i15 = this.f8295j;
        long j6 = this.f8296k;
        int i16 = this.f8297l;
        Locale locale = Locale.US;
        StringBuilder sbA = androidx.camera.camera2.internal.g0.a("DecoderCounters {\n decoderInits=", i6, ",\n decoderReleases=", i7, "\n queuedInputBuffers=");
        sbA.append(i8);
        sbA.append("\n skippedInputBuffers=");
        sbA.append(i9);
        sbA.append("\n renderedOutputBuffers=");
        sbA.append(i10);
        sbA.append("\n skippedOutputBuffers=");
        sbA.append(i11);
        sbA.append("\n droppedBuffers=");
        sbA.append(i12);
        sbA.append("\n droppedInputBuffers=");
        sbA.append(i13);
        sbA.append("\n maxConsecutiveDroppedBuffers=");
        sbA.append(i14);
        sbA.append("\n droppedToKeyframeEvents=");
        sbA.append(i15);
        sbA.append("\n totalVideoFrameProcessingOffsetUs=");
        sbA.append(j6);
        sbA.append("\n videoFrameProcessingOffsetCount=");
        sbA.append(i16);
        sbA.append("\n}");
        return sbA.toString();
    }
}
