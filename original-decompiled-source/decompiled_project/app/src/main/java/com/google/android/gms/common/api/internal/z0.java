package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.j;
import java.util.Set;

/* loaded from: classes2.dex */
public final class z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kb.k f6074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f6075b;

    public z0(a1 a1Var, kb.k kVar) {
        this.f6075b = a1Var;
        this.f6074a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.internal.j j1Var;
        kb.k kVar = this.f6074a;
        pa.a aVar = kVar.f16257b;
        int i10 = aVar.f21377b;
        a1 a1Var = this.f6075b;
        if (i10 == 0) {
            com.google.android.gms.common.internal.j0 j0Var = kVar.f16258c;
            com.google.android.gms.common.internal.p.f(j0Var);
            pa.a aVar2 = j0Var.f6159c;
            if (aVar2.f21377b != 0) {
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar2)), new Exception());
                a1Var.f5937i.b(aVar2);
                a1Var.f5936f.disconnect();
                return;
            }
            m0 m0Var = a1Var.f5937i;
            IBinder iBinder = j0Var.f6158b;
            if (iBinder == null) {
                j1Var = null;
            } else {
                int i11 = j.a.f6156a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                j1Var = iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.j ? (com.google.android.gms.common.internal.j) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.j1(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            Set<Scope> set = a1Var.f5934d;
            m0Var.getClass();
            if (j1Var == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                m0Var.b(new pa.a(4));
            } else {
                m0Var.f6018c = j1Var;
                m0Var.f6019d = set;
                if (m0Var.f6020e) {
                    m0Var.f6016a.getRemoteService(j1Var, set);
                }
            }
        } else {
            a1Var.f5937i.b(aVar);
        }
        a1Var.f5936f.disconnect();
    }
}
