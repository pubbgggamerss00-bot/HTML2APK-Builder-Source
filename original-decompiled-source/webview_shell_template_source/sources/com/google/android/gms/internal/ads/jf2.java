package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jf2 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lf2 f6052a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf2(lf2 lf2Var, Looper looper) {
        super(looper);
        this.f6052a = lf2Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws MediaCodec.CryptoException {
        kf2 kf2Var;
        lf2 lf2Var = this.f6052a;
        int i6 = message.what;
        if (i6 == 1) {
            kf2Var = (kf2) message.obj;
            try {
                lf2Var.f6707a.queueInputBuffer(kf2Var.f6395a, 0, kf2Var.f6396b, kf2Var.f6398d, kf2Var.f6399e);
            } catch (RuntimeException e6) {
                ov1.a(lf2Var.f6710d, e6);
            }
        } else if (i6 != 2) {
            kf2Var = null;
            if (i6 == 3) {
                lf2Var.f6711e.b();
            } else if (i6 != 4) {
                ov1.a(lf2Var.f6710d, new IllegalStateException(String.valueOf(message.what)));
            } else {
                try {
                    lf2Var.f6707a.setParameters((Bundle) message.obj);
                } catch (RuntimeException e7) {
                    ov1.a(lf2Var.f6710d, e7);
                }
            }
        } else {
            kf2Var = (kf2) message.obj;
            int i7 = kf2Var.f6395a;
            MediaCodec.CryptoInfo cryptoInfo = kf2Var.f6397c;
            long j6 = kf2Var.f6398d;
            int i8 = kf2Var.f6399e;
            try {
                synchronized (lf2.h) {
                    lf2Var.f6707a.queueSecureInputBuffer(i7, 0, cryptoInfo, j6, i8);
                }
            } catch (RuntimeException e8) {
                ov1.a(lf2Var.f6710d, e8);
            }
        }
        if (kf2Var != null) {
            ArrayDeque arrayDeque = lf2.f6706g;
            synchronized (arrayDeque) {
                arrayDeque.add(kf2Var);
            }
        }
    }
}
