package k0;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final View f15846a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15847b = e9.w0.a(pg.k.f21467b, new a());

    public static final class a extends kotlin.jvm.internal.s implements eh.a<InputMethodManager> {
        public a() {
            super(0);
        }

        @Override // eh.a
        public final InputMethodManager invoke() {
            Object systemService = h1.this.f15846a.getContext().getSystemService("input_method");
            kotlin.jvm.internal.r.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public h1(View view) {
        this.f15846a = view;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pg.j] */
    public final InputMethodManager a() {
        return (InputMethodManager) this.f15847b.getValue();
    }

    public final void b(int i10, int i11, int i12, int i13) {
        a().updateSelection(this.f15846a, i10, i11, i12, i13);
    }
}
