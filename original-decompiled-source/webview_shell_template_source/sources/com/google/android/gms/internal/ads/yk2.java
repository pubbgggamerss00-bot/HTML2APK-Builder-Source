package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yk2 {

    /* renamed from: a, reason: collision with root package name */
    public long f11020a;

    /* renamed from: b, reason: collision with root package name */
    public long f11021b;

    /* renamed from: c, reason: collision with root package name */
    public long f11022c;

    /* renamed from: d, reason: collision with root package name */
    public long f11023d;

    /* renamed from: e, reason: collision with root package name */
    public long f11024e;

    /* renamed from: f, reason: collision with root package name */
    public long f11025f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f11026g = new boolean[15];
    public int h;

    public final void a(long j6) {
        long j7 = this.f11023d;
        if (j7 == 0) {
            this.f11020a = j6;
        } else if (j7 == 1) {
            long j8 = j6 - this.f11020a;
            this.f11021b = j8;
            this.f11025f = j8;
            this.f11024e = 1L;
        } else {
            long j9 = j6 - this.f11022c;
            long jAbs = Math.abs(j9 - this.f11021b);
            int i6 = (int) (j7 % 15);
            boolean[] zArr = this.f11026g;
            if (jAbs <= 1000000) {
                this.f11024e++;
                this.f11025f += j9;
                if (zArr[i6]) {
                    zArr[i6] = false;
                    this.h--;
                }
            } else if (!zArr[i6]) {
                zArr[i6] = true;
                this.h++;
            }
        }
        this.f11023d++;
        this.f11022c = j6;
    }

    public final void b() {
        this.f11023d = 0L;
        this.f11024e = 0L;
        this.f11025f = 0L;
        this.h = 0;
        Arrays.fill(this.f11026g, false);
    }

    public final boolean c() {
        return this.f11023d > 15 && this.h == 0;
    }
}
