package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lf2 implements xf2 {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f6706g = new ArrayDeque();
    public static final Object h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f6707a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f6708b;

    /* renamed from: c, reason: collision with root package name */
    public jf2 f6709c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f6710d;

    /* renamed from: e, reason: collision with root package name */
    public final am0 f6711e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6712f;

    public lf2(MediaCodec mediaCodec, HandlerThread handlerThread) {
        am0 am0Var = new am0();
        this.f6707a = mediaCodec;
        this.f6708b = handlerThread;
        this.f6711e = am0Var;
        this.f6710d = new AtomicReference();
    }

    public static kf2 d() {
        ArrayDeque arrayDeque = f6706g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new kf2();
                }
                return (kf2) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xf2
    public final void a(Bundle bundle) {
        zzc();
        jf2 jf2Var = this.f6709c;
        int i6 = j31.f5914a;
        jf2Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.xf2
    public final void b(int i6, int i7, long j6, int i8) {
        zzc();
        kf2 kf2VarD = d();
        kf2VarD.f6395a = i6;
        kf2VarD.f6396b = i7;
        kf2VarD.f6398d = j6;
        kf2VarD.f6399e = i8;
        jf2 jf2Var = this.f6709c;
        int i9 = j31.f5914a;
        jf2Var.obtainMessage(1, kf2VarD).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.xf2
    public final void c(int i6, n92 n92Var, long j6) {
        int length;
        int length2;
        int length3;
        int length4;
        zzc();
        kf2 kf2VarD = d();
        kf2VarD.f6395a = i6;
        kf2VarD.f6396b = 0;
        kf2VarD.f6398d = j6;
        kf2VarD.f6399e = 0;
        MediaCodec.CryptoInfo cryptoInfo = kf2VarD.f6397c;
        cryptoInfo.numSubSamples = n92Var.f7357f;
        int[] iArr = n92Var.f7355d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < (length4 = iArr.length)) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, length4);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = n92Var.f7356e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < (length3 = iArr2.length)) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, length3);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = n92Var.f7353b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < (length2 = bArr.length)) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, length2);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = n92Var.f7352a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < (length = bArr2.length)) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = n92Var.f7354c;
        if (j31.f5914a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(n92Var.f7358g, n92Var.h));
        }
        this.f6709c.obtainMessage(2, kf2VarD).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.xf2
    public final void zzb() {
        am0 am0Var = this.f6711e;
        if (this.f6712f) {
            try {
                jf2 jf2Var = this.f6709c;
                if (jf2Var == null) {
                    throw null;
                }
                jf2Var.removeCallbacksAndMessages(null);
                synchronized (am0Var) {
                    am0Var.s = false;
                }
                jf2 jf2Var2 = this.f6709c;
                if (jf2Var2 == null) {
                    throw null;
                }
                jf2Var2.obtainMessage(3).sendToTarget();
                synchronized (am0Var) {
                    while (!am0Var.s) {
                        am0Var.wait();
                    }
                }
            } catch (InterruptedException e6) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xf2
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.f6710d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.xf2
    public final void zzg() {
        if (this.f6712f) {
            zzb();
            this.f6708b.quit();
        }
        this.f6712f = false;
    }

    @Override // com.google.android.gms.internal.ads.xf2
    public final void zzh() {
        if (this.f6712f) {
            return;
        }
        HandlerThread handlerThread = this.f6708b;
        handlerThread.start();
        this.f6709c = new jf2(this, handlerThread.getLooper());
        this.f6712f = true;
    }
}
