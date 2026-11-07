package lc;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class q implements Iterable<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CharSequence f16954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f16955b;

    public q(r rVar, String str) {
        this.f16955b = rVar;
        this.f16954a = str;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        r rVar = this.f16955b;
        p pVar = rVar.f16957b;
        pVar.getClass();
        return new o(pVar, rVar, this.f16954a);
    }

    public final String toString() {
        g gVar = new g(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        gVar.a(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
