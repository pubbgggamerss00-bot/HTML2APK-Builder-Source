package androidx.fragment.app;

import android.animation.Animator;
import android.util.Log;
import androidx.fragment.app.j0;
import q0.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f implements c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animator f1100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0.d f1101b;

    public f(Animator animator, j0.d dVar) {
        this.f1100a = animator;
        this.f1101b = dVar;
    }

    @Override // q0.c.a
    public final void onCancel() {
        this.f1100a.end();
        if (y.H(2)) {
            Log.v("FragmentManager", "Animator from operation " + this.f1101b + " has been canceled.");
        }
    }
}
