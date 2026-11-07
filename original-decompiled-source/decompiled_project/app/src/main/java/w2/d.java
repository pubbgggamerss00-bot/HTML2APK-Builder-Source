package w2;

import android.graphics.Paint;
import android.text.Layout;
import com.yalantis.ucrop.view.CropImageView;
import u2.i0;
import u2.l0;

/* loaded from: classes.dex */
public final class d {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31235a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f31235a = iArr;
        }
    }

    public static final float a(Layout layout, int i10, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i10);
        i0 i0Var = l0.f29218a;
        if (layout.getEllipsisCount(i10) <= 0 || layout.getParagraphDirection(i10) != 1 || lineLeft >= CropImageView.DEFAULT_ASPECT_RATIO) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment == null ? -1 : a.f31235a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float b(Layout layout, int i10, Paint paint) {
        float width;
        float width2;
        i0 i0Var = l0.f29218a;
        if (layout.getEllipsisCount(i10) <= 0) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        if (layout.getParagraphDirection(i10) != -1 || layout.getWidth() >= layout.getLineRight(i10)) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i10) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment != null ? a.f31235a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }
}
