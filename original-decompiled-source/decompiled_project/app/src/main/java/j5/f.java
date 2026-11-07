package j5;

import androidx.lifecycle.a1;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final a1 f15164a;

    /* renamed from: b, reason: collision with root package name */
    public final z0.c f15165b;

    /* renamed from: c, reason: collision with root package name */
    public final a f15166c;

    /* renamed from: d, reason: collision with root package name */
    public final ya.b f15167d;

    public f(a1 store, z0.c factory, a defaultExtras) {
        r.e(store, "store");
        r.e(factory, "factory");
        r.e(defaultExtras, "defaultExtras");
        this.f15164a = store;
        this.f15165b = factory;
        this.f15166c = defaultExtras;
        this.f15167d = new ya.b();
    }

    public final w0 a(h hVar, String key) {
        w0 viewModel;
        w0 w0VarA;
        r.e(key, "key");
        synchronized (this.f15167d) {
            try {
                a1 a1Var = this.f15164a;
                a1Var.getClass();
                viewModel = (w0) a1Var.f2249a.get(key);
                if (hVar.i(viewModel)) {
                    Object obj = this.f15165b;
                    if (obj instanceof z0.e) {
                        r.b(viewModel);
                        ((z0.e) obj).d(viewModel);
                    }
                    r.c(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    d dVar = new d(this.f15166c);
                    dVar.f15158a.put(z0.f2399b, key);
                    z0.c factory = this.f15165b;
                    r.e(factory, "factory");
                    try {
                        try {
                            w0VarA = factory.c(hVar, dVar);
                        } catch (AbstractMethodError unused) {
                            w0VarA = factory.b(b3.e.c(hVar), dVar);
                        }
                    } catch (AbstractMethodError unused2) {
                        w0VarA = factory.a(b3.e.c(hVar));
                    }
                    viewModel = w0VarA;
                    a1 a1Var2 = this.f15164a;
                    a1Var2.getClass();
                    r.e(viewModel, "viewModel");
                    w0 w0Var = (w0) a1Var2.f2249a.put(key, viewModel);
                    if (w0Var != null) {
                        w0Var.c();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return viewModel;
    }
}
