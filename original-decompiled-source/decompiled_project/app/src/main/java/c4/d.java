package c4;

import android.view.ActionMode;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d {

    public static class a {
        public static void a(TextView textView, int i10, float f10) {
            textView.setLineHeight(i10, f10);
        }
    }

    public static class b implements ActionMode.Callback {
    }

    public static void a(TextView textView, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i10 - r0, 1.0f);
        }
    }
}
