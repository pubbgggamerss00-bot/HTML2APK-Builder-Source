package androidx.work;

import androidx.work.r;
import java.util.HashSet;
import java.util.UUID;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m extends r {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a extends r.a<a, m> {
        public a(Class<? extends ListenableWorker> cls) {
            HashSet hashSet = new HashSet();
            this.f1854c = hashSet;
            this.f1852a = UUID.randomUUID();
            this.f1853b = new r2.l(this.f1852a.toString(), cls.getName());
            hashSet.add(cls.getName());
            this.f1853b.f14283d = OverwritingInputMerger.class.getName();
        }
    }
}
