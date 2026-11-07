package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import e4.a;
import g.o;
import l.c;
import l.c0;
import l.e;
import l.f;
import l.s;
import q4.b;
import y4.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends o {
    @Override // g.o
    public final c a(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    @Override // g.o
    public final e b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.o
    public final f c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // g.o
    public final s d(Context context, AttributeSet attributeSet) {
        return new p4.a(context, attributeSet);
    }

    @Override // g.o
    public final c0 e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        z4.a aVar = new z4.a(a5.a.b(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (b.b(context2.getTheme(), com.htmltoapk.template.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = w3.a.f15082x;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int iG = z4.a.g(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iG == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, w3.a.f15081w);
                    int iG2 = z4.a.g(aVar.getContext(), typedArrayObtainStyledAttributes3, 2, 4);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iG2 >= 0) {
                        aVar.setLineHeight(iG2);
                    }
                }
            }
        }
        return aVar;
    }
}
