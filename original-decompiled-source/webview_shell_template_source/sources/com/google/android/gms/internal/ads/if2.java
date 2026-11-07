package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class if2 implements wf2 {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f5739a;

    /* renamed from: b, reason: collision with root package name */
    public final mf2 f5740b;

    /* renamed from: c, reason: collision with root package name */
    public final xf2 f5741c;

    /* renamed from: d, reason: collision with root package name */
    public final tf2 f5742d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5743e;

    /* renamed from: f, reason: collision with root package name */
    public int f5744f = 0;

    public /* synthetic */ if2(MediaCodec mediaCodec, HandlerThread handlerThread, xf2 xf2Var, tf2 tf2Var) {
        this.f5739a = mediaCodec;
        this.f5740b = new mf2(handlerThread);
        this.f5741c = xf2Var;
        this.f5742d = tf2Var;
    }

    public static void l(if2 if2Var, MediaFormat mediaFormat, Surface surface, int i6) {
        tf2 tf2Var;
        LoudnessCodecController loudnessCodecController;
        mf2 mf2Var = if2Var.f5740b;
        MediaCodec mediaCodec = if2Var.f5739a;
        HandlerThread handlerThread = mf2Var.f7127b;
        y5.r(mf2Var.f7128c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(mf2Var, handler);
        mf2Var.f7128c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i6);
        Trace.endSection();
        if2Var.f5741c.zzh();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (j31.f5914a >= 35 && (tf2Var = if2Var.f5742d) != null && ((loudnessCodecController = tf2Var.f9268b) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            y5.r(tf2Var.f9267a.add(mediaCodec));
        }
        if2Var.f5744f = 1;
    }

    public static String m(int i6, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i6 == 1) {
            sb.append("Audio");
        } else if (i6 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i6);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final ByteBuffer a(int i6) {
        return this.f5739a.getOutputBuffer(i6);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final ByteBuffer b(int i6) {
        return this.f5739a.getInputBuffer(i6);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void c(int i6, n92 n92Var, long j6) {
        this.f5741c.c(i6, n92Var, j6);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void d(Surface surface) {
        this.f5739a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void e(int i6, int i7, long j6, int i8) {
        this.f5741c.b(i6, i7, j6, i8);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void f(int i6, long j6) {
        this.f5739a.releaseOutputBuffer(i6, j6);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final boolean g(aa1 aa1Var) {
        synchronized (this.f5740b.f7126a) {
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void h(int i6) {
        this.f5739a.setVideoScalingMode(i6);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        this.f5741c.zzc();
        mf2 mf2Var = this.f5740b;
        synchronized (mf2Var.f7126a) {
            try {
                IllegalStateException illegalStateException = mf2Var.f7138n;
                if (illegalStateException != null) {
                    mf2Var.f7138n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = mf2Var.f7134j;
                if (codecException != null) {
                    mf2Var.f7134j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = mf2Var.f7135k;
                if (cryptoException != null) {
                    mf2Var.f7135k = null;
                    throw cryptoException;
                }
                if (mf2Var.f7136l > 0 || mf2Var.f7137m) {
                    return -1;
                }
                e1.c cVar = mf2Var.f7130e;
                int i6 = cVar.f12775a;
                int i7 = cVar.f12776b;
                if (i6 == i7) {
                    return -1;
                }
                if (i6 == i7) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i8 = ((int[]) cVar.f12778d)[i6];
                cVar.f12775a = cVar.f12777c & (i6 + 1);
                if (i8 >= 0) {
                    y5.k(mf2Var.h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) mf2Var.f7131f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i8 == -2) {
                    mf2Var.h = (MediaFormat) mf2Var.f7132g.remove();
                    i8 = -2;
                }
                return i8;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void j(int i6) {
        this.f5739a.releaseOutputBuffer(i6, false);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void k(Bundle bundle) {
        this.f5741c.a(bundle);
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final int zza() {
        this.f5741c.zzc();
        mf2 mf2Var = this.f5740b;
        synchronized (mf2Var.f7126a) {
            try {
                IllegalStateException illegalStateException = mf2Var.f7138n;
                if (illegalStateException != null) {
                    mf2Var.f7138n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = mf2Var.f7134j;
                if (codecException != null) {
                    mf2Var.f7134j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = mf2Var.f7135k;
                if (cryptoException != null) {
                    mf2Var.f7135k = null;
                    throw cryptoException;
                }
                int i6 = -1;
                if (mf2Var.f7136l > 0 || mf2Var.f7137m) {
                    return -1;
                }
                e1.c cVar = mf2Var.f7129d;
                int i7 = cVar.f12775a;
                int i8 = cVar.f12776b;
                if (!(i7 == i8)) {
                    if (i7 == i8) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i6 = ((int[]) cVar.f12778d)[i7];
                    cVar.f12775a = (i7 + 1) & cVar.f12777c;
                }
                return i6;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        mf2 mf2Var = this.f5740b;
        synchronized (mf2Var.f7126a) {
            try {
                mediaFormat = mf2Var.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void zzi() {
        this.f5739a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void zzj() {
        this.f5741c.zzb();
        this.f5739a.flush();
        mf2 mf2Var = this.f5740b;
        synchronized (mf2Var.f7126a) {
            mf2Var.f7136l++;
            Handler handler = mf2Var.f7128c;
            int i6 = j31.f5914a;
            handler.post(new t(15, mf2Var));
        }
        this.f5739a.start();
    }

    @Override // com.google.android.gms.internal.ads.wf2
    public final void zzm() {
        tf2 tf2Var;
        tf2 tf2Var2;
        tf2 tf2Var3;
        try {
            try {
                if (this.f5744f == 1) {
                    this.f5741c.zzg();
                    mf2 mf2Var = this.f5740b;
                    synchronized (mf2Var.f7126a) {
                        mf2Var.f7137m = true;
                        mf2Var.f7127b.quit();
                        mf2Var.a();
                    }
                }
                this.f5744f = 2;
                if (this.f5743e) {
                    return;
                }
                int i6 = j31.f5914a;
                if (i6 >= 30 && i6 < 33) {
                    this.f5739a.stop();
                }
                if (i6 >= 35 && (tf2Var3 = this.f5742d) != null) {
                    tf2Var3.a(this.f5739a);
                }
                this.f5739a.release();
                this.f5743e = true;
            } catch (Throwable th) {
                if (!this.f5743e) {
                    int i7 = j31.f5914a;
                    if (i7 >= 30 && i7 < 33) {
                        this.f5739a.stop();
                    }
                    if (i7 >= 35 && (tf2Var2 = this.f5742d) != null) {
                        tf2Var2.a(this.f5739a);
                    }
                    this.f5739a.release();
                    this.f5743e = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (j31.f5914a >= 35 && (tf2Var = this.f5742d) != null) {
                tf2Var.a(this.f5739a);
            }
            this.f5739a.release();
            this.f5743e = true;
            throw th2;
        }
    }
}
