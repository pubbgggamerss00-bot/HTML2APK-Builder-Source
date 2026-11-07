package com.google.android.gms.common.internal;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f6177a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f6178b;

        public final void a(Object obj, String str) {
            this.f6177a.add(k3.b.a(str, "=", String.valueOf(obj)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f6178b.getClass().getSimpleName());
            sb.append('{');
            ArrayList arrayList = this.f6177a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb.append((String) arrayList.get(i10));
                if (i10 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
