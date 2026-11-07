package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ur1 implements Executor {
    public static final ur1 s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ ur1[] f9621t;

    static {
        ur1 ur1Var = new ur1("INSTANCE", 0);
        s = ur1Var;
        f9621t = new ur1[]{ur1Var};
    }

    public static ur1[] values() {
        return (ur1[]) f9621t.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
