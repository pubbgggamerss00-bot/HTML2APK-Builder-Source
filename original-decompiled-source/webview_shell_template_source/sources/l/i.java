package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final CompoundButton f13650a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f13651b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f13652c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13653d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13654e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13655f;

    public i(CompoundButton compoundButton) {
        this.f13650a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f13650a;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f13653d || this.f13654e) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f13653d) {
                    drawableMutate.setTintList(this.f13651b);
                }
                if (this.f13654e) {
                    drawableMutate.setTintMode(this.f13652c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i6) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.f13650a;
        Context context = compoundButton.getContext();
        int[] iArr = f.a.f12945m;
        b1 b1VarE = b1.e(i6, 0, context, attributeSet, iArr);
        TypedArray typedArray = b1VarE.f13583b;
        u0.f0.l(compoundButton, compoundButton.getContext(), iArr, attributeSet, b1VarE.f13583b, i6, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(y5.b0.d(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(y5.b0.d(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(b1VarE.a(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(h0.b(typedArray.getInt(3, -1), null));
            }
            b1VarE.f();
        } catch (Throwable th) {
            b1VarE.f();
            throw th;
        }
    }
}
