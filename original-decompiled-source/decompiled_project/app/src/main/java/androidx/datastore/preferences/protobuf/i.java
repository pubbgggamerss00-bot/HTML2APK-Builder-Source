package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.j;

/* loaded from: classes.dex */
public final class i extends j.a {

    /* renamed from: a, reason: collision with root package name */
    public int f2033a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f2034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f2035c;

    public i(j jVar) {
        this.f2035c = jVar;
        this.f2034b = jVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2033a < this.f2034b;
    }
}
