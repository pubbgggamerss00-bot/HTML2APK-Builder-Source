package cf;

import java.io.FilterOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class s extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f5560a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, ef.e eVar) {
        super(eVar);
        this.f5560a = tVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        l lVar = l.f5485k1;
        t tVar = this.f5560a;
        tVar.N0(lVar, (int) tVar.f5561c.f8730c);
        tVar.f5563e = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
    }
}
