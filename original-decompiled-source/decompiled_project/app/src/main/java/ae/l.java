package ae;

import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class l {
    public static RectF a(float[] fArr) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i10 = 1; i10 < fArr.length; i10 += 2) {
            float fRound = Math.round(fArr[i10 - 1] * 10.0f) / 10.0f;
            float fRound2 = Math.round(fArr[i10] * 10.0f) / 10.0f;
            float f10 = rectF.left;
            if (fRound < f10) {
                f10 = fRound;
            }
            rectF.left = f10;
            float f11 = rectF.top;
            if (fRound2 < f11) {
                f11 = fRound2;
            }
            rectF.top = f11;
            float f12 = rectF.right;
            if (fRound <= f12) {
                fRound = f12;
            }
            rectF.right = fRound;
            float f13 = rectF.bottom;
            if (fRound2 <= f13) {
                fRound2 = f13;
            }
            rectF.bottom = fRound2;
        }
        rectF.sort();
        return rectF;
    }
}
