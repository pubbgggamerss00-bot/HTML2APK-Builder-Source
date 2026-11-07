package i9;

import android.app.Activity;
import androidx.lifecycle.w0;
import java.util.Map;
import sh.q0;
import sh.z0;

/* loaded from: classes.dex */
public final class r extends w0 {

    /* renamed from: b, reason: collision with root package name */
    public final i8.j f14386b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f14387c;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f14388d;

    /* renamed from: e, reason: collision with root package name */
    public final th.l f14389e;

    public r(i8.j billingManager) {
        kotlin.jvm.internal.r.e(billingManager, "billingManager");
        this.f14386b = billingManager;
        this.f14387c = billingManager.f14228h;
        this.f14388d = billingManager.f14230j;
        this.f14389e = gg.a.h(billingManager.f14226f, q0.b(1, 5, null));
        billingManager.h();
    }

    public final void f(Activity activity, String str) {
        i8.j jVar = this.f14386b;
        ((Map) jVar.f14230j.getValue()).containsKey(str);
        jVar.e(activity, str, null);
    }
}
