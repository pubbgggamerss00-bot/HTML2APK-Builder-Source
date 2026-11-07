package e;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f extends a<Intent, d.a> {
    @Override // e.a
    public final Intent a(Context context, Intent intent) {
        Intent intent2 = intent;
        j.e("input", intent2);
        return intent2;
    }

    @Override // e.a
    public final Object c(Intent intent, int i6) {
        return new d.a(intent, i6);
    }
}
