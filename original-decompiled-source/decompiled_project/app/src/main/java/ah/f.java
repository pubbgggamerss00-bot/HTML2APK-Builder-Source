package ah;

import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final File f565a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f566b;

    public f(File file, List<? extends File> list) {
        this.f565a = file;
        this.f566b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f565a.equals(fVar.f565a) && this.f566b.equals(fVar.f566b);
    }

    public final int hashCode() {
        return this.f566b.hashCode() + (this.f565a.hashCode() * 31);
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.f565a + ", segments=" + this.f566b + ')';
    }
}
