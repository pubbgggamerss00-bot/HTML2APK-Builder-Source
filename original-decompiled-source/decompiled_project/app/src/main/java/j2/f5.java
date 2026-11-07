package j2;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f5 implements lh.g<e5> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14724a = new ArrayList();

    public final void b(Object obj, String str) {
        this.f14724a.add(new e5(str, obj));
    }

    @Override // lh.g
    public final Iterator<e5> iterator() {
        return this.f14724a.iterator();
    }
}
