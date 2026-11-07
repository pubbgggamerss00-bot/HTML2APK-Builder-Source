package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dg2 extends Exception {
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final zf2 f3933t;

    /* renamed from: u, reason: collision with root package name */
    public final String f3934u;

    public dg2(w wVar, jg2 jg2Var, int i6) {
        this("Decoder init failed: [" + i6 + "], " + wVar.toString(), jg2Var, wVar.f9978m, null, androidx.camera.camera2.internal.compat.workaround.c.d(Math.abs(i6), "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_"));
    }

    public dg2(w wVar, Exception exc, zf2 zf2Var) {
        this("Decoder init failed: " + zf2Var.f11282a + ", " + wVar.toString(), exc, wVar.f9978m, zf2Var, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : null);
    }

    public dg2(String str, Throwable th, String str2, zf2 zf2Var, String str3) {
        super(str, th);
        this.s = str2;
        this.f3933t = zf2Var;
        this.f3934u = str3;
    }
}
