package androidx.activity;

import android.content.res.Resources;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.k implements p5.l<Resources, Boolean> {
    public static final q0 s = new q0(1);

    @Override // p5.l
    public final Boolean invoke(Resources resources) {
        Resources resources2 = resources;
        kotlin.jvm.internal.j.e("resources", resources2);
        return Boolean.valueOf((resources2.getConfiguration().uiMode & 48) == 32);
    }
}
