package gb;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.internal.identity_credentials.zzh;
import com.google.android.gms.tasks.TaskCompletionSource;
import fb.m;
import gb.e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import ph.p0;
import ph.q0;
import qg.x;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements q, w7.d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11912a;

    public /* synthetic */ h(Object obj) {
        this.f11912a = obj;
    }

    @Override // w7.d
    public p0 a() {
        return (q0) this.f11912a;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) throws RemoteException {
        m mVar = (m) this.f11912a;
        d dVar = (d) obj;
        ((b) dVar.getService()).i(new e.b((TaskCompletionSource) obj2), mVar, zzh.zza(dVar.getContext()));
    }

    public List b(String workSpecId) {
        r.e(workSpecId, "workSpecId");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f11912a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (r.a(((c7.j) entry.getKey()).f5006a, workSpecId)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((c7.j) it.next());
        }
        return x.c0(linkedHashMap2.values());
    }

    public u6.x c(c7.j id2) {
        r.e(id2, "id");
        return (u6.x) ((LinkedHashMap) this.f11912a).remove(id2);
    }

    public u6.x d(c7.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f11912a;
        Object xVar = linkedHashMap.get(jVar);
        if (xVar == null) {
            xVar = new u6.x(jVar);
            linkedHashMap.put(jVar, xVar);
        }
        return (u6.x) xVar;
    }

    public h() {
        this.f11912a = new LinkedHashMap();
    }
}
