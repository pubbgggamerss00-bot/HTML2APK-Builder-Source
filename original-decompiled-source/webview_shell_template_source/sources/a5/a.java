package a5;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import j.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f35a = {R.attr.theme, com.htmltoapk.template.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f36b = {com.htmltoapk.template.R.attr.materialThemeOverlay};

    public static Context a(int i6, int i7, Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f36b, i6, i7);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i8 = iArr2[0];
        boolean z6 = (context instanceof c) && ((c) context).f13383a == i8;
        if (i8 == 0 || z6) {
            return context;
        }
        c cVar = new c(context, i8);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i6, i7);
            for (int i9 = 0; i9 < iArr.length; i9++) {
                iArr3[i9] = typedArrayObtainStyledAttributes2.getResourceId(i9, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr3[i10];
            if (i11 != 0) {
                cVar.getTheme().applyStyle(i11, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f35a);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            cVar.getTheme().applyStyle(resourceId, true);
        }
        return cVar;
    }

    public static Context b(Context context, AttributeSet attributeSet, int i6, int i7) {
        return a(i6, i7, context, attributeSet, new int[0]);
    }
}
