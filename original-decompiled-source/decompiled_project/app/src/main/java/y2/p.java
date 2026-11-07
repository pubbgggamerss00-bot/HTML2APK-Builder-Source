package y2;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import e9.w0;

@pg.d
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final View f33761a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f33762b = w0.a(pg.k.f21467b, new a());

    /* renamed from: c, reason: collision with root package name */
    public final y3.e0 f33763c;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<InputMethodManager> {
        public a() {
            super(0);
        }

        @Override // eh.a
        public final InputMethodManager invoke() {
            Object systemService = p.this.f33761a.getContext().getSystemService("input_method");
            kotlin.jvm.internal.r.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public p(View view) {
        this.f33761a = view;
        this.f33763c = new y3.e0(view);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pg.j] */
    public final void a(int i10, int i11, int i12, int i13) {
        ((InputMethodManager) this.f33762b.getValue()).updateSelection(this.f33761a, i10, i11, i12, i13);
    }
}
