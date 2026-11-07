package sc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public interface s {
    InputStream a(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException;

    OutputStream b(FileOutputStream fileOutputStream, byte[] bArr) throws GeneralSecurityException, IOException;
}
