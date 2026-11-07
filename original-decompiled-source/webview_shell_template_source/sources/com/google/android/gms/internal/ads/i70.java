package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i70 {

    /* renamed from: a, reason: collision with root package name */
    public static final h70 f5586a;

    /* renamed from: b, reason: collision with root package name */
    public static final h70 f5587b;

    /* renamed from: c, reason: collision with root package name */
    public static final h70 f5588c;

    /* renamed from: d, reason: collision with root package name */
    public static final f70 f5589d;

    /* renamed from: e, reason: collision with root package name */
    public static final ns1 f5590e;

    /* renamed from: f, reason: collision with root package name */
    public static final h70 f5591f;

    /* renamed from: g, reason: collision with root package name */
    public static final h70 f5592g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    static {
        ThreadPoolExecutor threadPoolExecutor;
        nn nnVar = zn.fb;
        if (zzbe.zzc().b(nnVar) == null || !((Boolean) zzbe.zzc().b(nnVar)).booleanValue()) {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new g70("Default"));
        } else {
            on onVar = zn.gb;
            if (zzbe.zzc().b(onVar) != null) {
                nn nnVar2 = zn.hb;
                if (zzbe.zzc().b(nnVar2) != null) {
                    threadPoolExecutor = new ThreadPoolExecutor(((Integer) zzbe.zzc().b(onVar)).intValue(), ((Integer) zzbe.zzc().b(onVar)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new g70("Default"));
                    threadPoolExecutor.allowCoreThreadTimeOut(((Boolean) zzbe.zzc().b(nnVar2)).booleanValue());
                }
            }
        }
        f5586a = new h70(threadPoolExecutor);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new g70("Loader"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        f5587b = new h70(threadPoolExecutor2);
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new g70("Activeview"));
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
        f5588c = new h70(threadPoolExecutor3);
        f70 f70Var = new f70(3, new g70("Schedule"));
        f5589d = f70Var;
        f5590e = new ns1(f70Var);
        f5591f = new h70(new gb());
        f5592g = new h70(ur1.s);
    }
}
