package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class p1 extends j implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f6031a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f6032b;

    /* renamed from: c, reason: collision with root package name */
    public final zau f6033c;

    /* renamed from: d, reason: collision with root package name */
    public final pa.d f6034d;

    public p1(k kVar, pa.d dVar) {
        super(kVar);
        this.f6032b = new AtomicReference(null);
        this.f6033c = new zau(Looper.getMainLooper());
        this.f6034d = dVar;
    }

    public final void a(pa.a aVar, int i10) {
        this.f6032b.set(null);
        ((a0) this).f5929f.i(aVar, i10);
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void onActivityResult(int i10, int i11, Intent intent) {
        AtomicReference atomicReference = this.f6032b;
        m1 m1Var = (m1) atomicReference.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int iC = this.f6034d.c(getActivity(), pa.e.f21388a);
                if (iC == 0) {
                    atomicReference.set(null);
                    zau zauVar = ((a0) this).f5929f.f5981n;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    return;
                } else {
                    if (m1Var == null) {
                        return;
                    }
                    if (m1Var.f6023b.f21377b == 18 && iC == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            atomicReference.set(null);
            zau zauVar2 = ((a0) this).f5929f.f5981n;
            zauVar2.sendMessage(zauVar2.obtainMessage(3));
            return;
        } else if (i11 == 0) {
            if (m1Var != null) {
                a(new pa.a(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, m1Var.f6023b.toString()), m1Var.f6022a);
                return;
            }
            return;
        }
        if (m1Var != null) {
            a(m1Var.f6023b, m1Var.f6022a);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        pa.a aVar = new pa.a(13, null);
        m1 m1Var = (m1) this.f6032b.get();
        a(aVar, m1Var == null ? -1 : m1Var.f6022a);
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f6032b.set(bundle.getBoolean("resolving_error", false) ? new m1(new pa.a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m1 m1Var = (m1) this.f6032b.get();
        if (m1Var == null) {
            return;
        }
        pa.a aVar = m1Var.f6023b;
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", m1Var.f6022a);
        bundle.putInt("failed_status", aVar.f21377b);
        bundle.putParcelable("failed_resolution", aVar.f21378c);
    }

    @Override // com.google.android.gms.common.api.internal.j
    public void onStart() {
        super.onStart();
        this.f6031a = true;
    }

    @Override // com.google.android.gms.common.api.internal.j
    public void onStop() {
        super.onStop();
        this.f6031a = false;
    }
}
