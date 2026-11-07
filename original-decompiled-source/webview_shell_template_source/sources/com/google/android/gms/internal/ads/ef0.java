package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ef0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4268a;

    public /* synthetic */ ef0(int i6) {
        this.f4268a = i6;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f4268a) {
            case 0:
                return new df0();
            case 1:
                return "app_open_ad";
            case 2:
                Set set = Collections.EMPTY_SET;
                ih1.j(set);
                return set;
            case 3:
                Set set2 = Collections.EMPTY_SET;
                ih1.j(set2);
                return set2;
            case 4:
                return new en0();
            case 5:
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new l71(h70Var);
            case 6:
                return new vc1();
            case 7:
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                if (executorServiceUnconfigurableExecutorService instanceof hs1) {
                    return (hs1) executorServiceUnconfigurableExecutorService;
                }
                return executorServiceUnconfigurableExecutorService instanceof ScheduledExecutorService ? new ns1((ScheduledExecutorService) executorServiceUnconfigurableExecutorService) : new ks1(executorServiceUnconfigurableExecutorService);
            default:
                h70 h70Var2 = i70.f5591f;
                ih1.j(h70Var2);
                return h70Var2;
        }
    }

    public /* synthetic */ ef0(boolean z6) {
        this.f4268a = 3;
    }
}
