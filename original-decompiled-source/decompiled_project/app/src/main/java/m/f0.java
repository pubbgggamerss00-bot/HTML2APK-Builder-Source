package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f17127a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f17128b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f17129c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f17130d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f17131e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f17132f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f17133g = new int[1];

    public static void a(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(g.a.f11247f);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList colorStateListD = d(context, i10);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f17128b, colorStateListD.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f17127a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        return r3.a.d(c(context, i10), Math.round(Color.alpha(r4) * f10));
    }

    public static int c(Context context, int i10) {
        int[] iArr = f17133g;
        iArr[0] = i10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i10) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f17133g;
        iArr[0] = i10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = p3.b.getColorStateList(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
