package z4;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.htmltoapk.template.R;
import l.c0;
import q4.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends c0 {
    public static int g(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i6 = 0; i6 < iArr.length && dimensionPixelSize < 0; i6++) {
            int i7 = iArr[i6];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i7, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i7, -1);
            }
        }
        return dimensionPixelSize;
    }

    @Override // l.c0, android.widget.TextView
    public final void setTextAppearance(Context context, int i6) throws Resources.NotFoundException {
        super.setTextAppearance(context, i6);
        if (b.b(context.getTheme(), R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i6, w3.a.f15081w);
            int iG = g(getContext(), typedArrayObtainStyledAttributes, 2, 4);
            typedArrayObtainStyledAttributes.recycle();
            if (iG >= 0) {
                setLineHeight(iG);
            }
        }
    }
}
