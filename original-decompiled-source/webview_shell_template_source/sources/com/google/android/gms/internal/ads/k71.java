package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class k71 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6276a;

    public /* synthetic */ k71(int i6) {
        this.f6276a = i6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6276a) {
            case 0:
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", zzv.zzp().f2954j.get());
                return new m71(bundle, 0);
            default:
                return new u51(3, new JSONObject());
        }
    }
}
