package q4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import l.b1;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i6) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!typedArray.hasValue(i6) || (resourceId = typedArray.getResourceId(i6, 0)) == 0 || (colorStateListB = k0.a.b(context, resourceId)) == null) ? typedArray.getColorStateList(i6) : colorStateListB;
    }

    public static ColorStateList b(Context context, b1 b1Var, int i6) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = b1Var.f13583b;
        return (!typedArray.hasValue(i6) || (resourceId = typedArray.getResourceId(i6, 0)) == 0 || (colorStateListB = k0.a.b(context, resourceId)) == null) ? b1Var.a(i6) : colorStateListB;
    }

    public static Drawable c(Context context, TypedArray typedArray, int i6) {
        int resourceId;
        Drawable drawableD;
        return (!typedArray.hasValue(i6) || (resourceId = typedArray.getResourceId(i6, 0)) == 0 || (drawableD = b0.d(context, resourceId)) == null) ? typedArray.getDrawable(i6) : drawableD;
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
