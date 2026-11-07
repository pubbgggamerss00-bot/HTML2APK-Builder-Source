package gd;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class p implements sc.s {
    @Override // sc.s
    public final InputStream a(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return new w(this, inputStream, bArr);
    }

    @Override // sc.s
    public final OutputStream b(FileOutputStream fileOutputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return new x(this, fileOutputStream, bArr);
    }

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract u g() throws GeneralSecurityException;

    public abstract v h(byte[] bArr) throws GeneralSecurityException;
}
