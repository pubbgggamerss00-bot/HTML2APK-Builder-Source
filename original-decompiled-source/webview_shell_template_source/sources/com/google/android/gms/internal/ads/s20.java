package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.Thread;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s20 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f8761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t20 f8762b;

    public s20(t20 t20Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f8761a = uncaughtExceptionHandler;
        this.f8762b = t20Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f8761a;
        try {
            try {
                this.f8762b.g(th);
            } catch (Throwable th2) {
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
                throw th2;
            }
        } catch (Throwable unused) {
            zzo.zzg("AdMob exception reporter failed reporting the exception.");
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
