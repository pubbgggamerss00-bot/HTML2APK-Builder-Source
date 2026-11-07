package c5;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.l;
import c5.n;
import c6.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class n extends b.k implements o3.a {

    /* renamed from: c, reason: collision with root package name */
    public boolean f4964c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4965d;

    /* renamed from: a, reason: collision with root package name */
    public final r f4962a = new r(new a());

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.v f4963b = new androidx.lifecycle.v(this);

    /* renamed from: e, reason: collision with root package name */
    public boolean f4966e = true;

    public class a extends t<n> implements p3.d, p3.e, o3.o, o3.p, b1, b.i0, e.j, c6.e, f0, y3.k {
        public a() {
            super(n.this);
        }

        @Override // c5.p
        public final View Y(int i10) {
            return n.this.findViewById(i10);
        }

        @Override // c5.p
        public final boolean Z() {
            Window window = n.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // y3.k
        public final void addMenuProvider(y3.o oVar) {
            n.this.addMenuProvider(oVar);
        }

        @Override // p3.d
        public final void addOnConfigurationChangedListener(x3.a<Configuration> aVar) {
            n.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // o3.o
        public final void addOnMultiWindowModeChangedListener(x3.a<o3.f> aVar) {
            n.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // o3.p
        public final void addOnPictureInPictureModeChangedListener(x3.a<o3.r> aVar) {
            n.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // p3.e
        public final void addOnTrimMemoryListener(x3.a<Integer> aVar) {
            n.this.addOnTrimMemoryListener(aVar);
        }

        @Override // c5.t
        public final void b0(PrintWriter printWriter, String[] strArr) {
            n.this.dump("  ", null, printWriter, strArr);
        }

        @Override // c5.t
        public final n c0() {
            return n.this;
        }

        @Override // c5.t
        public final LayoutInflater d0() {
            n nVar = n.this;
            return nVar.getLayoutInflater().cloneInContext(nVar);
        }

        @Override // c5.t
        public final void e0() {
            n.this.invalidateMenu();
        }

        @Override // e.j
        public final e.f getActivityResultRegistry() {
            return n.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.t
        public final androidx.lifecycle.l getLifecycle() {
            return n.this.f4963b;
        }

        @Override // b.i0
        public final b.d0 getOnBackPressedDispatcher() {
            return n.this.getOnBackPressedDispatcher();
        }

        @Override // c6.e
        public final c6.c getSavedStateRegistry() {
            return n.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.b1
        public final a1 getViewModelStore() {
            return n.this.getViewModelStore();
        }

        @Override // y3.k
        public final void removeMenuProvider(y3.o oVar) {
            n.this.removeMenuProvider(oVar);
        }

        @Override // p3.d
        public final void removeOnConfigurationChangedListener(x3.a<Configuration> aVar) {
            n.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // o3.o
        public final void removeOnMultiWindowModeChangedListener(x3.a<o3.f> aVar) {
            n.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // o3.p
        public final void removeOnPictureInPictureModeChangedListener(x3.a<o3.r> aVar) {
            n.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // p3.e
        public final void removeOnTrimMemoryListener(x3.a<Integer> aVar) {
            n.this.removeOnTrimMemoryListener(aVar);
        }

        @Override // c5.f0
        public final void s() {
        }
    }

    public n() {
        getSavedStateRegistry().c("android:support:lifecycle", new c.b() { // from class: c5.j
            @Override // c6.c.b
            public final Bundle a() {
                n nVar;
                c0 c0Var;
                do {
                    nVar = this.f4918a;
                    c0Var = nVar.f4962a.f4977a.f4982d;
                    l.b bVar = l.b.f2319a;
                } while (n.g(c0Var));
                nVar.f4963b.f(l.a.ON_STOP);
                return new Bundle();
            }
        });
        addOnConfigurationChangedListener(new x3.a() { // from class: c5.k
            @Override // x3.a
            public final void accept(Object obj) {
                this.f4943a.f4962a.a();
            }
        });
        addOnNewIntentListener(new x3.a() { // from class: c5.l
            @Override // x3.a
            public final void accept(Object obj) {
                this.f4944a.f4962a.a();
            }
        });
        addOnContextAvailableListener(new d.b() { // from class: c5.m
            @Override // d.b
            public final void a(b.k kVar) {
                n.a aVar = this.f4947a.f4962a.f4977a;
                aVar.f4982d.b(aVar, aVar, null);
            }
        });
    }

    public static boolean g(b0 b0Var) {
        l.b bVar = l.b.f2321c;
        boolean zG = false;
        for (h hVar : b0Var.f4780c.f()) {
            if (hVar != null) {
                t<?> tVar = hVar.f4890v;
                if ((tVar == null ? null : tVar.c0()) != null) {
                    zG |= g(hVar.g());
                }
                if (hVar.P.f2361d.compareTo(l.b.f2322d) >= 0) {
                    hVar.P.h(bVar);
                    zG = true;
                }
            }
        }
        return zG;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f4964c);
            printWriter.print(" mResumed=");
            printWriter.print(this.f4965d);
            printWriter.print(" mStopped=");
            printWriter.print(this.f4966e);
            if (getApplication() != null) {
                new m5.a(this, getViewModelStore()).I(str2, printWriter);
            }
            this.f4962a.f4977a.f4982d.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // b.k, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f4962a.a();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // b.k, o3.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4963b.f(l.a.ON_CREATE);
        c0 c0Var = this.f4962a.f4977a.f4982d;
        c0Var.F = false;
        c0Var.G = false;
        c0Var.M.f4838g = false;
        c0Var.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.f4962a.f4977a.f4982d.f4783f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f4962a.f4977a.f4982d.k();
        this.f4963b.f(l.a.ON_DESTROY);
    }

    @Override // b.k, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.f4962a.f4977a.f4982d.i();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f4965d = false;
        this.f4962a.f4977a.f4982d.t(5);
        this.f4963b.f(l.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.f4963b.f(l.a.ON_RESUME);
        c0 c0Var = this.f4962a.f4977a.f4982d;
        c0Var.F = false;
        c0Var.G = false;
        c0Var.M.f4838g = false;
        c0Var.t(7);
    }

    @Override // b.k, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f4962a.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        r rVar = this.f4962a;
        rVar.a();
        super.onResume();
        this.f4965d = true;
        rVar.f4977a.f4982d.y(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        r rVar = this.f4962a;
        rVar.a();
        a aVar = rVar.f4977a;
        super.onStart();
        this.f4966e = false;
        if (!this.f4964c) {
            this.f4964c = true;
            c0 c0Var = aVar.f4982d;
            c0Var.F = false;
            c0Var.G = false;
            c0Var.M.f4838g = false;
            c0Var.t(4);
        }
        aVar.f4982d.y(true);
        this.f4963b.f(l.a.ON_START);
        c0 c0Var2 = aVar.f4982d;
        c0Var2.F = false;
        c0Var2.G = false;
        c0Var2.M.f4838g = false;
        c0Var2.t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f4962a.a();
    }

    @Override // android.app.Activity
    public final void onStop() {
        r rVar;
        c0 c0Var;
        super.onStop();
        this.f4966e = true;
        do {
            rVar = this.f4962a;
            c0Var = rVar.f4977a.f4982d;
            l.b bVar = l.b.f2319a;
        } while (g(c0Var));
        c0 c0Var2 = rVar.f4977a.f4982d;
        c0Var2.G = true;
        c0Var2.M.f4838g = true;
        c0Var2.t(4);
        this.f4963b.f(l.a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.f4962a.f4977a.f4982d.f4783f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
