package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.htmltoapk.template.R;
import g.c;
import g.d;
import g.e;
import g.f;
import g.g;
import g.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.h1;
import l.j;
import l.s0;
import l0.h;
import l0.i;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements e {

    /* renamed from: y, reason: collision with root package name */
    public g f124y;

    public AppCompatActivity() {
        getSavedStateRegistry().c("androidx:appcompat", new c(this));
        addOnContextAvailableListener(new d(this));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        h().c(view, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x022f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Method method;
        g gVar = (g) h();
        gVar.f13095h0 = true;
        int i6 = gVar.f13099l0;
        if (i6 == -100) {
            i6 = f.f13078t;
        }
        int iH = gVar.H(context, i6);
        int i7 = 3;
        if (f.i(context) && f.i(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (f.A) {
                    try {
                        q0.g gVar2 = f.f13079u;
                        if (gVar2 == null) {
                            if (f.f13080v == null) {
                                f.f13080v = q0.g.a(i0.f.b(context));
                            }
                            if (!f.f13080v.f14100a.f14102a.isEmpty()) {
                                f.f13079u = f.f13080v;
                            }
                        } else if (!gVar2.equals(f.f13080v)) {
                            q0.g gVar3 = f.f13079u;
                            f.f13080v = gVar3;
                            i0.f.a(context, gVar3.f14100a.f14102a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!f.f13082x) {
                f.s.execute(new androidx.camera.camera2.interop.c(i7, context));
            }
        }
        q0.g gVarU = g.u(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(g.y(context, iH, gVarU, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof j.c) {
            try {
                ((j.c) context).a(g.y(context, iH, gVarU, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (g.C0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f6 = configuration3.fontScale;
                    float f7 = configuration4.fontScale;
                    if (f6 != f7) {
                        configuration.fontScale = f7;
                    }
                    int i8 = configuration3.mcc;
                    int i9 = configuration4.mcc;
                    if (i8 != i9) {
                        configuration.mcc = i9;
                    }
                    int i10 = configuration3.mnc;
                    int i11 = configuration4.mnc;
                    if (i10 != i11) {
                        configuration.mnc = i11;
                    }
                    int i12 = Build.VERSION.SDK_INT;
                    g.e.a(configuration3, configuration4, configuration);
                    int i13 = configuration3.touchscreen;
                    int i14 = configuration4.touchscreen;
                    if (i13 != i14) {
                        configuration.touchscreen = i14;
                    }
                    int i15 = configuration3.keyboard;
                    int i16 = configuration4.keyboard;
                    if (i15 != i16) {
                        configuration.keyboard = i16;
                    }
                    int i17 = configuration3.keyboardHidden;
                    int i18 = configuration4.keyboardHidden;
                    if (i17 != i18) {
                        configuration.keyboardHidden = i18;
                    }
                    int i19 = configuration3.navigation;
                    int i20 = configuration4.navigation;
                    if (i19 != i20) {
                        configuration.navigation = i20;
                    }
                    int i21 = configuration3.navigationHidden;
                    int i22 = configuration4.navigationHidden;
                    if (i21 != i22) {
                        configuration.navigationHidden = i22;
                    }
                    int i23 = configuration3.orientation;
                    int i24 = configuration4.orientation;
                    if (i23 != i24) {
                        configuration.orientation = i24;
                    }
                    int i25 = configuration3.screenLayout & 15;
                    int i26 = configuration4.screenLayout & 15;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    int i27 = configuration3.screenLayout & 192;
                    int i28 = configuration4.screenLayout & 192;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    int i29 = configuration3.screenLayout & 48;
                    int i30 = configuration4.screenLayout & 48;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 768;
                    int i32 = configuration4.screenLayout & 768;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    if (i12 >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode = (3 & configuration4.colorMode) | configuration.colorMode;
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode |= configuration4.colorMode & 12;
                        }
                    }
                    int i33 = configuration3.uiMode & 15;
                    int i34 = configuration4.uiMode & 15;
                    if (i33 != i34) {
                        configuration.uiMode |= i34;
                    }
                    int i35 = configuration3.uiMode & 48;
                    int i36 = configuration4.uiMode & 48;
                    if (i35 != i36) {
                        configuration.uiMode |= i36;
                    }
                    int i37 = configuration3.screenWidthDp;
                    int i38 = configuration4.screenWidthDp;
                    if (i37 != i38) {
                        configuration.screenWidthDp = i38;
                    }
                    int i39 = configuration3.screenHeightDp;
                    int i40 = configuration4.screenHeightDp;
                    if (i39 != i40) {
                        configuration.screenHeightDp = i40;
                    }
                    int i41 = configuration3.smallestScreenWidthDp;
                    int i42 = configuration4.smallestScreenWidthDp;
                    if (i41 != i42) {
                        configuration.smallestScreenWidthDp = i42;
                    }
                    int i43 = configuration3.densityDpi;
                    int i44 = configuration4.densityDpi;
                    if (i43 != i44) {
                        configuration.densityDpi = i44;
                    }
                }
            }
            Configuration configurationY = g.y(context, iH, gVarU, configuration, true);
            j.c cVar = new j.c(context, R.style.Theme_AppCompat_Empty);
            cVar.a(configurationY);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = cVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        i.a(theme);
                    } else {
                        synchronized (h.f13804a) {
                            if (h.f13806c) {
                                method = h.f13805b;
                                if (method != null) {
                                }
                            } else {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    h.f13805b = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e6) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e6);
                                }
                                h.f13806c = true;
                                method = h.f13805b;
                                if (method != null) {
                                    try {
                                        method.invoke(theme, null);
                                    } catch (IllegalAccessException | InvocationTargetException e7) {
                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e7);
                                        h.f13805b = null;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = cVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((g) h()).F();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((g) h()).F();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(int i6) {
        return (T) h().d(i6);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        g gVar = (g) h();
        if (gVar.H == null) {
            gVar.F();
            s sVar = gVar.G;
            gVar.H = new j.f(sVar != null ? sVar.c() : gVar.C);
        }
        return gVar.H;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i6 = h1.f13649a;
        return super.getResources();
    }

    public final f h() {
        if (this.f124y == null) {
            f.c cVar = f.s;
            this.f124y = new g(this, null, this, this);
        }
        return this.f124y;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        h().h();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g gVar = (g) h();
        if (gVar.Y && gVar.S) {
            gVar.F();
            s sVar = gVar.G;
            if (sVar != null) {
                sVar.f(sVar.f13174a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        j jVarA = j.a();
        Context context = gVar.C;
        synchronized (jVarA) {
            s0 s0Var = jVarA.f13674a;
            synchronized (s0Var) {
                w.d<WeakReference<Drawable.ConstantState>> dVar = s0Var.f13727b.get(context);
                if (dVar != null) {
                    dVar.a();
                }
            }
        }
        gVar.f13098k0 = new Configuration(gVar.C.getResources().getConfiguration());
        gVar.s(false, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        h().k();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i6, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        Intent intentA;
        if (!super.onMenuItemSelected(i6, menuItem)) {
            g gVar = (g) h();
            gVar.F();
            s sVar = gVar.G;
            if (menuItem.getItemId() != 16908332 || sVar == null || (sVar.f13178e.o() & 4) == 0 || (intentA = i0.i.a(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentA)) {
                navigateUpTo(intentA);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentA2 = i0.i.a(this);
            if (intentA2 == null) {
                intentA2 = i0.i.a(this);
            }
            if (intentA2 != null) {
                ComponentName component = intentA2.getComponent();
                if (component == null) {
                    component = intentA2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentB = i0.i.b(this, component);
                    while (intentB != null) {
                        arrayList.add(size, intentB);
                        intentB = i0.i.b(this, intentB.getComponent());
                    }
                    arrayList.add(intentA2);
                } catch (PackageManager.NameNotFoundException e6) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e6);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((g) h()).B();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        g gVar = (g) h();
        gVar.F();
        s sVar = gVar.G;
        if (sVar != null) {
            sVar.f13191t = true;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((g) h()).s(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        h().l();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i6) {
        super.onTitleChanged(charSequence, i6);
        h().r(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((g) h()).F();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i6) {
        initializeViewTreeOwners();
        h().o(i6);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i6) {
        super.setTheme(i6);
        ((g) h()).f13100m0 = i6;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        h().p(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        h().q(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
