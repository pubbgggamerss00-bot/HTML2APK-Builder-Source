package sg;

import java.util.Comparator;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class c implements Comparator<Comparable<? super Object>> {

    /* renamed from: a, reason: collision with root package name */
    public static final c f24920a = new c();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> a10 = comparable;
        Comparable<? super Object> b10 = comparable2;
        r.e(a10, "a");
        r.e(b10, "b");
        return b10.compareTo(a10);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return b.f24919a;
    }
}
