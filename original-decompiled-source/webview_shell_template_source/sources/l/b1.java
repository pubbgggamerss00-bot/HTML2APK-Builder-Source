package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import l.a0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13582a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f13583b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f13584c;

    public b1(Context context, TypedArray typedArray) {
        this.f13582a = context;
        this.f13583b = typedArray;
    }

    public static b1 e(int i6, int i7, Context context, AttributeSet attributeSet, int[] iArr) {
        return new b1(context, context.obtainStyledAttributes(attributeSet, iArr, i6, i7));
    }

    public final ColorStateList a(int i6) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = this.f13583b;
        return (!typedArray.hasValue(i6) || (resourceId = typedArray.getResourceId(i6, 0)) == 0 || (colorStateListB = k0.a.b(this.f13582a, resourceId)) == null) ? typedArray.getColorStateList(i6) : colorStateListB;
    }

    public final Drawable b(int i6) {
        int resourceId;
        TypedArray typedArray = this.f13583b;
        return (!typedArray.hasValue(i6) || (resourceId = typedArray.getResourceId(i6, 0)) == 0) ? typedArray.getDrawable(i6) : y5.b0.d(this.f13582a, resourceId);
    }

    public final Drawable c(int i6) {
        int resourceId;
        Drawable drawableD;
        if (!this.f13583b.hasValue(i6) || (resourceId = this.f13583b.getResourceId(i6, 0)) == 0) {
            return null;
        }
        j jVarA = j.a();
        Context context = this.f13582a;
        synchronized (jVarA) {
            drawableD = jVarA.f13674a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public final Typeface d(int i6, int i7, a0.a aVar) {
        int resourceId = this.f13583b.getResourceId(i6, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f13584c == null) {
            this.f13584c = new TypedValue();
        }
        TypedValue typedValue = this.f13584c;
        ThreadLocal<TypedValue> threadLocal = l0.f.f13795a;
        Context context = this.f13582a;
        if (context.isRestricted()) {
            return null;
        }
        return l0.f.a(context, resourceId, typedValue, i7, aVar, true, false);
    }

    public final void f() {
        this.f13583b.recycle();
    }
}
