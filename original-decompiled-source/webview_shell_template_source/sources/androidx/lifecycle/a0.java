package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a0 implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.savedstate.a f1272a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1273b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1274c;

    /* renamed from: d, reason: collision with root package name */
    public final d5.f f1275d;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a extends kotlin.jvm.internal.k implements p5.a<b0> {
        public final /* synthetic */ k0 s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k0 k0Var) {
            super(0);
            this.s = k0Var;
        }

        @Override // p5.a
        public final b0 a() {
            return z.c(this.s);
        }
    }

    public a0(androidx.savedstate.a aVar, k0 k0Var) {
        kotlin.jvm.internal.j.e("savedStateRegistry", aVar);
        this.f1272a = aVar;
        this.f1275d = androidx.activity.c0.g(new a(k0Var));
    }

    @Override // androidx.savedstate.a.b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1274c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((b0) this.f1275d.getValue()).f1283d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((y) entry.getValue()).f1344e.a();
            if (!kotlin.jvm.internal.j.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f1273b = false;
        return bundle;
    }

    public final void b() {
        if (this.f1273b) {
            return;
        }
        Bundle bundleA = this.f1272a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1274c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.f1274c = bundle;
        this.f1273b = true;
    }
}
