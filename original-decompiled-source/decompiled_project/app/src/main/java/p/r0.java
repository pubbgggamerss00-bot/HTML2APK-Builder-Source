package p;

import java.util.List;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f20710a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f20711b = new h0(0);

    public static final void a(int i10, List list) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            q.d.b("Index " + i10 + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(List list, int i10, int i11) {
        int size = list.size();
        if (i10 > i11) {
            q.d.a("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
            throw null;
        }
        if (i10 < 0) {
            q.d.b("fromIndex (" + i10 + ") is less than 0.");
            throw null;
        }
        if (i11 <= size) {
            return;
        }
        q.d.b("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
