package x8;

import java.io.File;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class f7<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        return i0.x1.b(((File) t3).getName(), ((File) t10).getName());
    }
}
