package m5;

import androidx.lifecycle.a0;
import androidx.lifecycle.a1;
import androidx.lifecycle.b0;
import androidx.lifecycle.t;
import androidx.lifecycle.w0;
import androidx.lifecycle.z;
import androidx.lifecycle.z0;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import j5.a;
import java.io.PrintWriter;
import ka.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.r;
import p.c1;

/* loaded from: classes.dex */
public final class a extends ci.a {

    /* renamed from: a, reason: collision with root package name */
    public final t f17658a;

    /* renamed from: b, reason: collision with root package name */
    public final c f17659b;

    /* renamed from: m5.a$a, reason: collision with other inner class name */
    public static class C0174a<D> extends a0<D> {

        /* renamed from: l, reason: collision with root package name */
        public final f f17660l;

        /* renamed from: m, reason: collision with root package name */
        public t f17661m;

        /* renamed from: n, reason: collision with root package name */
        public b<D> f17662n;

        public C0174a(f fVar) {
            this.f17660l = fVar;
            if (fVar.f18341a != null) {
                throw new IllegalStateException("There is already a listener registered");
            }
            fVar.f18341a = this;
        }

        @Override // androidx.lifecycle.z
        public final void e() {
            f fVar = this.f17660l;
            fVar.f18342b = true;
            fVar.f18344d = false;
            fVar.f18343c = false;
            fVar.f16235i.drainPermits();
            fVar.b();
        }

        @Override // androidx.lifecycle.z
        public final void f() {
            this.f17660l.f18342b = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.z
        public final void g(b0<? super D> b0Var) {
            super.g(b0Var);
            this.f17661m = null;
            this.f17662n = null;
        }

        public final void j() {
            t tVar = this.f17661m;
            b<D> bVar = this.f17662n;
            if (tVar == null || bVar == null) {
                return;
            }
            super.g(bVar);
            d(tVar, bVar);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            Class<?> cls = this.f17660l.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }
    }

    public static class b<D> implements b0<D> {

        /* renamed from: a, reason: collision with root package name */
        public final cc.f f17663a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f17664b = false;

        public b(f fVar, cc.f fVar2) {
            this.f17663a = fVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.b0
        public final void a(D d10) {
            this.f17664b = true;
            SignInHubActivity signInHubActivity = (SignInHubActivity) this.f17663a.f5363a;
            signInHubActivity.setResult(signInHubActivity.f5899j, signInHubActivity.f5900k);
            signInHubActivity.finish();
        }

        public final String toString() {
            return this.f17663a.toString();
        }
    }

    public static class c extends w0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0175a f17665d = new C0175a();

        /* renamed from: b, reason: collision with root package name */
        public final c1<C0174a> f17666b = new c1<>();

        /* renamed from: c, reason: collision with root package name */
        public boolean f17667c = false;

        /* renamed from: m5.a$c$a, reason: collision with other inner class name */
        public static class C0175a implements z0.c {
            @Override // androidx.lifecycle.z0.c
            public final <T extends w0> T a(Class<T> cls) {
                return new c();
            }
        }

        @Override // androidx.lifecycle.w0
        public final void e() {
            c1<C0174a> c1Var = this.f17666b;
            int iF = c1Var.f();
            for (int i10 = 0; i10 < iF; i10++) {
                C0174a c0174aG = c1Var.g(i10);
                f fVar = c0174aG.f17660l;
                fVar.a();
                fVar.f18343c = true;
                b<D> bVar = c0174aG.f17662n;
                if (bVar != 0) {
                    c0174aG.g(bVar);
                }
                C0174a c0174a = fVar.f18341a;
                if (c0174a == null) {
                    throw new IllegalStateException("No listener register");
                }
                if (c0174a != c0174aG) {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
                fVar.f18341a = null;
                if (bVar != 0) {
                    boolean z10 = bVar.f17664b;
                }
                fVar.f18344d = true;
                fVar.f18342b = false;
                fVar.f18343c = false;
                fVar.f18345e = false;
            }
            int i11 = c1Var.f20585d;
            Object[] objArr = c1Var.f20584c;
            for (int i12 = 0; i12 < i11; i12++) {
                objArr[i12] = null;
            }
            c1Var.f20585d = 0;
            c1Var.f20582a = false;
        }
    }

    public a(t tVar, a1 store) {
        this.f17658a = tVar;
        r.e(store, "store");
        a.C0143a defaultCreationExtras = a.C0143a.f15159b;
        r.e(defaultCreationExtras, "defaultCreationExtras");
        j5.f fVar = new j5.f(store, c.f17665d, defaultCreationExtras);
        h hVarA = h0.a(c.class);
        String strA = hVarA.a();
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f17659b = (c) fVar.a(hVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strA));
    }

    @Deprecated
    public final void I(String str, PrintWriter printWriter) {
        c cVar = this.f17659b;
        if (cVar.f17666b.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i10 = 0; i10 < cVar.f17666b.f(); i10++) {
                C0174a c0174aG = cVar.f17666b.g(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cVar.f17666b.d(i10));
                printWriter.print(": ");
                printWriter.println(c0174aG.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(c0174aG.f17660l);
                f fVar = c0174aG.f17660l;
                String str3 = str2 + "  ";
                fVar.getClass();
                printWriter.print(str3);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(fVar.f18341a);
                if (fVar.f18342b || fVar.f18345e) {
                    printWriter.print(str3);
                    printWriter.print("mStarted=");
                    printWriter.print(fVar.f18342b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(fVar.f18345e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (fVar.f18343c || fVar.f18344d) {
                    printWriter.print(str3);
                    printWriter.print("mAbandoned=");
                    printWriter.print(fVar.f18343c);
                    printWriter.print(" mReset=");
                    printWriter.println(fVar.f18344d);
                }
                if (fVar.f18338g != null) {
                    printWriter.print(str3);
                    printWriter.print("mTask=");
                    printWriter.print(fVar.f18338g);
                    printWriter.print(" waiting=");
                    fVar.f18338g.getClass();
                    printWriter.println(false);
                }
                if (fVar.f18339h != null) {
                    printWriter.print(str3);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(fVar.f18339h);
                    printWriter.print(" waiting=");
                    fVar.f18339h.getClass();
                    printWriter.println(false);
                }
                if (c0174aG.f17662n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(c0174aG.f17662n);
                    b<D> bVar = c0174aG.f17662n;
                    bVar.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar.f17664b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                f fVar2 = c0174aG.f17660l;
                Object obj = c0174aG.f2386e;
                Object obj2 = obj != z.f2381k ? obj : null;
                fVar2.getClass();
                StringBuilder sb = new StringBuilder(64);
                if (obj2 == null) {
                    sb.append("null");
                } else {
                    Class<?> cls = obj2.getClass();
                    sb.append(cls.getSimpleName());
                    sb.append("{");
                    sb.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb.append("}");
                }
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(c0174aG.f2384c > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.f17658a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
