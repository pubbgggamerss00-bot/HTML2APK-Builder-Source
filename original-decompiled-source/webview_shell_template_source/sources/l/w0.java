package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f13743a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f13744b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f13745c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f13746d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f13747e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f13748f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f13749g = new int[1];

    public static void a(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f.a.f12942j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i6) {
        ColorStateList colorStateListD = d(context, i6);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f13744b, colorStateListD.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f13743a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f6 = typedValue.getFloat();
        return m0.a.e(c(context, i6), Math.round(Color.alpha(r4) * f6));
    }

    public static int c(Context context, int i6) {
        int[] iArr = f13749g;
        iArr[0] = i6;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i6) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f13749g;
        iArr[0] = i6;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = k0.a.b(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
