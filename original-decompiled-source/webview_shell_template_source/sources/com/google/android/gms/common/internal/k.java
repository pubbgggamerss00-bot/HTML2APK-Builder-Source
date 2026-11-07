package com.google.android.gms.common.internal;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f2460a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f2461b;

        public final void a(String str, Object obj) {
            int length = str.length();
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(length + 1 + strValueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(strValueOf);
            this.f2460a.add(sb.toString());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f2461b.getClass().getSimpleName());
            sb.append('{');
            ArrayList arrayList = this.f2460a;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                sb.append((String) arrayList.get(i6));
                if (i6 < size - 1) {
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
