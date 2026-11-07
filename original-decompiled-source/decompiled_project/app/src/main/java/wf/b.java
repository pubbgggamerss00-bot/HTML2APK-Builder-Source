package wf;

import java.io.IOException;
import java.io.OutputStream;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f31526a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f31527b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static char[] a(short s10) {
        char[] cArr = f31527b;
        return new char[]{cArr[(s10 >> 12) & 15], cArr[(s10 >> 8) & 15], cArr[(s10 >> 4) & 15], cArr[s10 & 15]};
    }

    public static void b(byte b10, OutputStream outputStream) throws IOException {
        byte[] bArr = f31526a;
        outputStream.write(bArr[(b10 & 240) >> 4]);
        outputStream.write(bArr[b10 & RegisterType.DOUBLE_HI]);
    }
}
