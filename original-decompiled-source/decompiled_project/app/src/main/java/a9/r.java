package a9;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes.dex */
public final class r<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        return i0.x1.b((Integer) ((Map.Entry) t3).getValue(), (Integer) ((Map.Entry) t10).getValue());
    }
}
