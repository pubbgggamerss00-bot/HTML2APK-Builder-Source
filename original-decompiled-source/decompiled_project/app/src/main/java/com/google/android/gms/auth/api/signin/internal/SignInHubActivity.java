package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.lifecycle.a1;
import androidx.lifecycle.b0;
import c5.n;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import j5.a;
import j5.f;
import java.lang.reflect.Modifier;
import java.util.Set;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.r;
import m5.a;
import p.c1;

/* loaded from: classes2.dex */
public class SignInHubActivity extends n {

    /* renamed from: l, reason: collision with root package name */
    public static boolean f5895l = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5896f = false;

    /* renamed from: g, reason: collision with root package name */
    public SignInConfiguration f5897g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5898h;

    /* renamed from: j, reason: collision with root package name */
    public int f5899j;

    /* renamed from: k, reason: collision with root package name */
    public Intent f5900k;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void h() {
        a1 store = getViewModelStore();
        a.c.C0175a c0175a = a.c.f17665d;
        r.e(store, "store");
        a.C0143a defaultCreationExtras = a.C0143a.f15159b;
        r.e(defaultCreationExtras, "defaultCreationExtras");
        f fVar = new f(store, c0175a, defaultCreationExtras);
        h hVarA = h0.a(a.c.class);
        String strA = hVarA.a();
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        a.c cVar = (a.c) fVar.a(hVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strA));
        cc.f fVar2 = new cc.f(this);
        boolean z10 = cVar.f17667c;
        c1<a.C0174a> c1Var = cVar.f17666b;
        if (z10) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a.C0174a c0174aC = c1Var.c(0);
        if (c0174aC == null) {
            try {
                cVar.f17667c = true;
                Set set = com.google.android.gms.common.api.h.f5927a;
                synchronized (set) {
                }
                ka.f fVar3 = new ka.f(this, set);
                if (ka.f.class.isMemberClass() && !Modifier.isStatic(ka.f.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + fVar3);
                }
                a.C0174a c0174a = new a.C0174a(fVar3);
                c1Var.e(0, c0174a);
                cVar.f17667c = false;
                a.b<D> bVar = new a.b<>(c0174a.f17660l, fVar2);
                c0174a.d(this, bVar);
                b0 b0Var = c0174a.f17662n;
                if (b0Var != null) {
                    c0174a.g(b0Var);
                }
                c0174a.f17661m = this;
                c0174a.f17662n = bVar;
            } catch (Throwable th2) {
                cVar.f17667c = false;
                throw th2;
            }
        } else {
            a.b<D> bVar2 = new a.b<>(c0174aC.f17660l, fVar2);
            c0174aC.d(this, bVar2);
            b0 b0Var2 = c0174aC.f17662n;
            if (b0Var2 != null) {
                c0174aC.g(b0Var2);
            }
            c0174aC.f17661m = this;
            c0174aC.f17662n = bVar2;
        }
        f5895l = false;
    }

    public final void i(int i10) {
        Status status = new Status(i10, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f5895l = false;
    }

    @Override // c5.n, b.k, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f5896f) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f5891b) != null) {
                ka.n nVarA = ka.n.a(this);
                GoogleSignInOptions googleSignInOptions = this.f5897g.f5894b;
                synchronized (nVarA) {
                    synchronized (nVarA) {
                        nVarA.f16242a.c(googleSignInAccount, googleSignInOptions);
                    }
                    intent.removeExtra("signInAccount");
                    intent.putExtra("googleSignInAccount", googleSignInAccount);
                    this.f5898h = true;
                    this.f5899j = i11;
                    this.f5900k = intent;
                    h();
                    return;
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f5898h = true;
                this.f5899j = i11;
                this.f5900k = intent;
                h();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                i(intExtra);
                return;
            }
        }
        i(8);
    }

    @Override // c5.n, b.k, o3.d, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            i(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            i(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f5897g = signInConfiguration;
        if (bundle != null) {
            boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
            this.f5898h = z10;
            if (z10) {
                this.f5899j = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.f5900k = intent2;
                    h();
                    return;
                } else {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (f5895l) {
            setResult(0);
            i(12502);
            return;
        }
        f5895l = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f5897g);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f5896f = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            i(17);
        }
    }

    @Override // c5.n, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f5895l = false;
    }

    @Override // b.k, o3.d, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f5898h);
        if (this.f5898h) {
            bundle.putInt("signInResultCode", this.f5899j);
            bundle.putParcelable("signInResultData", this.f5900k);
        }
    }
}
