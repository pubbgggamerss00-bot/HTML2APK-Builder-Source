package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class ir1 extends wr1 implements Runnable {
    public static final /* synthetic */ int B = 0;
    public Object A;

    /* renamed from: z, reason: collision with root package name */
    public c5.a f5831z;

    public ir1(c5.a aVar, Object obj) {
        aVar.getClass();
        this.f5831z = aVar;
        this.A = obj;
    }

    @Override // com.google.android.gms.internal.ads.cr1
    public final String c() {
        c5.a aVar = this.f5831z;
        Object obj = this.A;
        String strC = super.c();
        String strB = aVar != null ? androidx.camera.camera2.internal.v0.b("inputFuture=[", aVar.toString(), "], ") : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (obj == null) {
            if (strC != null) {
                return strB.concat(strC);
            }
            return null;
        }
        return strB + "function=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.cr1
    public final void d() {
        i(this.f5831z);
        this.f5831z = null;
        this.A = null;
    }

    public abstract Object q(Object obj, Object obj2);

    public abstract void r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        c5.a aVar = this.f5831z;
        Object obj = this.A;
        if (((this.s instanceof sq1) | (aVar == null)) || (obj == null)) {
            return;
        }
        this.f5831z = null;
        if (aVar.isCancelled()) {
            j(aVar);
            return;
        }
        try {
            try {
                Object objQ = q(obj, bs1.r(aVar));
                this.A = null;
                r(objQ);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    f(th);
                } finally {
                    this.A = null;
                }
            }
        } catch (Error e6) {
            f(e6);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e7) {
            f(e7.getCause());
        } catch (Exception e8) {
            f(e8);
        }
    }
}
