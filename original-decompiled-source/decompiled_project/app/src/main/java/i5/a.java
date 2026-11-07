package i5;

import android.os.Bundle;
import c6.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import pg.n;
import qg.k0;
import sh.j0;
import u3.d;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements c.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f14160a;

    @Override // c6.c.b
    public final Bundle a() {
        n[] nVarArr;
        b bVar = this.f14160a;
        for (Map.Entry entry : k0.j(bVar.f14164d).entrySet()) {
            bVar.a(((j0) entry.getValue()).getValue(), (String) entry.getKey());
        }
        for (Map.Entry entry2 : k0.j(bVar.f14162b).entrySet()) {
            bVar.a(((c.b) entry2.getValue()).a(), (String) entry2.getKey());
        }
        LinkedHashMap linkedHashMap = bVar.f14161a;
        if (linkedHashMap.isEmpty()) {
            nVarArr = new n[0];
        } else {
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                arrayList.add(new n((String) entry3.getKey(), entry3.getValue()));
            }
            nVarArr = (n[]) arrayList.toArray(new n[0]);
        }
        return d.a((n[]) Arrays.copyOf(nVarArr, nVarArr.length));
    }
}
