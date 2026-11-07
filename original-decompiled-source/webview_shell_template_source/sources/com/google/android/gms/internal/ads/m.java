package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: w, reason: collision with root package name */
    public static final m f6889w = new m();
    public volatile long s = -9223372036854775807L;

    /* renamed from: t, reason: collision with root package name */
    public final Handler f6890t;

    /* renamed from: u, reason: collision with root package name */
    public Choreographer f6891u;

    /* renamed from: v, reason: collision with root package name */
    public int f6892v;

    public m() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f6890t = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        this.s = j6;
        Choreographer choreographer = this.f6891u;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i6 = message.what;
        if (i6 == 1) {
            try {
                this.f6891u = Choreographer.getInstance();
            } catch (RuntimeException e6) {
                qs0.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e6);
            }
            return true;
        }
        if (i6 == 2) {
            Choreographer choreographer = this.f6891u;
            if (choreographer != null) {
                int i7 = this.f6892v + 1;
                this.f6892v = i7;
                if (i7 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i6 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f6891u;
        if (choreographer2 != null) {
            int i8 = this.f6892v - 1;
            this.f6892v = i8;
            if (i8 == 0) {
                choreographer2.removeFrameCallback(this);
                this.s = -9223372036854775807L;
            }
        }
        return true;
    }
}
