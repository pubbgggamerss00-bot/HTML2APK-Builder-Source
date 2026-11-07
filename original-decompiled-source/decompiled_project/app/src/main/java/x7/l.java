package x7;

import ah.p;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import ph.m;
import x7.a;

/* loaded from: classes.dex */
public interface l<T extends View> extends i {
    static a f(int i10, int i11, int i12) {
        if (i10 == -2) {
            return a.b.f32184a;
        }
        int i13 = i10 - i12;
        if (i13 > 0) {
            b.a(i13);
            return new a.C0326a(i13);
        }
        int i14 = i11 - i12;
        if (i14 <= 0) {
            return null;
        }
        b.a(i14);
        return new a.C0326a(i14);
    }

    T a();

    @Override // x7.i
    default Object b(tg.e<? super h> eVar) throws Throwable {
        h size = getSize();
        if (size != null) {
            return size;
        }
        m mVar = new m(1, p.c(eVar));
        mVar.p();
        ViewTreeObserver viewTreeObserver = a().getViewTreeObserver();
        k kVar = new k(this, viewTreeObserver, mVar);
        viewTreeObserver.addOnPreDrawListener(kVar);
        mVar.s(new j(this, viewTreeObserver, kVar));
        Object objO = mVar.o();
        ug.a aVar = ug.a.f29706a;
        return objO;
    }

    default h getSize() {
        ViewGroup.LayoutParams layoutParams = a().getLayoutParams();
        a aVarF = f(layoutParams != null ? layoutParams.width : -1, a().getWidth(), k() ? a().getPaddingRight() + a().getPaddingLeft() : 0);
        if (aVarF == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = a().getLayoutParams();
        a aVarF2 = f(layoutParams2 != null ? layoutParams2.height : -1, a().getHeight(), k() ? a().getPaddingBottom() + a().getPaddingTop() : 0);
        if (aVarF2 == null) {
            return null;
        }
        return new h(aVarF, aVarF2);
    }

    default void j(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            a().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    default boolean k() {
        return true;
    }
}
