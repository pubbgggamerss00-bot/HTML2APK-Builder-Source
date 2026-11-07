package f4;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends n4.d {

    /* renamed from: w, reason: collision with root package name */
    public int f13061w;

    /* renamed from: x, reason: collision with root package name */
    public int f13062x;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements d {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends ViewGroup.MarginLayoutParams {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Deprecated
    /* renamed from: f4.c$c, reason: collision with other inner class name */
    public interface InterfaceC0059c {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface d {
    }

    private int getVisibleChipCount() {
        int i6 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if ((getChildAt(i7) instanceof Chip) && getChildAt(i7).getVisibility() == 0) {
                i6++;
            }
        }
        return i6;
    }

    @Override // n4.d
    public final boolean a() {
        return this.f13970u;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        throw null;
    }

    public List<Integer> getCheckedChipIds() {
        throw null;
    }

    public int getChipSpacingHorizontal() {
        return this.f13061w;
    }

    public int getChipSpacingVertical() {
        return this.f13062x;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f13970u) {
            getVisibleChipCount();
        }
        getRowCount();
        throw null;
    }

    public void setChipSpacing(int i6) {
        setChipSpacingHorizontal(i6);
        setChipSpacingVertical(i6);
    }

    public void setChipSpacingHorizontal(int i6) {
        if (this.f13061w != i6) {
            this.f13061w = i6;
            setItemSpacing(i6);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i6) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i6));
    }

    public void setChipSpacingResource(int i6) {
        setChipSpacing(getResources().getDimensionPixelOffset(i6));
    }

    public void setChipSpacingVertical(int i6) {
        if (this.f13062x != i6) {
            this.f13062x = i6;
            setLineSpacing(i6);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i6) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i6));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i6) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(InterfaceC0059c interfaceC0059c) {
        if (interfaceC0059c == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new a());
        }
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        throw null;
    }

    public void setSelectionRequired(boolean z6) {
        throw null;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i6) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i6) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // n4.d
    public void setSingleLine(boolean z6) {
        super.setSingleLine(z6);
    }

    public void setSingleSelection(boolean z6) {
        throw null;
    }

    public void setSingleLine(int i6) {
        setSingleLine(getResources().getBoolean(i6));
    }

    public void setSingleSelection(int i6) {
        setSingleSelection(getResources().getBoolean(i6));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public void setOnCheckedStateChangeListener(d dVar) {
    }
}
