package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.i;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class c extends View {
    public int[] s;

    /* renamed from: t, reason: collision with root package name */
    public int f811t;

    /* renamed from: u, reason: collision with root package name */
    public Context f812u;

    /* renamed from: v, reason: collision with root package name */
    public i f813v;

    /* renamed from: w, reason: collision with root package name */
    public String f814w;

    /* renamed from: x, reason: collision with root package name */
    public String f815x;

    /* renamed from: y, reason: collision with root package name */
    public View[] f816y;

    /* renamed from: z, reason: collision with root package name */
    public HashMap<Integer, String> f817z;

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = new int[32];
        this.f816y = null;
        this.f817z = new HashMap<>();
        this.f812u = context;
        g(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        int identifier;
        HashMap<String, Integer> map;
        Context context = this.f812u;
        if (str == null || str.length() == 0 || context == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            identifier = 0;
        } else {
            Integer num = (strTrim == null || (map = constraintLayout.E) == null || !map.containsKey(strTrim)) ? null : constraintLayout.E.get(strTrim);
            if (num instanceof Integer) {
                identifier = num.intValue();
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = f(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = e0.c.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.f817z.put(Integer.valueOf(identifier), strTrim);
            b(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public final void b(int i6) {
        if (i6 == getId()) {
            return;
        }
        int i7 = this.f811t + 1;
        int[] iArr = this.s;
        if (i7 > iArr.length) {
            this.s = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.s;
        int i8 = this.f811t;
        iArr2[i8] = i6;
        this.f811t = i8 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f812u == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = constraintLayout.getChildAt(i6);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.a) && strTrim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i6 = 0; i6 < this.f811t; i6++) {
            View view = constraintLayout.s.get(this.s[i6]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int f(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f812u.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = constraintLayout.getChildAt(i6);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e0.d.f12765b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f814w = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f815x = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.s, this.f811t);
    }

    public final void i() {
        if (this.f813v == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).f780q0 = this.f813v;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f814w;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f815x;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f814w = str;
        if (str == null) {
            return;
        }
        int i6 = 0;
        this.f811t = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i6);
            if (iIndexOf == -1) {
                a(str.substring(i6));
                return;
            } else {
                a(str.substring(i6, iIndexOf));
                i6 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f815x = str;
        if (str == null) {
            return;
        }
        int i6 = 0;
        this.f811t = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i6);
            if (iIndexOf == -1) {
                c(str.substring(i6));
                return;
            } else {
                c(str.substring(i6, iIndexOf));
                i6 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f814w = null;
        this.f811t = 0;
        for (int i6 : iArr) {
            b(i6);
        }
    }

    @Override // android.view.View
    public final void setTag(int i6, Object obj) {
        super.setTag(i6, obj);
        if (obj == null && this.f814w == null) {
            b(i6);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void h(b0.e eVar, boolean z6) {
    }
}
