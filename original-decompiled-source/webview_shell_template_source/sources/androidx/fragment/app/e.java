package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.i;
import androidx.fragment.app.j0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1092c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.d f1093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i.a f1094e;

    public e(ViewGroup viewGroup, View view, boolean z6, j0.d dVar, i.a aVar) {
        this.f1090a = viewGroup;
        this.f1091b = view;
        this.f1092c = z6;
        this.f1093d = dVar;
        this.f1094e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1090a;
        View view = this.f1091b;
        viewGroup.endViewTransition(view);
        boolean z6 = this.f1092c;
        j0.d dVar = this.f1093d;
        if (z6) {
            dVar.f1167a.a(view);
        }
        this.f1094e.a();
        if (y.H(2)) {
            Log.v("FragmentManager", "Animator from operation " + dVar + " has ended.");
        }
    }
}
