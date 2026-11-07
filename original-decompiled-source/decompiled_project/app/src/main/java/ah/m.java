package ah;

import java.io.File;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class m extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(File file) {
        super(file, null, "The source file doesn't exist.");
        r.e(file, "file");
    }
}
