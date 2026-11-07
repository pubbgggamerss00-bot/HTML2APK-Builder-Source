package i1;

import androidx.fragment.app.k;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class d extends RuntimeException {
    public final k s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, String str) {
        super(str);
        j.e("fragment", kVar);
        this.s = kVar;
    }
}
