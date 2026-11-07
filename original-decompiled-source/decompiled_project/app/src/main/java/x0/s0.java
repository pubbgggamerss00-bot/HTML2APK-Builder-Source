package x0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<Object> f31912a;

    public final boolean a(b bVar) {
        ArrayList<Object> arrayList = this.f31912a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                if (kotlin.jvm.internal.r.a(obj, bVar)) {
                    return true;
                }
                if ((obj instanceof s0) && ((s0) obj).a(bVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final s0 b() {
        Object obj;
        ArrayList<Object> arrayList = this.f31912a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if (obj instanceof s0) {
                    break;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        s0 s0Var = obj instanceof s0 ? (s0) obj : null;
        return s0Var != null ? s0Var.b() : this;
    }

    public final boolean c(b bVar) {
        ArrayList<Object> arrayList = this.f31912a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof b) {
                    if (obj.equals(bVar)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof s0) && !((s0) obj).c(bVar)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f31912a = null;
                return false;
            }
        }
        return true;
    }
}
