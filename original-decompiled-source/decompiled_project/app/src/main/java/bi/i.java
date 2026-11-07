package bi;

import java.util.Iterator;
import kotlinx.serialization.internal.p;

/* loaded from: classes2.dex */
public final class i implements Iterable<String>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f4275a;

    public i(p pVar) {
        this.f4275a = pVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new h(this.f4275a);
    }
}
