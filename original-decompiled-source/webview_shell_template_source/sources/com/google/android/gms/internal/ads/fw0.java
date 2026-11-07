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
public final class fw0 extends vj1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4807a;

    /* renamed from: b, reason: collision with root package name */
    public SensorManager f4808b;

    /* renamed from: c, reason: collision with root package name */
    public Sensor f4809c;

    /* renamed from: d, reason: collision with root package name */
    public long f4810d;

    /* renamed from: e, reason: collision with root package name */
    public int f4811e;

    /* renamed from: f, reason: collision with root package name */
    public sv0 f4812f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4813g;

    public fw0(Context context) {
        this.f4807a = context;
    }

    @Override // com.google.android.gms.internal.ads.vj1
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) zzbe.zzc().a(zn.R8)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f6 = fArr[0] / 9.80665f;
            float f7 = fArr[1] / 9.80665f;
            float f8 = fArr[2] / 9.80665f;
            float f9 = f8 * f8;
            if (((float) Math.sqrt(f9 + (f7 * f7) + (f6 * f6))) >= ((Float) zzbe.zzc().a(zn.S8)).floatValue()) {
                long jA = zzv.zzC().a();
                if (this.f4810d + ((Integer) zzbe.zzc().a(zn.T8)).intValue() <= jA) {
                    if (this.f4810d + ((Integer) zzbe.zzc().a(zn.U8)).intValue() < jA) {
                        this.f4811e = 0;
                    }
                    zze.zza("Shake detected.");
                    this.f4810d = jA;
                    int i6 = this.f4811e + 1;
                    this.f4811e = i6;
                    sv0 sv0Var = this.f4812f;
                    if (sv0Var != null) {
                        if (i6 == ((Integer) zzbe.zzc().a(zn.V8)).intValue()) {
                            sv0Var.d(new qv0(), rv0.f8712u);
                        }
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
                if (((Boolean) zzbe.zzc().a(zn.R8)).booleanValue()) {
                    if (this.f4808b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f4807a.getSystemService("sensor");
                        this.f4808b = sensorManager2;
                        if (sensorManager2 == null) {
                            zzo.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f4809c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f4813g && (sensorManager = this.f4808b) != null && (sensor = this.f4809c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f4810d = zzv.zzC().a() - ((Integer) zzbe.zzc().a(zn.T8)).intValue();
                        this.f4813g = true;
                        zze.zza("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
