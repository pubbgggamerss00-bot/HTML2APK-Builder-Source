package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mf2 extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f7127b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f7128c;
    public MediaFormat h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f7133i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f7134j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f7135k;

    /* renamed from: l, reason: collision with root package name */
    public long f7136l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7137m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f7138n;

    /* renamed from: a, reason: collision with root package name */
    public final Object f7126a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final e1.c f7129d = new e1.c(1);

    /* renamed from: e, reason: collision with root package name */
    public final e1.c f7130e = new e1.c(1);

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f7131f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f7132g = new ArrayDeque();

    public mf2(HandlerThread handlerThread) {
        this.f7127b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f7132g;
        if (!arrayDeque.isEmpty()) {
            this.f7133i = (MediaFormat) arrayDeque.getLast();
        }
        e1.c cVar = this.f7129d;
        cVar.f12776b = cVar.f12775a;
        e1.c cVar2 = this.f7130e;
        cVar2.f12776b = cVar2.f12775a;
        this.f7131f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f7126a) {
            this.f7135k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f7126a) {
            this.f7134j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i6) {
        synchronized (this.f7126a) {
            this.f7129d.b(i6);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i6, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f7126a) {
            try {
                MediaFormat mediaFormat = this.f7133i;
                if (mediaFormat != null) {
                    this.f7130e.b(-2);
                    this.f7132g.add(mediaFormat);
                    this.f7133i = null;
                }
                this.f7130e.b(i6);
                this.f7131f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f7126a) {
            this.f7130e.b(-2);
            this.f7132g.add(mediaFormat);
            this.f7133i = null;
        }
    }
}
