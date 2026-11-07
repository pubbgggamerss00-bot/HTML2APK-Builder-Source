package p8;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.r;
import pg.f0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f21355a = new f();

    public static String a(InputStream inputStream) throws UnsupportedEncodingException {
        int i10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        long j10 = 0;
        while (j10 < 4194304 && (i10 = inputStream.read(bArr)) >= 0) {
            byteArrayOutputStream.write(bArr, 0, i10);
            j10 += i10;
        }
        String string = byteArrayOutputStream.toString(mh.a.f18238b.name());
        r.d(string, "toString(...)");
        return string;
    }

    public static ArrayList b(FileInputStream fileInputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
        long length = 0;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                if (!nextEntry.isDirectory()) {
                    Set<String> set = c.f21342a;
                    String name = nextEntry.getName();
                    r.d(name, "getName(...)");
                    if (c.b(name)) {
                        f21355a.getClass();
                        String strA = a(zipInputStream);
                        length += strA.length();
                        if (length > 25165824) {
                            break;
                        }
                        arrayList.add(strA);
                    }
                }
            } finally {
            }
        }
        f0 f0Var = f0.f21461a;
        zipInputStream.close();
        return arrayList;
    }
}
