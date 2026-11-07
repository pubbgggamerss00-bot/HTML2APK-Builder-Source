package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.i;
import androidx.fragment.app.j0;
import q0.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h implements c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f1131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i.a f1133c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.d f1134d;

    public h(View view, ViewGroup viewGroup, i.a aVar, j0.d dVar) {
        this.f1131a = view;
        this.f1132b = viewGroup;
        this.f1133c = aVar;
        this.f1134d = dVar;
    }

    @Override // q0.c.a
    public final void onCancel() {
        View view = this.f1131a;
        view.clearAnimation();
        this.f1132b.endViewTransition(view);
        this.f1133c.a();
        if (y.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1134d + " has been cancelled.");
        }
    }
}
