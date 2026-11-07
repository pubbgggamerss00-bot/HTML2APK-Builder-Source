package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class iv0 extends vj1 {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f5862a;

    /* renamed from: b, reason: collision with root package name */
    public final Sensor f5863b;

    /* renamed from: c, reason: collision with root package name */
    public float f5864c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public Float f5865d = Float.valueOf(0.0f);

    /* renamed from: e, reason: collision with root package name */
    public long f5866e = zzv.zzC().a();

    /* renamed from: f, reason: collision with root package name */
    public int f5867f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5868g = false;
    public boolean h = false;

    /* renamed from: i, reason: collision with root package name */
    public sv0 f5869i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5870j = false;

    public iv0(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f5862a = sensorManager;
        if (sensorManager != null) {
            this.f5863b = sensorManager.getDefaultSensor(4);
        } else {
            this.f5863b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.vj1
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) zzbe.zzc().a(zn.W8)).booleanValue()) {
            long jA = zzv.zzC().a();
            if (this.f5866e + ((Integer) zzbe.zzc().a(zn.Y8)).intValue() < jA) {
                this.f5867f = 0;
                this.f5866e = jA;
                this.f5868g = false;
                this.h = false;
                this.f5864c = this.f5865d.floatValue();
            }
            float fFloatValue = this.f5865d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.f5865d = Float.valueOf(fFloatValue);
            float f6 = this.f5864c;
            qn qnVar = zn.X8;
            if (fFloatValue > ((Float) zzbe.zzc().a(qnVar)).floatValue() + f6) {
                this.f5864c = this.f5865d.floatValue();
                this.h = true;
            } else if (this.f5865d.floatValue() < this.f5864c - ((Float) zzbe.zzc().a(qnVar)).floatValue()) {
                this.f5864c = this.f5865d.floatValue();
                this.f5868g = true;
            }
            if (this.f5865d.isInfinite()) {
                this.f5865d = Float.valueOf(0.0f);
                this.f5864c = 0.0f;
            }
            if (this.f5868g && this.h) {
                zze.zza("Flick detected.");
                this.f5866e = jA;
                int i6 = this.f5867f + 1;
                this.f5867f = i6;
                this.f5868g = false;
                this.h = false;
                sv0 sv0Var = this.f5869i;
                if (sv0Var != null) {
                    if (i6 == ((Integer) zzbe.zzc().a(zn.Z8)).intValue()) {
                        sv0Var.d(new com.google.android.gms.ads.internal.client.t(1), rv0.f8712u);
                    }
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) zzbe.zzc().a(zn.W8)).booleanValue()) {
                    if (!this.f5870j && (sensorManager = this.f5862a) != null && (sensor = this.f5863b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f5870j = true;
                        zze.zza("Listening for flick gestures.");
                    }
                    if (this.f5862a == null || this.f5863b == null) {
                        zzo.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
