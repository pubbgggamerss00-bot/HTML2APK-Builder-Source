package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gs1 {

    /* renamed from: a, reason: collision with root package name */
    public final im1 f5152a = new im1();

    /* renamed from: b, reason: collision with root package name */
    public final String f5153b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f5154c;

    public gs1(Class cls) {
        this.f5153b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f5154c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f5152a) {
            try {
                Logger logger2 = this.f5154c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f5153b);
                this.f5154c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
