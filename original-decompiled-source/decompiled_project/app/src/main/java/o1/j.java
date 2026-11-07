package o1;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;
import s.p2;

/* loaded from: classes.dex */
public final class j {
    public static s.n a(float f10, float f11, int i10) {
        if ((i10 & 2) != 0) {
            f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        return new s.n(p2.f23868a, Float.valueOf(f10), new s.o(f11), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final p1.e b(View view, AndroidComposeView androidComposeView) {
        int[] iArr = i.f18863a;
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        androidComposeView.getLocationInWindow(iArr);
        float f10 = i10 - iArr[0];
        float f11 = i11 - iArr[1];
        return new p1.e(f10, f11, view.getWidth() + f10, view.getHeight() + f11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static s.n c(s.n nVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) nVar.f23843b.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((s.o) nVar.f23844c).f23852a;
        }
        return new s.n(nVar.f23842a, Float.valueOf(f10), new s.o(f11), nVar.f23845d, nVar.f23846e, nVar.f23847f);
    }

    public static final boolean d(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if ((!viewGroup.isFocusable() || view.hasFocus()) && !(view instanceof AndroidComposeView)) {
            if (rect != null) {
                View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
                return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
            return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue(), rect);
    }

    public static final Integer e(int i10) {
        if (i10 == 5) {
            return 33;
        }
        if (i10 == 6) {
            return 130;
        }
        if (i10 == 3) {
            return 17;
        }
        if (i10 == 4) {
            return 66;
        }
        if (i10 == 1) {
            return 2;
        }
        return i10 == 2 ? 1 : null;
    }

    public static final e f(int i10) {
        if (i10 == 1) {
            return new e(2);
        }
        if (i10 == 2) {
            return new e(1);
        }
        if (i10 == 17) {
            return new e(3);
        }
        if (i10 == 33) {
            return new e(5);
        }
        if (i10 == 66) {
            return new e(4);
        }
        if (i10 != 130) {
            return null;
        }
        return new e(6);
    }
}
