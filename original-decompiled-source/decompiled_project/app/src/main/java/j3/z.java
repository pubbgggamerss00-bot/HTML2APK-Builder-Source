package j3;

import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class z {
    public static final void a(g0 g0Var, y yVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (yVar == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = g0Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, yVar);
    }

    public static final void b(g0 g0Var, y yVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (yVar == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = g0Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(yVar);
    }
}
