package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.core.processing.p;
import com.htmltoapk.template.R;
import java.util.ArrayList;
import java.util.List;
import x0.a;
import x0.b;
import x0.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {

    /* renamed from: u, reason: collision with root package name */
    public static final Object f975u = new Object();
    public final ArrayList s;

    /* renamed from: t, reason: collision with root package name */
    public b f976t;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.s = new ArrayList();
    }

    private c getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof c) {
            return (c) tag;
        }
        c cVar = new c(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, cVar);
        return cVar;
    }

    public final void a() {
        ArrayList arrayList = this.s;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f976t = new b(getOrInstallSystemBarStateMonitor(), arrayList);
        getChildCount();
        if (this.f976t.f15109a.size() <= 0) {
            return;
        }
        a aVar = this.f976t.f15109a.get(0);
        getContext();
        aVar.getClass();
        throw new IllegalArgumentException("Unexpected side: 0");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f975u) {
            b bVar = this.f976t;
            int childCount = getChildCount() - (bVar != null ? bVar.f15109a.size() : 0);
            if (i6 > childCount || i6 < 0) {
                i6 = childCount;
            }
        }
        super.addView(view, i6, layoutParams);
    }

    public final void b() {
        if (this.f976t != null) {
            removeViews(getChildCount() - this.f976t.f15109a.size(), this.f976t.f15109a.size());
            if (this.f976t.f15109a.size() > 0) {
                this.f976t.f15109a.get(0).getClass();
                throw null;
            }
            b bVar = this.f976t;
            ArrayList<a> arrayList = bVar.f15109a;
            if (!bVar.f15112d) {
                bVar.f15112d = true;
                bVar.f15110b.f15114b.remove(bVar);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).f15108a = null;
                }
                arrayList.clear();
            }
            this.f976t = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f976t != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof c) {
            c cVar = (c) tag;
            if (cVar.f15114b.isEmpty()) {
                cVar.f15113a.post(new p(10, cVar));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<a> list) {
        ArrayList arrayList = this.s;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }
}
