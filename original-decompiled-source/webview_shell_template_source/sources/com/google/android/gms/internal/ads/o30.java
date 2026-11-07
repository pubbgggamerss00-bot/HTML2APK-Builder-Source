package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class o30 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7583t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f7584u;

    public /* synthetic */ o30(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f7583t = obj;
        this.f7584u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        DataOutputStream dataOutputStream;
        boolean zBooleanValue;
        switch (this.s) {
            case 0:
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = (ParcelFileDescriptor.AutoCloseOutputStream) this.f7583t;
                byte[] bArr = (byte[]) this.f7584u;
                DataOutputStream dataOutputStream2 = null;
                DataOutputStream dataOutputStream3 = null;
                try {
                    try {
                        dataOutputStream = new DataOutputStream(autoCloseOutputStream);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e6) {
                    e = e6;
                }
                try {
                    int length = bArr.length;
                    dataOutputStream.writeInt(length);
                    dataOutputStream.write(bArr);
                    i3.f.a(dataOutputStream);
                    dataOutputStream2 = length;
                } catch (IOException e7) {
                    e = e7;
                    dataOutputStream3 = dataOutputStream;
                    zzo.zzh("Error transporting the ad response", e);
                    zzv.zzp().h("LargeParcelTeleporter.pipeData.1", e);
                    if (dataOutputStream3 == null) {
                        i3.f.a(autoCloseOutputStream);
                        dataOutputStream2 = dataOutputStream3;
                    } else {
                        i3.f.a(dataOutputStream3);
                        dataOutputStream2 = dataOutputStream3;
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream2 = dataOutputStream;
                    if (dataOutputStream2 == null) {
                        i3.f.a(autoCloseOutputStream);
                    } else {
                        i3.f.a(dataOutputStream2);
                    }
                    throw th;
                }
                return;
            case 1:
                sg0 sg0Var = (sg0) this.f7583t;
                sg0Var.s.l0("AFMA_updateActiveView", (JSONObject) this.f7584u);
                return;
            case 2:
                fv0 fv0Var = (fv0) this.f7583t;
                try {
                    ((xv) this.f7584u).r1(fv0Var.a());
                    return;
                } catch (RemoteException e8) {
                    zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e8);
                    return;
                }
            case 3:
                ((jb1) this.f7583t).f6016w.f7070d.k0((zze) this.f7584u);
                return;
            case 4:
                hl1 hl1Var = (hl1) this.f7583t;
                Runnable runnable = (Runnable) this.f7584u;
                if (hl1Var.f5445j != null || hl1Var.f5442f) {
                    if (!hl1Var.f5442f) {
                        runnable.run();
                        return;
                    }
                    hl1Var.f5439c.c("Waiting to bind to the service.", new Object[0]);
                    synchronized (hl1Var.f5441e) {
                        hl1Var.f5441e.add(runnable);
                    }
                    return;
                }
                hl1Var.f5439c.c("Initiate binding to the service.", new Object[0]);
                synchronized (hl1Var.f5441e) {
                    hl1Var.f5441e.add(runnable);
                }
                gl1 gl1Var = new gl1(hl1Var);
                hl1Var.f5444i = gl1Var;
                hl1Var.f5442f = true;
                if (hl1Var.f5438b.bindService(hl1Var.f5443g, gl1Var, 1)) {
                    return;
                }
                hl1Var.f5439c.c("Failed to bind to the service.", new Object[0]);
                hl1Var.f5442f = false;
                synchronized (hl1Var.f5441e) {
                    hl1Var.f5441e.clear();
                }
                return;
            case 5:
                com.google.android.gms.internal.consent_sdk.u uVar = (com.google.android.gms.internal.consent_sdk.u) this.f7583t;
                String str = (String) this.f7584u;
                synchronized (com.google.android.gms.internal.consent_sdk.o0.class) {
                    if (com.google.android.gms.internal.consent_sdk.o0.f11858a == null) {
                        try {
                            uVar.evaluateJavascript("(function(){})()", null);
                            com.google.android.gms.internal.consent_sdk.o0.f11858a = Boolean.TRUE;
                        } catch (IllegalStateException unused) {
                            com.google.android.gms.internal.consent_sdk.o0.f11858a = Boolean.FALSE;
                        }
                        zBooleanValue = com.google.android.gms.internal.consent_sdk.o0.f11858a.booleanValue();
                    } else {
                        zBooleanValue = com.google.android.gms.internal.consent_sdk.o0.f11858a.booleanValue();
                    }
                }
                if (zBooleanValue) {
                    uVar.evaluateJavascript(str, null);
                    return;
                } else {
                    uVar.loadUrl("javascript:".concat(str));
                    return;
                }
            case 6:
                v3.i iVar = (v3.i) this.f7584u;
                v3.p pVar = iVar.f14806u;
                try {
                    v3.p pVar2 = (v3.p) iVar.f14805t.b((v3.p) this.f7583t);
                    if (pVar2 == null) {
                        iVar.k(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    v3.o oVar = v3.g.f14802b;
                    pVar2.getClass();
                    pVar2.f14816b.b(new v3.m(oVar, iVar));
                    pVar2.m();
                    pVar2.b(oVar, iVar);
                    pVar2.f14816b.b(new v3.j(oVar, iVar));
                    pVar2.m();
                    return;
                } catch (v3.e e9) {
                    if (e9.getCause() instanceof Exception) {
                        pVar.i((Exception) e9.getCause());
                        return;
                    } else {
                        pVar.i(e9);
                        return;
                    }
                } catch (Exception e10) {
                    pVar.i(e10);
                    return;
                }
            default:
                v3.p pVar3 = (v3.p) this.f7583t;
                try {
                    pVar3.j(((Callable) this.f7584u).call());
                    return;
                } catch (Exception e11) {
                    pVar3.i(e11);
                    return;
                } catch (Throwable th3) {
                    pVar3.i(new RuntimeException(th3));
                    return;
                }
        }
    }

    public o30(v3.i iVar, v3.p pVar) {
        this.s = 6;
        this.f7584u = iVar;
        this.f7583t = pVar;
    }
}
