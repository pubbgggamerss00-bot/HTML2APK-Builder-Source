package m5;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class c extends IOException {
    public c(File file, File file2, String str) {
        j.e("file", file);
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        String string = sb.toString();
        j.d("toString(...)", string);
        super(string);
    }
}
