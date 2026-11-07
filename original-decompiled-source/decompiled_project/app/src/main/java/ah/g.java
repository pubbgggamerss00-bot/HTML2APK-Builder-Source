package ah;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public class g extends IOException {
    public g(File file, File file2, String str) {
        r.e(file, "file");
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        String string = sb.toString();
        r.d(string, "toString(...)");
        super(string);
    }
}
