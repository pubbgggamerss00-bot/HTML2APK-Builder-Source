package com.google.android.gms.internal.cloudmessaging;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public interface zzb {
    ExecutorService zza(ThreadFactory threadFactory, int i10);

    ScheduledExecutorService zza(int i10, ThreadFactory threadFactory, int i11);
}
