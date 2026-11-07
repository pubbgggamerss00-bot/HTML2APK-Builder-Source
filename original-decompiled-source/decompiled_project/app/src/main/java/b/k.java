package b;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.j0;
import androidx.lifecycle.l;
import androidx.lifecycle.o0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.z0;
import b.k;
import c6.c;
import com.basitce.htmltoapk.R;
import e.f;
import e9.w0;
import f.a;
import f9.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.m0;
import y3.n;

/* loaded from: classes.dex */
public class k extends o3.d implements b1, androidx.lifecycle.i, c6.e, i0, e.j, p3.d, p3.e, o3.o, o3.p, y3.k {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final c Companion = new c();
    private a1 _viewModelStore;
    private final e.f activityResultRegistry;
    private int contentLayoutId;
    private final d.a contextAwareHelper;
    private final pg.j defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final pg.j fullyDrawnReporter$delegate;
    private final y3.n menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final pg.j onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<x3.a<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<x3.a<o3.f>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<x3.a<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<x3.a<o3.r>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<x3.a<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final e reportFullyDrawnExecutor;
    private final c6.d savedStateRegistryController;

    public static final class a implements androidx.lifecycle.r {
        public a() {
        }

        @Override // androidx.lifecycle.r
        public final void l(androidx.lifecycle.t tVar, l.a aVar) {
            k kVar = k.this;
            kVar.ensureViewModelStore();
            kVar.getLifecycle().c(this);
        }
    }

    public static final class b {
        public static OnBackInvokedDispatcher a(k activity) {
            kotlin.jvm.internal.r.e(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            kotlin.jvm.internal.r.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    public static final class c {
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public Object f3248a;

        /* renamed from: b, reason: collision with root package name */
        public a1 f3249b;
    }

    public interface e extends Executor {
        void E(View view);

        void h();
    }

    public final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final long f3250a = SystemClock.uptimeMillis() + 10000;

        /* renamed from: b, reason: collision with root package name */
        public Runnable f3251b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3252c;

        public f() {
        }

        @Override // b.k.e
        public final void E(View view) {
            if (this.f3252c) {
                return;
            }
            this.f3252c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            kotlin.jvm.internal.r.e(runnable, "runnable");
            this.f3251b = runnable;
            View decorView = k.this.getWindow().getDecorView();
            kotlin.jvm.internal.r.d(decorView, "window.decorView");
            if (!this.f3252c) {
                decorView.postOnAnimation(new Runnable() { // from class: b.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.f fVar = this.f3258a;
                        Runnable runnable2 = fVar.f3251b;
                        if (runnable2 != null) {
                            runnable2.run();
                            fVar.f3251b = null;
                        }
                    }
                });
            } else if (kotlin.jvm.internal.r.a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // b.k.e
        public final void h() {
            k kVar = k.this;
            kVar.getWindow().getDecorView().removeCallbacks(this);
            kVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z10;
            Runnable runnable = this.f3251b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f3250a) {
                    this.f3252c = false;
                    k.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f3251b = null;
            v fullyDrawnReporter = k.this.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f3274a) {
                z10 = fullyDrawnReporter.f3275b;
            }
            if (z10) {
                this.f3252c = false;
                k.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            k.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public static final class g extends e.f {
        public g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e.f
        public final void b(final int i10, f.a aVar, Object obj) {
            Bundle bundleExtra;
            final int i11;
            k kVar = k.this;
            final a.C0091a c0091aB = aVar.b(kVar, obj);
            if (c0091aB != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b.m
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        T t3 = c0091aB.f8744a;
                        k.g gVar = this.f3259a;
                        String str = (String) gVar.f8092a.get(Integer.valueOf(i10));
                        if (str == null) {
                            return;
                        }
                        f.a aVar2 = (f.a) gVar.f8096e.get(str);
                        if ((aVar2 != null ? aVar2.f8099a : null) == null) {
                            gVar.f8098g.remove(str);
                            gVar.f8097f.put(str, t3);
                        } else {
                            e.b<O> bVar = aVar2.f8099a;
                            if (gVar.f8095d.remove(str)) {
                                bVar.a(t3);
                            }
                        }
                    }
                });
                return;
            }
            Intent intentA = aVar.a(kVar, obj);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                kotlin.jvm.internal.r.b(extras);
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(kVar.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                HashSet hashSet = new HashSet();
                for (int i12 = 0; i12 < stringArrayExtra.length; i12++) {
                    if (TextUtils.isEmpty(stringArrayExtra[i12])) {
                        throw new IllegalArgumentException(o.a(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    }
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i12], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i12));
                    }
                }
                int size = hashSet.size();
                String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
                if (size > 0) {
                    if (size == stringArrayExtra.length) {
                        return;
                    }
                    int i13 = 0;
                    for (int i14 = 0; i14 < stringArrayExtra.length; i14++) {
                        if (!hashSet.contains(Integer.valueOf(i14))) {
                            strArr[i13] = stringArrayExtra[i14];
                            i13++;
                        }
                    }
                }
                if (kVar instanceof o3.a) {
                }
                kVar.requestPermissions(stringArrayExtra, i10);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                kVar.startActivityForResult(intentA, i10, bundle);
                return;
            }
            e.k kVar2 = (e.k) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                kotlin.jvm.internal.r.b(kVar2);
                i11 = i10;
                try {
                    kVar.startIntentSenderForResult(kVar2.f8110a, i11, kVar2.f8111b, kVar2.f8112c, kVar2.f8113d, 0, bundle);
                } catch (IntentSender.SendIntentException e10) {
                    e = e10;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3262a.a(i11, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                i11 = i10;
            }
        }
    }

