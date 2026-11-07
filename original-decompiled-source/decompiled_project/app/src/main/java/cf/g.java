package cf;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class g extends ef.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ef.h f5437c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ef.h hVar, ef.h hVar2) {
        super(hVar);
        this.f5437c = hVar2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5437c.close();
    }
}
