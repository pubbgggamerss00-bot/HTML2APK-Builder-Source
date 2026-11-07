package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.h;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements androidx.lifecycle.k {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class a {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b extends kotlin.jvm.internal.k implements p5.a<a> {
        public static final b s = new b(0);

        @Override // p5.a
        public final a a() throws SecurityException {
            try {
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                return new d();
            } catch (NoSuchFieldException unused) {
                return c.f42a;
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f42a = new c();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class d extends a {
    }

    static {
        c0.g(b.s);
    }

    @Override // androidx.lifecycle.k
    public final void a(androidx.lifecycle.m mVar, h.a aVar) {
        if (aVar == h.a.ON_DESTROY) {
            throw null;
        }
    }
}
