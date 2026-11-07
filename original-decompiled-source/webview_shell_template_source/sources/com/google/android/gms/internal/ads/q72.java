package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class q72 {

    /* renamed from: t, reason: collision with root package name */
    public static MessageDigest f8245t;
    public final Object s;

    public q72(int i6) {
        switch (i6) {
            case 4:
                this.s = new cy();
                break;
            default:
                this.s = new Object();
                break;
        }
    }

    public abstract byte a(long j6);

    public MessageDigest b() {
        synchronized (this.s) {
            MessageDigest messageDigest = f8245t;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i6 = 0; i6 < 2; i6++) {
                try {
                    f8245t = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f8245t;
        }
    }

    public abstract void c(int i6, long j6);

    public abstract double d(long j6, Object obj);

    public abstract int e();

    public abstract float f(long j6, Object obj);

    public abstract int g();

    public abstract int h();

    public abstract void i(long j6, byte[] bArr, long j7, long j8);

    public abstract int j();

    public abstract void k(Object obj, long j6, boolean z6);

    public abstract int l();

    public abstract void m(Object obj, long j6, byte b7);

    public abstract int n();

    public abstract void o(Object obj, long j6, double d7);

    public abstract void p();

    public abstract void q(Object obj, long j6, float f6);

    public abstract boolean r(long j6, Object obj);

    public abstract long s();

    public abstract long t();

    public abstract long u();

    public abstract zy v();

    public abstract w50 w();

    public abstract boolean x();

    public abstract void y();

    public abstract boolean z();

    public q72(View view) {
        this.s = new WeakReference(view);
    }
}
