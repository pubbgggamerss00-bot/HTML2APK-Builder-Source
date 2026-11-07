package m3;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<Matrix> f17645a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<RectF> f17646b = new ThreadLocal<>();

    public static void a(b bVar, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != bVar) {
            a(bVar, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
