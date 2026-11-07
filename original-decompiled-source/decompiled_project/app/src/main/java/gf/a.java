package gf;

import java.io.FilterOutputStream;
import java.io.IOException;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public final class a extends FilterOutputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f12043c = {RegisterType.LONG_HI, 10};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f12044d = {10};

    /* renamed from: a, reason: collision with root package name */
    public long f12045a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12046b;

    public final void h() throws IOException {
        if (this.f12046b) {
            return;
        }
        write(f12044d);
        this.f12046b = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f12046b = false;
        ((FilterOutputStream) this).out.write(i10);
        this.f12045a++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f12046b = false;
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        this.f12045a += i11;
    }
}
