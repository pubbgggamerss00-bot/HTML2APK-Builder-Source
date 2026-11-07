package v4;

import ah.l;
import java.io.File;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class d extends s implements eh.a<File> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n2.b f30614a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n2.b bVar) {
        super(0);
        this.f30614a = bVar;
    }

    @Override // eh.a
    public final File invoke() {
        File file = (File) this.f30614a.invoke();
        if (l.g(file).equals("preferences_pb")) {
            File absoluteFile = file.getAbsoluteFile();
            r.d(absoluteFile, "file.absoluteFile");
            return absoluteFile;
        }
        throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
