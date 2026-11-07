package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f5927a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface a extends com.google.android.gms.common.api.internal.f {
    }

    @Deprecated
    public interface b extends com.google.android.gms.common.api.internal.n {
    }

    @ResultIgnorabilityUnspecified
    public <A extends a.b, R extends l, T extends com.google.android.gms.common.api.internal.d<R, A>> T a(T t3) {
        throw new UnsupportedOperationException();
    }

    @ResultIgnorabilityUnspecified
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends l, A>> T b(T t3) {
        throw new UnsupportedOperationException();
    }

    public Looper c() {
        throw new UnsupportedOperationException();
    }

    public void d() {
        throw new UnsupportedOperationException();
    }

    public void e() {
        throw new UnsupportedOperationException();
    }
}
