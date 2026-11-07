package ne;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f18797a;

    /* renamed from: b, reason: collision with root package name */
    public final d f18798b;

    public c(Set<e> set, d dVar) {
        this.f18797a = b(set);
        this.f18798b = dVar;
    }

    public static String b(Set<e> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<e> it = set.iterator();
        while (it.hasNext()) {
            e next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // ne.h
    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        String str = this.f18797a;
        d dVar = this.f18798b;
        synchronized (dVar.f18800a) {
            setUnmodifiableSet = Collections.unmodifiableSet(dVar.f18800a);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (dVar.f18800a) {
            setUnmodifiableSet2 = Collections.unmodifiableSet(dVar.f18800a);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
