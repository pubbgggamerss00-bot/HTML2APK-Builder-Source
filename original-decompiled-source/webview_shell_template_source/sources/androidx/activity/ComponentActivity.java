package androidx.activity;

import android.annotation.SuppressLint;
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
import androidx.activity.ComponentActivity;
import androidx.lifecycle.h;
import androidx.lifecycle.h0;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import androidx.savedstate.a;
import com.htmltoapk.template.R;
import d.e;
import e.a;
import i0.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import u0.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements androidx.lifecycle.k0, androidx.lifecycle.f, y1.c, p0, d.i, k0.b, k0.c, i0.r, i0.s, u0.g {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final b Companion = new b();
    private androidx.lifecycle.j0 _viewModelStore;
    private final d.e activityResultRegistry;
    private int contentLayoutId;
    private final c.a contextAwareHelper;
    private final d5.b defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final d5.b fullyDrawnReporter$delegate;
    private final u0.j menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final d5.b onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<t0.a<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<t0.a<i0.h>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<t0.a<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<t0.a<i0.u>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<t0.a<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final d reportFullyDrawnExecutor;
    private final y1.b savedStateRegistryController;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
        public static OnBackInvokedDispatcher a(ComponentActivity componentActivity) {
            kotlin.jvm.internal.j.e("activity", componentActivity);
            OnBackInvokedDispatcher onBackInvokedDispatcher = componentActivity.getOnBackInvokedDispatcher();
            kotlin.jvm.internal.j.d("activity.getOnBackInvokedDispatcher()", onBackInvokedDispatcher);
            return onBackInvokedDispatcher;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public Object f37a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.lifecycle.j0 f38b;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface d extends Executor {
        void c();

        void l(View view);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class e implements d, ViewTreeObserver.OnDrawListener, Runnable {
        public final long s = SystemClock.uptimeMillis() + 10000;

        /* renamed from: t, reason: collision with root package name */
        public Runnable f39t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f40u;

        public e() {
        }

        @Override // androidx.activity.ComponentActivity.d
        public final void c() {
            ComponentActivity componentActivity = ComponentActivity.this;
            componentActivity.getWindow().getDecorView().removeCallbacks(this);
            componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            kotlin.jvm.internal.j.e("runnable", runnable);
            this.f39t = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            kotlin.jvm.internal.j.d("window.decorView", decorView);
            if (!this.f40u) {
                decorView.postOnAnimation(new j(0, this));
            } else if (kotlin.jvm.internal.j.a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.ComponentActivity.d
        public final void l(View view) {
            if (this.f40u) {
                return;
            }
            this.f40u = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z6;
            Runnable runnable = this.f39t;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.s) {
                    this.f40u = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f39t = null;
            e0 fullyDrawnReporter = ComponentActivity.this.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f60b) {
                z6 = fullyDrawnReporter.f61c;
            }
            if (z6) {
                this.f40u = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class f extends d.e {
        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // d.e
        public final void b(final int i6, e.a aVar, Object obj) {
            Bundle bundleExtra;
            int i7;
            ComponentActivity componentActivity = ComponentActivity.this;
            final a.C0049a c0049aB = aVar.b(componentActivity, obj);
            if (c0049aB != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        Serializable serializable = c0049aB.f12747a;
                        ComponentActivity.f fVar = this.s;
                        String str = (String) fVar.f12636a.get(Integer.valueOf(i6));
                        if (str == null) {
                            return;
                        }
                        e.a aVar2 = (e.a) fVar.f12640e.get(str);
                        if ((aVar2 != null ? aVar2.f12643a : null) == null) {
                            fVar.f12642g.remove(str);
                            fVar.f12641f.put(str, serializable);
                        } else {
                            d.b<O> bVar = aVar2.f12643a;
                            if (fVar.f12639d.remove(str)) {
                                bVar.b(serializable);
                            }
                        }
                    }
                });
                return;
            }
            Intent intentA = aVar.a(componentActivity, obj);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                kotlin.jvm.internal.j.b(extras);
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(componentActivity.getClassLoader());
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
                for (int i8 = 0; i8 < stringArrayExtra.length; i8++) {
                    if (TextUtils.isEmpty(stringArrayExtra[i8])) {
                        throw new IllegalArgumentException(m.e(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    }
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i8], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i8));
                    }
                }
                int size = hashSet.size();
                String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
                if (size > 0) {
                    if (size == stringArrayExtra.length) {
                        return;
                    }
                    int i9 = 0;
                    for (int i10 = 0; i10 < stringArrayExtra.length; i10++) {
                        if (!hashSet.contains(Integer.valueOf(i10))) {
                            strArr[i9] = stringArrayExtra[i10];
                            i9++;
                        }
                    }
                }
                if (componentActivity instanceof a.InterfaceC0066a) {
                }
                componentActivity.requestPermissions(stringArrayExtra, i6);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                componentActivity.startActivityForResult(intentA, i6, bundle);
                return;
            }
            d.j jVar = (d.j) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                kotlin.jvm.internal.j.b(jVar);
                i7 = i6;
                try {
                    componentActivity.startIntentSenderForResult(jVar.s, i7, jVar.f12653t, jVar.f12654u, jVar.f12655v, 0, bundle);
                } catch (IntentSender.SendIntentException e6) {
                    e = e6;
                    new Handler(Looper.getMainLooper()).post(new l(i7, 0, this, e));
                }
            } catch (IntentSender.SendIntentException e7) {
                e = e7;
                i7 = i6;
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class g extends kotlin.jvm.internal.k implements p5.a<androidx.lifecycle.c0> {
        public g() {
            super(0);
        }

        @Override // p5.a
        public final androidx.lifecycle.c0 a() {
            ComponentActivity componentActivity = ComponentActivity.this;
            return new androidx.lifecycle.c0(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class h extends kotlin.jvm.internal.k implements p5.a<e0> {
        public h() {
            super(0);
        }

        @Override // p5.a
        public final e0 a() {
            ComponentActivity componentActivity = ComponentActivity.this;
            return new e0(componentActivity.reportFullyDrawnExecutor, new n(componentActivity));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class i extends kotlin.jvm.internal.k implements p5.a<OnBackPressedDispatcher> {
        public i() {
            super(0);
        }

        @Override // p5.a
        public final OnBackPressedDispatcher a() {
            ComponentActivity componentActivity = ComponentActivity.this;
            OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new o(0, componentActivity));
            if (Build.VERSION.SDK_INT >= 33) {
                if (!kotlin.jvm.internal.j.a(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new p(0, componentActivity, onBackPressedDispatcher));
                    return onBackPressedDispatcher;
                }
                componentActivity.addObserverForBackInvoker(onBackPressedDispatcher);
            }
            return onBackPressedDispatcher;
        }
    }

    public ComponentActivity() {
        this.contextAwareHelper = new c.a();
        this.menuHostHelper = new u0.j(new androidx.activity.d(0, this));
        y1.b bVar = new y1.b(this);
        this.savedStateRegistryController = bVar;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = c0.g(new h());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new androidx.lifecycle.k() { // from class: androidx.activity.e
            @Override // androidx.lifecycle.k
            public final void a(androidx.lifecycle.m mVar, h.a aVar) {
                ComponentActivity._init_$lambda$2(this.s, mVar, aVar);
            }
        });
        getLifecycle().a(new androidx.lifecycle.k() { // from class: androidx.activity.f
            @Override // androidx.lifecycle.k
            public final void a(androidx.lifecycle.m mVar, h.a aVar) {
                ComponentActivity._init_$lambda$3(this.s, mVar, aVar);
            }
        });
        getLifecycle().a(new androidx.lifecycle.k() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.k
            public final void a(androidx.lifecycle.m mVar, h.a aVar) {
                ComponentActivity componentActivity = ComponentActivity.this;
                componentActivity.ensureViewModelStore();
                componentActivity.getLifecycle().c(this);
            }
        });
        bVar.a();
        androidx.lifecycle.z.b(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new a.b() { // from class: androidx.activity.g
            @Override // androidx.savedstate.a.b
            public final Bundle a() {
                return ComponentActivity._init_$lambda$4(this.f66a);
            }
        });
        addOnContextAvailableListener(new c.b() { // from class: androidx.activity.h
            @Override // c.b
            public final void a(ComponentActivity componentActivity) {
                ComponentActivity._init_$lambda$5(this.f67a, componentActivity);
            }
        });
        this.defaultViewModelProviderFactory$delegate = c0.g(new g());
        this.onBackPressedDispatcher$delegate = c0.g(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, androidx.lifecycle.m mVar, h.a aVar) {
        Window window;
        View viewPeekDecorView;
        kotlin.jvm.internal.j.e("<anonymous parameter 0>", mVar);
        kotlin.jvm.internal.j.e("event", aVar);
        if (aVar != h.a.ON_STOP || (window = componentActivity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ComponentActivity componentActivity, androidx.lifecycle.m mVar, h.a aVar) {
        kotlin.jvm.internal.j.e("<anonymous parameter 0>", mVar);
        kotlin.jvm.internal.j.e("event", aVar);
        if (aVar == h.a.ON_DESTROY) {
            componentActivity.contextAwareHelper.f2058b = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            componentActivity.reportFullyDrawnExecutor.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        d.e eVar = componentActivity.activityResultRegistry;
        eVar.getClass();
        LinkedHashMap linkedHashMap = eVar.f12637b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(eVar.f12639d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(eVar.f12642g));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ComponentActivity componentActivity, Context context) {
        kotlin.jvm.internal.j.e("it", context);
        Bundle bundleA = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            d.e eVar = componentActivity.activityResultRegistry;
            LinkedHashMap linkedHashMap = eVar.f12637b;
            LinkedHashMap linkedHashMap2 = eVar.f12636a;
            Bundle bundle = eVar.f12642g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                eVar.f12639d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                String str = stringArrayList.get(i6);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (bundle.containsKey(str)) {
                        continue;
                    } else {
                        if ((linkedHashMap2 instanceof q5.a) && !(linkedHashMap2 instanceof q5.b)) {
                            kotlin.jvm.internal.s.a(linkedHashMap2, "kotlin.collections.MutableMap");
                            throw null;
                        }
                        linkedHashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i6);
                kotlin.jvm.internal.j.d("rcs[i]", num2);
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i6);
                kotlin.jvm.internal.j.d("keys[i]", str2);
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                eVar.f12637b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final OnBackPressedDispatcher onBackPressedDispatcher) {
        getLifecycle().a(new androidx.lifecycle.k(this) { // from class: androidx.activity.i

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ ComponentActivity f68t;

            {
                this.f68t = this;
            }

            @Override // androidx.lifecycle.k
            public final void a(androidx.lifecycle.m mVar, h.a aVar) {
                ComponentActivity.addObserverForBackInvoker$lambda$7(onBackPressedDispatcher, this.f68t, mVar, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, androidx.lifecycle.m mVar, h.a aVar) {
        kotlin.jvm.internal.j.e("<anonymous parameter 0>", mVar);
        kotlin.jvm.internal.j.e("event", aVar);
        if (aVar == h.a.ON_CREATE) {
            onBackPressedDispatcher.f47e = a.a(componentActivity);
            onBackPressedDispatcher.d(onBackPressedDispatcher.f49g);
        }
    }

    private final d createFullyDrawnExecutor() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this._viewModelStore = cVar.f38b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new androidx.lifecycle.j0();
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d("window.decorView", decorView);
        dVar.l(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // u0.g
    public void addMenuProvider(u0.l lVar) {
        kotlin.jvm.internal.j.e("provider", lVar);
        u0.j jVar = this.menuHostHelper;
        jVar.f14503b.add(lVar);
        jVar.f14502a.run();
    }

    @Override // k0.b
    public final void addOnConfigurationChangedListener(t0.a<Configuration> aVar) {
        kotlin.jvm.internal.j.e("listener", aVar);
        this.onConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(c.b bVar) {
        kotlin.jvm.internal.j.e("listener", bVar);
        c.a aVar = this.contextAwareHelper;
        aVar.getClass();
        ComponentActivity componentActivity = aVar.f2058b;
        if (componentActivity != null) {
            bVar.a(componentActivity);
        }
        aVar.f2057a.add(bVar);
    }

    @Override // i0.r
    public final void addOnMultiWindowModeChangedListener(t0.a<i0.h> aVar) {
        kotlin.jvm.internal.j.e("listener", aVar);
        this.onMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(t0.a<Intent> aVar) {
        kotlin.jvm.internal.j.e("listener", aVar);
        this.onNewIntentListeners.add(aVar);
    }

    @Override // i0.s
    public final void addOnPictureInPictureModeChangedListener(t0.a<i0.u> aVar) {
        kotlin.jvm.internal.j.e("listener", aVar);
        this.onPictureInPictureModeChangedListeners.add(aVar);
    }

    @Override // k0.c
    public final void addOnTrimMemoryListener(t0.a<Integer> aVar) {
        kotlin.jvm.internal.j.e("listener", aVar);
        this.onTrimMemoryListeners.add(aVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        kotlin.jvm.internal.j.e("listener", runnable);
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // d.i
    public final d.e getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.f
    public k1.a getDefaultViewModelCreationExtras() {
        k1.c cVar = new k1.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f13533a;
        if (application != null) {
            Application application2 = getApplication();
            kotlin.jvm.internal.j.d("application", application2);
            linkedHashMap.put(androidx.lifecycle.g0.f1299a, application2);
        }
        linkedHashMap.put(androidx.lifecycle.z.f1345a, this);
        linkedHashMap.put(androidx.lifecycle.z.f1346b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(androidx.lifecycle.z.f1347c, extras);
        }
        return cVar;
    }

    public h0.b getDefaultViewModelProviderFactory() {
        return (h0.b) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public e0 getFullyDrawnReporter() {
        return (e0) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.f37a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.m
    public androidx.lifecycle.h getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.activity.p0
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // y1.c
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.savedStateRegistryController.f15219b;
    }

    @Override // androidx.lifecycle.k0
    public androidx.lifecycle.j0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        androidx.lifecycle.j0 j0Var = this._viewModelStore;
        kotlin.jvm.internal.j.b(j0Var);
        return j0Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d("window.decorView", decorView);
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d("window.decorView", decorView2);
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d("window.decorView", decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d("window.decorView", decorView4);
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d("window.decorView", decorView5);
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i6, int i7, Intent intent) {
        if (this.activityResultRegistry.a(i6, i7, intent)) {
            return;
        }
        super.onActivityResult(i6, i7, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        kotlin.jvm.internal.j.e("newConfig", configuration);
        super.onConfigurationChanged(configuration);
        Iterator<t0.a<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        c.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f2058b = this;
        Iterator it = aVar.f2057a.iterator();
        while (it.hasNext()) {
            ((c.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i6 = androidx.lifecycle.w.f1337t;
        w.a.b(this);
        int i7 = this.contentLayoutId;
        if (i7 != 0) {
            setContentView(i7);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i6, Menu menu) {
        kotlin.jvm.internal.j.e("menu", menu);
        if (i6 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i6, menu);
        u0.j jVar = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<u0.l> it = jVar.f14503b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        kotlin.jvm.internal.j.e("item", menuItem);
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        if (i6 == 0) {
            Iterator<u0.l> it = this.menuHostHelper.f14503b.iterator();
            while (it.hasNext()) {
                if (it.next().a(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z6) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<t0.a<i0.h>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new i0.h(z6));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.j.e("intent", intent);
        super.onNewIntent(intent);
        Iterator<t0.a<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i6, Menu menu) {
        kotlin.jvm.internal.j.e("menu", menu);
        Iterator<u0.l> it = this.menuHostHelper.f14503b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(i6, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z6) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<t0.a<i0.u>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new i0.u(z6));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i6, View view, Menu menu) {
        kotlin.jvm.internal.j.e("menu", menu);
        if (i6 != 0) {
            return true;
        }
        super.onPreparePanel(i6, view, menu);
        Iterator<u0.l> it = this.menuHostHelper.f14503b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        kotlin.jvm.internal.j.e("permissions", strArr);
        kotlin.jvm.internal.j.e("grantResults", iArr);
        if (this.activityResultRegistry.a(i6, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i6, strArr, iArr);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        androidx.lifecycle.j0 j0Var = this._viewModelStore;
        if (j0Var == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            j0Var = cVar.f38b;
        }
        if (j0Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.f37a = objOnRetainCustomNonConfigurationInstance;
        cVar2.f38b = j0Var;
        return cVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.j.e("outState", bundle);
        if (getLifecycle() instanceof androidx.lifecycle.n) {
            androidx.lifecycle.h lifecycle = getLifecycle();
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry", lifecycle);
            ((androidx.lifecycle.n) lifecycle).h();
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i6) {
        super.onTrimMemory(i6);
        Iterator<t0.a<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i6));
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
        return this.contextAwareHelper.f2058b;
    }

    public final <I, O> d.c<I> registerForActivityResult(final e.a<I, O> aVar, final d.e eVar, final d.b<O> bVar) {
        kotlin.jvm.internal.j.e("contract", aVar);
        kotlin.jvm.internal.j.e("registry", eVar);
        kotlin.jvm.internal.j.e("callback", bVar);
        final String str = "activity_rq#" + this.nextLocalRequestCode.getAndIncrement();
        LinkedHashMap linkedHashMap = eVar.f12638c;
        kotlin.jvm.internal.j.e("key", str);
        androidx.lifecycle.h lifecycle = getLifecycle();
        if (lifecycle.b().compareTo(h.b.f1303v) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        eVar.d(str);
        e.b bVar2 = (e.b) linkedHashMap.get(str);
        if (bVar2 == null) {
            bVar2 = new e.b(lifecycle);
        }
        androidx.lifecycle.k kVar = new androidx.lifecycle.k() { // from class: d.d
            @Override // androidx.lifecycle.k
            public final void a(m mVar, h.a aVar2) {
                e eVar2 = eVar;
                LinkedHashMap linkedHashMap2 = eVar2.f12640e;
                h.a aVar3 = h.a.ON_START;
                String str2 = str;
                if (aVar3 != aVar2) {
                    if (h.a.ON_STOP == aVar2) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (h.a.ON_DESTROY == aVar2) {
                            eVar2.e(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = eVar2.f12642g;
                LinkedHashMap linkedHashMap3 = eVar2.f12641f;
                e.a aVar4 = aVar;
                b bVar3 = bVar;
                linkedHashMap2.put(str2, new e.a(aVar4, bVar3));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    bVar3.b(obj);
                }
                a aVar5 = (a) q0.b.a(str2, bundle);
                if (aVar5 != null) {
                    bundle.remove(str2);
                    bVar3.b(aVar4.c(aVar5.f12632t, aVar5.s));
                }
            }
        };
        bVar2.f12645a.a(kVar);
        bVar2.f12646b.add(kVar);
        linkedHashMap.put(str, bVar2);
        return new d.g(eVar, str, aVar);
    }

    @Override // u0.g
    public void removeMenuProvider(u0.l lVar) {
        kotlin.jvm.internal.j.e("provider", lVar);
        this.menuHostHelper.a(lVar);
    }

    @Override // k0.b
    public final void removeOnConfigurationChangedListener(t0.a<Configuration> aVar) {
        kotlin.jvm.internal.j.e("listener", aVar);
        this.onConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(c.b bVar) {
        kotlin.jvm.internal.j.e("listener", bVar);
        c.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f2057a.remove(bVar);
    }

    @Override // i0.r
    public final void removeOnMultiWindowModeChangedListener(t0.a<i0.h> aVar) {
        kotlin.jvm.internal.j.e("listener", aVar);
        this.onMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(t0.a<Intent> aVar) {
        kotlin.jvm.internal.j.e("listener", aVar);
        this.onNewIntentListeners.remove(aVar);
    }

    @Override // i0.s
    public final void removeOnPictureInPictureModeChangedListener(t0.a<i0.u> aVar) {
        kotlin.jvm.internal.j.e("listener", aVar);
        this.onPictureInPictureModeChangedListeners.remove(aVar);
    }

    @Override // k0.c
    public final void removeOnTrimMemoryListener(t0.a<Integer> aVar) {
        kotlin.jvm.internal.j.e("listener", aVar);
        this.onTrimMemoryListeners.remove(aVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        kotlin.jvm.internal.j.e("listener", runnable);
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (d2.a.b()) {
                Trace.beginSection(d2.a.d("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            e0 fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f60b) {
                try {
                    fullyDrawnReporter.f61c = true;
                    ArrayList arrayList = fullyDrawnReporter.f62d;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        ((p5.a) obj).a();
                    }
                    fullyDrawnReporter.f62d.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i6) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d("window.decorView", decorView);
        dVar.l(decorView);
        super.setContentView(i6);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i6) {
        kotlin.jvm.internal.j.e("intent", intent);
        super.startActivityForResult(intent, i6);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i6, Intent intent, int i7, int i8, int i9) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.j.e("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i6, intent, i7, i8, i9);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i6, Bundle bundle) {
        kotlin.jvm.internal.j.e("intent", intent);
        super.startActivityForResult(intent, i6, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i6, Intent intent, int i7, int i8, int i9, Bundle bundle) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.j.e("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i6, intent, i7, i8, i9, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z6, Configuration configuration) {
        kotlin.jvm.internal.j.e("newConfig", configuration);
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z6, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<t0.a<i0.h>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new i0.h(z6));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z6, Configuration configuration) {
        kotlin.jvm.internal.j.e("newConfig", configuration);
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z6, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<t0.a<i0.u>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new i0.u(z6));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d("window.decorView", decorView);
        dVar.l(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(final u0.l lVar, androidx.lifecycle.m mVar) {
        kotlin.jvm.internal.j.e("provider", lVar);
        kotlin.jvm.internal.j.e("owner", mVar);
        final u0.j jVar = this.menuHostHelper;
        jVar.f14503b.add(lVar);
        jVar.f14502a.run();
        androidx.lifecycle.h lifecycle = mVar.getLifecycle();
        HashMap map = jVar.f14504c;
        j.a aVar = (j.a) map.remove(lVar);
        if (aVar != null) {
            aVar.f14505a.c(aVar.f14506b);
            aVar.f14506b = null;
        }
        map.put(lVar, new j.a(lifecycle, new androidx.lifecycle.k() { // from class: u0.i
            @Override // androidx.lifecycle.k
            public final void a(androidx.lifecycle.m mVar2, h.a aVar2) {
                h.a aVar3 = h.a.ON_DESTROY;
                j jVar2 = jVar;
                if (aVar2 == aVar3) {
                    jVar2.a(lVar);
                } else {
                    jVar2.getClass();
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d("window.decorView", decorView);
        dVar.l(decorView);
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final u0.l lVar, androidx.lifecycle.m mVar, final h.b bVar) {
        kotlin.jvm.internal.j.e("provider", lVar);
        kotlin.jvm.internal.j.e("owner", mVar);
        kotlin.jvm.internal.j.e("state", bVar);
        final u0.j jVar = this.menuHostHelper;
        jVar.getClass();
        androidx.lifecycle.h lifecycle = mVar.getLifecycle();
        HashMap map = jVar.f14504c;
        j.a aVar = (j.a) map.remove(lVar);
        if (aVar != null) {
            aVar.f14505a.c(aVar.f14506b);
            aVar.f14506b = null;
        }
        map.put(lVar, new j.a(lifecycle, new androidx.lifecycle.k() { // from class: u0.h
            @Override // androidx.lifecycle.k
            public final void a(androidx.lifecycle.m mVar2, h.a aVar2) {
                j jVar2 = jVar;
                jVar2.getClass();
                Runnable runnable = jVar2.f14502a;
                CopyOnWriteArrayList<l> copyOnWriteArrayList = jVar2.f14503b;
                h.a.Companion.getClass();
                h.b bVar2 = bVar;
                int iOrdinal = bVar2.ordinal();
                h.a aVar3 = null;
                h.a aVar4 = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : h.a.ON_RESUME : h.a.ON_START : h.a.ON_CREATE;
                l lVar2 = lVar;
                if (aVar2 == aVar4) {
                    copyOnWriteArrayList.add(lVar2);
                    runnable.run();
                    return;
                }
                h.a aVar5 = h.a.ON_DESTROY;
                if (aVar2 == aVar5) {
                    jVar2.a(lVar2);
                    return;
                }
                int iOrdinal2 = bVar2.ordinal();
                if (iOrdinal2 == 2) {
                    aVar3 = aVar5;
                } else if (iOrdinal2 == 3) {
                    aVar3 = h.a.ON_STOP;
                } else if (iOrdinal2 == 4) {
                    aVar3 = h.a.ON_PAUSE;
                }
                if (aVar2 == aVar3) {
                    copyOnWriteArrayList.remove(lVar2);
                    runnable.run();
                }
            }
        }));
    }

    public final <I, O> d.c<I> registerForActivityResult(e.a<I, O> aVar, d.b<O> bVar) {
        kotlin.jvm.internal.j.e("contract", aVar);
        kotlin.jvm.internal.j.e("callback", bVar);
        return registerForActivityResult(aVar, this.activityResultRegistry, bVar);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    public ComponentActivity(int i6) {
        this();
        this.contentLayoutId = i6;
    }
}
