package uh;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* loaded from: classes2.dex */
public final class t {
    public static final void a(ZipOutputStream zipOutputStream, String str, byte[] bArr) throws IOException {
        zipOutputStream.putNextEntry(new ZipEntry(str));
        zipOutputStream.write(bArr);
        zipOutputStream.closeEntry();
    }

    public static final void b(ZipOutputStream zipOutputStream, String str, File file) throws IOException {
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ah.b.a(fileInputStream, zipOutputStream, 8192);
            fileInputStream.close();
            zipOutputStream.closeEntry();
        } finally {
        }
    }

    public static final s c(Object obj) {
        if (obj != a.f29716a) {
            return (s) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final boolean d(Object obj) {
        return obj == a.f29716a;
    }
}
