package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f6063a = Collections.synchronizedMap(new p.a());

    /* renamed from: b, reason: collision with root package name */
    public int f6064b = 0;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f6065c;

    public final void a(String str, j jVar) {
        Map map = this.f6063a;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(i8.n.d("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, jVar);
        if (this.f6064b > 0) {
            new zzh(Looper.getMainLooper()).post(new t1(this, jVar, str));
        }
    }

    public final void b(Bundle bundle) {
        this.f6064b = 1;
        this.f6065c = bundle;
        for (Map.Entry entry : this.f6063a.entrySet()) {
            ((j) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f6063a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((j) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }
}
