package hb;

import i0.x1;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class q0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12966a;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[ORIG_RETURN, RETURN] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.f12966a) {
            case 0:
                b bVar = (b) obj;
                b bVar2 = (b) obj2;
                com.google.android.gms.common.internal.p.f(bVar);
                com.google.android.gms.common.internal.p.f(bVar2);
                int i10 = bVar.f12926a;
                int i11 = bVar2.f12926a;
                if (i10 != i11) {
                    return i10 >= i11 ? 1 : -1;
                }
                int i12 = bVar.f12927b;
                int i13 = bVar2.f12927b;
                if (i12 == i13) {
                    return 0;
                }
                if (i12 < i13) {
                }
            default:
                return x1.b(((ii.h) obj).f14551a, ((ii.h) obj2).f14551a);
        }
    }
}
