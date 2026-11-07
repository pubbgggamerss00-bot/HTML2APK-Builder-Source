package u0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.k implements p5.l<View, Iterator<? extends View>> {
    public static final i0 s = new i0(1);

    @Override // p5.l
    public final Iterator<? extends View> invoke(View view) {
        View view2 = view;
        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup != null) {
            return new j0(viewGroup);
        }
        return null;
    }
}
