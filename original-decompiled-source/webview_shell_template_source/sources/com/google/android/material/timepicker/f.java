package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.processing.p;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.htmltoapk.template.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class f extends ConstraintLayout {
    public final p I;
    public int J;
    public final u4.g K;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i6, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            p pVar = this.I;
            handler.removeCallbacks(pVar);
            handler.post(pVar);
        }
    }

    public void h() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.b(this);
        HashMap map = new HashMap();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i7 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i7 == null) {
                    i7 = 1;
                }
                if (!map.containsKey(i7)) {
                    map.put(i7, new ArrayList());
                }
                ((List) map.get(i7)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.J * 0.66f) : this.J;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id);
                HashMap<Integer, d.a> map2 = dVar.f823c;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id), new d.a());
                }
                d.b bVar = map2.get(Integer.valueOf(id)).f827d;
                bVar.f879z = R.id.circle_center;
                bVar.A = iRound;
                bVar.B = size;
                size += 360.0f / list.size();
            }
        }
        dVar.a(this);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            p pVar = this.I;
            handler.removeCallbacks(pVar);
            handler.post(pVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i6) {
        this.K.r(ColorStateList.valueOf(i6));
    }

    public f(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        u4.g gVar = new u4.g();
        this.K = gVar;
        gVar.setShapeAppearanceModel(gVar.f14610t.f14619a.d(new u4.h(0.5f)));
        this.K.r(ColorStateList.valueOf(-1));
        setBackground(this.K);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3.a.f15084z, i6, 0);
        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.I = new p(4, this);
        typedArrayObtainStyledAttributes.recycle();
    }
}
