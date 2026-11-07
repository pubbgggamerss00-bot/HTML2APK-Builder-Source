package af;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: g, reason: collision with root package name */
    public InputStream f529g;

    /* renamed from: h, reason: collision with root package name */
    public d f530h;

    @Override // af.a
    public final void close() throws IOException {
        a();
        this.f527e = true;
        d dVar = this.f530h;
        dVar.f536c.clear();
        dVar.f534a = 0L;
    }

    @Override // af.a
    public final int read() throws IOException {
        this.f526d = 0;
        long j10 = this.f524b;
        d dVar = this.f530h;
        long j11 = dVar.f534a;
        if (j10 >= j11) {
            int i10 = (int) ((j10 - j11) + 1);
            if (dVar.a(i10, this.f529g) < i10) {
                return -1;
            }
        }
        int iB = dVar.b(this.f524b);
        if (iB >= 0) {
            this.f524b++;
        }
        return iB;
    }

    @Override // af.a
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f526d = 0;
        long j10 = this.f524b;
        d dVar = this.f530h;
        long j11 = dVar.f534a;
        if (j10 >= j11) {
            dVar.a((int) ((j10 - j11) + i11), this.f529g);
        }
        int iC = this.f530h.c(this.f524b, bArr, i10, i11);
        if (iC > 0) {
            this.f524b += iC;
        }
        return iC;
    }
}
