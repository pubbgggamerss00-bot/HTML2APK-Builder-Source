package i1;

import android.view.ViewGroup;
import androidx.fragment.app.k;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: t, reason: collision with root package name */
    public final ViewGroup f13343t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, ViewGroup viewGroup) {
        super(kVar, "Attempting to add fragment " + kVar + " to container " + viewGroup + " which is not a FragmentContainerView");
        j.e("fragment", kVar);
        this.f13343t = viewGroup;
    }
}
