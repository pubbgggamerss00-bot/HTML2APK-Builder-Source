package androidx.lifecycle;

import androidx.lifecycle.l;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d implements r {

    /* renamed from: a, reason: collision with root package name */
    public final h[] f2258a;

    public d(h[] hVarArr) {
        this.f2258a = hVarArr;
    }

    @Override // androidx.lifecycle.r
    public final void l(t tVar, l.a aVar) {
        new HashMap();
        h[] hVarArr = this.f2258a;
        for (h hVar : hVarArr) {
            hVar.a();
        }
        for (h hVar2 : hVarArr) {
            hVar2.a();
        }
    }
}
