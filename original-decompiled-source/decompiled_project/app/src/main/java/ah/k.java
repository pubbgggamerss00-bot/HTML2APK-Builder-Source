package ah;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class k implements eh.p {

    /* renamed from: a, reason: collision with root package name */
    public static final k f587a = new k();

    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        IOException exception = (IOException) obj2;
        r.e((File) obj, "<unused var>");
        r.e(exception, "exception");
        throw exception;
    }
}
