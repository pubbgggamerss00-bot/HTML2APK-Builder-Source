package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m80 extends vj1 {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f6968a;

    /* renamed from: c, reason: collision with root package name */
    public final Display f6970c;

    /* renamed from: f, reason: collision with root package name */
    public float[] f6973f;

    /* renamed from: g, reason: collision with root package name */
    public uj1 f6974g;
    public n80 h;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f6971d = new float[9];

    /* renamed from: e, reason: collision with root package name */
    public final float[] f6972e = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final Object f6969b = new Object();

    public m80(Context context) {
        this.f6968a = (SensorManager) context.getSystemService("sensor");
        this.f6970c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.google.android.gms.internal.ads.vj1
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f6969b) {
            try {
                if (this.f6973f == null) {
                    this.f6973f = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f6971d, fArr);
        int rotation = this.f6970c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f6971d, 2, 129, this.f6972e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f6971d, 129, 130, this.f6972e);
        } else if (rotation != 3) {
            System.arraycopy(this.f6971d, 0, this.f6972e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f6971d, 130, 1, this.f6972e);
        }
        float[] fArr2 = this.f6972e;
        float f6 = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f6;
        float f7 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f7;
        float f8 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f8;
        synchronized (this.f6969b) {
            System.arraycopy(this.f6972e, 0, this.f6973f, 0, 9);
        }
        n80 n80Var = this.h;
        if (n80Var != null) {
            synchronized (n80Var.M) {
                n80Var.M.notifyAll();
            }
        }
    }

    public final void b() {
        if (this.f6974g == null) {
            return;
        }
        this.f6968a.unregisterListener(this);
        this.f6974g.post(new l80(0));
        this.f6974g = null;
    }

    public final boolean c(float[] fArr) {
        synchronized (this.f6969b) {
            try {
                float[] fArr2 = this.f6973f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
