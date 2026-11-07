package okhttp3.internal.platform.android;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class CloseGuard {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f19788d = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final Method f19789a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f19790b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f19791c;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public CloseGuard(Method method, Method method2, Method method3) {
        this.f19789a = method;
        this.f19790b = method2;
        this.f19791c = method3;
    }
}
