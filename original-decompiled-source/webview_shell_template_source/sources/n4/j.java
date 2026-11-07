package n4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.camera.camera2.internal.v0;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f13990a = {R.attr.colorPrimary};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f13991b = {R.attr.colorPrimaryVariant};

    public static void a(Context context, AttributeSet attributeSet, int i6, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3.a.H, i6, i7);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z6) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f13991b, "Theme.MaterialComponents");
            }
        }
        c(context, f13990a, "Theme.AppCompat");
    }

    public static void b(Context context, AttributeSet attributeSet, int[] iArr, int i6, int i7, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3.a.H, i6, i7);
        boolean z6 = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i6, i7);
            for (int i8 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i8, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z6 = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z6 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z6) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i6 = 0; i6 < iArr.length; i6++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i6)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(v0.b("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static TypedArray d(Context context, AttributeSet attributeSet, int[] iArr, int i6, int i7, int... iArr2) {
        a(context, attributeSet, i6, i7);
        b(context, attributeSet, iArr, i6, i7, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i6, i7);
    }
}
