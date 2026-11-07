package y3;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f33816a;

    public static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final View f33817a;

        public a(View view) {
            this.f33817a = view;
        }

        public void a() {
            View view = this.f33817a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }

        public void b() {
            final View viewFindViewById;
            View view = this.f33817a;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
                viewFindViewById = view;
            } else {
                viewFindViewById = view.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = view.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: y3.d0
                @Override // java.lang.Runnable
                public final void run() {
                    View view2 = viewFindViewById;
                    ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                }
            });
        }
    }

    public static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public View f33818b;

        /* JADX WARN: Type inference failed for: r4v0, types: [y3.l0] */
        @Override // y3.e0.a
        public final void a() {
            View view = this.f33818b;
            WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: y3.l0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    atomicBoolean.set((i10 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r42);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r42);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // y3.e0.a
        public final void b() {
            View view = this.f33818b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }
    }

    public static class c {
    }

    public e0(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            this.f33816a = new a(view);
            return;
        }
        b bVar = new b(view);
        bVar.f33818b = view;
        this.f33816a = bVar;
    }
}
