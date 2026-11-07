package y5;

import androidx.room.t0;
import cc.i;
import eh.p;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b implements x5.b {

    /* renamed from: a, reason: collision with root package name */
    public final i f33940a;

    public b(i iVar) {
        this.f33940a = iVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((i6.c) this.f33940a.f5370a).close();
    }

    @Override // x5.b
    public final <R> Object o0(boolean z10, p<? super t0, ? super tg.e<? super R>, ? extends Object> pVar, tg.e<? super R> eVar) {
        i6.c cVar = (i6.c) this.f33940a.f5370a;
        cVar.getDatabaseName();
        return pVar.invoke(new c(new a(cVar.P())), eVar);
    }
}
