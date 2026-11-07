package w2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.jvm.internal.r;
import u2.i0;
import u2.l0;

/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i15)) != layout.getLineCount() - 1) {
            return;
        }
        i0 i0Var = l0.f29218a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fB = d.b(layout, lineForOffset, paint) + d.a(layout, lineForOffset, paint);
            if (fB == CropImageView.DEFAULT_ASPECT_RATIO) {
                return;
            }
            r.b(canvas);
            canvas.translate(fB, CropImageView.DEFAULT_ASPECT_RATIO);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return 0;
    }
}
