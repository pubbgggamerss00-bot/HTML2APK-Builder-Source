package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pd2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8041a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f8042b;

    /* renamed from: c, reason: collision with root package name */
    public final md2 f8043c;

    /* renamed from: d, reason: collision with root package name */
    public final od2 f8044d;

    /* renamed from: e, reason: collision with root package name */
    public final nd2 f8045e;

    /* renamed from: f, reason: collision with root package name */
    public ld2 f8046f;

    /* renamed from: g, reason: collision with root package name */
    public ck1 f8047g;
    public gy0 h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8048i;

    /* renamed from: j, reason: collision with root package name */
    public final xj1 f8049j;

    public pd2(Context context, xj1 xj1Var, gy0 gy0Var, ck1 ck1Var) {
        Context applicationContext = context.getApplicationContext();
        this.f8041a = applicationContext;
        this.f8049j = xj1Var;
        this.h = gy0Var;
        this.f8047g = ck1Var;
        int i6 = j31.f5914a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f8042b = handler;
        this.f8043c = j31.f5914a >= 23 ? new md2(this) : null;
        this.f8044d = new od2(this);
        ld2 ld2Var = ld2.f6671c;
        String str = j31.f5916c;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f8045e = uriFor != null ? new nd2(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(AudioDeviceInfo audioDeviceInfo) {
        ck1 ck1Var = this.f8047g;
        if (Objects.equals(audioDeviceInfo, ck1Var == null ? null : (AudioDeviceInfo) ck1Var.f3613t)) {
            return;
        }
        ck1 ck1Var2 = audioDeviceInfo != null ? new ck1(19, audioDeviceInfo) : null;
        this.f8047g = ck1Var2;
        b(ld2.b(this.f8041a, this.h, ck1Var2));
    }

    public final void b(ld2 ld2Var) {
        qc2 qc2Var;
        if (!this.f8048i || ld2Var.equals(this.f8046f)) {
            return;
        }
        this.f8046f = ld2Var;
        te2 te2Var = (te2) this.f8049j.f10619t;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = te2Var.T;
        if (looper != looperMyLooper) {
            String name = looper == null ? "null" : looper.getThread().getName();
            throw new IllegalStateException("Current looper (" + (looperMyLooper == null ? "null" : looperMyLooper.getThread().getName()) + ") is not the playback looper (" + name + ")");
        }
        if (ld2Var.equals(te2Var.f9255q)) {
            return;
        }
        te2Var.f9255q = ld2Var;
        xj1 xj1Var = te2Var.f9250l;
        if (xj1Var != null) {
            ve2 ve2Var = (ve2) xj1Var.f10619t;
            synchronized (ve2Var.s) {
                qc2Var = ve2Var.I;
            }
            if (qc2Var != null) {
                yj2 yj2Var = (yj2) qc2Var;
                synchronized (yj2Var.f11012c) {
                    yj2Var.f11015f.getClass();
                }
            }
        }
    }
}
