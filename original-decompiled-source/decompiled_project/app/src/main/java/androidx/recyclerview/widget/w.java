package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.v;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f2818a;

    public w(v vVar) {
        this.f2818a = vVar;
    }

    public final void a(int i10) {
        v vVar = this.f2818a;
        View childAt = vVar.getChildAt(i10);
        if (childAt != null) {
            v.a0 a0VarJ = v.J(childAt);
            v.d dVar = vVar.f2680m;
            if (dVar != null && a0VarJ != null) {
                dVar.e(a0VarJ);
            }
            childAt.clearAnimation();
        }
        vVar.removeViewAt(i10);
    }
}
