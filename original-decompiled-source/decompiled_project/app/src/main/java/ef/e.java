package ef;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class e extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final h f8716a;

    public e(h hVar) {
        this.f8716a = hVar;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f8716a.write(bArr, i10, i11);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        h hVar = this.f8716a;
        hVar.getClass();
        hVar.write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f8716a.write(i10);
    }
}
