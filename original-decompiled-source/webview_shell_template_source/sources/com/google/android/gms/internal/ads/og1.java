package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class og1 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7750a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager f7751b;

    /* renamed from: c, reason: collision with root package name */
    public float f7752c;

    /* renamed from: d, reason: collision with root package name */
    public final yg1 f7753d;

    public og1(Handler handler, Context context, yg1 yg1Var) {
        super(handler);
        this.f7750a = context;
        this.f7751b = (AudioManager) context.getSystemService("audio");
        this.f7753d = yg1Var;
    }

    public final float a() {
        AudioManager audioManager = this.f7751b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f6 = 0.0f;
        if (streamMaxVolume > 0) {
            if (streamVolume <= 0) {
                return 0.0f;
            }
            f6 = streamVolume / streamMaxVolume;
            if (f6 > 1.0f) {
                return 1.0f;
            }
        }
        return f6;
    }

    public final void b() {
        float f6 = this.f7752c;
        yg1 yg1Var = this.f7753d;
        yg1Var.f10974a = f6;
        if (yg1Var.f10976c == null) {
            yg1Var.f10976c = rg1.f8631c;
        }
        Iterator it = Collections.unmodifiableCollection(yg1Var.f10976c.f8633b).iterator();
        while (it.hasNext()) {
            ch1 ch1Var = ((fg1) it.next()).f4654d;
            xg1.a(ch1Var.a(), "setDeviceVolume", Float.valueOf(f6), ch1Var.f3576a);
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        super.onChange(z6);
        float fA = a();
        if (fA != this.f7752c) {
            this.f7752c = fA;
            b();
        }
    }
}
