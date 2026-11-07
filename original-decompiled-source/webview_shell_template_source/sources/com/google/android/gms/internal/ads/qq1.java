package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class qq1 extends wr1 implements Runnable {
    public Class A;
    public Object B;

    /* renamed from: z, reason: collision with root package name */
    public c5.a f8444z;

    public qq1(c5.a aVar, Class cls, Object obj) {
        aVar.getClass();
        this.f8444z = aVar;
        this.A = cls;
        this.B = obj;
    }

    @Override // com.google.android.gms.internal.ads.cr1
    public final String c() {
        c5.a aVar = this.f8444z;
        Class cls = this.A;
        Object obj = this.B;
        String strC = super.c();
        String strB = aVar != null ? androidx.camera.camera2.internal.v0.b("inputFuture=[", aVar.toString(), "], ") : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (cls == null || obj == null) {
            if (strC != null) {
                return strB.concat(strC);
            }
            return null;
        }
        return strB + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.cr1
    public final void d() {
        i(this.f8444z);
        this.f8444z = null;
        this.A = null;
        this.B = null;
    }

    public abstract Object q(Object obj, Throwable th);

    public abstract void r(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        c5.a aVar = this.f8444z;
        Class cls = this.A;
        Object obj = this.B;
        if (((obj == null) || ((aVar == 0) | (cls == null))) || (this.s instanceof sq1)) {
            return;
        }
        this.f8444z = null;
        try {
            th = aVar instanceof xs1 ? ((xs1) aVar).a() : null;
        } catch (ExecutionException e6) {
            Throwable cause = e6.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(aVar.getClass()) + " threw " + String.valueOf(e6.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objR = th == null ? bs1.r(aVar) : null;
        if (th == null) {
            e(objR);
            return;
        }
        if (!cls.isInstance(th)) {
            j(aVar);
            return;
        }
        try {
            Object objQ = q(obj, th);
            this.A = null;
            this.B = null;
            r(objQ);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                f(th2);
            } finally {
                this.A = null;
                this.B = null;
            }
        }
    }
}
