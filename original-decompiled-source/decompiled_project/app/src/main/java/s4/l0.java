package s4;

import java.io.File;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.s implements eh.l<File, v0> {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f24302a = new l0(1);

    @Override // eh.l
    public final v0 invoke(File file) {
        File it = file;
        kotlin.jvm.internal.r.e(it, "it");
        String absolutePath = it.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.r.d(absolutePath, "file.canonicalFile.absolutePath");
        return new h1(absolutePath);
    }
}
