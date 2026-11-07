package g;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.d.a;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.h;
import com.google.android.gms.ads.AdRequest;
import g.o;
import g.r;
import g.s;
import g.s.d;
import j.e;
import j.h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import l.e0;
import l.f0;
import l.g0;
import l.h1;
import l.i1;
import l.t;
import l.v;
import l.y;
import u0.c0;
import u0.f;
import u0.f0;
import u0.n0;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g extends g.f implements f.a, LayoutInflater.Factory2 {
    public static final w.g<String, Integer> A0 = new w.g<>();
    public static final int[] B0 = {R.attr.windowBackground};
    public static final boolean C0 = !"robolectric".equals(Build.FINGERPRINT);
    public final Object B;
    public final Context C;
    public Window D;
    public C0062g E;
    public final Object F;
    public s G;
    public j.f H;
    public CharSequence I;
    public f0 J;
    public b K;
    public m L;
    public j.a M;
    public ActionBarContextView N;
    public PopupWindow O;
    public g.i P;
    public boolean S;
    public ViewGroup T;
    public TextView U;
    public View V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f13088a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f13089b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f13090c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f13091d0;

    /* renamed from: e0, reason: collision with root package name */
    public l[] f13092e0;

    /* renamed from: f0, reason: collision with root package name */
    public l f13093f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f13094g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f13095h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f13096i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f13097j0;

    /* renamed from: k0, reason: collision with root package name */
    public Configuration f13098k0;

    /* renamed from: l0, reason: collision with root package name */
    public final int f13099l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f13100m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f13101n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f13102o0;
    public j p0;

    /* renamed from: q0, reason: collision with root package name */
    public h f13103q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f13104r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f13105s0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f13107u0;

    /* renamed from: v0, reason: collision with root package name */
    public Rect f13108v0;

    /* renamed from: w0, reason: collision with root package name */
    public Rect f13109w0;

    /* renamed from: x0, reason: collision with root package name */
    public o f13110x0;

    /* renamed from: y0, reason: collision with root package name */
    public OnBackInvokedDispatcher f13111y0;

    /* renamed from: z0, reason: collision with root package name */
    public OnBackInvokedCallback f13112z0;
    public n0 Q = null;
    public final boolean R = true;

    /* renamed from: t0, reason: collision with root package name */
    public final a f13106t0 = new a();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            if ((gVar.f13105s0 & 1) != 0) {
                gVar.A(0);
            }
            if ((gVar.f13105s0 & 4096) != 0) {
                gVar.A(108);
            }
            gVar.f13104r0 = false;
            gVar.f13105s0 = 0;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class b implements j.a {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z6) {
            g.this.w(fVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback = g.this.D.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, fVar);
            return true;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public final e.a f13113a;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a extends f5.b {
            public a() {
            }

            @Override // u0.o0
            public final void a() {
                g gVar = g.this;
                gVar.N.setVisibility(8);
                PopupWindow popupWindow = gVar.O;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.N.getParent() instanceof View) {
                    View view = (View) gVar.N.getParent();
                    WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
                    f0.c.c(view);
                }
                gVar.N.h();
                gVar.Q.d(null);
                gVar.Q = null;
                ViewGroup viewGroup = gVar.T;
                WeakHashMap<View, n0> weakHashMap2 = u0.f0.f14480a;
                f0.c.c(viewGroup);
            }
        }

        public c(e.a aVar) {
            this.f13113a = aVar;
        }

        public final void a(j.a aVar) {
            e.a aVar2 = this.f13113a;
            aVar2.f13396a.onDestroyActionMode(aVar2.a(aVar));
            g gVar = g.this;
            if (gVar.O != null) {
                gVar.D.getDecorView().removeCallbacks(gVar.P);
            }
            if (gVar.N != null) {
                n0 n0Var = gVar.Q;
                if (n0Var != null) {
                    n0Var.b();
                }
                n0 n0VarA = u0.f0.a(gVar.N);
                n0VarA.a(0.0f);
                gVar.Q = n0VarA;
                n0VarA.d(new a());
            }
            gVar.M = null;
            ViewGroup viewGroup = gVar.T;
            WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
            f0.c.c(viewGroup);
            gVar.N();
        }

        public final boolean b(j.a aVar, Menu menu) {
            ViewGroup viewGroup = g.this.T;
            WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
            f0.c.c(viewGroup);
            e.a aVar2 = this.f13113a;
            ActionMode.Callback callback = aVar2.f13396a;
            j.e eVarA = aVar2.a(aVar);
            w.g<Menu, Menu> gVar = aVar2.f13399d;
            Menu eVar = gVar.get(menu);
            if (eVar == null) {
                eVar = new k.e(aVar2.f13397b, (o0.a) menu);
                gVar.put(menu, eVar);
            }
            return callback.onPrepareActionMode(eVarA, eVar);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class e {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static q0.g b(Configuration configuration) {
            return q0.g.a(configuration.getLocales().toLanguageTags());
        }

        public static void c(q0.g gVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(gVar.f14100a.f14102a.toLanguageTags()));
        }

        public static void d(Configuration configuration, q0.g gVar) {
            configuration.setLocales(LocaleList.forLanguageTags(gVar.f14100a.f14102a.toLanguageTags()));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class f {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, g.l] */
        public static OnBackInvokedCallback b(Object obj, final g gVar) {
            Objects.requireNonNull(gVar);
            ?? r02 = new OnBackInvokedCallback() { // from class: g.l
                public final void onBackInvoked() {
                    gVar.I();
                }
            };
            androidx.activity.q.b(obj).registerOnBackInvokedCallback(1000000, r02);
            return r02;
        }

        public static void c(Object obj, Object obj2) {
            androidx.activity.q.b(obj).unregisterOnBackInvokedCallback(g.k.a(obj2));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class h extends i {

        /* renamed from: c, reason: collision with root package name */
        public final PowerManager f13119c;

        public h(Context context) {
            super();
            this.f13119c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // g.g.i
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // g.g.i
        public final int c() {
            return d.a(this.f13119c) ? 2 : 1;
        }

        @Override // g.g.i
        public final void d() {
            g.this.s(true, true);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public abstract class i {

        /* renamed from: a, reason: collision with root package name */
        public a f13121a;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                i.this.d();
            }
        }

        public i() {
        }

        public final void a() {
            a aVar = this.f13121a;
            if (aVar != null) {
                try {
                    g.this.C.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f13121a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f13121a == null) {
                this.f13121a = new a();
            }
            g.this.C.registerReceiver(this.f13121a, intentFilterB);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class j extends i {

        /* renamed from: c, reason: collision with root package name */
        public final r f13124c;

        public j(r rVar) {
            super();
            this.f13124c = rVar;
        }

        @Override // g.g.i
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // g.g.i
        public final int c() {
            Location location;
            boolean z6;
            long j6;
            r rVar = this.f13124c;
            r.a aVar = rVar.f13169c;
            LocationManager locationManager = rVar.f13168b;
            if (aVar.f13171b > System.currentTimeMillis()) {
                z6 = aVar.f13170a;
            } else {
                Context context = rVar.f13167a;
                Location lastKnownLocation = null;
                if (f5.b.d(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    try {
                    } catch (Exception e6) {
                        Log.d("TwilightManager", "Failed to get last known location", e6);
                    }
                    Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                    location = lastKnownLocation2;
                } else {
                    location = null;
                }
                if (f5.b.d(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            lastKnownLocation = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e7) {
                        Log.d("TwilightManager", "Failed to get last known location", e7);
                    }
                }
                if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                    location = lastKnownLocation;
                }
                if (location != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (q.f13162d == null) {
                        q.f13162d = new q();
                    }
                    q qVar = q.f13162d;
                    qVar.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                    qVar.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                    z6 = qVar.f13165c == 1;
                    long j7 = qVar.f13164b;
                    long j8 = qVar.f13163a;
                    qVar.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                    long j9 = qVar.f13164b;
                    if (j7 == -1 || j8 == -1) {
                        j6 = jCurrentTimeMillis + 43200000;
                    } else {
                        if (jCurrentTimeMillis > j8) {
                            j7 = j9;
                        } else if (jCurrentTimeMillis > j7) {
                            j7 = j8;
                        }
                        j6 = j7 + 60000;
                    }
                    aVar.f13170a = z6;
                    aVar.f13171b = j6;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i6 = Calendar.getInstance().get(11);
                    if (i6 < 6 || i6 >= 22) {
                        z6 = true;
                    }
                }
            }
            return z6 ? 2 : 1;
        }

        @Override // g.g.i
        public final void d() {
            g.this.s(true, true);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class k extends ContentFrameLayout {
        public k(j.c cVar) {
            super(cVar, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.z(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x6 = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                if (x6 < -5 || y2 < -5 || x6 > getWidth() + 5 || y2 > getHeight() + 5) {
                    g gVar = g.this;
                    gVar.x(gVar.E(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i6) {
            setBackgroundDrawable(b0.d(getContext(), i6));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class l {

        /* renamed from: a, reason: collision with root package name */
        public int f13126a;

        /* renamed from: b, reason: collision with root package name */
        public int f13127b;

        /* renamed from: c, reason: collision with root package name */
        public int f13128c;

        /* renamed from: d, reason: collision with root package name */
        public int f13129d;

        /* renamed from: e, reason: collision with root package name */
        public k f13130e;

        /* renamed from: f, reason: collision with root package name */
        public View f13131f;

        /* renamed from: g, reason: collision with root package name */
        public View f13132g;
        public androidx.appcompat.view.menu.f h;

        /* renamed from: i, reason: collision with root package name */
        public androidx.appcompat.view.menu.d f13133i;

        /* renamed from: j, reason: collision with root package name */
        public j.c f13134j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f13135k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f13136l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f13137m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f13138n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f13139o;

        /* renamed from: p, reason: collision with root package name */
        public Bundle f13140p;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class m implements j.a {
        public m() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z6) {
            l lVar;
            androidx.appcompat.view.menu.f fVarK = fVar.k();
            int i6 = 0;
            boolean z7 = fVarK != fVar;
            if (z7) {
                fVar = fVarK;
            }
            g gVar = g.this;
            l[] lVarArr = gVar.f13092e0;
            int length = lVarArr != null ? lVarArr.length : 0;
            while (true) {
                if (i6 < length) {
                    lVar = lVarArr[i6];
                    if (lVar != null && lVar.h == fVar) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    lVar = null;
                    break;
                }
            }
            if (lVar != null) {
                if (!z7) {
                    gVar.x(lVar, z6);
                } else {
                    gVar.v(lVar.f13126a, lVar, fVarK);
                    gVar.x(lVar, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback;
            if (fVar != fVar.k()) {
                return true;
            }
            g gVar = g.this;
            if (!gVar.Y || (callback = gVar.D.getCallback()) == null || gVar.f13097j0) {
                return true;
            }
            callback.onMenuOpened(108, fVar);
            return true;
        }
    }

    public g(Context context, Window window, g.e eVar, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.f13099l0 = -100;
        this.C = context;
        this.F = eVar;
        this.B = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AppCompatActivity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        appCompatActivity = (AppCompatActivity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.f13099l0 = appCompatActivity.h().f();
            }
        }
        if (this.f13099l0 == -100) {
            String name = this.B.getClass().getName();
            w.g<String, Integer> gVar = A0;
            Integer num = gVar.get(name);
            if (num != null) {
                this.f13099l0 = num.intValue();
                gVar.remove(this.B.getClass().getName());
            }
        }
        if (window != null) {
            t(window);
        }
        l.j.d();
    }

    public static q0.g u(Context context) {
        q0.g gVar;
        q0.g gVar2;
        if (Build.VERSION.SDK_INT >= 33 || (gVar = g.f.f13079u) == null) {
            return null;
        }
        q0.g gVarB = e.b(context.getApplicationContext().getResources().getConfiguration());
        LocaleList localeList = gVar.f14100a.f14102a;
        if (localeList.isEmpty()) {
            gVar2 = q0.g.f14099b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i6 = 0;
            while (i6 < gVarB.f14100a.f14102a.size() + localeList.size()) {
                Locale locale = i6 < localeList.size() ? localeList.get(i6) : gVarB.f14100a.f14102a.get(i6 - localeList.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i6++;
            }
            gVar2 = new q0.g(new q0.i(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return gVar2.f14100a.f14102a.isEmpty() ? gVarB : gVar2;
    }

    public static Configuration y(Context context, int i6, q0.g gVar, Configuration configuration, boolean z6) {
        int i7 = i6 != 1 ? i6 != 2 ? z6 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i7 | (configuration2.uiMode & (-49));
        if (gVar != null) {
            e.d(configuration2, gVar);
        }
        return configuration2;
    }

    public final void A(int i6) {
        l lVarE = E(i6);
        if (lVarE.h != null) {
            Bundle bundle = new Bundle();
            lVarE.h.t(bundle);
            if (bundle.size() > 0) {
                lVarE.f13140p = bundle;
            }
            lVarE.h.w();
            lVarE.h.clear();
        }
        lVarE.f13139o = true;
        lVarE.f13138n = true;
        if ((i6 == 108 || i6 == 0) && this.J != null) {
            l lVarE2 = E(0);
            lVarE2.f13135k = false;
            L(lVarE2, null);
        }
    }

    public final void B() {
        ViewGroup viewGroup;
        if (this.S) {
            return;
        }
        Context context = this.C;
        int[] iArr = f.a.f12942j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            n(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            n(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            n(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            n(10);
        }
        this.f13089b0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        C();
        this.D.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f13090c0) {
            viewGroup = this.f13088a0 ? (ViewGroup) layoutInflaterFrom.inflate(com.htmltoapk.template.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.htmltoapk.template.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f13089b0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.htmltoapk.template.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.Z = false;
            this.Y = false;
        } else if (this.Y) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.htmltoapk.template.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new j.c(context, typedValue.resourceId) : context).inflate(com.htmltoapk.template.R.layout.abc_screen_toolbar, (ViewGroup) null);
            l.f0 f0Var = (l.f0) viewGroup.findViewById(com.htmltoapk.template.R.id.decor_content_parent);
            this.J = f0Var;
            f0Var.setWindowCallback(this.D.getCallback());
            if (this.Z) {
                this.J.h(109);
            }
            if (this.W) {
                this.J.h(2);
            }
            if (this.X) {
                this.J.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.Y + ", windowActionBarOverlay: " + this.Z + ", android:windowIsFloating: " + this.f13089b0 + ", windowActionModeOverlay: " + this.f13088a0 + ", windowNoTitle: " + this.f13090c0 + " }");
        }
        com.google.android.gms.ads.nonagon.signalgeneration.d dVar = new com.google.android.gms.ads.nonagon.signalgeneration.d(this);
        WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
        f0.d.k(viewGroup, dVar);
        if (this.J == null) {
            this.U = (TextView) viewGroup.findViewById(com.htmltoapk.template.R.id.title);
        }
        boolean z6 = i1.f13669a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e6) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e6);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e7) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e7);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.htmltoapk.template.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.D.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.D.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new g.h(this));
        this.T = viewGroup;
        Object obj = this.B;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.I;
        if (!TextUtils.isEmpty(title)) {
            l.f0 f0Var2 = this.J;
            if (f0Var2 != null) {
                f0Var2.setWindowTitle(title);
            } else {
                s sVar = this.G;
                if (sVar != null) {
                    sVar.f13178e.setWindowTitle(title);
                } else {
                    TextView textView = this.U;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.T.findViewById(R.id.content);
        View decorView = this.D.getDecorView();
        contentFrameLayout2.f266y.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.S = true;
        l lVarE = E(0);
        if (this.f13097j0 || lVarE.h != null) {
            return;
        }
        G(108);
    }

    public final void C() {
        if (this.D == null) {
            Object obj = this.B;
            if (obj instanceof Activity) {
                t(((Activity) obj).getWindow());
            }
        }
        if (this.D == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final i D(Context context) {
        if (this.p0 == null) {
            if (r.f13166d == null) {
                Context applicationContext = context.getApplicationContext();
                r.f13166d = new r(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.p0 = new j(r.f13166d);
        }
        return this.p0;
    }

    public final l E(int i6) {
        l[] lVarArr = this.f13092e0;
        if (lVarArr == null || lVarArr.length <= i6) {
            l[] lVarArr2 = new l[i6 + 1];
            if (lVarArr != null) {
                System.arraycopy(lVarArr, 0, lVarArr2, 0, lVarArr.length);
            }
            this.f13092e0 = lVarArr2;
            lVarArr = lVarArr2;
        }
        l lVar = lVarArr[i6];
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l();
        lVar2.f13126a = i6;
        lVar2.f13138n = false;
        lVarArr[i6] = lVar2;
        return lVar2;
    }

    public final void F() {
        B();
        if (this.Y && this.G == null) {
            Object obj = this.B;
            if (obj instanceof Activity) {
                this.G = new s(this.Z, (Activity) obj);
            } else if (obj instanceof Dialog) {
                this.G = new s((Dialog) obj);
            }
            s sVar = this.G;
            if (sVar != null) {
                sVar.e(this.f13107u0);
            }
        }
    }

    public final void G(int i6) {
        this.f13105s0 = (1 << i6) | this.f13105s0;
        if (this.f13104r0) {
            return;
        }
        View decorView = this.D.getDecorView();
        WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
        decorView.postOnAnimation(this.f13106t0);
        this.f13104r0 = true;
    }

    public final int H(Context context, int i6) {
        if (i6 != -100) {
            if (i6 != -1) {
                if (i6 != 0) {
                    if (i6 != 1 && i6 != 2) {
                        if (i6 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f13103q0 == null) {
                            this.f13103q0 = new h(context);
                        }
                        return this.f13103q0.c();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return D(context).c();
                }
            }
            return i6;
        }
        return -1;
    }

    public final boolean I() {
        g0 g0Var;
        boolean z6 = this.f13094g0;
        this.f13094g0 = false;
        l lVarE = E(0);
        if (lVarE.f13137m) {
            if (!z6) {
                x(lVarE, true);
            }
            return true;
        }
        j.a aVar = this.M;
        if (aVar != null) {
            aVar.c();
            return true;
        }
        F();
        s sVar = this.G;
        if (sVar == null || (g0Var = sVar.f13178e) == null || !g0Var.i()) {
            return false;
        }
        sVar.f13178e.collapseActionView();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r2.f162x.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(l lVar, KeyEvent keyEvent) {
        int i6;
        ViewGroup.LayoutParams layoutParams;
        boolean z6 = lVar.f13137m;
        int i7 = lVar.f13126a;
        if (z6 || this.f13097j0) {
            return;
        }
        Context context = this.C;
        if (i7 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.D.getCallback();
        if (callback != null && !callback.onMenuOpened(i7, lVar.h)) {
            x(lVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !L(lVar, keyEvent)) {
            return;
        }
        k kVar = lVar.f13130e;
        if (kVar != null && !lVar.f13138n) {
            View view = lVar.f13132g;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i6 = -1;
            }
            lVar.f13136l = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i6, -2, 0, 0, 1002, 8519680, -3);
            layoutParams2.gravity = lVar.f13128c;
            layoutParams2.windowAnimations = lVar.f13129d;
            windowManager.addView(lVar.f13130e, layoutParams2);
            lVar.f13137m = true;
            if (i7 != 0) {
                N();
                return;
            }
            return;
        }
        if (kVar == null) {
            F();
            s sVar = this.G;
            Context contextC = sVar != null ? sVar.c() : null;
            if (contextC != null) {
                context = contextC;
            }
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(com.htmltoapk.template.R.attr.actionBarPopupTheme, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                themeNewTheme.applyStyle(i8, true);
            }
            themeNewTheme.resolveAttribute(com.htmltoapk.template.R.attr.panelMenuListTheme, typedValue, true);
            int i9 = typedValue.resourceId;
            if (i9 != 0) {
                themeNewTheme.applyStyle(i9, true);
            } else {
                themeNewTheme.applyStyle(com.htmltoapk.template.R.style.Theme_AppCompat_CompactMenu, true);
            }
            j.c cVar = new j.c(context, 0);
            cVar.getTheme().setTo(themeNewTheme);
            lVar.f13134j = cVar;
            TypedArray typedArrayObtainStyledAttributes = cVar.obtainStyledAttributes(f.a.f12942j);
            lVar.f13127b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
            lVar.f13129d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            typedArrayObtainStyledAttributes.recycle();
            lVar.f13130e = new k(lVar.f13134j);
            lVar.f13128c = 81;
        } else if (lVar.f13138n && kVar.getChildCount() > 0) {
            lVar.f13130e.removeAllViews();
        }
        View view2 = lVar.f13132g;
        if (view2 == null) {
            if (lVar.h != null) {
                if (this.L == null) {
                    this.L = new m();
                }
                m mVar = this.L;
                if (lVar.f13133i == null) {
                    androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(lVar.f13134j);
                    lVar.f13133i = dVar;
                    dVar.f161w = mVar;
                    androidx.appcompat.view.menu.f fVar = lVar.h;
                    fVar.b(dVar, fVar.f170a);
                }
                androidx.appcompat.view.menu.d dVar2 = lVar.f13133i;
                k kVar2 = lVar.f13130e;
                if (dVar2.f160v == null) {
                    dVar2.f160v = (ExpandedMenuView) dVar2.f158t.inflate(com.htmltoapk.template.R.layout.abc_expanded_menu_layout, (ViewGroup) kVar2, false);
                    if (dVar2.f162x == null) {
                        dVar2.f162x = dVar2.new a();
                    }
                    dVar2.f160v.setAdapter((ListAdapter) dVar2.f162x);
                    dVar2.f160v.setOnItemClickListener(dVar2);
                }
                ExpandedMenuView expandedMenuView = dVar2.f160v;
                lVar.f13131f = expandedMenuView;
                if (expandedMenuView != null) {
                }
            }
            lVar.f13138n = true;
            return;
        }
        lVar.f13131f = view2;
        if (lVar.f13131f != null) {
            if (lVar.f13132g == null) {
                androidx.appcompat.view.menu.d dVar3 = lVar.f13133i;
                if (dVar3.f162x == null) {
                    dVar3.f162x = dVar3.new a();
                }
            }
            ViewGroup.LayoutParams layoutParams3 = lVar.f13131f.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            lVar.f13130e.setBackgroundResource(lVar.f13127b);
            ViewParent parent = lVar.f13131f.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(lVar.f13131f);
            }
            lVar.f13130e.addView(lVar.f13131f, layoutParams3);
            if (!lVar.f13131f.hasFocus()) {
                lVar.f13131f.requestFocus();
            }
        }
        lVar.f13138n = true;
        return;
        i6 = -2;
        lVar.f13136l = false;
        WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i6, -2, 0, 0, 1002, 8519680, -3);
        layoutParams22.gravity = lVar.f13128c;
        layoutParams22.windowAnimations = lVar.f13129d;
        windowManager.addView(lVar.f13130e, layoutParams22);
        lVar.f13137m = true;
        if (i7 != 0) {
        }
    }

    public final boolean K(l lVar, int i6, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((lVar.f13135k || L(lVar, keyEvent)) && (fVar = lVar.h) != null) {
            return fVar.performShortcut(i6, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L(l lVar, KeyEvent keyEvent) {
        l.f0 f0Var;
        l.f0 f0Var2;
        Resources.Theme themeNewTheme;
        l.f0 f0Var3;
        l.f0 f0Var4;
        if (!this.f13097j0) {
            boolean z6 = lVar.f13135k;
            int i6 = lVar.f13126a;
            if (z6) {
                return true;
            }
            l lVar2 = this.f13093f0;
            if (lVar2 != null && lVar2 != lVar) {
                x(lVar2, false);
            }
            Window.Callback callback = this.D.getCallback();
            if (callback != null) {
                lVar.f13132g = callback.onCreatePanelView(i6);
            }
            boolean z7 = i6 == 0 || i6 == 108;
            if (z7 && (f0Var4 = this.J) != null) {
                f0Var4.c();
            }
            if (lVar.f13132g == null) {
                androidx.appcompat.view.menu.f fVar = lVar.h;
                if (fVar == null || lVar.f13139o) {
                    if (fVar == null) {
                        Context context = this.C;
                        if ((i6 == 0 || i6 == 108) && this.J != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.htmltoapk.template.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.htmltoapk.template.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.htmltoapk.template.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                j.c cVar = new j.c(context, 0);
                                cVar.getTheme().setTo(themeNewTheme);
                                context = cVar;
                            }
                        }
                        androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(context);
                        fVar2.f174e = this;
                        androidx.appcompat.view.menu.f fVar3 = lVar.h;
                        if (fVar2 != fVar3) {
                            if (fVar3 != null) {
                                fVar3.r(lVar.f13133i);
                            }
                            lVar.h = fVar2;
                            androidx.appcompat.view.menu.d dVar = lVar.f13133i;
                            if (dVar != null) {
                                fVar2.b(dVar, fVar2.f170a);
                            }
                        }
                        if (lVar.h != null) {
                            if (z7 && (f0Var2 = this.J) != null) {
                                if (this.K == null) {
                                    this.K = new b();
                                }
                                f0Var2.a(lVar.h, this.K);
                            }
                            lVar.h.w();
                            if (callback.onCreatePanelMenu(i6, lVar.h)) {
                                lVar.f13139o = false;
                            } else {
                                androidx.appcompat.view.menu.f fVar4 = lVar.h;
                                if (fVar4 != null) {
                                    if (fVar4 != null) {
                                        fVar4.r(lVar.f13133i);
                                    }
                                    lVar.h = null;
                                }
                                if (z7 && (f0Var = this.J) != null) {
                                    f0Var.a(null, this.K);
                                }
                            }
                        }
                    }
                }
                lVar.h.w();
                Bundle bundle = lVar.f13140p;
                if (bundle != null) {
                    lVar.h.s(bundle);
                    lVar.f13140p = null;
                }
                if (!callback.onPreparePanel(0, lVar.f13132g, lVar.h)) {
                    if (z7 && (f0Var3 = this.J) != null) {
                        f0Var3.a(null, this.K);
                    }
                    lVar.h.v();
                    return false;
                }
                lVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                lVar.h.v();
            }
            lVar.f13135k = true;
            lVar.f13136l = false;
            this.f13093f0 = lVar;
            return true;
        }
        return false;
    }

    public final void M() {
        if (this.S) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void N() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z6 = false;
            if (this.f13111y0 != null && (E(0).f13137m || this.M != null)) {
                z6 = true;
            }
            if (z6 && this.f13112z0 == null) {
                this.f13112z0 = f.b(this.f13111y0, this);
            } else {
                if (z6 || (onBackInvokedCallback = this.f13112z0) == null) {
                    return;
                }
                f.c(this.f13111y0, onBackInvokedCallback);
                this.f13112z0 = null;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        l lVar;
        Window.Callback callback = this.D.getCallback();
        if (callback != null && !this.f13097j0) {
            androidx.appcompat.view.menu.f fVarK = fVar.k();
            l[] lVarArr = this.f13092e0;
            int length = lVarArr != null ? lVarArr.length : 0;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    lVar = lVarArr[i6];
                    if (lVar != null && lVar.h == fVarK) {
                        break;
                    }
                    i6++;
                } else {
                    lVar = null;
                    break;
                }
            }
            if (lVar != null) {
                return callback.onMenuItemSelected(lVar.f13126a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        l.f0 f0Var = this.J;
        if (f0Var == null || !f0Var.d() || (ViewConfiguration.get(this.C).hasPermanentMenuKey() && !this.J.e())) {
            l lVarE = E(0);
            lVarE.f13138n = true;
            x(lVarE, false);
            J(lVarE, null);
            return;
        }
        Window.Callback callback = this.D.getCallback();
        if (this.J.b()) {
            this.J.f();
            if (this.f13097j0) {
                return;
            }
            callback.onPanelClosed(108, E(0).h);
            return;
        }
        if (callback == null || this.f13097j0) {
            return;
        }
        if (this.f13104r0 && (1 & this.f13105s0) != 0) {
            View decorView = this.D.getDecorView();
            a aVar = this.f13106t0;
            decorView.removeCallbacks(aVar);
            aVar.run();
        }
        l lVarE2 = E(0);
        androidx.appcompat.view.menu.f fVar2 = lVarE2.h;
        if (fVar2 == null || lVarE2.f13139o || !callback.onPreparePanel(0, lVarE2.f13132g, fVar2)) {
            return;
        }
        callback.onMenuOpened(108, lVarE2.h);
        this.J.g();
    }

    @Override // g.f
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        B();
        ((ViewGroup) this.T.findViewById(R.id.content)).addView(view, layoutParams);
        this.E.a(this.D.getCallback());
    }

    @Override // g.f
    public final <T extends View> T d(int i6) {
        B();
        return (T) this.D.findViewById(i6);
    }

    @Override // g.f
    public final Context e() {
        return this.C;
    }

    @Override // g.f
    public final int f() {
        return this.f13099l0;
    }

    @Override // g.f
    public final void g() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.C);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof g) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.f
    public final void h() {
        if (this.G != null) {
            F();
            this.G.getClass();
            G(0);
        }
    }

    @Override // g.f
    public final void j() {
        String strC;
        this.f13095h0 = true;
        s(false, true);
        C();
        Object obj = this.B;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = i0.i.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e6) {
                    throw new IllegalArgumentException(e6);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                s sVar = this.G;
                if (sVar == null) {
                    this.f13107u0 = true;
                } else {
                    sVar.e(true);
                }
            }
            synchronized (g.f.f13084z) {
                g.f.m(this);
                g.f.f13083y.add(new WeakReference<>(this));
            }
        }
        this.f13098k0 = new Configuration(this.C.getResources().getConfiguration());
        this.f13096i0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // g.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        if (this.B instanceof Activity) {
            synchronized (g.f.f13084z) {
                g.f.m(this);
            }
        }
        if (this.f13104r0) {
            this.D.getDecorView().removeCallbacks(this.f13106t0);
        }
        this.f13097j0 = true;
        if (this.f13099l0 != -100) {
            Object obj = this.B;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                A0.put(this.B.getClass().getName(), Integer.valueOf(this.f13099l0));
            } else {
                A0.remove(this.B.getClass().getName());
            }
        }
        j jVar = this.p0;
        if (jVar != null) {
            jVar.a();
        }
        h hVar = this.f13103q0;
        if (hVar != null) {
            hVar.a();
        }
    }

    @Override // g.f
    public final void l() {
        F();
        s sVar = this.G;
        if (sVar != null) {
            sVar.f13191t = false;
            j.g gVar = sVar.s;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    @Override // g.f
    public final boolean n(int i6) {
        if (i6 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i6 = 108;
        } else if (i6 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i6 = 109;
        }
        if (this.f13090c0 && i6 == 108) {
            return false;
        }
        if (this.Y && i6 == 1) {
            this.Y = false;
        }
        if (i6 == 1) {
            M();
            this.f13090c0 = true;
            return true;
        }
        if (i6 == 2) {
            M();
            this.W = true;
            return true;
        }
        if (i6 == 5) {
            M();
            this.X = true;
            return true;
        }
        if (i6 == 10) {
            M();
            this.f13088a0 = true;
            return true;
        }
        if (i6 == 108) {
            M();
            this.Y = true;
            return true;
        }
        if (i6 != 109) {
            return this.D.requestFeature(i6);
        }
        M();
        this.Z = true;
        return true;
    }

    @Override // g.f
    public final void o(int i6) {
        B();
        ViewGroup viewGroup = (ViewGroup) this.T.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.C).inflate(i6, viewGroup);
        this.E.a(this.D.getCallback());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View tVar;
        View view2 = null;
        if (this.f13110x0 == null) {
            int[] iArr = f.a.f12942j;
            Context context2 = this.C;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f13110x0 = new o();
            } else {
                try {
                    this.f13110x0 = (o) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f13110x0 = new o();
                }
            }
        }
        o oVar = this.f13110x0;
        int i6 = h1.f13649a;
        oVar.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f12955x, 0, 0);
        char c7 = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context cVar = (resourceId == 0 || ((context instanceof j.c) && ((j.c) context).f13383a == resourceId)) ? context : new j.c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (!str.equals("RatingBar")) {
                    c7 = 65535;
                    break;
                } else {
                    c7 = 0;
                    break;
                }
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c7 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c7 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c7 = 3;
                    break;
                }
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c7 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c7 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c7 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c7 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c7 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c7 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c7 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c7 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c7 = '\r';
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                tVar = new t(cVar, attributeSet);
                break;
            case 1:
                tVar = new l.g(cVar, attributeSet);
                break;
            case 2:
                tVar = new l.p(cVar, attributeSet);
                break;
            case 3:
                tVar = oVar.e(cVar, attributeSet);
                break;
            case 4:
                tVar = new l.m(cVar, attributeSet);
                break;
            case 5:
                tVar = new v(cVar, attributeSet);
                break;
            case 6:
                tVar = new y(cVar, attributeSet, com.htmltoapk.template.R.attr.spinnerStyle);
                break;
            case 7:
                tVar = oVar.d(cVar, attributeSet);
                break;
            case '\b':
                tVar = new e0(cVar, attributeSet);
                break;
            case '\t':
                tVar = new l.o(cVar, attributeSet, 0);
                break;
            case '\n':
                tVar = oVar.a(cVar, attributeSet);
                break;
            case 11:
                tVar = oVar.c(cVar, attributeSet);
                break;
            case '\f':
                tVar = new l.k(cVar, attributeSet);
                break;
            case '\r':
                tVar = oVar.b(cVar, attributeSet);
                break;
            default:
                tVar = null;
                break;
        }
        if (tVar == null && context != cVar) {
            Object[] objArr = oVar.f13151a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = cVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i7 = 0;
                    while (true) {
                        String[] strArr = o.f13150g;
                        if (i7 < 3) {
                            View viewF = oVar.f(cVar, str, strArr[i7]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i7++;
                            }
                        }
                    }
                } else {
                    View viewF2 = oVar.f(cVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            tVar = view2;
        }
        if (tVar != null) {
            Context context3 = tVar.getContext();
            if ((context3 instanceof ContextWrapper) && tVar.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, o.f13146c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    tVar.setOnClickListener(new o.a(string2, tVar));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = cVar.obtainStyledAttributes(attributeSet, o.f13147d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z6 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
                    new u0.e0(com.htmltoapk.template.R.id.tag_accessibility_heading, Boolean.class, 0, 28).c(tVar, Boolean.valueOf(z6));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = cVar.obtainStyledAttributes(attributeSet, o.f13148e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    u0.f0.n(tVar, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = cVar.obtainStyledAttributes(attributeSet, o.f13149f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z7 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap<View, n0> weakHashMap2 = u0.f0.f14480a;
                    new c0(com.htmltoapk.template.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).c(tVar, Boolean.valueOf(z7));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return tVar;
    }

    @Override // g.f
    public final void p(View view) {
        B();
        ViewGroup viewGroup = (ViewGroup) this.T.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.E.a(this.D.getCallback());
    }

    @Override // g.f
    public final void q(View view, ViewGroup.LayoutParams layoutParams) {
        B();
        ViewGroup viewGroup = (ViewGroup) this.T.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.E.a(this.D.getCallback());
    }

    @Override // g.f
    public final void r(CharSequence charSequence) {
        this.I = charSequence;
        l.f0 f0Var = this.J;
        if (f0Var != null) {
            f0Var.setWindowTitle(charSequence);
            return;
        }
        s sVar = this.G;
        if (sVar != null) {
            sVar.f13178e.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(boolean z6, boolean z7) {
        int i6;
        boolean z8;
        Object obj;
        Object obj2;
        if (this.f13097j0) {
            return false;
        }
        int i7 = this.f13099l0;
        if (i7 == -100) {
            i7 = g.f.f13078t;
        }
        Context context = this.C;
        int iH = H(context, i7);
        int i8 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        q0.g gVarU = i8 < 33 ? u(context) : null;
        if (!z7 && gVarU != null) {
            gVarU = e.b(context.getResources().getConfiguration());
        }
        Configuration configurationY = y(context, iH, gVarU, null, false);
        boolean z9 = this.f13102o0;
        boolean z10 = true;
        Object obj3 = this.B;
        if (z9 || !(obj3 instanceof Activity)) {
            this.f13102o0 = true;
            i6 = this.f13101n0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i6 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i8 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f13101n0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e6) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e6);
                    this.f13101n0 = 0;
                }
                this.f13102o0 = true;
                i6 = this.f13101n0;
            }
        }
        Configuration configuration = this.f13098k0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i9 = configuration.uiMode & 48;
        int i10 = configurationY.uiMode & 48;
        q0.g gVarB = e.b(configuration);
        q0.g gVarB2 = gVarU == null ? null : e.b(configurationY);
        int i11 = i9 != i10 ? AdRequest.MAX_CONTENT_URL_LENGTH : 0;
        if (gVarB2 != null && !gVarB.equals(gVarB2)) {
            i11 |= 8196;
        }
        int i12 = 3;
        if (((~i6) & i11) != 0 && z6 && this.f13095h0 && ((C0 || this.f13096i0) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (!activity.isChild()) {
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 31 && (i11 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationY.getLayoutDirection());
                }
                if (i13 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new androidx.activity.d(i12, activity));
                }
                z8 = true;
            }
        } else {
            z8 = false;
        }
        if (z8 || i11 == 0) {
            z10 = z8;
        } else {
            boolean z11 = (i6 & i11) == i11;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i10;
            if (gVarB2 != null) {
                e.d(configuration2, gVarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 < 26 && i14 < 28) {
                if (!p.h) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        p.f13161g = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e7) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e7);
                    }
                    p.h = true;
                }
                Field field = p.f13161g;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e8) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e8);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!p.f13156b) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                p.f13155a = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e9) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e9);
                            }
                            p.f13156b = true;
                        }
                        Field field2 = p.f13155a;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e10) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e10);
                            }
                            if (obj2 != null) {
                                if (!p.f13158d) {
                                    try {
                                        p.f13157c = Class.forName("android.content.res.ThemedResourceCache");
                                    } catch (ClassNotFoundException e11) {
                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e11);
                                    }
                                    p.f13158d = true;
                                }
                                Class<?> cls = p.f13157c;
                                if (cls != null) {
                                    if (!p.f13160f) {
                                        try {
                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                            p.f13159e = declaredField3;
                                            declaredField3.setAccessible(true);
                                        } catch (NoSuchFieldException e12) {
                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e12);
                                        }
                                        p.f13160f = true;
                                    }
                                    Field field3 = p.f13159e;
                                    if (field3 != null) {
                                        try {
                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                        } catch (IllegalAccessException e13) {
                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e13);
                                        }
                                        if (longSparseArray != null) {
                                            longSparseArray.clear();
                                        }
                                    }
                                }
                            }
                        } else {
                            obj2 = null;
                            if (obj2 != null) {
                            }
                        }
                    }
                }
            }
            int i15 = this.f13100m0;
            if (i15 != 0) {
                context.setTheme(i15);
                context.getTheme().applyStyle(this.f13100m0, true);
            }
            if (z11 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof androidx.lifecycle.m) {
                    if (((androidx.lifecycle.m) activity2).getLifecycle().b().compareTo(h.b.f1302u) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f13096i0 && !this.f13097j0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (gVarB2 != null) {
            e.c(e.b(context.getResources().getConfiguration()));
        }
        if (i7 == 0) {
            D(context).e();
        } else {
            j jVar = this.p0;
            if (jVar != null) {
                jVar.a();
            }
        }
        if (i7 == 3) {
            if (this.f13103q0 == null) {
                this.f13103q0 = new h(context);
            }
            this.f13103q0.e();
        } else {
            h hVar = this.f13103q0;
            if (hVar != null) {
                hVar.a();
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(Window window) {
        Drawable drawableD;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.D != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C0062g) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C0062g c0062g = new C0062g(callback);
        this.E = c0062g;
        window.setCallback(c0062g);
        Context context = this.C;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, B0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableD = null;
        } else {
            l.j jVarA = l.j.a();
            synchronized (jVarA) {
                drawableD = jVarA.f13674a.d(context, resourceId, true);
            }
        }
        if (drawableD != null) {
            window.setBackgroundDrawable(drawableD);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.D = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f13111y0) != null) {
            return;
        }
        Object obj = this.B;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f13112z0) != null) {
            f.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f13112z0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f13111y0 = f.a(activity);
            } else {
                this.f13111y0 = null;
            }
        }
        N();
    }

    public final void v(int i6, l lVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (lVar == null && i6 >= 0) {
                l[] lVarArr = this.f13092e0;
                if (i6 < lVarArr.length) {
                    lVar = lVarArr[i6];
                }
            }
            if (lVar != null) {
                fVar = lVar.h;
            }
        }
        if ((lVar == null || lVar.f13137m) && !this.f13097j0) {
            C0062g c0062g = this.E;
            Window.Callback callback = this.D.getCallback();
            c0062g.getClass();
            try {
                c0062g.f13117v = true;
                callback.onPanelClosed(i6, fVar);
            } finally {
                c0062g.f13117v = false;
            }
        }
    }

    public final void w(androidx.appcompat.view.menu.f fVar) {
        if (this.f13091d0) {
            return;
        }
        this.f13091d0 = true;
        this.J.i();
        Window.Callback callback = this.D.getCallback();
        if (callback != null && !this.f13097j0) {
            callback.onPanelClosed(108, fVar);
        }
        this.f13091d0 = false;
    }

    public final void x(l lVar, boolean z6) {
        k kVar;
        l.f0 f0Var;
        if (z6 && lVar.f13126a == 0 && (f0Var = this.J) != null && f0Var.b()) {
            w(lVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.C.getSystemService("window");
        if (windowManager != null && lVar.f13137m && (kVar = lVar.f13130e) != null) {
            windowManager.removeView(kVar);
            if (z6) {
                v(lVar.f13126a, lVar, null);
            }
        }
        lVar.f13135k = false;
        lVar.f13136l = false;
        lVar.f13137m = false;
        lVar.f13131f = null;
        lVar.f13138n = true;
        if (this.f13093f0 == lVar) {
            this.f13093f0 = null;
        }
        if (lVar.f13126a == 0) {
            N();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(KeyEvent keyEvent) {
        View decorView;
        boolean zF;
        boolean zL;
        Object obj = this.B;
        if ((!(obj instanceof f.a) && !(obj instanceof n)) || (decorView = this.D.getDecorView()) == null || !u0.f.a(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                C0062g c0062g = this.E;
                Window.Callback callback = this.D.getCallback();
                c0062g.getClass();
                try {
                    c0062g.f13116u = true;
                    if (!callback.dispatchKeyEvent(keyEvent)) {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode == 4) {
                                this.f13094g0 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    l lVarE = E(0);
                                    if (!lVarE.f13137m) {
                                        L(lVarE, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.M == null) {
                                    l lVarE2 = E(0);
                                    l.f0 f0Var = this.J;
                                    Context context = this.C;
                                    if (f0Var == null || !f0Var.d() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        boolean z6 = lVarE2.f13137m;
                                        if (z6 || lVarE2.f13136l) {
                                            x(lVarE2, true);
                                            zF = z6;
                                        } else if (lVarE2.f13135k) {
                                            if (lVarE2.f13139o) {
                                                lVarE2.f13135k = false;
                                                zL = L(lVarE2, keyEvent);
                                            } else {
                                                zL = true;
                                            }
                                            if (zL) {
                                                J(lVarE2, keyEvent);
                                                zF = true;
                                            }
                                        } else {
                                            zF = false;
                                        }
                                        if (zF) {
                                            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                            if (audioManager != null) {
                                                audioManager.playSoundEffect(0);
                                                return true;
                                            }
                                            Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                            return true;
                                        }
                                    } else {
                                        if (this.J.b()) {
                                            zF = this.J.f();
                                        } else if (!this.f13097j0 && L(lVarE2, keyEvent)) {
                                            zF = this.J.g();
                                        }
                                        if (zF) {
                                        }
                                    }
                                }
                            }
                            return false;
                        }
                        if (!I()) {
                            return false;
                        }
                    }
                } finally {
                    c0062g.f13116u = false;
                }
            }
        }
        return true;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: g.g$g, reason: collision with other inner class name */
    public class C0062g extends j.h {

        /* renamed from: t, reason: collision with root package name */
        public boolean f13115t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f13116u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f13117v;

        public C0062g(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.f13115t = true;
                callback.onContentChanged();
            } finally {
                this.f13115t = false;
            }
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean z6 = this.f13116u;
            Window.Callback callback = this.s;
            return z6 ? callback.dispatchKeyEvent(keyEvent) : g.this.z(keyEvent) || callback.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[RETURN] */
        @Override // android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            boolean z6;
            androidx.appcompat.view.menu.f fVar;
            boolean zPerformShortcut;
            if (!this.s.dispatchKeyShortcutEvent(keyEvent)) {
                int keyCode = keyEvent.getKeyCode();
                g gVar = g.this;
                gVar.F();
                s sVar = gVar.G;
                if (sVar == null) {
                    l lVar = gVar.f13093f0;
                    if (lVar == null || !gVar.K(lVar, keyEvent.getKeyCode(), keyEvent)) {
                        if (gVar.f13093f0 == null) {
                            l lVarE = gVar.E(0);
                            gVar.L(lVarE, keyEvent);
                            boolean zK = gVar.K(lVarE, keyEvent.getKeyCode(), keyEvent);
                            lVarE.f13135k = false;
                            if (zK) {
                            }
                            if (z6) {
                                return false;
                            }
                        }
                        z6 = false;
                        if (z6) {
                        }
                    } else {
                        l lVar2 = gVar.f13093f0;
                        if (lVar2 != null) {
                            lVar2.f13136l = true;
                        }
                    }
                    z6 = true;
                    if (z6) {
                    }
                } else {
                    s.d dVar = sVar.f13181i;
                    if (dVar == null || (fVar = dVar.f13198v) == null) {
                        zPerformShortcut = false;
                    } else {
                        fVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                        zPerformShortcut = fVar.performShortcut(keyCode, keyEvent, 0);
                    }
                    if (zPerformShortcut) {
                        z6 = true;
                        if (z6) {
                        }
                    }
                }
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f13115t) {
                this.s.onContentChanged();
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i6, Menu menu) {
            if (i6 != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return this.s.onCreatePanelMenu(i6, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public final View onCreatePanelView(int i6) {
            return this.s.onCreatePanelView(i6);
        }

        @Override // j.h, android.view.Window.Callback
        public final boolean onMenuOpened(int i6, Menu menu) {
            super.onMenuOpened(i6, menu);
            if (i6 == 108) {
                g gVar = g.this;
                gVar.F();
                s sVar = gVar.G;
                if (sVar != null) {
                    sVar.b(true);
                }
            }
            return true;
        }

        @Override // j.h, android.view.Window.Callback
        public final void onPanelClosed(int i6, Menu menu) {
            if (this.f13117v) {
                this.s.onPanelClosed(i6, menu);
                return;
            }
            super.onPanelClosed(i6, menu);
            g gVar = g.this;
            if (i6 == 108) {
                gVar.F();
                s sVar = gVar.G;
                if (sVar != null) {
                    sVar.b(false);
                    return;
                }
                return;
            }
            if (i6 == 0) {
                l lVarE = gVar.E(i6);
                if (lVarE.f13137m) {
                    gVar.x(lVarE, false);
                }
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onPreparePanel(int i6, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar = menu instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) menu : null;
            if (i6 == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.f191x = true;
            }
            boolean zOnPreparePanel = this.s.onPreparePanel(i6, view, menu);
            if (fVar != null) {
                fVar.f191x = false;
            }
            return zOnPreparePanel;
        }

        @Override // j.h, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i6) {
            androidx.appcompat.view.menu.f fVar = g.this.E(0).h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i6);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i6);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i6) {
            ViewGroup viewGroup;
            g gVar = g.this;
            if (!gVar.R || i6 != 0) {
                return h.a.b(this.s, callback, i6);
            }
            Context context = gVar.C;
            e.a aVar = new e.a(context, callback);
            Object obj = gVar.F;
            j.a aVar2 = gVar.M;
            if (aVar2 != null) {
                aVar2.c();
            }
            c cVar = gVar.new c(aVar);
            gVar.F();
            s sVar = gVar.G;
            if (sVar != null) {
                s.d dVar = sVar.f13181i;
                if (dVar != null) {
                    dVar.c();
                }
                sVar.f13176c.setHideOnContentScrollEnabled(false);
                sVar.f13179f.h();
                s.d dVar2 = sVar.new d(sVar.f13179f.getContext(), cVar);
                androidx.appcompat.view.menu.f fVar = dVar2.f13198v;
                fVar.w();
                try {
                    if (dVar2.f13199w.f13113a.c(dVar2, fVar)) {
                        sVar.f13181i = dVar2;
                        dVar2.i();
                        sVar.f13179f.f(dVar2);
                        sVar.a(true);
                    } else {
                        dVar2 = null;
                    }
                    gVar.M = dVar2;
                } finally {
                    fVar.v();
                }
            }
            if (gVar.M == null) {
                n0 n0Var = gVar.Q;
                if (n0Var != null) {
                    n0Var.b();
                }
                j.a aVar3 = gVar.M;
                if (aVar3 != null) {
                    aVar3.c();
                }
                if (obj != null) {
                    boolean z6 = gVar.f13097j0;
                }
                if (gVar.N == null) {
                    if (gVar.f13089b0) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.htmltoapk.template.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            j.c cVar2 = new j.c(context, 0);
                            cVar2.getTheme().setTo(themeNewTheme);
                            context = cVar2;
                        }
                        gVar.N = new ActionBarContextView(context, null);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.htmltoapk.template.R.attr.actionModePopupWindowStyle);
                        gVar.O = popupWindow;
                        popupWindow.setWindowLayoutType(2);
                        gVar.O.setContentView(gVar.N);
                        gVar.O.setWidth(-1);
                        context.getTheme().resolveAttribute(com.htmltoapk.template.R.attr.actionBarSize, typedValue, true);
                        gVar.N.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        gVar.O.setHeight(-2);
                        gVar.P = new g.i(gVar);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) gVar.T.findViewById(com.htmltoapk.template.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            gVar.F();
                            s sVar2 = gVar.G;
                            Context contextC = sVar2 != null ? sVar2.c() : null;
                            if (contextC != null) {
                                context = contextC;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                            gVar.N = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (gVar.N != null) {
                    n0 n0Var2 = gVar.Q;
                    if (n0Var2 != null) {
                        n0Var2.b();
                    }
                    gVar.N.h();
                    Context context2 = gVar.N.getContext();
                    ActionBarContextView actionBarContextView = gVar.N;
                    j.d dVar3 = new j.d();
                    dVar3.f13388u = context2;
                    dVar3.f13389v = actionBarContextView;
                    dVar3.f13390w = cVar;
                    androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(actionBarContextView.getContext());
                    fVar2.f180l = 1;
                    dVar3.f13393z = fVar2;
                    fVar2.f174e = dVar3;
                    if (aVar.c(dVar3, fVar2)) {
                        dVar3.i();
                        gVar.N.f(dVar3);
                        gVar.M = dVar3;
                        if (gVar.S && (viewGroup = gVar.T) != null && viewGroup.isLaidOut()) {
                            gVar.N.setAlpha(0.0f);
                            n0 n0VarA = u0.f0.a(gVar.N);
                            n0VarA.a(1.0f);
                            gVar.Q = n0VarA;
                            n0VarA.d(new g.j(gVar));
                        } else {
                            gVar.N.setAlpha(1.0f);
                            gVar.N.setVisibility(0);
                            if (gVar.N.getParent() instanceof View) {
                                View view = (View) gVar.N.getParent();
                                WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
                                f0.c.c(view);
                            }
                        }
                        if (gVar.O != null) {
                            gVar.D.getDecorView().post(gVar.P);
                        }
                    } else {
                        gVar.M = null;
                    }
                }
                gVar.N();
                gVar.M = gVar.M;
            }
            gVar.N();
            j.a aVar4 = gVar.M;
            if (aVar4 != null) {
                return aVar.a(aVar4);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }
}
