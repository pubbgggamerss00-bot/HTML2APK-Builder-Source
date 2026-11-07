package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.u10;
import k3.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private u10 zza;

    private final void zza() {
        u10 u10Var = this.zza;
        if (u10Var != null) {
            try {
                u10Var.zzx();
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i6, int i7, Intent intent) {
        try {
            u10 u10Var = this.zza;
            if (u10Var != null) {
                u10Var.zzh(i6, i7, intent);
            }
        } catch (Exception e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
        super.onActivityResult(i6, i7, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            u10 u10Var = this.zza;
            if (u10Var != null) {
                if (!u10Var.zzH()) {
                    return;
                }
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
        super.onBackPressed();
        try {
            u10 u10Var2 = this.zza;
            if (u10Var2 != null) {
                u10Var2.zzi();
            }
        } catch (RemoteException e7) {
            zzo.zzl("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            u10 u10Var = this.zza;
            if (u10Var != null) {
                u10Var.zzk(new b(configuration));
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u10 u10VarZzq = zzbc.zza().zzq(this);
        this.zza = u10VarZzq;
        if (u10VarZzq == null) {
            zzo.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            u10VarZzq.zzl(bundle);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            u10 u10Var = this.zza;
            if (u10Var != null) {
                u10Var.zzm();
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            u10 u10Var = this.zza;
            if (u10Var != null) {
                u10Var.zzo();
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        try {
            u10 u10Var = this.zza;
            if (u10Var != null) {
                u10Var.zzp(i6, strArr, iArr);
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            u10 u10Var = this.zza;
            if (u10Var != null) {
                u10Var.zzq();
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            u10 u10Var = this.zza;
            if (u10Var != null) {
                u10Var.zzr();
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            u10 u10Var = this.zza;
            if (u10Var != null) {
                u10Var.zzs(bundle);
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            u10 u10Var = this.zza;
            if (u10Var != null) {
                u10Var.zzt();
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            u10 u10Var = this.zza;
            if (u10Var != null) {
                u10Var.zzu();
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            u10 u10Var = this.zza;
            if (u10Var != null) {
                u10Var.zzv();
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i6) {
        super.setContentView(i6);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
