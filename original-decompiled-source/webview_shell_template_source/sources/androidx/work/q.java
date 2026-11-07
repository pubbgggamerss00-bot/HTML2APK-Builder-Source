package androidx.work;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.camera.camera2.internal.v0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class q {
    public void a(m mVar) {
        List listSingletonList = Collections.singletonList(mVar);
        j2.k kVar = (j2.k) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        j2.g gVar = new j2.g(kVar, listSingletonList);
        if (gVar.f13467f) {
            k.c().f(j2.g.f13461g, v0.b("Already enqueued work ids (", TextUtils.join(", ", gVar.f13465d), ")"), new Throwable[0]);
        } else {
            kVar.f13477d.a(new s2.e(gVar));
        }
    }
}
