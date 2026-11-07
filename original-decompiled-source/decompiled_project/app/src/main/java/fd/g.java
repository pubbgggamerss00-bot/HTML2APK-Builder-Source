package fd;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import sc.o;
import sc.s;

/* loaded from: classes2.dex */
public final class g implements s {

    /* renamed from: a, reason: collision with root package name */
    public o<s> f11179a;

    @Override // sc.s
    public final InputStream a(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        o<s> oVar = this.f11179a;
        e eVar = new e();
        eVar.f11174a = false;
        eVar.f11175b = null;
        eVar.f11177d = oVar;
        if (inputStream.markSupported()) {
            eVar.f11176c = inputStream;
        } else {
            eVar.f11176c = new BufferedInputStream(inputStream);
        }
        eVar.f11176c.mark(Integer.MAX_VALUE);
        eVar.f11178e = (byte[]) bArr.clone();
        return eVar;
    }

    @Override // sc.s
    public final OutputStream b(FileOutputStream fileOutputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return this.f11179a.f24816b.f24823b.b(fileOutputStream, bArr);
    }
}
