package o4;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Path;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import m0.d;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {
    public static float a(String[] strArr, int i6) throws NumberFormatException {
        float f6 = Float.parseFloat(strArr[i6]);
        if (f6 >= 0.0f && f6 <= 1.0f) {
            return f6;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f6);
    }

    public static boolean b(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int c(Context context, int i6, int i7) {
        TypedValue typedValueA = q4.b.a(context.getTheme(), i6);
        return (typedValueA == null || typedValueA.type != 16) ? i7 : typedValueA.data;
    }

    public static TimeInterpolator d(Context context, int i6, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i6, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!b(strValueOf, "cubic-bezier") && !b(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (b(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(a(strArrSplit, 0), a(strArrSplit, 1), a(strArrSplit, 2), a(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!b(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            d.a.b(d.b(strSubstring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e6) {
            throw new RuntimeException("Error in parsing ".concat(strSubstring), e6);
        }
    }
}
