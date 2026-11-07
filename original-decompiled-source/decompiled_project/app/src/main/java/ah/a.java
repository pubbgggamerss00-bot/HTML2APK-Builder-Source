package ah;

import java.io.File;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class a extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(File file) {
        super(file, null, "Cannot list files in a directory");
        r.e(file, "file");
    }
}
