package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t01 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f9054a = new long[10];

    /* renamed from: b, reason: collision with root package name */
    public Object[] f9055b = new Object[10];

    /* renamed from: c, reason: collision with root package name */
    public int f9056c;

    /* renamed from: d, reason: collision with root package name */
    public int f9057d;

    public final synchronized int a() {
        return this.f9057d;
    }

    public final synchronized Object b() {
        if (this.f9057d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized Object c(long j6) {
        Object objF;
        objF = null;
        while (this.f9057d > 0 && j6 - this.f9054a[this.f9056c] >= 0) {
            objF = f();
        }
        return objF;
    }

    public final synchronized void d(long j6, Object obj) {
        try {
            if (this.f9057d > 0) {
                if (j6 <= this.f9054a[((this.f9056c + r0) - 1) % this.f9055b.length]) {
                    e();
                }
            }
            int length = this.f9055b.length;
            if (this.f9057d >= length) {
                int i6 = length + length;
                long[] jArr = new long[i6];
                Object[] objArr = new Object[i6];
                int i7 = this.f9056c;
                int i8 = length - i7;
                System.arraycopy(this.f9054a, i7, jArr, 0, i8);
                System.arraycopy(this.f9055b, this.f9056c, objArr, 0, i8);
                int i9 = this.f9056c;
                if (i9 > 0) {
                    System.arraycopy(this.f9054a, 0, jArr, i8, i9);
                    System.arraycopy(this.f9055b, 0, objArr, i8, this.f9056c);
                }
                this.f9054a = jArr;
                this.f9055b = objArr;
                this.f9056c = 0;
            }
            int i10 = this.f9056c;
            int i11 = this.f9057d;
            Object[] objArr2 = this.f9055b;
            int length2 = (i10 + i11) % objArr2.length;
            this.f9054a[length2] = j6;
            objArr2[length2] = obj;
            this.f9057d = i11 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        this.f9056c = 0;
        this.f9057d = 0;
        Arrays.fill(this.f9055b, (Object) null);
    }

    public final Object f() {
        y5.r(this.f9057d > 0);
        Object[] objArr = this.f9055b;
        int i6 = this.f9056c;
        Object obj = objArr[i6];
        objArr[i6] = null;
        this.f9056c = (i6 + 1) % objArr.length;
        this.f9057d--;
        return obj;
    }
}
