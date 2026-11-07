package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class j {
    protected final k mLifecycleFragment;

    public j(k kVar) {
        this.mLifecycleFragment = kVar;
    }

    public static k getFragment(Activity activity) {
        return getFragment(new i(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity activityC = this.mLifecycleFragment.c();
        com.google.android.gms.common.internal.p.f(activityC);
        return activityC;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static k getFragment(i iVar) {
        s1 s1Var;
        v1 v1Var;
        Activity activity = iVar.f5987a;
        if (!(activity instanceof c5.n)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = s1.f6044b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (s1Var = (s1) weakReference.get()) != null) {
                return s1Var;
            }
            try {
                s1 s1Var2 = (s1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (s1Var2 == null || s1Var2.isRemoving()) {
                    s1Var2 = new s1();
                    activity.getFragmentManager().beginTransaction().add(s1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(s1Var2));
                return s1Var2;
            } catch (ClassCastException e10) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
            }
        }
        c5.n nVar = (c5.n) activity;
        c5.r rVar = nVar.f4962a;
        WeakHashMap weakHashMap2 = v1.X;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(nVar);
        if (weakReference2 != null && (v1Var = (v1) weakReference2.get()) != null) {
            return v1Var;
        }
        try {
            v1 v1Var2 = (v1) rVar.f4977a.f4982d.B("SLifecycleFragmentImpl");
            if (v1Var2 == null || v1Var2.f4883m) {
                v1Var2 = new v1();
                c5.c0 c0Var = rVar.f4977a.f4982d;
                c0Var.getClass();
                c5.a aVar = new c5.a(c0Var);
                aVar.e(0, v1Var2, "SLifecycleFragmentImpl");
                aVar.d(true);
            }
            weakHashMap2.put(nVar, new WeakReference(v1Var2));
            return v1Var2;
        } catch (ClassCastException e11) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e11);
        }
    }

    public static k getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
