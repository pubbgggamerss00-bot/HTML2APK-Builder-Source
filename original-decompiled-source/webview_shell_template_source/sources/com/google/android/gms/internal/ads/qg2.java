package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qg2 implements wf2 {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f8383a;

    /* renamed from: b, reason: collision with root package name */
    public final tf2 f8384b;

    public qg2(MediaCodec mediaCodec, tf2 tf2Var) {
        this.f8383a = mediaCodec;
        this.f8384b = tf2Var;
        if (j31.f5914a < 35 || tf2Var == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = tf2Var.f9268b;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            y5.r(tf2Var.f9267a.add(mediaCodec));
        }
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final ByteBuffer a(int i6) {
        return this.f8383a.getOutputBuffer(i6);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final ByteBuffer b(int i6) {
        return this.f8383a.getInputBuffer(i6);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void c(int i6, n92 n92Var, long j6) throws MediaCodec.CryptoException {
        this.f8383a.queueSecureInputBuffer(i6, 0, n92Var.f7359i, j6, 0);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void d(Surface surface) {
        this.f8383a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void e(int i6, int i7, long j6, int i8) throws MediaCodec.CryptoException {
        this.f8383a.queueInputBuffer(i6, 0, i7, j6, i8);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void f(int i6, long j6) {
        this.f8383a.releaseOutputBuffer(i6, j6);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final /* synthetic */ boolean g(aa1 aa1Var) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void h(int i6) {
        this.f8383a.setVideoScalingMode(i6);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f8383a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void j(int i6) {
        this.f8383a.releaseOutputBuffer(i6, false);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void k(Bundle bundle) {
        this.f8383a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final int zza() {
        return this.f8383a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final MediaFormat zzc() {
        return this.f8383a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void zzi() {
        this.f8383a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void zzj() {
        this.f8383a.flush();
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void zzm() {
        tf2 tf2Var = this.f8384b;
        MediaCodec mediaCodec = this.f8383a;
        try {
            int i6 = j31.f5914a;
            if (i6 >= 30 && i6 < 33) {
                mediaCodec.stop();
            }
            if (i6 >= 35 && tf2Var != null) {
                tf2Var.a(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (j31.f5914a >= 35 && tf2Var != null) {
                tf2Var.a(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }
}
