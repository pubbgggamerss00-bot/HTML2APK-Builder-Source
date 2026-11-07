package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.htmltoapk.template.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import n4.j;
import u0.f0;
import u4.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends com.google.android.material.button.a {
    public static final /* synthetic */ int S = 0;
    public final LinkedHashSet<b> M;
    public boolean N;
    public boolean O;
    public boolean P;
    public final int Q;
    public HashSet R;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends u0.a {
        public a() {
        }

        @Override // u0.a
        public final void d(View view, v0.b bVar) {
            int i6;
            AccessibilityNodeInfo accessibilityNodeInfo = bVar.f14729a;
            this.f14446a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            int i7 = MaterialButtonToggleGroup.S;
            if (view instanceof MaterialButton) {
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                    if (i8 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    }
                    if (materialButtonToggleGroup.getChildAt(i8) == view) {
                        i6 = i9;
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i8) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i8).getVisibility() != 8) {
                        i9++;
                    }
                    i8++;
                }
            } else {
                i6 = -1;
            }
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i6, 1, false, ((MaterialButton) view).M));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        void a();
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a5.a.b(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.M = new LinkedHashSet<>();
        this.N = false;
        this.R = new HashSet();
        TypedArray typedArrayD = j.d(getContext(), attributeSet, w3.a.f15074o, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayD.getBoolean(7, false));
        this.Q = typedArrayD.getResourceId(2, -1);
        this.P = typedArrayD.getBoolean(4, false);
        if (this.f12131x == null) {
            this.f12131x = p.b(new u4.a(0.0f));
        }
        setEnabled(typedArrayD.getBoolean(0, true));
        typedArrayD.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.O ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i6 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if ((getChildAt(i7) instanceof MaterialButton) && getChildAt(i7).getVisibility() != 8) {
                i6++;
            }
        }
        return i6;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // com.google.android.material.button.a, android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i6, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        n(materialButton.getId(), materialButton.M);
        f0.m(materialButton, new a());
    }

    public int getCheckedButtonId() {
        if (!this.O || this.R.isEmpty()) {
            return -1;
        }
        return ((Integer) this.R.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            int id = ((MaterialButton) getChildAt(i6)).getId();
            if (this.R.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final void n(int i6, boolean z6) {
        if (i6 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i6);
            return;
        }
        HashSet hashSet = new HashSet(this.R);
        if (z6 && !hashSet.contains(Integer.valueOf(i6))) {
            if (this.O && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i6));
        } else {
            if (z6 || !hashSet.contains(Integer.valueOf(i6))) {
                return;
            }
            if (!this.P || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i6));
            }
        }
        o(hashSet);
    }

    public final void o(Set<Integer> set) {
        HashSet hashSet = this.R;
        this.R = new HashSet(set);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            int id = ((MaterialButton) getChildAt(i6)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.N = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.N = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator<b> it = this.M.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i6 = this.Q;
        if (i6 != -1) {
            o(Collections.singleton(Integer.valueOf(i6)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.O ? 1 : 2));
    }

    public void setSelectionRequired(boolean z6) {
        this.P = z6;
    }

    public void setSingleSelection(boolean z6) {
        if (this.O != z6) {
            this.O = z6;
            o(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            ((MaterialButton) getChildAt(i6)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i6) {
        setSingleSelection(getResources().getBoolean(i6));
    }
}
