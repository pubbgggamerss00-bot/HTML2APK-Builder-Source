package i7;

import g7.p;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14184a;

    /* renamed from: b, reason: collision with root package name */
    public final h7.c f14185b;

    /* renamed from: c, reason: collision with root package name */
    public final p f14186c;

    public c(Object obj, h7.c cVar, p pVar) {
        this.f14184a = obj;
        this.f14185b = cVar;
        this.f14186c = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        h7.c cVar2 = cVar.f14185b;
        h7.c cVar3 = this.f14185b;
        return r.a(cVar3, cVar2) && cVar3.equals(this.f14184a, cVar.f14184a) && r.a(this.f14186c, cVar.f14186c);
    }

    public final int hashCode() {
        h7.c cVar = this.f14185b;
        return this.f14186c.hashCode() + ((cVar.hashCode(this.f14184a) + (cVar.hashCode() * 31)) * 31);
    }
}
