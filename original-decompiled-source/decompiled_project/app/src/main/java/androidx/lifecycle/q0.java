package androidx.lifecycle;

import android.os.Bundle;
import c6.c;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class q0 implements c.b {

    /* renamed from: a, reason: collision with root package name */
    public final c6.c f2341a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2342b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f2343c;

    /* renamed from: d, reason: collision with root package name */
    public final pg.s f2344d;

    public q0(c6.c savedStateRegistry, b1 b1Var) {
        kotlin.jvm.internal.r.e(savedStateRegistry, "savedStateRegistry");
        this.f2341a = savedStateRegistry;
        this.f2344d = e9.w0.b(new p0(b1Var, 0));
    }

    @Override // c6.c.b
    public final Bundle a() {
        Bundle bundleA = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
        Bundle bundle = this.f2343c;
        if (bundle != null) {
            bundleA.putAll(bundle);
        }
        for (Map.Entry entry : ((r0) this.f2344d.getValue()).f2345b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA2 = ((l0) entry.getValue()).f2326b.f14165e.a();
            if (!bundleA2.isEmpty()) {
                b4.a.d(bundleA, str, bundleA2);
            }
        }
        this.f2342b = false;
        return bundleA;
    }

    public final void b() {
        if (this.f2342b) {
            return;
        }
        Bundle bundleA = this.f2341a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleA2 = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
        Bundle bundle = this.f2343c;
        if (bundle != null) {
            bundleA2.putAll(bundle);
        }
        if (bundleA != null) {
            bundleA2.putAll(bundleA);
        }
        this.f2343c = bundleA2;
        this.f2342b = true;
    }
}