    public static final class h extends kotlin.jvm.internal.s implements eh.a<s0> {
        public h() {
            super(0);
        }

        @Override // eh.a
        public final s0 invoke() {
            k kVar = k.this;
            return new s0(kVar.getApplication(), kVar, kVar.getIntent() != null ? kVar.getIntent().getExtras() : null);
        }
    }

    public static final class i extends kotlin.jvm.internal.s implements eh.a<v> {
        public i() {
            super(0);
        }

        @Override // eh.a
        public final v invoke() {
            k kVar = k.this;
            return new v(kVar.reportFullyDrawnExecutor, new p(kVar));
        }
    }

    public static final class j extends kotlin.jvm.internal.s implements eh.a<d0> {
        public j() {
            super(0);
        }

        @Override // eh.a
        public final d0 invoke() {
            final k kVar = k.this;
            final d0 d0Var = new d0(new Runnable() { // from class: b.q
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        super/*android.app.Activity*/.onBackPressed();
                    } catch (IllegalStateException e10) {
                        if (!kotlin.jvm.internal.r.a(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                            throw e10;
                        }
                    } catch (NullPointerException e11) {
                        if (!kotlin.jvm.internal.r.a(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                            throw e11;
                        }
                    }
                }
            });
            if (Build.VERSION.SDK_INT >= 33) {
                if (!kotlin.jvm.internal.r.a(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            kVar.addObserverForBackInvoker(d0Var);
                        }
                    });
                    return d0Var;
                }
                kVar.addObserverForBackInvoker(d0Var);
            }
            return d0Var;
        }
    }

    public k() {
        this.contextAwareHelper = new d.a();
        this.menuHostHelper = new y3.n(new b.e(this));
        e6.b bVar = new e6.b(this, new z0(this, 2));
        this.savedStateRegistryController = new c6.d(bVar);
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = w0.b(new i());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new g();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new androidx.lifecycle.r() { // from class: b.f
            @Override // androidx.lifecycle.r
            public final void l(androidx.lifecycle.t tVar, l.a aVar) {
                k._init_$lambda$2(this.f3240a, tVar, aVar);
            }
        });
        getLifecycle().a(new androidx.lifecycle.r() { // from class: b.g
            @Override // androidx.lifecycle.r
            public final void l(androidx.lifecycle.t tVar, l.a aVar) {
                k._init_$lambda$3(this.f3241a, tVar, aVar);
            }
        });
        getLifecycle().a(new a());
        bVar.a();
        o0.b(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new c.b() { // from class: b.h
            @Override // c6.c.b
            public final Bundle a() {
                return k._init_$lambda$4(this.f3243a);
            }
        });
        addOnContextAvailableListener(new d.b() { // from class: b.i
            @Override // d.b
            public final void a(k kVar) {
                k._init_$lambda$5(this.f3244a, kVar);
            }
        });
        this.defaultViewModelProviderFactory$delegate = w0.b(new h());
        this.onBackPressedDispatcher$delegate = w0.b(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(k kVar, androidx.lifecycle.t tVar, l.a event) {
        Window window;
        View viewPeekDecorView;
        kotlin.jvm.internal.r.e(tVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.r.e(event, "event");
        if (event != l.a.ON_STOP || (window = kVar.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(k kVar, androidx.lifecycle.t tVar, l.a event) {
        kotlin.jvm.internal.r.e(tVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.r.e(event, "event");
        if (event == l.a.ON_DESTROY) {
            kVar.contextAwareHelper.f7036b = null;
            if (!kVar.isChangingConfigurations()) {
                kVar.getViewModelStore().a();
            }
            kVar.reportFullyDrawnExecutor.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(k kVar) {
        Bundle bundle = new Bundle();
        e.f fVar = kVar.activityResultRegistry;
        fVar.getClass();
        LinkedHashMap linkedHashMap = fVar.f8093b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(fVar.f8095d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(fVar.f8098g));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(k kVar, Context it) {
        kotlin.jvm.internal.r.e(it, "it");
        Bundle bundleA = kVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            e.f fVar = kVar.activityResultRegistry;
            LinkedHashMap linkedHashMap = fVar.f8093b;
            LinkedHashMap linkedHashMap2 = fVar.f8092a;
            Bundle bundle = fVar.f8098g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                fVar.f8095d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = stringArrayList.get(i10);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        m0.a(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i10);
                kotlin.jvm.internal.r.d(num2, "rcs[i]");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i10);
                kotlin.jvm.internal.r.d(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                fVar.f8093b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final d0 d0Var) {
        getLifecycle().a(new androidx.lifecycle.r(this) { // from class: b.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f3246b;

            {
                this.f3246b = this;
            }

            @Override // androidx.lifecycle.r
            public final void l(androidx.lifecycle.t tVar, l.a aVar) {
                k.addObserverForBackInvoker$lambda$7(d0Var, this.f3246b, tVar, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(d0 d0Var, k kVar, androidx.lifecycle.t tVar, l.a event) {
        kotlin.jvm.internal.r.e(tVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.r.e(event, "event");
        if (event == l.a.ON_CREATE) {
            d0Var.f3226e = b.a(kVar);
            d0Var.d(d0Var.f3228g);
        }
    }

    private final e createFullyDrawnExecutor() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.f3249b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new a1();
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.r.d(decorView, "window.decorView");
        eVar.E(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // y3.k
    public void addMenuProvider(y3.o provider) {
        kotlin.jvm.internal.r.e(provider, "provider");
        y3.n nVar = this.menuHostHelper;
        nVar.f33870b.add(provider);
        nVar.f33869a.run();
    }

    @Override // p3.d
    public final void addOnConfigurationChangedListener(x3.a<Configuration> listener) {
        kotlin.jvm.internal.r.e(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(d.b listener) {
        kotlin.jvm.internal.r.e(listener, "listener");
        d.a aVar = this.contextAwareHelper;
        aVar.getClass();
        k kVar = aVar.f7036b;
        if (kVar != null) {
            listener.a(kVar);
        }
        aVar.f7035a.add(listener);
    }

    @Override // o3.o
    public final void addOnMultiWindowModeChangedListener(x3.a<o3.f> listener) {
        kotlin.jvm.internal.r.e(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(x3.a<Intent> listener) {
        kotlin.jvm.internal.r.e(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // o3.p
    public final void addOnPictureInPictureModeChangedListener(x3.a<o3.r> listener) {
        kotlin.jvm.internal.r.e(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // p3.e
    public final void addOnTrimMemoryListener(x3.a<Integer> listener) {
        kotlin.jvm.internal.r.e(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.r.e(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // e.j
    public final e.f getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.i
    public j5.a getDefaultViewModelCreationExtras() {
        j5.d dVar = new j5.d((Object) null);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f15158a;
        if (application != null) {
            Application application2 = getApplication();
            kotlin.jvm.internal.r.d(application2, "application");
            linkedHashMap.put(z0.a.f2402d, application2);
        }
        linkedHashMap.put(o0.f2335a, this);
        linkedHashMap.put(o0.f2336b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(o0.f2337c, extras);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.i
    public z0.c getDefaultViewModelProviderFactory() {
        return (z0.c) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public v getFullyDrawnReporter() {
        return (v) this.fullyDrawnReporter$delegate.getValue();
    }

    @pg.d
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.f3248a;
        }
        return null;
    }

    @Override // o3.d, androidx.lifecycle.t
    public androidx.lifecycle.l getLifecycle() {
        return super.getLifecycle();
    }

    @Override // b.i0
    public final d0 getOnBackPressedDispatcher() {
        return (d0) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // c6.e
    public final c6.c getSavedStateRegistry() {
        return this.savedStateRegistryController.f4996b;
    }

    @Override // androidx.lifecycle.b1
    public a1 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        a1 a1Var = this._viewModelStore;
        kotlin.jvm.internal.r.b(a1Var);
        return a1Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.r.d(decorView, "window.decorView");
        c1.d(decorView, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.r.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.r.d(decorView3, "window.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.r.d(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.r.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @pg.d
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.activityResultRegistry.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    @pg.d
    public void onBackPressed() {
        getOnBackPressedDispatcher().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.r.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<x3.a<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // o3.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        d.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f7036b = this;
        Iterator it = aVar.f7035a.iterator();
        while (it.hasNext()) {
            ((d.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i10 = j0.f2313b;
        j0.a.b(this);
        int i11 = this.contentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        kotlin.jvm.internal.r.e(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        y3.n nVar = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<y3.o> it = nVar.f33870b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem item) {
        kotlin.jvm.internal.r.e(item, "item");
        if (super.onMenuItemSelected(i10, item)) {
            return true;
        }
        if (i10 != 0) {
            return false;
        }
        Iterator<y3.o> it = this.menuHostHelper.f33870b.iterator();
        while (it.hasNext()) {
            if (it.next().a(item)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    @pg.d
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<x3.a<o3.f>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new o3.f(z10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.r.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator<x3.a<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        kotlin.jvm.internal.r.e(menu, "menu");
        Iterator<y3.o> it = this.menuHostHelper.f33870b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    @pg.d
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<x3.a<o3.r>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new o3.r(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        kotlin.jvm.internal.r.e(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator<y3.o> it = this.menuHostHelper.f33870b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @pg.d
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.r.e(permissions, "permissions");
        kotlin.jvm.internal.r.e(grantResults, "grantResults");
        if (this.activityResultRegistry.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    @pg.d
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        a1 a1Var = this._viewModelStore;
        if (a1Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            a1Var = dVar.f3249b;
        }
        if (a1Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f3248a = objOnRetainCustomNonConfigurationInstance;
        dVar2.f3249b = a1Var;
        return dVar2;
    }

    @Override // o3.d, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.r.e(outState, "outState");
        if (getLifecycle() instanceof androidx.lifecycle.v) {
            androidx.lifecycle.l lifecycle = getLifecycle();
            kotlin.jvm.internal.r.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.v) lifecycle).h(l.b.f2321c);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.b(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<x3.a<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f7036b;
    }

    public final <I, O> e.c<I> registerForActivityResult(final f.a<I, O> contract, final e.f registry, final e.b<O> callback) {
        kotlin.jvm.internal.r.e(contract, "contract");
        kotlin.jvm.internal.r.e(registry, "registry");
        kotlin.jvm.internal.r.e(callback, "callback");
        final String key = "activity_rq#" + this.nextLocalRequestCode.getAndIncrement();
        LinkedHashMap linkedHashMap = registry.f8094c;
        kotlin.jvm.internal.r.e(key, "key");
        androidx.lifecycle.l lifecycle = getLifecycle();
        if (lifecycle.b().compareTo(l.b.f2322d) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        registry.d(key);
        f.b bVar = (f.b) linkedHashMap.get(key);
        if (bVar == null) {
            bVar = new f.b(lifecycle);
        }
        androidx.lifecycle.r rVar = new androidx.lifecycle.r() { // from class: e.d
            @Override // androidx.lifecycle.r
            public final void l(t tVar, l.a aVar) {
                f fVar = registry;
                LinkedHashMap linkedHashMap2 = fVar.f8096e;
                l.a aVar2 = l.a.ON_START;
                String str = key;
                if (aVar2 != aVar) {
                    if (l.a.ON_STOP == aVar) {
                        linkedHashMap2.remove(str);
                        return;
                    } else {
                        if (l.a.ON_DESTROY == aVar) {
                            fVar.e(str);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = fVar.f8098g;
                LinkedHashMap linkedHashMap3 = fVar.f8097f;
                f.a aVar3 = contract;
                b bVar2 = callback;
                linkedHashMap2.put(str, new f.a(aVar3, bVar2));
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    bVar2.a(obj);
                }
                a aVar4 = (a) u3.c.a(bundle, str, a.class);
                if (aVar4 != null) {
                    bundle.remove(str);
                    bVar2.a(aVar3.c(aVar4.f8087b, aVar4.f8086a));
                }
            }
        };
        bVar.f8101a.a(rVar);
        bVar.f8102b.add(rVar);
        linkedHashMap.put(key, bVar);
        return new e.h(registry, key, contract);
    }

    @Override // y3.k
    public void removeMenuProvider(y3.o provider) {
        kotlin.jvm.internal.r.e(provider, "provider");
        this.menuHostHelper.a(provider);
    }

    @Override // p3.d
    public final void removeOnConfigurationChangedListener(x3.a<Configuration> listener) {
        kotlin.jvm.internal.r.e(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(d.b listener) {
        kotlin.jvm.internal.r.e(listener, "listener");
        d.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f7035a.remove(listener);
    }

    @Override // o3.o
    public final void removeOnMultiWindowModeChangedListener(x3.a<o3.f> listener) {
        kotlin.jvm.internal.r.e(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(x3.a<Intent> listener) {
        kotlin.jvm.internal.r.e(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // o3.p
    public final void removeOnPictureInPictureModeChangedListener(x3.a<o3.r> listener) {
        kotlin.jvm.internal.r.e(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // p3.e
    public final void removeOnTrimMemoryListener(x3.a<Integer> listener) {
        kotlin.jvm.internal.r.e(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.r.e(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (m6.a.b()) {
                Trace.beginSection(m6.a.c("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            v fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f3274a) {
                try {
                    fullyDrawnReporter.f3275b = true;
                    ArrayList arrayList = fullyDrawnReporter.f3276c;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((eh.a) obj).invoke();
                    }
                    fullyDrawnReporter.f3276c.clear();
                    pg.f0 f0Var = pg.f0.f21461a;
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.r.d(decorView, "window.decorView");
        eVar.E(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @pg.d
    public void startActivityForResult(Intent intent, int i10) {
        kotlin.jvm.internal.r.e(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @pg.d
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.r.e(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13);
    }

    @Override // android.app.Activity
    @pg.d
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        kotlin.jvm.internal.r.e(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @pg.d
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.r.e(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        kotlin.jvm.internal.r.e(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<x3.a<o3.f>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new o3.f(z10));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration newConfig) {
        kotlin.jvm.internal.r.e(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<x3.a<o3.r>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new o3.r(z10));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.r.d(decorView, "window.decorView");
        eVar.E(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(final y3.o provider, androidx.lifecycle.t owner) {
        kotlin.jvm.internal.r.e(provider, "provider");
        kotlin.jvm.internal.r.e(owner, "owner");
        final y3.n nVar = this.menuHostHelper;
        nVar.f33870b.add(provider);
        nVar.f33869a.run();
        androidx.lifecycle.l lifecycle = owner.getLifecycle();
        HashMap map = nVar.f33871c;
        n.a aVar = (n.a) map.remove(provider);
        if (aVar != null) {
            aVar.f33872a.c(aVar.f33873b);
            aVar.f33873b = null;
        }
        map.put(provider, new n.a(lifecycle, new androidx.lifecycle.r() { // from class: y3.m
            @Override // androidx.lifecycle.r
            public final void l(androidx.lifecycle.t tVar, l.a aVar2) {
                n nVar2 = nVar;
                nVar2.getClass();
                if (aVar2 == l.a.ON_DESTROY) {
                    nVar2.a(provider);
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.r.d(decorView, "window.decorView");
        eVar.E(decorView);
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(final y3.o provider, androidx.lifecycle.t owner, final l.b state) {
        kotlin.jvm.internal.r.e(provider, "provider");
        kotlin.jvm.internal.r.e(owner, "owner");
        kotlin.jvm.internal.r.e(state, "state");
        final y3.n nVar = this.menuHostHelper;
        nVar.getClass();
        androidx.lifecycle.l lifecycle = owner.getLifecycle();
        HashMap map = nVar.f33871c;
        n.a aVar = (n.a) map.remove(provider);
        if (aVar != null) {
            aVar.f33872a.c(aVar.f33873b);
            aVar.f33873b = null;
        }
        map.put(provider, new n.a(lifecycle, new androidx.lifecycle.r() { // from class: y3.l
            @Override // androidx.lifecycle.r
            public final void l(androidx.lifecycle.t tVar, l.a aVar2) {
                n nVar2 = nVar;
                nVar2.getClass();
                b.e eVar = nVar2.f33869a;
                CopyOnWriteArrayList<o> copyOnWriteArrayList = nVar2.f33870b;
                l.a.Companion.getClass();
                l.b bVar = state;
                l.a aVarB = l.a.C0033a.b(bVar);
                o oVar = provider;
                if (aVar2 == aVarB) {
                    copyOnWriteArrayList.add(oVar);
                    eVar.run();
                } else if (aVar2 == l.a.ON_DESTROY) {
                    nVar2.a(oVar);
                } else if (aVar2 == l.a.C0033a.a(bVar)) {
                    copyOnWriteArrayList.remove(oVar);
                    eVar.run();
                }
            }
        }));
    }

    public final <I, O> e.c<I> registerForActivityResult(f.a<I, O> contract, e.b<O> callback) {
        kotlin.jvm.internal.r.e(contract, "contract");
        kotlin.jvm.internal.r.e(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    public k(int i10) {
        this();
        this.contentLayoutId = i10;
    }
}
