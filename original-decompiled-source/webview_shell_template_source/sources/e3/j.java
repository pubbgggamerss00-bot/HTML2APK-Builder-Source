package e3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Map<BasePendingResult<?>, Boolean> f12888a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final Map<v3.f<?>, Boolean> f12889b = Collections.synchronizedMap(new WeakHashMap());

    public final void a(boolean z6, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f12888a) {
            map = new HashMap(this.f12888a);
        }
        synchronized (this.f12889b) {
            map2 = new HashMap(this.f12889b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z6 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).b(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z6 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((v3.f) entry2.getKey()).a(new d3.b(status));
            }
        }
    }
}
