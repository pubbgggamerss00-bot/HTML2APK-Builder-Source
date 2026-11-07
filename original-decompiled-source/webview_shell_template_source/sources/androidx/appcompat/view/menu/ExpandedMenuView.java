package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.f;
import l.b1;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements f.b, k, AdapterView.OnItemClickListener {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f130t = {R.attr.background, R.attr.divider};
    public f s;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        b1 b1VarE = b1.e(R.attr.listViewStyle, 0, context, attributeSet, f130t);
        TypedArray typedArray = b1VarE.f13583b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(b1VarE.b(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(b1VarE.b(1));
        }
        b1VarE.f();
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean a(h hVar) {
        return this.s.q(hVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(f fVar) {
        this.s = fVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
        a((h) getAdapter().getItem(i6));
    }
}
