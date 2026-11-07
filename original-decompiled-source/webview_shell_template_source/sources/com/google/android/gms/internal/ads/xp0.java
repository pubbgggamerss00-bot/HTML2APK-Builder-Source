package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xp0 implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final fp0 f10659a;

    /* renamed from: b, reason: collision with root package name */
    public final tp0 f10660b;

    public xp0(fp0 fp0Var, tp0 tp0Var) {
        this.f10659a = fp0Var;
        this.f10660b = tp0Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
        int y2;
        fp0 fp0Var;
        int iZza;
        try {
            if (this.f10659a != null) {
                int i6 = -1;
                if (Math.abs(f6) > Math.abs(f7)) {
                    if (f6 > 0.0f) {
                        y2 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f6) * 1000.0f);
                        i6 = 1;
                    } else if (f6 < 0.0f) {
                        y2 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f6) * 1000.0f);
                        i6 = 2;
                    } else {
                        y2 = 0;
                    }
                    fp0Var = this.f10659a;
                    synchronized (fp0Var) {
                        iZza = fp0Var.f4750l.zza();
                    }
                    if (i6 == iZza) {
                        this.f10659a.d(this.f10660b.f9359u, y2);
                        return false;
                    }
                } else {
                    if (f7 > 0.0f) {
                        y2 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f7) * 1000.0f);
                        i6 = 8;
                    } else if (f7 < 0.0f) {
                        y2 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f7) * 1000.0f);
                        i6 = 4;
                    }
                    fp0Var = this.f10659a;
                    synchronized (fp0Var) {
                    }
                }
            }
            return false;
        } finally {
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
