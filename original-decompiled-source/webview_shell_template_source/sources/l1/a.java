package l1;

import androidx.fragment.app.p;
import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import java.io.PrintWriter;
import w.h;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends p {
    public final m s;

    /* renamed from: t, reason: collision with root package name */
    public final b f13817t;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: l1.a$a, reason: collision with other inner class name */
    public static class C0076a<D> extends r<D> {
        @Override // androidx.lifecycle.LiveData
        public final void onActive() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public final void onInactive() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            sb.append("null");
            sb.append("}}");
            return sb.toString();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends f0 {

        /* renamed from: e, reason: collision with root package name */
        public static final C0077a f13818e = new C0077a();

        /* renamed from: d, reason: collision with root package name */
        public final h<C0076a> f13819d = new h<>();

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: l1.a$b$a, reason: collision with other inner class name */
        public static class C0077a implements h0.b {
            @Override // androidx.lifecycle.h0.b
            public final <T extends f0> T a(Class<T> cls) {
                return new b();
            }
        }

        @Override // androidx.lifecycle.f0
        public final void b() {
            h<C0076a> hVar = this.f13819d;
            int i6 = hVar.f14852u;
            if (i6 > 0) {
                ((C0076a) hVar.f14851t[0]).getClass();
                throw null;
            }
            Object[] objArr = hVar.f14851t;
            for (int i7 = 0; i7 < i6; i7++) {
                objArr[i7] = null;
            }
            hVar.f14852u = 0;
        }
    }

    public a(m mVar, j0 j0Var) {
        this.s = mVar;
        h0 h0Var = new h0(j0Var, b.f13818e);
        String canonicalName = b.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f13817t = (b) h0Var.a(b.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
    }

    @Deprecated
    public final void i(String str, PrintWriter printWriter) {
        h<C0076a> hVar = this.f13817t.f13819d;
        if (hVar.f14852u > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (hVar.f14852u <= 0) {
                return;
            }
            C0076a c0076a = (C0076a) hVar.f14851t[0];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(hVar.s[0]);
            printWriter.print(": ");
            printWriter.println(c0076a.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        m mVar = this.s;
        if (mVar == null) {
            sb.append("null");
        } else {
            String simpleName = mVar.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = mVar.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(iLastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(mVar)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
