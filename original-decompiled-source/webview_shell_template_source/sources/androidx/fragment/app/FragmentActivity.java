package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.p0;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.h;
import androidx.savedstate.a;
import i0.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements a.InterfaceC0066a {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f1049x = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1051u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1052v;
    public final q s = new q(new a());

    /* renamed from: t, reason: collision with root package name */
    public final androidx.lifecycle.n f1050t = new androidx.lifecycle.n(this);

    /* renamed from: w, reason: collision with root package name */
    public boolean f1053w = true;

    public FragmentActivity() {
        getSavedStateRegistry().c("android:support:lifecycle", new a.b() { // from class: androidx.fragment.app.l
            @Override // androidx.savedstate.a.b
            public final Bundle a() {
                FragmentActivity fragmentActivity;
                int i6 = FragmentActivity.f1049x;
                do {
                    fragmentActivity = this.f1211a;
                } while (FragmentActivity.g(fragmentActivity.s.f1220a.f1224v));
                fragmentActivity.f1050t.f(h.a.ON_STOP);
                return new Bundle();
            }
        });
        addOnConfigurationChangedListener(new androidx.camera.view.t(1, this));
        addOnNewIntentListener(new t0.a() { // from class: androidx.fragment.app.m
            @Override // t0.a
            public final void accept(Object obj) {
                this.f1212a.s.a();
            }
        });
        addOnContextAvailableListener(new c.b() { // from class: androidx.fragment.app.n
            @Override // c.b
            public final void a(ComponentActivity componentActivity) {
                FragmentActivity.a aVar = this.f1213a.s.f1220a;
                aVar.f1224v.b(aVar, aVar, null);
            }
        });
    }

    public static boolean g(y yVar) {
        boolean zG = false;
        for (k kVar : yVar.f1233c.g()) {
            if (kVar != null) {
                s<?> sVar = kVar.K;
                if ((sVar == null ? null : sVar.j()) != null) {
                    zG |= g(kVar.c());
                }
                h0 h0Var = kVar.f1188f0;
                h.b bVar = h.b.f1303v;
                if (h0Var != null) {
                    h0Var.b();
                    if (h0Var.f1136u.f1317c.compareTo(bVar) >= 0) {
                        kVar.f1188f0.f1136u.h();
                        zG = true;
                    }
                }
                if (kVar.f1187e0.f1317c.compareTo(bVar) >= 0) {
                    kVar.f1187e0.h();
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
            printWriter.print(this.f1051u);
            printWriter.print(" mResumed=");
            printWriter.print(this.f1052v);
            printWriter.print(" mStopped=");
            printWriter.print(this.f1053w);
            if (getApplication() != null) {
                new l1.a(this, getViewModelStore()).i(str2, printWriter);
            }
            this.s.f1220a.f1224v.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i7, Intent intent) {
        this.s.a();
        super.onActivityResult(i6, i7, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1050t.f(h.a.ON_CREATE);
        z zVar = this.s.f1220a.f1224v;
        zVar.E = false;
        zVar.F = false;
        zVar.L.f1080i = false;
        zVar.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.s.f1220a.f1224v.f1236f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.s.f1220a.f1224v.k();
        this.f1050t.f(h.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        if (i6 == 6) {
            return this.s.f1220a.f1224v.i();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f1052v = false;
        this.s.f1220a.f1224v.t(5);
        this.f1050t.f(h.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f1050t.f(h.a.ON_RESUME);
        z zVar = this.s.f1220a.f1224v;
        zVar.E = false;
        zVar.F = false;
        zVar.L.f1080i = false;
        zVar.t(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        this.s.a();
        super.onRequestPermissionsResult(i6, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        q qVar = this.s;
        qVar.a();
        super.onResume();
        this.f1052v = true;
        qVar.f1220a.f1224v.y(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        q qVar = this.s;
        qVar.a();
        a aVar = qVar.f1220a;
        super.onStart();
        this.f1053w = false;
        if (!this.f1051u) {
            this.f1051u = true;
            z zVar = aVar.f1224v;
            zVar.E = false;
            zVar.F = false;
            zVar.L.f1080i = false;
            zVar.t(4);
        }
        aVar.f1224v.y(true);
        this.f1050t.f(h.a.ON_START);
        z zVar2 = aVar.f1224v;
        zVar2.E = false;
        zVar2.F = false;
        zVar2.L.f1080i = false;
        zVar2.t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.s.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        q qVar;
        super.onStop();
        this.f1053w = true;
        do {
            qVar = this.s;
        } while (g(qVar.f1220a.f1224v));
        z zVar = qVar.f1220a.f1224v;
        zVar.F = true;
        zVar.L.f1080i = true;
        zVar.t(4);
        this.f1050t.f(h.a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.s.f1220a.f1224v.f1236f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends s<FragmentActivity> implements k0.b, k0.c, i0.r, i0.s, androidx.lifecycle.k0, p0, d.i, y1.c, c0, u0.g {
        public a() {
            super(FragmentActivity.this);
        }

        @Override // u0.g
        public final void addMenuProvider(u0.l lVar) {
            FragmentActivity.this.addMenuProvider(lVar);
        }

        @Override // k0.b
        public final void addOnConfigurationChangedListener(t0.a<Configuration> aVar) {
            FragmentActivity.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // i0.r
        public final void addOnMultiWindowModeChangedListener(t0.a<i0.h> aVar) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // i0.s
        public final void addOnPictureInPictureModeChangedListener(t0.a<i0.u> aVar) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // k0.c
        public final void addOnTrimMemoryListener(t0.a<Integer> aVar) {
            FragmentActivity.this.addOnTrimMemoryListener(aVar);
        }

        @Override // androidx.fragment.app.p
        public final View d(int i6) {
            return FragmentActivity.this.findViewById(i6);
        }

        @Override // androidx.fragment.app.p
        public final boolean g() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // d.i
        public final d.e getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.m
        public final androidx.lifecycle.h getLifecycle() {
            return FragmentActivity.this.f1050t;
        }

        @Override // androidx.activity.p0
        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // y1.c
        public final androidx.savedstate.a getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.k0
        public final androidx.lifecycle.j0 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.s
        public final void i(PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.s
        public final FragmentActivity j() {
            return FragmentActivity.this;
        }

        @Override // androidx.fragment.app.s
        public final LayoutInflater k() {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            return fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        }

        @Override // androidx.fragment.app.s
        public final void l() {
            FragmentActivity.this.invalidateOptionsMenu();
        }

        @Override // u0.g
        public final void removeMenuProvider(u0.l lVar) {
            FragmentActivity.this.removeMenuProvider(lVar);
        }

        @Override // k0.b
        public final void removeOnConfigurationChangedListener(t0.a<Configuration> aVar) {
            FragmentActivity.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // i0.r
        public final void removeOnMultiWindowModeChangedListener(t0.a<i0.h> aVar) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // i0.s
        public final void removeOnPictureInPictureModeChangedListener(t0.a<i0.u> aVar) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // k0.c
        public final void removeOnTrimMemoryListener(t0.a<Integer> aVar) {
            FragmentActivity.this.removeOnTrimMemoryListener(aVar);
        }

        @Override // androidx.fragment.app.c0
        public final void a() {
        }
    }
}
